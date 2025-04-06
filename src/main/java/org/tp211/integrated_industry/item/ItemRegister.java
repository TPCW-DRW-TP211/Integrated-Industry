package org.tp211.integrated_industry.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemRegister {
    public ItemRegister() {
        public class ModItems {
            public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
                // Create the item key.
                RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FabricDocsReference.MOD_ID, name));

                // Create the item instance.
                Item item = itemFactory.apply(settings.registryKey(itemKey));

                // Register the item.
                Registry.register(Registries.ITEM, itemKey, item);

                return item;
            }

        }
    }
}
