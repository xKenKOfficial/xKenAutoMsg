package x.KenKOfficial.AutoMsg.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.AutoMsg.Main.*;
import x.KenKOfficial.AutoMsg.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] l;
    
    private static boolean lIl(final int IlllllIllllllll) {
        return IlllllIllllllll != 0;
    }
    
    private static boolean Ill(final int lIIIIIlllllllll, final int IIIIIIlllllllll) {
        return lIIIIIlllllllll < IIIIIIlllllllll;
    }
    
    private static void ll() {
        (I = new String[PlayerJoin.l[13]])[PlayerJoin.l[0]] = I("ss3iTVW/Mq14NTO+oUA/GA==", "VQHSr");
        PlayerJoin.I[PlayerJoin.l[1]] = l("lF3SJXi6GlKn0mo8FAYAFna61OFgagwPOJwiCNoJ5gQ=", "leOyV");
        PlayerJoin.I[PlayerJoin.l[2]] = Il("UGxjNXlLaXhkeUtpeGQfUGdjNTw9MSsYMQI7CCojUGxjNRlLaXhkeUtpeGR5", "vTEYD");
        PlayerJoin.I[PlayerJoin.l[3]] = I("++HGJUh05MI=", "AqDxJ");
        PlayerJoin.I[PlayerJoin.l[4]] = Il("d0JEOzQlFxkNd29eU0ozZkpDQRMyEBI=", "WdslQ");
        PlayerJoin.I[PlayerJoin.l[5]] = l("3VnHvfr3yIM=", "JYhuQ");
        PlayerJoin.I[PlayerJoin.l[6]] = I("p1CrQk/NjT9mJZl8u7I7ryCDMWeTDJNl0T0+oCe8+qQ=", "ORSPg");
        PlayerJoin.I[PlayerJoin.l[7]] = Il("", "GakEV");
        PlayerJoin.I[PlayerJoin.l[8]] = Il("RU5lDz4WCz05M0NQaGtxBwAmPycWUn1kMwwbMSQlAUY1LHhXIBY+DRctFB8w", "ehRKW");
        PlayerJoin.I[PlayerJoin.l[9]] = I("4eLagw6Xr1c=", "HjZLy");
        PlayerJoin.I[PlayerJoin.l[10]] = Il("YXVaAAk1JgwtCzsyDisDZ2tXYUQjYl1vUnN9X3FQcyFDYQ1hNAIlGG9zXXRYcWU=", "ASmAb");
        PlayerJoin.I[PlayerJoin.l[11]] = l("UuO8kMDpV0U=", "PUoxY");
        PlayerJoin.I[PlayerJoin.l[12]] = l("oNdgE4lIsjzlvkmnez8hIz6DeCVEPf/kdS0c986//TrwA+xBj3HI1QrB6yWSi9vn", "IIvXk");
    }
    
    private static void IIl() {
        (l = new int[14])[0] = ((0x5 ^ 0x11 ^ (0x3E ^ 0x48)) & (0xAA ^ 0x95 ^ (0xCB ^ 0x96) ^ -" ".length()));
        PlayerJoin.l[1] = " ".length();
        PlayerJoin.l[2] = "  ".length();
        PlayerJoin.l[3] = "   ".length();
        PlayerJoin.l[4] = (0x38 ^ 0x6D ^ (0x50 ^ 0x1));
        PlayerJoin.l[5] = (0xF ^ 0xA);
        PlayerJoin.l[6] = (0x0 ^ 0x2D ^ (0x2E ^ 0x5));
        PlayerJoin.l[7] = (84 + 51 - 1 + 58 ^ 50 + 85 - 39 + 103);
        PlayerJoin.l[8] = (162 + 11 - 47 + 37 ^ 71 + 112 - 86 + 74);
        PlayerJoin.l[9] = (0x6D ^ 0x64);
        PlayerJoin.l[10] = (0x67 ^ 0x6D);
        PlayerJoin.l[11] = (0x6 ^ 0xD);
        PlayerJoin.l[12] = (0x71 ^ 0x7D);
        PlayerJoin.l[13] = (0xD ^ 0x0);
    }
    
    private static String l(final String IIllIllllllllll, final String lIllIllllllllll) {
        try {
            final SecretKeySpec lIIIlllllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.l[8]), "DES");
            final Cipher IIIIlllllllllll = Cipher.getInstance("DES");
            IIIIlllllllllll.init(PlayerJoin.l[2], lIIIlllllllllll);
            return new String(IIIIlllllllllll.doFinal(Base64.getDecoder().decode(IIllIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllllllllll) {
            llllIllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String Il(String IIllIIlllllllll, final String llIlIIlllllllll) {
        IIllIIlllllllll = new String(Base64.getDecoder().decode(IIllIIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllIIlllllllll = new StringBuilder();
        final char[] IlllIIlllllllll = llIlIIlllllllll.toCharArray();
        int lIllIIlllllllll = PlayerJoin.l[0];
        final Exception lllIIIlllllllll = (Object)IIllIIlllllllll.toCharArray();
        final boolean IllIIIlllllllll = lllIIIlllllllll.length != 0;
        char lIlIIIlllllllll = (char)PlayerJoin.l[0];
        while (Ill(lIlIIIlllllllll, IllIIIlllllllll ? 1 : 0)) {
            final char IlIIlIlllllllll = lllIIIlllllllll[lIlIIIlllllllll];
            llllIIlllllllll.append((char)(IlIIlIlllllllll ^ IlllIIlllllllll[lIllIIlllllllll % IlllIIlllllllll.length]));
            "".length();
            ++lIllIIlllllllll;
            ++lIlIIIlllllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllIIlllllllll);
    }
    
    static {
        IIl();
        ll();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent lllIlllllllllll) {
        final Player IIIllllllllllll = lllIlllllllllll.getPlayer();
        if (lIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.I[PlayerJoin.l[0]]) ? 1 : 0) && lIl(IIIllllllllllll.hasPermission(PlayerJoin.I[PlayerJoin.l[1]]) ? 1 : 0)) {
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[2]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[3]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[4]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[5]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[6]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[7]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[8]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[9]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[10]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[11]]));
            IIIllllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[12]]));
        }
    }
    
    private static String I(final String lIIIIllllllllll, final String IllllIlllllllll) {
        try {
            final SecretKeySpec IIlIIllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIIllllllllll = Cipher.getInstance("Blowfish");
            llIIIllllllllll.init(PlayerJoin.l[2], IIlIIllllllllll);
            return new String(llIIIllllllllll.doFinal(Base64.getDecoder().decode(lIIIIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIllllllllll) {
            IlIIIllllllllll.printStackTrace();
            return null;
        }
    }
}
