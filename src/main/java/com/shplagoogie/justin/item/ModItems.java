package com.shplagoogie.justin.item;

import com.shplagoogie.justin.JustinMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustinMod.MOD_ID);

    public static final RegistryObject<Item> JUSTINITE_INGOT = ITEMS.register("justinite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JUSTIN_TAB)));

    public static final RegistryObject<Item> JUSTINITE_NUGGET = ITEMS.register("justinite_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JUSTIN_TAB)));

    public static final RegistryObject<Item> RAW_JUSTINITE = ITEMS.register("raw_justinite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JUSTIN_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
