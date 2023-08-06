package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;

public class JiaoJi extends WeaponBase {
    public JiaoJi(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a命中敌人后§7虚弱§a敌方(虚弱III | 3s)");
    }
}
