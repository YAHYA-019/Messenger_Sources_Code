package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.60z, reason: invalid class name */
/* loaded from: 60z.class */
public abstract class C60z {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.powerupsavatar.plugins.common.CommonAvatarPowerUpKillSwitch", "messaging.powerupsavatar.common.CommonAvatarPowerUpKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((AnonymousClass610) 1Bn.A0A(67781)).A02());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.powerupsavatar.common.CommonAvatarPowerUpKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.powerupsavatar.common.CommonAvatarPowerUpKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
