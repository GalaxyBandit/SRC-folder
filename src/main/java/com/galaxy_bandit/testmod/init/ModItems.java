package com.galaxy_bandit.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.galaxy_bandit.testmod.items.ItemBase;
import com.galaxy_bandit.testmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_TEST = EnumHelper.addToolMaterial("material_test", 3, 500, 2.0F, 5.0F, 10);
	
	//Items
	public static final Item TEST_ITEM = new ItemBase("test_item");
	public static final Item TEST = new ItemBase("test");
	public static final Item TEST_SLUDGE = new ItemBase("test_sludge");
	
	//Tools
	public static final ItemSword TEST_SWORD = new ToolSword("test_sword", MATERIAL_TEST);
	
}
