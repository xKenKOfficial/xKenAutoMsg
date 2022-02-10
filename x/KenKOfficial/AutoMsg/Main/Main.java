package x.KenKOfficial.AutoMsg.Main;

import org.bukkit.plugin.java.*;
import org.bukkit.*;
import x.KenKOfficial.AutoMsg.Listeners.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.AutoMsg.Tasks.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ String[] lIl;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ int[] lll;
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.lIl[Main.lll[6]]);
        System.out.println(Main.lIl[Main.lll[7]]);
        System.out.println(Main.lIl[Main.lll[8]]);
        System.out.println(Main.lIl[Main.lll[9]]);
        System.out.println(Main.lIl[Main.lll[10]]);
        System.out.println(Main.lIl[Main.lll[11]]);
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIl[Main.lll[12]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    static {
        IIIll();
        lIlIl();
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    public void registerTasks() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIl[Main.lll[13]]).append(this.getName())));
        MessageTask.start();
    }
    
    private static void IIIll() {
        (lll = new int[15])[0] = ((0xD2 ^ 0xAA ^ (0xDB ^ 0xA8)) & (107 + 35 - 89 + 83 ^ 27 + 37 - 22 + 89 ^ -" ".length()));
        Main.lll[1] = " ".length();
        Main.lll[2] = "  ".length();
        Main.lll[3] = "   ".length();
        Main.lll[4] = (12 + 106 - 28 + 61 ^ 19 + 97 - 55 + 86);
        Main.lll[5] = (0xC7 ^ 0xC2);
        Main.lll[6] = (0x8F ^ 0x89);
        Main.lll[7] = (0x3D ^ 0x3A);
        Main.lll[8] = (0x9A ^ 0x92);
        Main.lll[9] = (54 + 6 + 12 + 92 ^ 92 + 167 - 223 + 137);
        Main.lll[10] = (0x54 ^ 0x58 ^ (0x5 ^ 0x3));
        Main.lll[11] = (0x2D ^ 0x26);
        Main.lll[12] = (0x31 ^ 0x3D);
        Main.lll[13] = (0x41 ^ 0x1 ^ (0xC4 ^ 0x89));
        Main.lll[14] = (0xB ^ 0x44 ^ (0xD1 ^ 0x90));
    }
    
    private static void lIlIl() {
        (lIl = new String[Main.lll[14]])[Main.lll[0]] = lIll("V2pac25XalpzbldqWnNuV2pac25XalpzbldqWnNuV2pac25XalpzbldqWnNuV2pac25XalpzbldqWnM=", "tIyPM");
        Main.lIl[Main.lll[1]] = Illl("T+zoWU/Xtr4YeXXjH8NlHQ==", "WVcIr");
        Main.lIl[Main.lll[2]] = lIll("Jg41EAYQUWdSQkFGBQYYEA==", "qkGcl");
        Main.lIl[Main.lll[3]] = Illl("J0s8rnrOe9iqdPedyrnVYQ==", "fUAfi");
        Main.lIl[Main.lll[4]] = IIIIl("xhaXEBUG7kmW+WvWgrqFKw/8lMLkKTxn/NzpoIpor1BP6t9JXmGTjihZX/Y3y3rh3mINhIuIZ8zkrDpr2n/0GQ==", "LHJEr");
        Main.lIl[Main.lll[5]] = IIIIl("EY/StjD9vP8Rj9K2MP28/xGP0rYw/bz/EY/StjD9vP8Rj9K2MP28/xGP0rYw/bz/EY/StjD9vP/7bUj78eZCtQ==", "QgxGv");
        Main.lIl[Main.lll[6]] = IIIIl("nGMOnDtRb8ScYw6cO1FvxJxjDpw7UW/EnGMOnDtRb8ScYw6cO1FvxJxjDpw7UW/EnGMOnDtRb8QDm0SD2ulmjw==", "MpAKl");
        Main.lIl[Main.lll[7]] = lIll("PyMdGTIyHBc6ACA=", "Ghxws");
        Main.lIl[Main.lll[8]] = lIll("LxwdNhwZQ090WEhULSACGQ==", "xyoEv");
        Main.lIl[Main.lll[9]] = lIll("CTICExw5Lg8dACw5AVM=", "MWxrw");
        Main.lIl[Main.lll[10]] = Illl("5zN2hktZEtH1U8S/M7XwDsZ4Fr3NhSr3Moj4r+3VrGuPyHaTo8algibeMB60Xd0SINaV1/s8JIGlgCWl8OYD4g==", "uonnH");
        Main.lIl[Main.lll[11]] = IIIIl("Tjj9JSkPgidOOP0lKQ+CJ044/SUpD4InTjj9JSkPgidOOP0lKQ+CJ044/SUpD4InTjj9JSkPgiffg5oHGUOmdw==", "nBjbB");
        Main.lIl[Main.lll[12]] = IIIIl("b2sF+FErS+/3IrnRKPc74LyBQ5XfS3NdDMZqYJmtyq0=", "LkZFs");
        Main.lIl[Main.lll[13]] = IIIIl("0bn81m50LqTUbJN+F25LruC0NJZa2S5jfRYd1jNHW0Q=", "Hkcrq");
    }
    
    private static String Illl(final String IllIIlIIlllllll, final String lIlIIlIIlllllll) {
        try {
            final SecretKeySpec llIlIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), Main.lll[8]), "DES");
            final Cipher IlIlIlIIlllllll = Cipher.getInstance("DES");
            IlIlIlIIlllllll.init(Main.lll[2], llIlIlIIlllllll);
            return new String(IlIlIlIIlllllll.doFinal(Base64.getDecoder().decode(IllIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIlllllll) {
            lIIlIlIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        this.registerTasks();
        System.out.println(Main.lIl[Main.lll[0]]);
        System.out.println(Main.lIl[Main.lll[1]]);
        System.out.println(Main.lIl[Main.lll[2]]);
        System.out.println(Main.lIl[Main.lll[3]]);
        System.out.println(Main.lIl[Main.lll[4]]);
        System.out.println(Main.lIl[Main.lll[5]]);
    }
    
    private static String lIll(String lIlIIIlIlllllll, final String IIlIIIlIlllllll) {
        lIlIIIlIlllllll = (int)new String(Base64.getDecoder().decode(((String)lIlIIIlIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIlIIlIlllllll = new StringBuilder();
        final char[] lllIIIlIlllllll = IIlIIIlIlllllll.toCharArray();
        int IllIIIlIlllllll = Main.lll[0];
        final float IIIIIIlIlllllll = (Object)((String)lIlIIIlIlllllll).toCharArray();
        final byte llllllIIlllllll = (byte)IIIIIIlIlllllll.length;
        long IlllllIIlllllll = Main.lll[0];
        while (IlIll((int)IlllllIIlllllll, llllllIIlllllll)) {
            final char llIlIIlIlllllll = IIIIIIlIlllllll[IlllllIIlllllll];
            IIIlIIlIlllllll.append((char)(llIlIIlIlllllll ^ lllIIIlIlllllll[IllIIIlIlllllll % lllIIIlIlllllll.length]));
            "".length();
            ++IllIIIlIlllllll;
            ++IlllllIIlllllll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(IIIlIIlIlllllll);
    }
    
    private static boolean IlIll(final int IIIIIlIIlllllll, final int lllllIIIlllllll) {
        return IIIIIlIIlllllll < lllllIIIlllllll;
    }
    
    private static String IIIIl(final String lIlIllIIlllllll, final String IlIIllIIlllllll) {
        try {
            final SecretKeySpec IIIlllIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllIllIIlllllll = Cipher.getInstance("Blowfish");
            lllIllIIlllllll.init(Main.lll[2], IIIlllIIlllllll);
            return new String(lllIllIIlllllll.doFinal(Base64.getDecoder().decode(lIlIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllIIlllllll) {
            IllIllIIlllllll.printStackTrace();
            return null;
        }
    }
}
