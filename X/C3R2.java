package X;

/* renamed from: X.3R2, reason: invalid class name */
/* loaded from: 3R2.class */
public final class C3R2 {
    public static C3R2 A0A;
    public static final Object A0B = new Object();
    public int A00;
    public int A01;
    public int A02;
    public C3R2 A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06;
    public final long[] A07;
    public final 07S[] A08;
    public final 07S[] A09;

    public C3R2(int i) {
        if (i <= 0) {
            throw 0Pz.A06("Invalid batch Size of ", " was given.", i);
        }
        this.A08 = new 07S[i];
        this.A09 = new 07S[i];
        this.A07 = new long[i];
        this.A06 = new long[i];
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A04 = false;
        this.A00 = 0;
        this.A03 = null;
    }

    public void A00() {
        long j;
        int i = 0;
        while (true) {
            int i2 = i;
            j = -3;
            if (i2 >= this.A02) {
                break;
            }
            07T r0 = this.A08[i2];
            if (r0 != null) {
                r0.A02();
                this.A07[i2] = j;
            }
            i = i2 + 1;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A01) {
                break;
            }
            07T r02 = this.A09[i4];
            if (r02 != null) {
                r02.A02();
                this.A06[i4] = j;
            }
            i3 = i4 + 1;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A00 = 0;
        this.A05 = false;
        this.A04 = false;
        synchronized (A0B) {
            C3R2 c3r2 = A0A;
            if (c3r2 == null || 15 > c3r2.A00) {
                this.A03 = c3r2;
                int i5 = 1;
                if (c3r2 != null) {
                    i5 = 1 + c3r2.A00;
                }
                this.A00 = i5;
                A0A = this;
            }
        }
    }
}
