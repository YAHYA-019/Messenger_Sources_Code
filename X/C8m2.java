package X;

/* renamed from: X.8m2, reason: invalid class name */
/* loaded from: 8m2.class */
public final class C8m2 extends C1rj {
    public int A00;
    public C9hj A01;
    public 95U A02;

    public C8m2() {
        super("FDSGlimmerShape");
    }

    public static 8TN A00(1Iw r301) {
        return new 8TN(new C8m2(), r301);
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C9hj c9hj = this.A01;
        95U r0 = this.A02;
        int i = this.A00;
        1BL.A1F(c9hj, r0);
        return new 8iX(c9hj, r0, 2lO.A02, i);
    }
}
