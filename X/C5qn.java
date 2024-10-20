package X;

/* renamed from: X.5qn, reason: invalid class name */
/* loaded from: 5qn.class */
public final class C5qn extends C1rj {
    public int A00;
    public int A01;

    public C5qn() {
        super("ProgressSpinnerListItem");
    }

    public final Object[] A0k() {
        return AnonymousClass001.A1b(Integer.valueOf(this.A00), this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        int i2 = this.A01;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A10(100.0f);
        A01.A1L(i2);
        A01.A2h(C1ro.CENTER);
        A01.A2i(C1rp.CENTER);
        36Z A00 = C2rs.A00(r302);
        A00.A1L(i);
        A00.A0C(i);
        A00.A0J();
        A01.A2f(A00.A01);
        return A01.A00;
    }
}
