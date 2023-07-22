package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class HaoZiWeiZhi extends Item {

    public HaoZiWeiZhi(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a获得飞行Buff|60s");
        tip.addInfo("§e我是混元形意太极门掌门人马宝国，刚才有个朋友问我马老师发生肾摸事了，我说怎么回事？给我发了几张截图，我一看！\n" +
                "嗷！原来是昨天，有两个年轻人，30多岁，一个体重90多公斤，一个体重80多公斤。\n" +
                "塔们说，诶…有一个说是我在健身房练功，颈椎练坏了，马老师你能不能教教我混元功法？诶…帮助治疗一下，我的颈椎病。\n" +
                "我说可以，我说你在健身房练死劲，不好用，他不服气，我说小朋友你两个手来折我一个手指头，他折不动。他说你这也没用，我说我这个有用。\n" +
                "这是化劲儿，传统功夫是讲化劲的，四两拨千斤，200多斤的英国大力士都挝不动我这一个手指，啊…哈！他说要和我试试，我说可以。\n" +
                "诶…我一说，他啪就站起来了，很快啊！然后上来就是一个左正蹬，一个右鞭腿，一个左刺拳！\n" +
                "我全部防区防出去了啊，防出去以后自然是传统功夫以点到为止，右拳放在了鼻子上，没打他。我笑一下，准备收拳。\n" +
                "因为这时间，按传统功夫的点到为止他已经输了，如果这一拳发力，一拳就把他鼻子打骨折了，放在鼻子上没有打他。\n" +
                "他也承认我先打到他面部，他不知道拳放在了鼻子上。他承认我先打到他面部，啊！我收拳的时间不打了，他突然袭击左刺拳来打我脸，啊，我大E了啊，没有闪。\n" +
                "诶…他的左拳给我眼，右眼蹭了一下，但没关系啊。他也说啊，他截图也说了，两分多钟以后，当时流眼泪了，捂着眼，我说婷婷。然后两分钟以后，两分多钟以后诶就好了。\n" +
                "我说小伙子你不讲武德你不懂，他忙说马老师对不对不起，我不懂规矩，啊，我是…他说他是乱打的。\n" +
                "他可不是乱打的啊，正蹬鞭腿左刺拳训练有素，后来他说他练过三四年泰拳，啊，看来是有备而来。\n" +
                "这两个年轻人，不讲武德，\n" +
                "来，骗！\n" +
                "来，偷袭！\n" +
                "我69岁的老同志。这好吗？这不好。\n" +
                "我劝这位年轻人，耗子尾汁，好好反思。以后不要再犯这样的聪明，小聪明，啊，嗯…武林要以和为贵，要讲武德，不要搞窝里斗.");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        World playerWorld = player.level;

        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : world.players()) {
            playerEntity.playSound(SoundsList.haoziweizhi, 1.0f, 1.0f);
        }

        player.addEffect(new EffectInstance(EffectsList.flight, 60, 1, true, true));

        PropUtils.title(playerWorld, "§b§l偷袭!", "耗子尾汁");

        return ActionResult.pass(itemstack);
    }
}
