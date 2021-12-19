
package net.twallowhavenstudios.extraadditions.itemgroup;

import net.twallowhavenstudios.extraadditions.item.TabIconBrewingItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ExtraAdditionsModElements.ModElement.Tag
public class BrewingItemGroup extends ExtraAdditionsModElements.ModElement {
	public BrewingItemGroup(ExtraAdditionsModElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbrewing") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TabIconBrewingItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
