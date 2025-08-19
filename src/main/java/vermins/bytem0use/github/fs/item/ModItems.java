package vermins.bytem0use.github.fs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vermins.bytem0use.github.fs.FazbearSights;

public class ModItems {

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(EXAMPLE_ITEM);
    }

    public static void addItemsToCombatItemsGroup(FabricItemGroupEntries entries) {
        entries.add(EXAMPLE_ITEM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FazbearSights.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FazbearSights.LOGGER.info("Registering Mod Items for " + FazbearSights.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemsGroup);
    }

}
