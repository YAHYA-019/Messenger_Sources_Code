package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.61i, reason: invalid class name */
/* loaded from: 61i.class */
public abstract class C61i {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.sharedalbum.plugins.SharedalbumKillSwitch", "messaging.sharedalbum.SharedalbumKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((2yD) 1Bi.A03(16385)).AZk(36322521242617458L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.sharedalbum.SharedalbumKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.sharedalbum.SharedalbumKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}