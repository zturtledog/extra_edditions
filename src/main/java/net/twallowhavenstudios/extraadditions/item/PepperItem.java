
package net.twallowhavenstudios.extraadditions.item;

import net.twallowhavenstudios.extraadditions.itemgroup.FoodItemGroup;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@ExtraAdditionsModElements.ModElement.Tag
public class PepperItem extends ExtraAdditionsModElements.ModElement {
	@ObjectHolder("extra_additions:pepper")
	public static final Item block = null;

	public PepperItem(ExtraAdditionsModElements instance) {
		super(instance, 166);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(FoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("pepper");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
