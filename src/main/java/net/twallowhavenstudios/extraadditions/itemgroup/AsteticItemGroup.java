
package net.twallowhavenstudios.extraadditions.itemgroup;

import net.twallowhavenstudios.extraadditions.item.TabIconAsteticItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ExtraAdditionsModElements.ModElement.Tag
public class AsteticItemGroup extends ExtraAdditionsModElements.ModElement {
	public AsteticItemGroup(ExtraAdditionsModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabastetic") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TabIconAsteticItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
