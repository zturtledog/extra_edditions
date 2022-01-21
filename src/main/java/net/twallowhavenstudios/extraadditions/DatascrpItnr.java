package net.twallowhavenstudios.extraadditions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatascrpItnr {
    public ArrayList<secdar> sectionData = new ArrayList<secdar>();
    public ArrayList<varible> vars = new ArrayList<varible>();
    public String f_dat = "";

    public DatascrpItnr load(String file) throws IOException {
        try {
            File myObj = new File(file);
            Scanner r = new Scanner(myObj);

            ArrayList<String> lines = new ArrayList<String>();
            String segment = "null";

            while (r.hasNextLine()) {
                String current = r.nextLine().replaceAll(" ", "");

                f_dat += current + "\n";

                if (current.contains(":")) {
                    if (current.startsWith(":")) {
                        if (segment != "null") {
                            sectionData.add(new secdar(segment, lines));
                            lines.clear();
                        }
                        segment = current;
                    }else if (current.startsWith(".")) {
                        vars.add(new varible(current.replace(".","").split(":")[0],addFormat(current.split(":")[1])));
                    }else {
                        lines.add(current);
                    }
                }
            }
            sectionData.add(new secdar(segment, lines));
            lines.clear();
            r.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return (this);
    }

    public DatascrpItnr txt(String file) {
        try {
            String[] lines = file.split("\n");
            ArrayList<String> infos = new ArrayList<String>();
            String segment = "";

            for (int i = 0; i < lines.length; i++) {
                String current = lines[i].replaceAll(" ", "");

                if (current.contains(":")) {
                    if (current.startsWith(":")) {
                        if (segment != "null") {
                            sectionData.add(new secdar(segment, infos));
                            infos.clear();
                        }
                        segment = current;
                    }else if (current.startsWith(".")) {
                        vars.add(new varible(current.replace(".","").split(":")[0],addFormat(current.split(":")[1])));
                    }else {
                        infos.add(current);
                    }
                }
            }
            sectionData.add(new secdar(segment, infos));
            infos.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return this;
    }

    public String get(String path) {
        for (secdar data : sectionData) {
            if (numerate(data.secname) == numerate(path.split("[.]+")[0])) {
                for (String line : data.infos) {
                    if (numerate(line.split(":")[0]) == numerate(path.split("[.]+")[1])) {
                        return (addFormat(line.split(":")[1]));
                    }
                }
            }
        }

        return ("");// ("dataline not found!");
    }

    public ArrayList<idra> getStr(String head) {
        ArrayList<idra> end = new ArrayList<idra>();
        for (secdar data : sectionData) {
            if (numerate(data.secname) == numerate(head)) {
                for (String line : data.infos) {
                    end.add(new idra(line.split(":")[0], addFormat(line.split(":")[1])));
                }
            }
        }
        return (end);
    }

    private String addFormat(String s) {
        return (variate(join(join(join(join(s.split("/~"), "Ξ").split("~"), " ").split("Ξ"), "~").split("~ ~"), "")));
    }

    private String variate(String input) {
        for (varible var : vars) {
            // System.out.println("x");
            input = input.replaceAll(var.name, var.value);
        }

        return(input);
    }

    static String join(String[] split, String d) {
        String end = "";

        for (int i = 0; i < split.length; i++) {
            end += split[i] + d;
        }

        return (end);
    }

    private static int numerate(String in) {
        int end = 0;
        for (int i = 0; i < in.length(); i++) {
            end += in.charAt(i) * (10 ^ i);
        }
        return (end);
    }

    public Double getNum(String path) {
        String got = get(path);
        return(Double.parseDouble(got));
    }

    public boolean getBool(String path) {
        String got = get(path);
        return(got == "true" ? true:(got == "false" ? false:null));
    }

    public class idra {
        public String name;
        public String value;

        idra(String n, String v) {
            name = n;
            value = v;
        }
    }

    public class secdar {
        public String secname;
        public ArrayList<String> infos;

        public secdar(String name, ArrayList<String> data) {
            secname = name;
            infos = (ArrayList<String>) data.clone();
        }
    }

    public class varible {
        public String name = "";
        public String value = "";

        varible(String nme, String vlu) {
            name = nme;
            value = vlu;
        }
    }
}
