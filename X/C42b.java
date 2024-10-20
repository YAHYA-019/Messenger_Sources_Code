package X;

/* renamed from: X.42b, reason: invalid class name */
/* loaded from: 42b.class */
public final class C42b extends 3sX {
    public int A00;
    public int A01;
    public 3sY A02;
    public Object A03;
    public String A04;
    public C42b A05;
    public final C42b A06;

    public C42b(3sY r302, C42b c42b, int i, int i2, int i3) {
        this.A06 = c42b;
        this.A02 = r302;
        ((3sX) this).A01 = i;
        this.A01 = i2;
        this.A00 = i3;
        ((3sX) this).A00 = -1;
    }

    private void A00(int i, int i2, int i3) {
        ((3sX) this).A01 = i;
        ((3sX) this).A00 = -1;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = null;
        this.A03 = null;
        3sY r0 = this.A02;
        if (r0 != null) {
            r0.A00 = null;
            r0.A01 = null;
            r0.A02 = null;
        }
    }

    public C42b A06(int i, int i2) {
        C42b c42b = this.A05;
        if (c42b != null) {
            c42b.A00(1, i, i2);
            return c42b;
        }
        3sY r0 = this.A02;
        C42b c42b2 = new C42b(r0 == null ? null : new 3sY(r0.A03), this, 1, i, i2);
        this.A05 = c42b2;
        return c42b2;
    }

    public C42b A07(int i, int i2) {
        C42b c42b = this.A05;
        if (c42b != null) {
            c42b.A00(2, i, i2);
            return c42b;
        }
        3sY r0 = this.A02;
        C42b c42b2 = new C42b(r0 == null ? null : new 3sY(r0.A03), this, 2, i, i2);
        this.A05 = c42b2;
        return c42b2;
    }

    public void A08(String str) {
        this.A04 = str;
        3sY r0 = this.A02;
        if (r0 == null || !r0.A00(str)) {
            return;
        }
        Object obj = r0.A03;
        throw new 5DK(obj instanceof AbstractC01033pi ? (AbstractC01033pi) obj : null, 0Pz.A0j("Duplicate field '", str, "'"));
    }
}
