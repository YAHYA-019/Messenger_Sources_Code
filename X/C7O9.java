package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7O9, reason: invalid class name */
/* loaded from: 7O9.class */
public abstract class C7O9 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.events.plugins.qp.EventsQpKillSwitch", "messaging.events.qp.EventsQpKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((2yD) 1Bi.A03(16385)).AZk(36315340062860044L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.events.qp.EventsQpKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.events.qp.EventsQpKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
