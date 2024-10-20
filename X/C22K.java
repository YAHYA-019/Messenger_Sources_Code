package X;

/* renamed from: X.22K, reason: invalid class name */
/* loaded from: 22K.class */
public final class C22K {
    public long A00;
    public boolean A01;
    public final 1Br A02 = 1Bq.A00(84488);

    public final void A00(Integer num) {
        if (num.intValue() != 0) {
            synchronized (this) {
            }
        } else {
            long now = ((C0dr) this.A02.A00.get()).now();
            synchronized (this) {
                this.A00 = now;
            }
        }
        this.A01 = false;
    }

    public final boolean A01(long j) {
        long now = ((C0dr) this.A02.A00.get()).now();
        boolean z = false;
        if (!this.A01) {
            long j2 = this.A00;
            long j3 = now - j2;
            if (j2 == 0 || j3 >= j) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        synchronized (this) {
            if (!this.A01) {
                long j4 = this.A00;
                long j5 = now - j4;
                if (j4 == 0 || j5 >= j) {
                    this.A01 = true;
                    return true;
                }
            }
            return false;
        }
    }
}
