package cn.wyslmzc.yuhao.wysmod.utils;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.util.ArrayList;
import java.util.List;

public class Tooltip {
    private static List<ITextComponent> tooltip;
    private static List<String> info;
    private static List<String> tip;

    public Tooltip(List<ITextComponent> _tooltip) {
        tooltip = _tooltip;
        info = new ArrayList<>();
        tip = new ArrayList<>();
    }

    public void show() {
        tooltip.add(new StringTextComponent("§b§m§l=============================="));
        for (String value : tip) {
            tooltip.add(new StringTextComponent(value));
        }
        tooltip.add(new StringTextComponent("§b§m§l=============================="));
        if (Screen.hasShiftDown()) {
            for (String s : info) {
                tooltip.add(new StringTextComponent(s));
            }
            tooltip.add(new StringTextComponent("§b§m§l=============================="));
        } else {
            tooltip.add(new StringTextComponent("§7按下 SHIFT 显示更多"));
        }
    }

    public void addInfo(String s) {
        info.add(s);
    }

    public void addTip(String s) {
        tip.add(s);
    }

    public List<ITextComponent> getTooltip() {
        return tooltip;
    }
}
