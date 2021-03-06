
package net.twallowhavenstudios.extraadditions.itemgroup;

import net.twallowhavenstudios.extraadditions.item.TabiconprossesingItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ExtraAdditionsModElements.ModElement.Tag
public class ProssesingItemGroup extends ExtraAdditionsModElements.ModElement {
	public ProssesingItemGroup(ExtraAdditionsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabprossesing") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TabiconprossesingItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
