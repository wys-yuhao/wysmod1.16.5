package cn.wyslmzc.yuhao.wysmod.utils;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.time.LocalTime;
import java.util.Objects;

public class Umpire {
    public static void send(World world, PlayerEntity player, String message) {
        for (PlayerEntity umpire : world.players()) {
            if (umpire.getTeam() == null) {
                return;
            }
            if (!umpire.getTeam().getName().equals("umpire")) {
                return;
            }
            //上面判断了null
            TextFormatting color = Objects.requireNonNull(player.getTeam()).getColor();

            umpire.sendMessage(new StringTextComponent(
                    "§l[§6裁判系统§r§l]" +
                            "§r§l[§7" + LocalTime.now() + "§r§l]" +
                            "§l[§r§a玩家" +
                            color + player.getName().getContents() +
                            "§r§l]" +
                            message


            ), Util.NIL_UUID);
        }
    }
}
