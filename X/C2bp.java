package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2bp, reason: invalid class name */
/* loaded from: 2bp.class */
public abstract class C2bp {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.nativepagereply.plugins.highmessagespersecond.HMPSKillSwitch", "messaging.nativepagereply.highmessagespersecond.HMPSKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C2bq) 1Bi.A03(66606)).A00());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.nativepagereply.highmessagespersecond.HMPSKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.nativepagereply.highmessagespersecond.HMPSKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
