package X;

/* renamed from: X.8kj, reason: invalid class name */
/* loaded from: 8kj.class */
public final class C8kj extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C8kj() {
        super("EmojiTabIconComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Integer.valueOf(this.A00), this.A03, Integer.valueOf(this.A01), Boolean.valueOf(this.A05), Integer.valueOf(this.A02), Boolean.valueOf(this.A06), Boolean.valueOf(this.A07)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2hd c2hd;
        int i = this.A00;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        int i2 = this.A01;
        int i3 = this.A02;
        String str = this.A04;
        Integer num = this.A03;
        4YV.A1M(r302, 0, str);
        int i4 = 0;
        2cM A00 = 2cK.A00(r302);
        A00.A2b();
        7zL.A1J(A00);
        7zR.A0y(r302.A0D, A00, num);
        A00.A2S(str);
        A00.A2c();
        A00.A0R();
        A00.A0m(100.0f);
        C2cm A002 = C2cl.A00(r302);
        if (z2) {
            i4 = i2;
        }
        A002.A2X(i4);
        A002.A2a(i);
        A002.A10(100.0f);
        A00.A2e(7zL.A0J(A002));
        if (z) {
            C83f A003 = C2hd.A00(r302);
            A003.A2Z(0);
            A003.A2Y(i3);
            A003.A2E(z3 ? C26z.TOP : C26z.BOTTOM, 0);
            A003.A0c();
            A003.A2X(2.0f);
            A003.A10(100.0f);
            c2hd = A003.A2V();
        } else {
            c2hd = null;
        }
        return 7zL.A0V(A00, c2hd);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
