package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Eaq.class */
public abstract class Eaq {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.quickpromotion.plugins.bloks.BloksKillSwitch", "messaging.quickpromotion.bloks.BloksKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean A012 = 2yD.A01(1BL.A0Q(), 36310551168680296L);
                    A01 = A012;
                    A00 = i;
                    r301.A01(A012, (Exception) null, "messaging.quickpromotion.bloks.BloksKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.quickpromotion.bloks.BloksKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
