package net.toadbean.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;
import net.toadbean.mccourse.MCCourseMod;
import net.toadbean.mccourse.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        System.out.println("Registering fuels for " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // 400 ticks = 20 seconds
        registry.add(ModItems.COAL_SLIVER, 400);
    }
}
