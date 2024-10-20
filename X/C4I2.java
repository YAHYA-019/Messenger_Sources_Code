package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4I2, reason: invalid class name */
/* loaded from: 4I2.class */
public abstract class C4I2 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(20L r301, 1YC r302, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r302.A05("com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "messaging.advancedcrypto.core.ArmadilloCoreKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    11T.A0F(r301, 0);
                    Boolean valueOf = Boolean.valueOf(((1CO) r301.A00.A00.get()).AZk(36316289244866424L));
                    A01 = valueOf;
                    A00 = i;
                    r302.A01(valueOf, (Exception) null, "messaging.advancedcrypto.core.ArmadilloCoreKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r302.A01(A01, e, "messaging.advancedcrypto.core.ArmadilloCoreKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
