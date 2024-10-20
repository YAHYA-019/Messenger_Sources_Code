package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.65k, reason: invalid class name */
/* loaded from: 65k.class */
public abstract class C65k {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.zero.messenger.plugins.messenger.MessengerMessengerKillSwitch", "zero.messenger.messenger.MessengerMessengerKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "zero.messenger.messenger.MessengerMessengerKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "zero.messenger.messenger.MessengerMessengerKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
