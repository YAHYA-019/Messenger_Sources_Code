package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Evc.class */
public final class Evc {
    public AtomicLong A03;
    public AtomicLong A04;
    public AtomicLong A05;
    public final C00i A08 = 1BV.A00(85033);
    public final C00i A09 = 1BQ.A02(98331);
    public final List A0A = AnonymousClass001.A0s();
    public AtomicBoolean A01 = DKC.A1E(false);
    public AtomicLong A06 = new AtomicLong(0);
    public AtomicInteger A02 = new AtomicInteger(0);
    public boolean A07 = false;
    public java.util.Map A00 = DKD.A13();

    public Evc() {
        long j = -1;
        this.A04 = new AtomicLong(j);
        this.A05 = new AtomicLong(j);
        this.A03 = new AtomicLong(j);
    }

    public void A00() {
        AtomicLong atomicLong = this.A05;
        long j = atomicLong.get();
        long j2 = -1;
        atomicLong.set(j2);
        if (j != j2) {
            this.A06.addAndGet(DKF.A05(this.A08) - j);
        }
    }
}
