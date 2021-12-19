
package net.twallowhavenstudios.extraadditions.item;

import net.twallowhavenstudios.extraadditions.itemgroup.ItemsItemGroup;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@ExtraAdditionsModElements.ModElement.Tag
public class SiliconeWaferItem extends ExtraAdditionsModElements.ModElement {
	@ObjectHolder("extra_additions:silicone_wafer")
	public static final Item block = null;

	public SiliconeWaferItem(ExtraAdditionsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("silicone_wafer");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
