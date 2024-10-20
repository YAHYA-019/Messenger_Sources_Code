package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2c0, reason: invalid class name */
/* loaded from: 2c0.class */
public abstract class C2c0 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.messageexpiration.plugins.MessageExpirationKillSwitch", "messaging.messageexpiration.MessageExpirationKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(1xG.A00((1xG) 1Bi.A03(66259)).AZk(36322293609219365L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.messageexpiration.MessageExpirationKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.messageexpiration.MessageExpirationKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
