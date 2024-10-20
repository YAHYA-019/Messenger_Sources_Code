package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1Ar, reason: invalid class name */
/* loaded from: 1Ar.class */
public final class C1Ar extends C17v {
    public C1Ar() {
        super("lt");
    }

    public void A04(16F r302, long j) {
        long j2;
        AtomicLong atomicLong = (AtomicLong) A01(r302);
        if (j <= 0) {
            return;
        }
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, j2 == 0 ? j : (long) ((j2 * 0.8d) + (j * 0.2d))));
    }
}
