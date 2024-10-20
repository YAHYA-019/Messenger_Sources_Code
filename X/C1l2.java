package X;

/* renamed from: X.1l2, reason: invalid class name */
/* loaded from: 1l2.class */
public final class C1l2 {
    public 4mK A00;
    public 4mK A01;
    public 4mK A02;
    public 4mK A03;
    public 4mK A04;
    public 4mK A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final 3lK A09;
    public final C1Qt A0A;
    public final C1Qt A0B;

    public C1l2(3lK r302, C1Qt c1Qt, C1Qt c1Qt2, long j, long j2, long j3) {
        this.A09 = r302;
        this.A0B = c1Qt;
        this.A0A = c1Qt2;
        this.A08 = j;
        this.A06 = j2;
        this.A07 = j3;
    }

    public static 4mK A00(C1l2 c1l2) {
        4mK r304;
        if (c1l2.A09.AUi()) {
            r304 = c1l2.A03;
            if (r304 == null) {
                1RY AYd = c1l2.A0B.AYd();
                r304 = new 4mK(AYd.A03, AYd.A01);
                c1l2.A03 = r304;
            }
        } else {
            r304 = c1l2.A04;
            if (r304 == null) {
                1RY An4 = c1l2.A0B.An4();
                4mK r0 = new 4mK(An4.A03, An4.A01);
                c1l2.A04 = r0;
                return r0;
            }
        }
        return r304;
    }

    public 4mK A01(long j) {
        4mK r308;
        if (j == -3) {
            throw AnonymousClass001.A0L("got unset latency for event when scheduling upload!");
        }
        if (j == -2) {
            if (this.A09.AUi()) {
                r308 = this.A01;
                if (r308 == null) {
                    1RY AYd = this.A0A.AYd();
                    r308 = new 4mK(AYd.A03, AYd.A01);
                    this.A01 = r308;
                }
            } else {
                r308 = this.A02;
                if (r308 == null) {
                    1RY An4 = this.A0A.An4();
                    4mK r0 = new 4mK(An4.A03, An4.A01);
                    this.A02 = r0;
                    return r0;
                }
            }
        } else {
            if (j == -1) {
                return A00(this);
            }
            if (j == -4) {
                r308 = this.A05;
                if (r308 == null) {
                    long j2 = this.A08;
                    4mK r02 = new 4mK(j2, this.A07 * j2);
                    this.A05 = r02;
                    return r02;
                }
            } else {
                if (j != -5) {
                    return new 4mK(j, this.A07 * j);
                }
                r308 = this.A00;
                if (r308 == null) {
                    long j3 = this.A06;
                    4mK r03 = new 4mK(j3, this.A07 * j3);
                    this.A00 = r03;
                    return r03;
                }
            }
        }
        return r308;
    }
}
