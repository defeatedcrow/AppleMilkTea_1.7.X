package mods.defeatedcrow.common.item;

import java.util.List;

import net.minecraft.src.*;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import mods.defeatedcrow.common.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemAppleSandwich extends ItemFood {
	
	@SideOnly(Side.CLIENT)
    private IIcon iconSandwichType[];
	
	private static final String[] sandwichType = new String[] {"_apple", "_egg", "_cassis"};
	
	public ItemAppleSandwich (int reco, int sat, boolean flag){
		super (reco, sat, flag);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setMaxStackSize(64);
		this.setAlwaysEdible();

	}
	
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, 2);
        return this.iconSandwichType[j];
    }

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return super.getUnlocalizedName() + "_" + par1ItemStack.getItemDamage();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		par3List.add(new ItemStack(this, 1, 0));
		par3List.add(new ItemStack(this, 1, 1));
		par3List.add(new ItemStack(this, 1, 2));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.iconSandwichType = new IIcon[3];

        for (int i = 0; i < 3; ++i)
        {
            this.iconSandwichType[i] = par1IconRegister.registerIcon("defeatedcrow:sandwich" + sandwichType[i]);
        }
	}

}
