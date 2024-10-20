package X;

/* renamed from: X.6ug, reason: invalid class name */
/* loaded from: 6ug.class */
public final class C6ug extends C1rj {
    public 1LI A00;
    public C6td A01;
    public 5TY A02;

    public C6ug() {
        super("SectionConfigComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C6ug c6ug = (C6ug) super.A0l();
        1LI r0 = c6ug.A00;
        c6ug.A00 = r0 != null ? r0.A0l() : null;
        return c6ug;
    }

    @Override // X.C1rj
    public 1LI A0x() {
        return this.A00;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A00;
        2dD A00 = C2dB.A00(r302);
        A00.A2X(r0);
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(C6td.class, this.A01);
        A00.A03(5TY.class, this.A02);
        A00.A03(1iF.class, new 1iF(262644498145293L));
        return A00;
    }
}
