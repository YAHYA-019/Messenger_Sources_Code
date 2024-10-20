package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5yt, reason: invalid class name */
/* loaded from: 5yt.class */
public abstract class C5yt {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.msys.thread.plugins.platypustoggle.PlatypusToggleKillSwitch", "messaging.msys.thread.platypustoggle.PlatypusToggleKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((1uZ) 1Bi.A03(66270)).A06());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.msys.thread.platypustoggle.PlatypusToggleKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.msys.thread.platypustoggle.PlatypusToggleKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
