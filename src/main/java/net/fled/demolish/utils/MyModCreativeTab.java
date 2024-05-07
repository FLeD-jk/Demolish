package net.fled.demolish.utils;

import net.fled.demolish.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MyModCreativeTab extends CreativeModeTab {

    public MyModCreativeTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.MYAPOLOGIZE.get());
    }
}
