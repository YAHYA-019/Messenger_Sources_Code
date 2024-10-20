package X;

/* renamed from: X.3Qx, reason: invalid class name */
/* loaded from: 3Qx.class */
public final class C3Qx {
    public static C3Qx A05;
    public static final Object A06 = new Object();
    public int A00;
    public int A01;
    public C3Qx A02;
    public boolean A03;
    public final 07S[] A04;

    public C3Qx(int i) {
        if (i <= 0) {
            throw 0Pz.A06("Invalid batch Size of ", " was given.", i);
        }
        this.A04 = new 07S[i];
        this.A01 = 0;
        this.A03 = false;
        this.A00 = 0;
        this.A02 = null;
    }

    public void A00() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A01) {
                break;
            }
            07T r0 = this.A04[i2];
            if (r0 != null) {
                r0.A02();
            }
            i = i2 + 1;
        }
        this.A01 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A03 = false;
        synchronized (A06) {
            C3Qx c3Qx = A05;
            if (c3Qx == null || 15 > c3Qx.A00) {
                this.A02 = c3Qx;
                int i3 = 1;
                if (c3Qx != null) {
                    i3 = 1 + c3Qx.A00;
                }
                this.A00 = i3;
                A05 = this;
            }
        }
    }
}
