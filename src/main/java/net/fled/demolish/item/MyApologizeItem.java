package net.fled.demolish.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.TextColor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MyApologizeItem extends SwordItem {
    public MyApologizeItem(Tiers tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, net.minecraft.world.item.TooltipFlag flag) {
        MutableComponent coloredText = Component.translatable("item.demolish.myapologize.tooltip")
                .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xB7B3B3)));
        tooltip.add(coloredText);
        super.appendHoverText(stack, level, tooltip, flag);
    }
}