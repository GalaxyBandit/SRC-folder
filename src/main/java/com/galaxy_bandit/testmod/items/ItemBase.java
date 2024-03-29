package com.galaxy_bandit.testmod.items;

import com.galaxy_bandit.testmod.Main;
import com.galaxy_bandit.testmod.init.ModItems;
import com.galaxy_bandit.testmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

public ItemBase(String name)
{
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MISC);
	
	ModItems.ITEMS.add(this);
}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
