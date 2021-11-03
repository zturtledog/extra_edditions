
package net.twallowhavenstudios.extraadditions.item;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

@ExtraAdditionsModElements.ModElement.Tag
public class PolypianNightItem extends ExtraAdditionsModElements.ModElement {
	@ObjectHolder("extra_additions:polypian_night")
	public static final Item block = null;
	public PolypianNightItem(ExtraAdditionsModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ExtraAdditionsModElements.sounds.get(new ResourceLocation("extra_additions:polypian-night")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("polypian_night");
		}
	}
}
