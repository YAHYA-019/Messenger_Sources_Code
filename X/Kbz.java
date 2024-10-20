package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Kbz.class */
public abstract class Kbz {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05(4YT.A00(35), "messaging.reactions.reactionsactionsdrawer.ReactionsReactionsactionsdrawerKillSwitch", andIncrement);
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsReactionsactionsdrawerKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsReactionsactionsdrawerKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
