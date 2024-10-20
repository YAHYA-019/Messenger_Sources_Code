package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6lg, reason: invalid class name */
/* loaded from: 6lg.class */
public abstract class C6lg {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.communitymessaging.plugins.participation.CommunitymessagingParticipationKillSwitch", "messaging.communitymessaging.participation.CommunitymessagingParticipationKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((2yD) 1Bi.A03(16385)).AZk(2342164482484420985L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.communitymessaging.participation.CommunitymessagingParticipationKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.communitymessaging.participation.CommunitymessagingParticipationKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
