package X;

/* renamed from: X.Az0, reason: case insensitive filesystem */
/* loaded from: Az0.class */
public final class C2007Az0 extends C1rj {
    public 5A0 A00;

    public C2007Az0() {
        super("MigCheckboxAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5A0 r0 = this.A00;
        AwZ A00 = Dyc.A00(r302);
        A00.A2Y(r0.A02);
        A00.A01.A00 = 1LI.A09(r302, C2007Az0.class, "MigCheckboxAccessoryLayout", -952092468);
        A00.A2X(r0.A01);
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -952092468) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C2007Az0) r0).A00.A00.Bnv(((Ehh) obj).A01);
        return null;
    }
}
