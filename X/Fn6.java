package X;

/* loaded from: Fn6.class */
public final class Fn6 implements GFk {
    public 1BY A00;
    public final C00i A02 = 7zN.A0D(98900);
    public final 6Gx A01 = DKD.A0Z();

    public Fn6(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.GFk
    public void AC8(1pK r302, FFY ffy) {
        if (!(r302 instanceof DYt)) {
            ((Fn7) this.A02.get()).AC8(r302, ffy);
            return;
        }
        DYt dYt = (DYt) r302;
        String A0r = ffy.A02() == null ? null : ffy.A02().A0r(1809547558);
        6Gx r0 = this.A01;
        FHR A00 = FHR.A00();
        A00.A04(ER3.A0E);
        A00.A08("appear");
        if (A0r != null) {
            A00.A01.put("idv_screen", A0r);
        }
        r0.A05(A00);
        dYt.A04 = new Elu(this, ffy, A0r);
    }
}
