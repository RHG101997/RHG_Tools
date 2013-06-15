package com.RHG_Tools;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.RHG_Tools.block.ModBlock;
import com.RHG_Tools.creativeTap.creativeTabs;
import com.RHG_Tools.item.ModItem;
import com.RHG_Tools.lib.References;
import com.RHG_Tools.recipes.CraftingRecipes;

@Mod(
		modid= References.MOD_ID ,
		name = References.MOD_NAME,
		version = References.VERSION)

@NetworkMod(
		serverSideRequired = false,
		clientSideRequired = true)


public class RHG_Tools {
	
	public static CreativeTabs RHG_Tools_Tab = new creativeTabs(CreativeTabs.getNextID(), References.MOD_ID);
	
	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event){
		
		ModBlock.init();
		ModItem.init();
		CraftingRecipes.init();
		
		
	}
	
	
	
	@Mod.Init
	public void init(FMLInitializationEvent event){
		
		
	}
	
	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	
	

}
