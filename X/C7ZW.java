package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7ZW, reason: invalid class name */
/* loaded from: 7ZW.class */
public abstract class C7ZW {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, C1gs c1gs, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.cutover.plugins.commonplugins.CutoverKillSwitch", "messaging.cutover.commonplugins.CutoverKillSwitch", andIncrement);
            try {
                try {
                    11T.A0F(c1gs, 0);
                    Boolean valueOf = Boolean.valueOf(!c1gs.A02());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.cutover.commonplugins.CutoverKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.cutover.commonplugins.CutoverKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
