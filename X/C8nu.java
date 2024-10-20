package X;

/* renamed from: X.8nu, reason: invalid class name */
/* loaded from: 8nu.class */
public final class C8nu extends C1rj {
    public static final C1rp A07 = C1rp.FLEX_START;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1LI A05;
    public C1rp A06;

    public C8nu() {
        super("Badge");
        this.A01 = 0;
        this.A02 = 0;
        this.A06 = A07;
        this.A04 = 15;
    }

    public static 8T1 A00(1Iw r301) {
        return new 8T1(new C8nu(), r301);
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05, Integer.valueOf(this.A03), this.A06, Integer.valueOf(this.A04)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8nu c8nu = (C8nu) super.A0l();
        c8nu.A05 = 4YV.A0J(c8nu.A05);
        return c8nu;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A05;
        int i = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        C1rp c1rp = this.A06;
        int i5 = this.A04;
        7zP.A1L(r302, 0, c1rp);
        2cM A00 = 2cK.A00(r302);
        A00.A2h(c1rp);
        8Sl r02 = new 8Sl(new C8je(), r302);
        C8je c8je = r02.A00;
        c8je.A03 = i;
        r02.A02.set(1);
        r02.A2X(i2);
        c8je.A00 = i3;
        c8je.A01 = i4;
        c8je.A04 = i5;
        r02.A0c();
        r02.A0b();
        A00.A2d(r02);
        return 7zL.A0V(A00, r0);
    }
}
