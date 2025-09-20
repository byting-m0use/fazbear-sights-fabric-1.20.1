package vermins.bytem0use.github.fs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import vermins.bytem0use.github.fs.FazbearSights;

public class ModBlocks {

        public static final Block TILED_FLOOR_BLOCK = registerBlock("tiled_floor_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));

        public static final Block FREDDY_FAZBEAR_CARDBOARD_CUTOUT = registerBlock("freddy_fazbear_cardboard_cutout", 
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

        public static final Block TILED_WALL_BLOCK = registerBlock("tiled_wall_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));

        public static final Block PEPPERONI_PIZZA = registerBlock("pepperoni_pizza",
            new Block(FabricBlockSettings.copyOf(Blocks.CAKE).sounds(BlockSoundGroup.FUNGUS)));

        public static final Block TILED_FLOOR_BLOCK_WHITE_RED = registerBlock("tiled_floor_block_white_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));

        public static final Block TILED_FLOOR_BLOCK_BLACK_RED = registerBlock("tiled_floor_block_black_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));

        public static final Block FNAF1_WALL_BLOCK = registerBlock("fnaf1_wall_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));

        public static final Block FNAF1_WALL_PATTERN_BLOCK = registerBlock("fnaf1_wall_pattern_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.GLASS)));


            

private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FazbearSights.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FazbearSights.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FazbearSights.LOGGER.info("Registering ModBlocks for " + FazbearSights.MOD_ID);
    }
}
