package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7ms, reason: invalid class name */
/* loaded from: 7ms.class */
public abstract class C7ms {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.appointments.plugins.biimbooking.BiimBookingKillSwitch", "messaging.appointments.biimbooking.BiimBookingKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C2ib) 1Bi.A03(17077)).A01());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.appointments.biimbooking.BiimBookingKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.appointments.biimbooking.BiimBookingKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
