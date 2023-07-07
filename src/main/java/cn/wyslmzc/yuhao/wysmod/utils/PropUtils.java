package cn.wyslmzc.yuhao.wysmod.utils;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import java.util.Objects;

public class PropUtils {
    public static void title(World world, String text) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a reset");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a title [{\"text\":\"§k|§r " + text + " §r§k|\"}]");
        }
    }

    public static void title(World world, PlayerEntity player, String text) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a reset");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a title [{\"text\":\"§k|§r " + text + " §r§k|\"}]");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a subtitle [{\"text\":\"" + player.getName().getContents() + "\"}]");
        }
    }

    public static void tellRaw(World world, String text) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "tellraw @a [{\"text\":\"§k|§r " + text + " §r§k|\"}]");
        }
    }

    public static void runCommand(World world, String cmd) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    cmd);
        }
    }

}
