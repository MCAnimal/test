
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.TestPlankBlock;
import net.mcreator.test.block.TestDimPortalBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> TEST_PLANK = REGISTRY.register("test_plank", () -> new TestPlankBlock());
	public static final RegistryObject<Block> TEST_DIM_PORTAL = REGISTRY.register("test_dim_portal", () -> new TestDimPortalBlock());
}
