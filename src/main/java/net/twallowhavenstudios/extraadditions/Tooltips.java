package net.twallowhavenstudios.extraadditions;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.twallowhavenstudios.extraadditions.block.AssemblerBlock;
import net.twallowhavenstudios.extraadditions.item.TagItem;
import net.twallowhavenstudios.extraadditions.item.TransistorItem;

import java.util.ArrayList;
import java.util.List;

@mezz.jei.api.JeiPlugin
public class Tooltips implements IModPlugin {
	public static IJeiHelpers jeiHelper;
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("extra_additions", "default");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		jeiHelper = registration.getJeiHelpers();
		registration.addRecipeCategories(new AssemblerBlockJeiCategory(jeiHelper.getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addRecipes(generateAssemblerBlockRecipes(), AssemblerBlockJeiCategory.Uid);
		// ...
	}

	private List<AssemblerBlockJeiCategory.AssemblerBlockRecipeWrapper> generateAssemblerBlockRecipes() {
		List<AssemblerBlockJeiCategory.AssemblerBlockRecipeWrapper> recipes = new ArrayList<>();
		ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(TransistorItem.block));
        outputs.add(new ItemStack(TagItem.block));
        // ...
		recipes.add(new AssemblerBlockJeiCategory.AssemblerBlockRecipeWrapper(inputs, outputs));
		return recipes;
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(AssemblerBlock.block), AssemblerBlockJeiCategory.Uid);
	}
	public static class AssemblerBlockJeiCategory implements IRecipeCategory<AssemblerBlockJeiCategory.AssemblerBlockRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("extra_additions", "assemblerblockcategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
		private static final int output1 = 1; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public AssemblerBlockJeiCategory(IGuiHelper guiHelper) {
			this.title = "Assembler";
			this.background = guiHelper.createDrawable(new ResourceLocation("extra_additions", "src/main/resources/assets/extra_additions/textures/assembler_gui.png"), 0, 0, 176, 166);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends AssemblerBlockRecipeWrapper> getRecipeClass() {
			return AssemblerBlockJeiCategory.AssemblerBlockRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(AssemblerBlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
		}

		@Override
		public void setRecipe(IRecipeLayout iRecipeLayout, AssemblerBlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
			IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
			stacks.init(input1, true, 32, 44);
			stacks.init(output1, false, 176, 71);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
			// ...
		}
		public static class AssemblerBlockRecipeWrapper {
            private List<ItemStack> input;
            private List<ItemStack> output;

            public AssemblerBlockRecipeWrapper(List<ItemStack> input, List<ItemStack> output) {
                this.input = input;
                this.output = output;
            }


            public List<ItemStack> getInput() {
                return input;
            }

            public List<ItemStack> getOutput() {
                return output;
            }
        }
	}
}