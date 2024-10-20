package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Eam.class */
public abstract class Eam {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.caa.plugins.shared.CaaSharedKillSwitch", "messaging.caa.shared.CaaSharedKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.caa.shared.CaaSharedKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.caa.shared.CaaSharedKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
