package X;

/* loaded from: Dwo.class */
public final class Dwo extends C1rj {
    public 2O4 A00;
    public Eeb A01;
    public FyG A02;

    public Dwo() {
        super("NTRecyclerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00, null, 1BK.A0d()};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FyG fyG = this.A02;
        2O4 r0 = this.A00;
        Eeb eeb = this.A01;
        try {
            C2ki A00 = C2kV.A00(r302);
            A00.A2h(true);
            7zL.A1K(r302);
            QOh qOh = new QOh();
            qOh.A02 = fyG;
            qOh.A00 = eeb;
            A00.A2d(qOh);
            A00.A2X(null);
            A00.A2j(true);
            A00.A2Z(r0);
            A00.A2g(null);
            2kY r02 = new 2kY();
            2XM r03 = new 2XM(2XL.A0E);
            r03.A0D = false;
            r02.A00 = r03.A00();
            2kZ A002 = r02.A00();
            2kW r04 = new 2kW();
            r04.A07 = A002;
            A00.A2f(r04.A00());
            return A00.A2W();
        } catch (Exception e) {
            FAo.A00(fyG, e);
            return null;
        }
    }
}
