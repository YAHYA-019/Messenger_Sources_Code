package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.60v, reason: invalid class name */
/* loaded from: 60v.class */
public abstract class C60v {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, C60t c60t, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.powerups.plugins.giftbox.GiftBoxPowerupKillSwitch", "messaging.powerups.giftbox.GiftBoxPowerupKillSwitch", andIncrement);
            try {
                try {
                    11T.A0F(c60t, 0);
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.powerups.giftbox.GiftBoxPowerupKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.powerups.giftbox.GiftBoxPowerupKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
