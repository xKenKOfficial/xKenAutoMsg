package x.KenKOfficial.AutoMsg.Tasks;

import org.bukkit.scheduler.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import x.KenKOfficial.AutoMsg.Utils.*;
import x.KenKOfficial.AutoMsg.Main.*;
import org.bukkit.plugin.*;
import java.util.*;

public class MessageTask
{
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String[] IIIl;
    private static final /* synthetic */ int[] lIIl;
    
    public static void start() {
        new BukkitRunnable() {
            /* synthetic */ int i = MessageTask$1.Ill[0];
            private static final /* synthetic */ int[] Ill;
            private static final /* synthetic */ String[] IIl;
            /* synthetic */ List<String> wiadomosci = Main.getPlugin().getConfig().getStringList(MessageTask$1.IIl[MessageTask$1.Ill[0]]);
            
            private static boolean IIlIl(final int IIlIIllIlllllll) {
                return IIlIIllIlllllll != 0;
            }
            
            private static String IIll(final String llllIllIlllllll, final String IIllIllIlllllll) {
                try {
                    final SecretKeySpec IlIIlllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIllIlllllll.getBytes(StandardCharsets.UTF_8)), MessageTask$1.Ill[3]), "DES");
                    final Cipher lIIIlllIlllllll = Cipher.getInstance("DES");
                    lIIIlllIlllllll.init(MessageTask$1.Ill[2], IlIIlllIlllllll);
                    return new String(lIIIlllIlllllll.doFinal(Base64.getDecoder().decode(llllIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception IIIIlllIlllllll) {
                    IIIIlllIlllllll.printStackTrace();
                    return null;
                }
            }
            
            private static void IlIIl() {
                (Ill = new int[4])[0] = ((0xD ^ 0x3B) & ~(0xBD ^ 0x8B));
                MessageTask$1.Ill[1] = " ".length();
                MessageTask$1.Ill[2] = "  ".length();
                MessageTask$1.Ill[3] = (0x37 ^ 0x1C ^ (0x33 ^ 0x10));
            }
            
            private static void lIIIl() {
                (IIl = new String[MessageTask$1.Ill[2]])[MessageTask$1.Ill[0]] = IIll("HdBUYJe+c91illENhUm3GQ==", "BfSrb");
                MessageTask$1.IIl[MessageTask$1.Ill[1]] = llll("97PICWIsyus=", "ZAbWr");
            }
            
            private static String llll(final String IIlllllIlllllll, final String lIIllllIlllllll) {
                try {
                    final SecretKeySpec lllllllIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher IllllllIlllllll = Cipher.getInstance("Blowfish");
                    IllllllIlllllll.init(MessageTask$1.Ill[2], lllllllIlllllll);
                    return new String(IllllllIlllllll.doFinal(Base64.getDecoder().decode(IIlllllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lIlllllIlllllll) {
                    lIlllllIlllllll.printStackTrace();
                    return null;
                }
            }
            
            public void run() {
                if (llIIl(this.i, this.wiadomosci.size())) {
                    final long lIlIIIIllllllll = (long)Bukkit.getOnlinePlayers().iterator();
                    while (IIlIl(((Iterator)lIlIIIIllllllll).hasNext() ? 1 : 0)) {
                        final Player IIIlIIIllllllll = ((Iterator<Player>)lIlIIIIllllllll).next();
                        IIIlIIIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(MessageTask.prefix).append(MessageTask$1.IIl[MessageTask$1.Ill[1]]).append(this.wiadomosci.get(this.i)))));
                        "".length();
                        if ((0x9 ^ 0xD) == 0x0) {
                            return;
                        }
                    }
                    this.i += MessageTask$1.Ill[1];
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else {
                    this.i = MessageTask$1.Ill[0];
                }
            }
            
            static {
                IlIIl();
                lIIIl();
            }
            
            private static boolean llIIl(final int lllIIllIlllllll, final int IllIIllIlllllll) {
                return lllIIllIlllllll < IllIIllIlllllll;
            }
        }.runTaskTimer((Plugin)Main.getPlugin(), 0L, 20L * Main.getPlugin().getConfig().getInt(MessageTask.IIIl[MessageTask.lIIl[0]]));
        "".length();
    }
    
    private static String IllIl(String llllllllIllllll, final String IlllllllIllllll) {
        llllllllIllllll = new String(Base64.getDecoder().decode(llllllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIIIIIlllllll = new StringBuilder();
        final char[] lIIIIIIIlllllll = IlllllllIllllll.toCharArray();
        int IIIIIIIIlllllll = MessageTask.lIIl[0];
        final boolean IlIlllllIllllll = (Object)llllllllIllllll.toCharArray();
        final int lIIlllllIllllll = IlIlllllIllllll.length;
        long IIIlllllIllllll = MessageTask.lIIl[0];
        while (IIlll((int)IIIlllllIllllll, lIIlllllIllllll)) {
            final char lIlIIIIIlllllll = IlIlllllIllllll[IIIlllllIllllll];
            IlIIIIIIlllllll.append((char)(lIlIIIIIlllllll ^ lIIIIIIIlllllll[IIIIIIIIlllllll % lIIIIIIIlllllll.length]));
            "".length();
            ++IIIIIIIIlllllll;
            ++IIIlllllIllllll;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(IlIIIIIIlllllll);
    }
    
    private static void lIIll() {
        (IIIl = new String[MessageTask.lIIl[2]])[MessageTask.lIIl[0]] = IllIl("FQg0ARIfCBgGGhUINQ==", "xmGrs");
        MessageTask.IIIl[MessageTask.lIIl[1]] = lllIl("D83N8z/WPFc=", "lprkY");
    }
    
    public static String getPrefix() {
        return MessageTask.prefix;
    }
    
    private static String lllIl(final String IlIIlIIIlllllll, final String llIIlIIIlllllll) {
        try {
            final SecretKeySpec lllIlIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIlIIIlllllll = Cipher.getInstance("Blowfish");
            IllIlIIIlllllll.init(MessageTask.lIIl[2], lllIlIIIlllllll);
            return new String(IllIlIIIlllllll.doFinal(Base64.getDecoder().decode(IlIIlIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIlllllll) {
            lIlIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlll(final int IIlIllllIllllll, final int llIIllllIllllll) {
        return IIlIllllIllllll < llIIllllIllllll;
    }
    
    static {
        llIll();
        lIIll();
        prefix = Main.getPlugin().getConfig().getString(MessageTask.IIIl[MessageTask.lIIl[1]]);
    }
    
    private static void llIll() {
        (lIIl = new int[3])[0] = ((0x67 ^ 0x76 ^ (0x7F ^ 0x68)) & (0xC7 ^ 0x8F ^ (0x29 ^ 0x67) ^ -" ".length()));
        MessageTask.lIIl[1] = " ".length();
        MessageTask.lIIl[2] = "  ".length();
    }
}
