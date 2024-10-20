package X;

/* renamed from: X.2hd, reason: invalid class name */
/* loaded from: 2hd.class */
public final class C2hd extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public String A03;

    public C2hd() {
        super("Line");
        this.A00 = -16777216;
        this.A03 = "Line";
        this.A02 = 0;
    }

    public static C83f A00(1Iw r301) {
        return new C83f(new C2hd(), r301);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cM A01;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = this.A02;
        String str = this.A03;
        11T.A0F(r302, 0);
        boolean z = true;
        if (i == 1) {
            A01 = 2cK.A01(r302, str, 0);
        } else {
            z = false;
            A01 = C1rg.A01(r302, str, 0);
        }
        A01.A0k(0.0f);
        A01.A2Y(C1ro.FLEX_START);
        C2k3 A00 = C2k2.A00(r302);
        A00.A2X(i2);
        A00.A0k(0.0f);
        int i4 = 0;
        if (z) {
            i4 = i3;
        }
        A00.A0C(i4);
        if (z) {
            i3 = 0;
        }
        A00.A1L(i3);
        A00.A0j(1.0f);
        A01.A2W(A00);
        1LI A2V = A01.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}
