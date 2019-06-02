package com.galaxy_bandit.testmod.items.tools;

import com.galaxy_bandit.testmod.Main;
import com.galaxy_bandit.testmod.init.ModItems;
import com.galaxy_bandit.testmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

public ToolSword(String name, ToolMaterial material)
{
	super(material);
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
