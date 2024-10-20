package X;

/* loaded from: Esj.class */
public final class Esj {
    public final /* synthetic */ FHH A00;
    public final /* synthetic */ FyG A01;

    public Esj(FHH fhh, FyG fyG) {
        this.A01 = fyG;
        this.A00 = fhh;
    }

    public final void A00(GL7 gl7, GJj gJj) {
        FyG fyG = this.A01;
        if (fyG != null) {
            DKM A02 = DKM.A02(gl7);
            A02.A0I(fyG);
            DKM.A0D(gl7, fyG, A02, gJj);
        } else {
            FHH fhh = this.A00;
            DKc A08 = DKM.A08(gl7);
            FFn fFn = fhh.A04.A00;
            if (fFn != null) {
                FAv.A01(gl7, fFn.A02(), A08, gJj);
            }
        }
    }
}
