package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.gui.GUIBase;
import cn.wyslmzc.yuhao.wysmod.gui.GenshinImpack;
import cn.wyslmzc.yuhao.wysmod.gui.IronMan;

import java.util.Map;

public class GUIList {

    private static final Map<String, GUIBase> GUIList = RegistryEvents.GUIList;

    public static GUIBase genshinImpack = new GenshinImpack();
    public static GUIBase ironMan = new IronMan();

    public static void init() {
        GUIList.put("genshinImpack", genshinImpack);
        GUIList.put("ironMan", ironMan);
    }
}
