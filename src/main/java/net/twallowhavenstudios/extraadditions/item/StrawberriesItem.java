
package net.twallowhavenstudios.extraadditions.item;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@ExtraAdditionsModElements.ModElement.Tag
public class StrawberriesItem extends ExtraAdditionsModElements.ModElement {
	@ObjectHolder("extra_additions:strawberries")
	public static final Item block = null;

	public StrawberriesItem(ExtraAdditionsModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("strawberries");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
