package mods.defeatedcrow.recipe;

import mods.defeatedcrow.api.*;
import mods.defeatedcrow.api.recipe.*;
import mods.defeatedcrow.common.*;
import net.minecraft.block.Block;
import net.minecraft.init.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RegisterMakerRecipe {
	
	public void registerTea()
	{
		//登録メソッド
		//teacup1
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(Items.milk_bucket, 1), new ItemStack(DCsAppleMilk.teacupBlock, 1, 1),
				new ItemStack(DCsAppleMilk.teacupBlock, 1, 1),
	    		new String("defeatedcrow:textures/blocks/contents_milk.png"));
	    
	    //牛乳を追加投入できるものは下記のメソッドで登録
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(Items.dye, 1, 3), new ItemStack(DCsAppleMilk.teacupBlock, 1, 6),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 7),
	    		new String("defeatedcrow:textures/blocks/contents_cocoa.png"),
	    		new String("defeatedcrow:textures/blocks/contents_cocoa_milk.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.EXItems, 1, 2), new ItemStack(DCsAppleMilk.teacupBlock, 1, 4),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 5),
	    		new String("defeatedcrow:textures/blocks/contents_greentea.png"),
	    		new String("defeatedcrow:textures/blocks/contents_greentea_milk.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.EXItems, 1, 3), new ItemStack(DCsAppleMilk.teacupBlock, 1, 2),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 3),
	    		new String("defeatedcrow:textures/blocks/contents_tea.png"),
	    		new String("defeatedcrow:textures/blocks/contents_tea_milk.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.gratedApple, 1, 0), new ItemStack(DCsAppleMilk.teacupBlock, 1, 8),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 9),
	    		new String("defeatedcrow:textures/blocks/contents_juice.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.gratedApple, 1, 1), new ItemStack(DCsAppleMilk.teacupBlock, 1, 8),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 9),
	    		new String("defeatedcrow:textures/blocks/contents_juice.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.gratedApple, 1, 2), new ItemStack(DCsAppleMilk.teacupBlock, 1, 10),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 11),
	    		new String("defeatedcrow:textures/blocks/contents_lemon.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.gratedApple, 1, 3), new ItemStack(DCsAppleMilk.teacupBlock, 1, 12),
	    		new ItemStack(DCsAppleMilk.teacupBlock, 1, 13),
	    		new String("defeatedcrow:textures/blocks/contents_cocoa.png"),
	    		new String("defeatedcrow:textures/blocks/contents_cocoa_milk.png"));
	    
	    //teacup2
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.EXItems, 1, 8), new ItemStack(DCsAppleMilk.teaCup2, 1, 0),
	    		new ItemStack(DCsAppleMilk.teaCup2, 1, 1),
	    		new String("defeatedcrow:textures/blocks/contents_earlgray.png"),
	    		new String("defeatedcrow:textures/blocks/contents_tea_milk.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.EXItems, 1, 9), new ItemStack(DCsAppleMilk.teaCup2, 1, 2),
	    		new ItemStack(DCsAppleMilk.teaCup2, 1, 3),
	    		new String("defeatedcrow:textures/blocks/contents_appletea.png"),
	    		new String("defeatedcrow:textures/blocks/contents_tea_milk.png"));
	    
		TeaRecipeRegister.INSTANCE.register(new ItemStack(DCsAppleMilk.gratedApple, 1, 5), new ItemStack(DCsAppleMilk.teaCup2, 1, 4),
	    		new String("defeatedcrow:textures/blocks/contents_lime.png"));
	    
		TeaRecipeRegister.INSTANCE.register(new ItemStack(DCsAppleMilk.gratedApple, 1, 6), new ItemStack(DCsAppleMilk.teaCup2, 1, 5),
	    		new String("defeatedcrow:textures/blocks/contents_tomato.png"));
	    
		TeaRecipeRegister.INSTANCE.registerCanMilk(new ItemStack(DCsAppleMilk.gratedApple, 1, 7), new ItemStack(DCsAppleMilk.teaCup2, 1, 6),
	    		new ItemStack(DCsAppleMilk.teaCup2, 1, 7),
	    		new String("defeatedcrow:textures/blocks/contents_berry.png"));
	    
		TeaRecipeRegister.INSTANCE.register(new ItemStack(DCsAppleMilk.gratedApple, 1, 8), new ItemStack(DCsAppleMilk.teaCup2, 1, 8),
	    		new String("defeatedcrow:textures/blocks/contents_grape.png"));
	    
		TeaRecipeRegister.INSTANCE.register(new ItemStack(DCsAppleMilk.leafTea, 1, 1), new ItemStack(DCsAppleMilk.teaCup2, 1, 9),
	    		new String("defeatedcrow:textures/blocks/contents_mint.png"));
	}
	
	public void registerIce()
	{
		IceRecipeRegister.INSTANCE.register(new ItemStack(DCsAppleMilk.condensedMIlk, 1, 0), new ItemStack(DCsAppleMilk.blockIcecream, 1, 0));
		
		IceRecipeRegister.INSTANCE.register(new ItemStack(Blocks.gravel, 1, 0), new ItemStack(Items.flint, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 3), new ItemStack(DCsAppleMilk.blockIcecream, 1, 1),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 5), new ItemStack(DCsAppleMilk.blockIcecream, 1, 2),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 7), new ItemStack(DCsAppleMilk.blockIcecream, 1, 3),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 9), new ItemStack(DCsAppleMilk.blockIcecream, 1, 5),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 11), new ItemStack(DCsAppleMilk.blockIcecream, 1, 6),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teacupBlock, 1, 13), new ItemStack(DCsAppleMilk.blockIcecream, 1, 4),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(Items.water_bucket, 1, 0), new ItemStack(DCsAppleMilk.EXItems, 1, 7),
				new ItemStack(Items.bucket, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teaCup2, 1, 4), new ItemStack(DCsAppleMilk.blockIcecream, 1, 7),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teaCup2, 1, 5), new ItemStack(DCsAppleMilk.blockIcecream, 1, 8),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teaCup2, 1, 7), new ItemStack(DCsAppleMilk.blockIcecream, 1, 9),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teaCup2, 1, 8), new ItemStack(DCsAppleMilk.blockIcecream, 1, 10),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.teaCup2, 1, 9), new ItemStack(DCsAppleMilk.blockIcecream, 1, 11),
				new ItemStack(DCsAppleMilk.emptyCup, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 1), new ItemStack(DCsAppleMilk.cocktail, 1, 1),
				new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 0));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 17), new ItemStack(DCsAppleMilk.cocktail, 1, 1),
				new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 1));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 33), new ItemStack(DCsAppleMilk.cocktail, 1, 1),
				new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 17));
		
		IceRecipeRegister.INSTANCE.registerCanLeave(new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 49), new ItemStack(DCsAppleMilk.cocktail, 1, 1),
				new ItemStack(DCsAppleMilk.itemLargeBottle, 1, 33));
		
		IceRecipeRegister.INSTANCE.registerCharger(new ItemStack(DCsAppleMilk.icyCrystal, 1, 0), 64);
		
	}

}
