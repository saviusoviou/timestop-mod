package com.timestop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TimeStopMod implements ModInitializer {
    public static final String MOD_ID = "timestop";

    public static final Item GOLDEN_CLOCK = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "golden_clock"),
        new Item(new Item.Settings())
    );

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
            .register(entries -> entries.add(GOLDEN_CLOCK));
    }
}
