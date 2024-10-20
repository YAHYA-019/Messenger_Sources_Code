package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Hwb.class */
public abstract class Hwb {
    public static final AtomicBoolean A00 = 7zO.A15();

    public static void A00(String str) {
        AtomicBoolean atomicBoolean = A00;
        synchronized (atomicBoolean) {
            atomicBoolean.getAndSet(true);
        }
        C0il.A0B(str);
    }
}
