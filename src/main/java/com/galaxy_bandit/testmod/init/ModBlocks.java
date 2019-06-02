package com.galaxy_bandit.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.galaxy_bandit.testmod.blocks.BlockBase;
import com.galaxy_bandit.testmod.blocks.TestBlock;
import com.galaxy_bandit.testmod.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TEST_BLOCK = new TestBlock("test_block", Material.IRON);
}
