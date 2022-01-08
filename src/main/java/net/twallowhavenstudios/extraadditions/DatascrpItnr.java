package engine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import engine.helpers.secdar;

public class infoscrp {
    public ArrayList<secdar> sectionData = new ArrayList<secdar>();

    public infoscrp load(String file) throws IOException {
        try {
            File myObj = new File(file);
            Scanner r = new Scanner(myObj);
    
            ArrayList<String> lines = new ArrayList<String>();
            String segment = "null";
            
            while (r.hasNextLine()) {
                String current = r.nextLine().replaceAll(" ", "");
                if (current.contains(":")) {
                    if (current.startsWith(":")) {
                        if (segment != "null") {
                            sectionData.add(new secdar(segment, lines));
                            lines.clear();
                        }
                        segment = current;
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

        return(this);
    }

    public String get(String path) {
        for (secdar data : sectionData) {
            if (numerate(data.secname) == numerate(path.split("[.]+")[0])) {
                for (String line : data.infos) {
                    if (numerate(line.split(":")[0]) == numerate(path.split("[.]+")[1])) {
                        return(addFormat(line.split(":")[1]));
                    }
                }
            }
        }

        return("dataline not found!");
    }

    public ArrayList<idra> getStr(String head) {
        ArrayList<idra> end = new ArrayList<idra>();
        for (secdar data : sectionData) {
            if (numerate(data.secname) == numerate(head)) {
                for (String line : data.infos) {
                    end.add(new idra(line.split(":")[0],addFormat(line.split(":")[1])));
                }
            }
        }
        return(end);
    }

    private String addFormat(String s) {
        return(join(join(join(join(s.split("/~"), "?").split("~")," ").split("?"),"~").split("~ ~"),""));
    }

    private String join(String[] split, String d) {
        String end = "";

        for (int i = 0; i < split.length; i++) {
            end += split[i]+d;
        }

        return(end);
    }

    private static int numerate(String in) {
        int end = 0;
        for (int i = 0; i < in.length(); i++) {
            end+=in.charAt(i)*(10^i);
        }
        return(end);
    }

    public class idra {
        public String name;
        public String value;

        idra(String n,String v) {
            name = n;
            value = v;
        }
    }
}
