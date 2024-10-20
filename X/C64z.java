package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.64z, reason: invalid class name */
/* loaded from: 64z.class */
public abstract class C64z {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.publicchats.plugins.seencount.PublicchatsSeencountKillSwitch", "messaging.publicchats.seencount.PublicchatsSeencountKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.publicchats.seencount.PublicchatsSeencountKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.publicchats.seencount.PublicchatsSeencountKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
