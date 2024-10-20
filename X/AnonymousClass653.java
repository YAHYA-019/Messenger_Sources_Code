package X;

/* renamed from: X.653, reason: invalid class name */
/* loaded from: 653.class */
public final class AnonymousClass653 extends C1rj {
    public int A00;
    public int A01;

    public AnonymousClass653() {
        super("Space");
    }

    public static 7fT A00(1Iw r301) {
        AnonymousClass653 anonymousClass653 = new AnonymousClass653();
        C1rs c1rs = new C1rs(anonymousClass653, r301, 0, 0);
        ((7fT) c1rs).A01 = anonymousClass653;
        ((7fT) c1rs).A00 = r301;
        return c1rs;
    }

    public final Object[] A0k() {
        return AnonymousClass001.A1b(Integer.valueOf(this.A00), this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        int i2 = this.A01;
        11T.A0F(r302, 0);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0C(i);
        A01.A1L(i2);
        return A01.A00;
    }
}
