package net.fled.demolish.Mobs;

import net.fled.demolish.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "demolish", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModCustomMobsDrop {

    @SubscribeEvent
    public static void onWitherBossDrop(LivingDropsEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof WitherBoss) {
            // Створення нового об'єкту ItemEntity з ItemStack та додавання його до списку випадкових випадінь
            event.getDrops().add(new ItemEntity(entity.level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(ModItems.MYAPOLOGIZE.get())));
        }
    }

}
