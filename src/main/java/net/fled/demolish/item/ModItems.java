package net.fled.demolish.item;


import net.fled.demolish.Demolish;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demolish.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> MYAPOLOGIZE = ITEMS.register("myapologize",
            () -> new MyApologizeItem(Tiers.NETHERITE, 40 , 5.0f , new Item.Properties()
                    .tab(Demolish.MY_MOD_TAB)
                    .durability(-1)
                    .fireResistant()
                    .rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<Item> LASTNOTE = ITEMS.register("lastnote", () -> new ThelastnoteItem( new Item.Properties().tab(Demolish.MY_MOD_TAB)));
}
