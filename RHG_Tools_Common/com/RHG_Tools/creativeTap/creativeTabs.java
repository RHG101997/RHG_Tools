package com.RHG_Tools.creativeTap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class creativeTabs extends CreativeTabs {

	
	public creativeTabs(int id, String name){
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack(){

		return new ItemStack(Item.pickaxeDiamond);

	}
	
	
}
