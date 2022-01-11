
package net.twallowhavenstudios.extraadditions.item;

import net.twallowhavenstudios.extraadditions.itemgroup.FoodItemGroup;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@ExtraAdditionsModElements.ModElement.Tag
public class KaleItem extends ExtraAdditionsModElements.ModElement {
	@ObjectHolder("extra_additions:kale")
	public static final Item block = null;

	public KaleItem(ExtraAdditionsModElements instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("kale");
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
