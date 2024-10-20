package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.63w, reason: invalid class name */
/* loaded from: 63w.class */
public abstract class C63w {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.media.ephemeralmedia.plugins.core.EphemeralMediaCoreKillSwitch", "messaging.media.ephemeralmedia.core.EphemeralMediaCoreKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((63U) 1Bi.A03(66565)).A00());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.media.ephemeralmedia.core.EphemeralMediaCoreKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.media.ephemeralmedia.core.EphemeralMediaCoreKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
