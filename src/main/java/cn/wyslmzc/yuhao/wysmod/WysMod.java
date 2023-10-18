package cn.wyslmzc.yuhao.wysmod;

import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

@Mod("wys")
public class WysMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String modId = "wys";
    public static final VarInstance ValueInstance = new VarInstance();
    public static WysMod INSTANCE;

    public WysMod() {
        INSTANCE = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    private void onServerStarting(final FMLServerStartingEvent event) {
        event.getServer().setMotd("五元素幸运方块Mod服务器");
        event.getServer().setPort(25565);
        event.getServer().sendMessage(
                new StringTextComponent("Port: " + event.getServer().getPort()),
                UUID.randomUUID());
    }
}
