package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.60s, reason: invalid class name */
/* loaded from: 60s.class */
public abstract class C60s {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, C60t c60t, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.powerups.plugins.fire.FirePowerupKillSwitch", "messaging.powerups.fire.FirePowerupKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    11T.A0F(c60t, 0);
                    Boolean valueOf = Boolean.valueOf(C60t.A00(c60t).AZk(36313892653767841L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.powerups.fire.FirePowerupKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.powerups.fire.FirePowerupKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
