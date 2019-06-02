package com.galaxy_bandit.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TestBlock extends BlockBase
{

	public TestBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(15.0F);
		setLightOpacity(1);
		//setBlockUnbreakable();
		this.setRegistryName(name);
	}

}
