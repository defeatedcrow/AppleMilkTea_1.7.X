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
import mods.defeatedcrow.plugin.LoadSSectorPlugin;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAppleTart extends ItemFood {
	
	@SideOnly(Side.CLIENT)
    private IIcon iconType[];
	private static String[] type = new String[] {"apple", "cassis"};
	
	public ItemAppleTart (int reco, int sat, boolean flag){
		super (reco, sat, flag);
		this.setMaxStackSize(64);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, 1);
        return this.iconType[j];
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
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.iconType = new IIcon[2];

        for (int i = 0; i < 2; ++i)
        {
            this.iconType[i] = par1IconRegister.registerIcon("defeatedcrow:" + type[i] + "tart");
        }
	}
	
	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
//		if (!par2World.isRemote)
//		{
//			this.reduceMoisture(-1, 0.0F, par3EntityPlayer);
//		}
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		return par1ItemStack;
	}
	
//	private void reduceMoisture(int par1, float par2, EntityPlayer par3EntityPlayer)
//	{
//		if (DCsAppleMilk.SuccessLoadSSector)
//		{
//			LoadSSectorPlugin.addStatus(par1, par2, 0, 0.0F, par3EntityPlayer);
//		}
//	}

}
