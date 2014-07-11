package mods.defeatedcrow.plugin;

import forestry.api.core.ItemInterface;
import mods.defeatedcrow.common.AMTLogger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LoadForestryPlugin {
	
	public void load()
	{
		ItemStack item = ItemInterface.getItem("waxCapsule");
		if (item != null) {
			ItemStack register = item;
			if (register != null) {
				LoadModHandler.registerModItems("emptyCapsule", register);
			}
		}
		ItemStack item2 = ItemInterface.getItem("refractoryEmpty");
		if (item2 != null) {
			ItemStack register = item2;
			if (register != null) {
				LoadModHandler.registerModItems("emptyRefractory", register);
			}
		}
		ItemStack item3 = ItemInterface.getItem("canEmpty");
		if (item3 != null) {
			ItemStack register = item3;
			if (register != null) {
				LoadModHandler.registerModItems("emptyCan", register);
			}
		}
		ItemStack item4 = ItemInterface.getItem("waxCapsuleWater");
		if (item4 != null) {
			ItemStack register = item4;
			if (register != null) {
				LoadModHandler.registerModItems("waterCapsule", register);
				if (LoadModHandler.registerModItems("containerWater", register)) {
					AMTLogger.debugInfo("Succeeded to get Forestry water capsule");
				}
			}
		}
		ItemStack item5 = ItemInterface.getItem("refractoryWater");
		if (item5 != null) {
			ItemStack register = item5;
			if (register != null) {
				LoadModHandler.registerModItems("waterRefractory", register);
				if (LoadModHandler.registerModItems("containerWater", register)) {
					AMTLogger.debugInfo("Succeeded to get Forestry water refractory");
				}
			}
		}
		ItemStack item6 = ItemInterface.getItem("canWater");
		if (item6 != null) {
			ItemStack register = item6;
			if (register != null) {
				LoadModHandler.registerModItems("waterCan", register);
				if (LoadModHandler.registerModItems("containerWater", register)) {
					AMTLogger.debugInfo("Succeeded to get Forestry water can");
				}
			}
		}
	}

}
