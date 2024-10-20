package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.61l, reason: invalid class name */
/* loaded from: 61l.class */
public abstract class C61l {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, C5jj c5jj, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.translation.plugins.TranslationKillSwitch", "messaging.translation.TranslationKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    11T.A0F(c5jj, 0);
                    Boolean valueOf = Boolean.valueOf(c5jj.A01());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.translation.TranslationKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.translation.TranslationKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
