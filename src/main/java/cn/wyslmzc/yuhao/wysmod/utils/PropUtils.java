package cn.wyslmzc.yuhao.wysmod.utils;


import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

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

    public static void title(World world, String title, String sub) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a reset");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a title [{\"text\":\"§k|§r " + title + " §r§k|\"}]");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title @a subtitle [{\"text\":\"" + sub + "\"}]");
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
                    "title @a subtitle [{\"text\":\"" + "使用者:" + player.getName().getContents() + "\"}]");
        }
    }

    public static void actionBarTitle(World world, PlayerEntity player, String text) {
        if (!world.isClientSide) {
            MinecraftServer server = Objects.requireNonNull(world.getServer());
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title " + player.getName().getContents() + " reset");
            server.getCommands().performCommand(
                    world.getServer().createCommandSourceStack(),
                    "title " + player.getName().getContents() + " actionbar [{\"text\":\"" + text + " \"}]");
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
            ServerWorld serverworld = server.overworld();

            CommandSource source = new CommandSource(server,
                    Vector3d.atLowerCornerOf(serverworld.getSharedSpawnPos()),
                    Vector2f.ZERO,
                    serverworld,
                    4,
                    "Server",
                    new StringTextComponent("Server"),
                    server,
                    (Entity) null);

            server.getCommands().performCommand(
                    source,
                    cmd);
        }
    }

    public static void runCommand(PlayerEntity player, String cmd) {
        World world = player.level;
        if (world.isClientSide) {
            return;
        }
        MinecraftServer server = Objects.requireNonNull(world.getServer());
        server.getCommands().performCommand(player.createCommandSourceStack(), cmd);
    }

    public static boolean isPlayerEquipArmor(PlayerEntity player, ArmorSuit armorSuit) {
        int a = 0;

        for (ItemStack itemStack : player.inventory.armor) {
            if (itemStack.getItem() == armorSuit.helmet || itemStack.getItem() == armorSuit.chest || itemStack.getItem() == armorSuit.legs || itemStack.getItem() == armorSuit.feet) {
                a++;
            }
        }
        return a == 4;
    }

    public static void addEffect(PlayerEntity player, Effect effect, int sec, int level) {
        player.addEffect(new EffectInstance(effect, sec * 20, level - 1, true, true));
    }
}
