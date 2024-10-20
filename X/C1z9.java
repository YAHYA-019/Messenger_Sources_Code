package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1z9, reason: invalid class name */
/* loaded from: 1z9.class */
public abstract class C1z9 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.msys.lifecycle.plugins.lifecycle.MsysLifecycleLifecycleKillSwitch", "messaging.msys.lifecycle.lifecycle.MsysLifecycleLifecycleKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.msys.lifecycle.lifecycle.MsysLifecycleLifecycleKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.msys.lifecycle.lifecycle.MsysLifecycleLifecycleKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
