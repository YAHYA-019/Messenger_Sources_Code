package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6h5, reason: invalid class name */
/* loaded from: 6h5.class */
public abstract class C6h5 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.publicchats.plugins.events.PublicchatsEventsKillSwitch", "messaging.publicchats.events.PublicchatsEventsKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((2yD) 1Bi.A03(16385)).AZk(36320279269489869L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.publicchats.events.PublicchatsEventsKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.publicchats.events.PublicchatsEventsKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
