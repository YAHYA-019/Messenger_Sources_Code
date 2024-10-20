package X;

/* loaded from: F5w.class */
public final class F5w {
    public Exz A00;
    public boolean A01 = false;
    public final GIk A02;
    public final EsZ A03;

    public F5w(GIk gIk, EsZ esZ) {
        this.A03 = esZ;
        this.A02 = gIk;
        this.A00 = gIk.BfN(null);
        A00(this);
    }

    public static void A00(F5w f5w) {
        Exz exz = f5w.A00;
        if (exz.A01) {
            EqC eqC = f5w.A03.A00;
            eqC.A02 = true;
            1Pr A00 = F5D.A00(eqC.A04.A04);
            A00.A00.remove(eqC.A05);
            return;
        }
        GIp gIp = (GIp) exz.A00;
        if (gIp == null) {
            f5w.A00 = f5w.A02.BfN(null);
            A00(f5w);
        } else {
            gIp.Civ(new FuA(gIp, f5w), f5w.A03, null);
        }
    }
}
