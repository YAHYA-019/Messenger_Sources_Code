package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.61o, reason: invalid class name */
/* loaded from: 61o.class */
public abstract class C61o {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger) {
        Boolean bool;
        int i = C1Y6.A00;
        return (A00 != i || (bool = A01) == null) ? A01(r301, atomicInteger, i) : bool.booleanValue();
    }

    public static boolean A01(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.publicchats.plugins.threadview.PublicchatsThreadviewKillSwitch", "messaging.publicchats.threadview.PublicchatsThreadviewKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((2yD) 1Bi.A03(16385)).AZk(36320279269489869L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.publicchats.threadview.PublicchatsThreadviewKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.publicchats.threadview.PublicchatsThreadviewKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
