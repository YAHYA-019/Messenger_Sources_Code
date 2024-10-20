package X;

/* loaded from: Fxu.class */
public final class Fxu implements GHJ {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ DLQ A02;
    public final /* synthetic */ GJj A03;

    public Fxu(FyG fyG, FHh fHh, DLQ dlq, GJj gJj) {
        this.A03 = gJj;
        this.A02 = dlq;
        this.A00 = fyG;
        this.A01 = fHh;
    }

    public final void Cim(int i) {
        GJj gJj = this.A03;
        if (gJj != null) {
            DLQ dlq = this.A02;
            FyG fyG = this.A00;
            if (fyG != null) {
                FAv.A01(dlq, fyG, DKM.A08(fyG), gJj);
                return;
            }
            FHh fHh = this.A01;
            if (fHh != null) {
                FEK.A00(fHh, DKM.A08(fyG), gJj);
            }
        }
    }
}
