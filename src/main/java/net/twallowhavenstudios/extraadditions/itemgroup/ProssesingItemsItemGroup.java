
package net.twallowhavenstudios.extraadditions.itemgroup;

import net.twallowhavenstudios.extraadditions.item.SiliconeItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ExtraAdditionsModElements.ModElement.Tag
public class ProssesingItemsItemGroup extends ExtraAdditionsModElements.ModElement {
	public ProssesingItemsItemGroup(ExtraAdditionsModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabprossesing_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SiliconeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
