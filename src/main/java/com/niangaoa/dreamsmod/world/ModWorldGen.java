package com.niangaoa.dreamsmod.world;

import com.niangaoa.dreamsmod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (world.provider.getDimension() == 0) {

            generateOverWorld(random, chunkX, chunkZ, world, chunkGenerator,chunkProvider);

        }

    }

    private void generateOverWorld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        generateOre(ModBlocks.DREAM_ORE.getDefaultState(), world, random, chunkX*16, chunkZ*16, 5, 16, random.nextInt(8)+3, 4);

    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {

        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {

            BlockPos pos = new BlockPos(x+random.nextInt(16), minY+ random.nextInt(deltaY), z+random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
        }

    }

}
