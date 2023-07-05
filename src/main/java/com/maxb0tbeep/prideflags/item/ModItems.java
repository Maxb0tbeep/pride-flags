package com.maxb0tbeep.prideflags.item;

import com.maxb0tbeep.prideflags.PrideFlags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
//    public static final Item GAYBER = registerItem("example",
//            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PrideFlags.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PrideFlags.LOGGER.info("Registering mod items for "+PrideFlags.MOD_ID);
    }
}
