package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.items.bases.weaponBase;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;

public class FeiDuanDeLianDao extends weaponBase {
    public FeiDuanDeLianDao(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§c吸血效果: +40%");
    }
}
