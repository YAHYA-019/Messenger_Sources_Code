package X;

/* renamed from: X.8xk, reason: invalid class name */
/* loaded from: 8xk.class */
public final class C8xk extends C5yu {
    public final int A00;
    public final int A01;
    public final Aap A02;
    public final String A03;
    public final String A04;

    public C8xk(Aap aap, String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str2;
        this.A02 = aap;
    }

    @Override // X.C5yu
    public 1LI A01(1Iw r302, int i, int i2) {
        11T.A0F(r302, 0);
        String str = this.A03;
        int i3 = this.A01;
        int i4 = this.A00;
        String str2 = this.A04;
        Aap aap = this.A02;
        1BK.A1K(str, 0, str2);
        9Ui r0 = new 9Ui(aap, i4 == -1 ? C98U.GREEN : C98U.WHITE, str, str2, i3, i4);
        2cM A00 = 2cK.A00(r302);
        A00.A2g(C1ro.FLEX_END);
        A00.A2c();
        8Pi r02 = new 8Pi(r302, new C8jy());
        r02.A01.A00 = r0;
        r02.A02.set(0);
        return 7zL.A0U(A00, r02);
    }

    @Override // X.C5yu
    public String A02() {
        return "TitleBarCombinedActionButton";
    }
}
