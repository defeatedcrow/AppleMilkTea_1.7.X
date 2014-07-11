package mods.defeatedcrow.common;

import java.io.IOException;
import java.util.List;

import cpw.mods.fml.relauncher.CoreModManager;

public class RequiredCoreModChecker {
	
	private static boolean completed = false;
	private final String BR = System.getProperty("line.separator");
	
	public boolean isCompleted()
	{
		return this.completed;
	}
	
	public void coreModCheck()
	{
		//まずはコアモッドのチェック
		List<String> loaded = CoreModManager.getLoadedCoremods();
		for (String name : loaded)
		{
			if (name.equalsIgnoreCase("PotionExtensionCore"))
			{
				this.completed = true;
				AMTLogger.trace("Required CoreMod loaded : PotionExtensionCore");
			}
		}
		
		//未導入の場合
		if (!this.completed)
		{
			AMTLogger.warn("Failed to checking required CoreMod : PotionExtensionCore");
			AMTLogger.warn("Please restart the client, or get to download PotionExtensionCore from the link : ");
			AMTLogger.warn("http://forum.minecraftuser.jp/viewtopic.php?f=13&t=6672");
		}
		
	}

}
