package X;

/* renamed from: X.1iq, reason: invalid class name */
/* loaded from: 1iq.class */
public final class C1iq {
    public final C00i A07 = new 1BQ(16458);
    public final C00i A09 = new 1BQ(16616);
    public final C00i A0A = new 1BQ(84488);
    public final C00i A0B = new 1BQ(16936);
    public final C00i A08 = new 1BV(49852);
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;

    public static void A00(C1iq c1iq, long j) {
        synchronized (c1iq) {
            if (!A01(c1iq, j)) {
                c1iq.notifyAll();
            }
        }
    }

    public static boolean A01(C1iq c1iq, long j) {
        if (c1iq.A03 == 0 && j - ((1Od) c1iq.A09.get()).A0Z < 15000) {
            return true;
        }
        long j2 = c1iq.A00;
        if (j2 > 0 && j2 > c1iq.A03 && j2 - c1iq.A02 > 1000 && j - j2 < 10000) {
            return true;
        }
        long j3 = c1iq.A01;
        return j3 - c1iq.A02 > 1000 && j - j3 < 5000 && j3 > c1iq.A03;
    }

    public long A02(Integer num) {
        int intValue = num.intValue();
        long j = 0;
        long j2 = intValue != 1 ? intValue != 2 ? this.A06 : this.A05 : this.A04;
        if (j2 != 0) {
            j = ((C0dr) this.A0A.get()).now() - j2;
        }
        return j;
    }

    public void A03(Integer num) {
        synchronized (this) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.A04 = 0L;
            } else if (intValue != 2) {
                this.A06 = 0L;
            } else {
                this.A05 = 0L;
            }
            this.A03 = ((C0dr) this.A0A.get()).now();
            ((2CF) this.A0B.get()).A01 = true;
            notifyAll();
        }
    }

    public void A04(Integer num) {
        C00i c00i;
        synchronized (this) {
            int intValue = num.intValue();
            if (intValue == 1) {
                c00i = this.A0A;
                this.A04 = ((C0dr) c00i.get()).now();
            } else if (intValue != 2) {
                c00i = this.A0A;
                this.A06 = ((C0dr) c00i.get()).now();
            } else {
                c00i = this.A0A;
                this.A05 = ((C0dr) c00i.get()).now();
            }
            this.A03 = ((C0dr) c00i.get()).now();
            ((2CF) this.A0B.get()).A01 = true;
            notifyAll();
        }
    }
}
