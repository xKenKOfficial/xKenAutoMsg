package x.KenKOfficial.AutoMsg.Utils;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] Il;
    private static final /* synthetic */ int[] ll;
    
    public static String fixColor(final String IIIlllIllllllll) {
        return IIIlllIllllllll.replaceAll(ChatUtil.Il[ChatUtil.ll[0]], ChatUtil.Il[ChatUtil.ll[1]]).replace(ChatUtil.Il[ChatUtil.ll[2]], ChatUtil.Il[ChatUtil.ll[3]]).replace(ChatUtil.Il[ChatUtil.ll[4]], ChatUtil.Il[ChatUtil.ll[5]]).replace(ChatUtil.Il[ChatUtil.ll[6]], ChatUtil.Il[ChatUtil.ll[7]]);
    }
    
    private static void lIIl() {
        (Il = new String[ChatUtil.ll[8]])[ChatUtil.ll[0]] = lll("aFgD2vjuEH8=", "srWPA");
        ChatUtil.Il[ChatUtil.ll[1]] = lll("fgD4yUMWNHw=", "YuUQZ");
        ChatUtil.Il[ChatUtil.ll[2]] = lll("jBHETI1upOs=", "uzWDd");
        ChatUtil.Il[ChatUtil.ll[3]] = lll("5S0VxWwQ0Bs=", "loCJh");
        ChatUtil.Il[ChatUtil.ll[4]] = IIIl("Zkg=", "ZtFGU");
        ChatUtil.Il[ChatUtil.ll[5]] = IIIl("w7w=", "WmpQu");
        ChatUtil.Il[ChatUtil.ll[6]] = IIIl("MDou", "KtSSJ");
        ChatUtil.Il[ChatUtil.ll[7]] = IIIl("aw==", "azqRm");
    }
    
    private static String IIIl(String llIllIIllllllll, final String IlIllIIllllllll) {
        llIllIIllllllll = (short)new String(Base64.getDecoder().decode(((String)llIllIIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllllIIllllllll = new StringBuilder();
        final char[] lIlllIIllllllll = IlIllIIllllllll.toCharArray();
        int IIlllIIllllllll = ChatUtil.ll[0];
        final String IllIlIIllllllll = (Object)((String)llIllIIllllllll).toCharArray();
        final String lIlIlIIllllllll = (String)IllIlIIllllllll.length;
        int IIlIlIIllllllll = ChatUtil.ll[0];
        while (llIl(IIlIlIIllllllll, (int)lIlIlIIllllllll)) {
            final char lIIIIlIllllllll = IllIlIIllllllll[IIlIlIIllllllll];
            IllllIIllllllll.append((char)(lIIIIlIllllllll ^ lIlllIIllllllll[IIlllIIllllllll % lIlllIIllllllll.length]));
            "".length();
            ++IIlllIIllllllll;
            ++IIlIlIIllllllll;
            "".length();
            if (((0x7E ^ 0x3C) & ~(0x6 ^ 0x44)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IllllIIllllllll);
    }
    
    private static String lll(final String IIIIllIllllllll, final String llllIlIllllllll) {
        try {
            final SecretKeySpec llIIllIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIllllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.ll[8]), "DES");
            final Cipher IlIIllIllllllll = Cipher.getInstance("DES");
            IlIIllIllllllll.init(ChatUtil.ll[2], llIIllIllllllll);
            return new String(IlIIllIllllllll.doFinal(Base64.getDecoder().decode(IIIIllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIllllllll) {
            lIIIllIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIl() {
        (ll = new int[9])[0] = ((0x89 ^ 0xA5 ^ (0xDA ^ 0xB6)) & (145 + 247 - 267 + 125 ^ 28 + 93 - 67 + 132 ^ -" ".length()));
        ChatUtil.ll[1] = " ".length();
        ChatUtil.ll[2] = "  ".length();
        ChatUtil.ll[3] = "   ".length();
        ChatUtil.ll[4] = ("  ".length() ^ (0x8 ^ 0xE));
        ChatUtil.ll[5] = (0x4B ^ 0x6B ^ (0x0 ^ 0x25));
        ChatUtil.ll[6] = (0xB0 ^ 0xB6);
        ChatUtil.ll[7] = (0xD0 ^ 0x9E ^ (0x7 ^ 0x4E));
        ChatUtil.ll[8] = (0x7B ^ 0x73);
    }
    
    static {
        IlIl();
        lIIl();
    }
    
    private static boolean llIl(final int IIIIlIIllllllll, final int llllIIIllllllll) {
        return IIIIlIIllllllll < llllIIIllllllll;
    }
}
