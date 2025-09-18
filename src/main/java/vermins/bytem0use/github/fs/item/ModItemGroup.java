package vermins.bytem0use.github.fs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vermins.bytem0use.github.fs.FazbearSights;
import vermins.bytem0use.github.fs.block.ModBlocks;

public class ModItemGroup {
        public static final ItemGroup TILED_FLOOR_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FazbearSights.MOD_ID, "tiled_floor_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tiled_floor_block"))
                    .icon(() -> new ItemStack(ModBlocks.TILED_FLOOR_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TILED_FLOOR_BLOCK);
                        entries.add(ModBlocks.FREDDY_FAZBEAR_CARDBOARD_CUTOUT);
                        entries.add(ModBlocks.TILED_WALL_BLOCK);
                        entries.add(ModBlocks.TILED_FLOOR_BLOCK_BLACK_RED);
                        entries.add(ModBlocks.TILED_FLOOR_BLOCK_WHITE_RED);

                    }).build());

    public static void registerItemGroups() {
        FazbearSights.LOGGER.info("Registering Item Groups for " + FazbearSights.MOD_ID);
    }
}
