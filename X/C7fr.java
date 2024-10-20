package X;

/* renamed from: X.7fr, reason: invalid class name */
/* loaded from: 7fr.class */
public final class C7fr extends C1rj {
    public 5A6 A00;

    public C7fr() {
        super("MigCloseIconButtonLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5A6 r0 = this.A00;
        8Tl A00 = C5hr.A00(r302);
        A00.A2X(r0.A01);
        A00.A2Z(true);
        A00.A1J(2131954232);
        A00.A2Y(r0.A02);
        A00.A2T(1LI.A06(r302, C7fr.class, "MigCloseIconButtonLayout"));
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C7fr) r0).A00.A00.onClick(((3xC) obj).A00);
        return null;
    }
}
