package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2j2, reason: invalid class name */
/* loaded from: 2j2.class */
public abstract class C2j2 {
    public static int A00 = 255;
    public static Boolean A01;

    public static Boolean A00(int i) {
        if (A00 != i) {
            return null;
        }
        return A01;
    }

    public static boolean A01(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.chatheads.plugins.core.ChatheadsCoreKillSwitch", "messaging.chatheads.core.ChatheadsCoreKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.chatheads.core.ChatheadsCoreKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.chatheads.core.ChatheadsCoreKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}