
package net.twallowhavenstudios.extraadditions.itemgroup;

import net.twallowhavenstudios.extraadditions.item.TabIconComputingItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ExtraAdditionsModElements.ModElement.Tag
public class ComputingItemGroup extends ExtraAdditionsModElements.ModElement {
	public ComputingItemGroup(ExtraAdditionsModElements instance) {
		super(instance, 99);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcomputing") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TabIconComputingItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
