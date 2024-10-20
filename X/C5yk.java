package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5yk, reason: invalid class name */
/* loaded from: 5yk.class */
public abstract class C5yk {
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
            r301.A05(AbE.A00(451), "messaging.wellbeing.selfremediation.block.WellbeingSelfremediationBlockKillSwitch", andIncrement);
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.wellbeing.selfremediation.block.WellbeingSelfremediationBlockKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.wellbeing.selfremediation.block.WellbeingSelfremediationBlockKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
