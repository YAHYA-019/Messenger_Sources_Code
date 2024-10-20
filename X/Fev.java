package X;

/* loaded from: Fev.class */
public final class Fev implements GEl {
    public final /* synthetic */ FEj A00;
    public final /* synthetic */ EnB A01;

    public Fev(FEj fEj, EnB enB) {
        this.A00 = fEj;
        this.A01 = enB;
    }

    @Override // X.GEl
    public void BuB() {
        FEj fEj = this.A00;
        EnB enB = fEj.A00;
        if (enB == null || !11T.A0O(this.A01, enB)) {
            return;
        }
        fEj.A01 = null;
        fEj.A00 = null;
        fEj.A02 = false;
        FEj.A00(fEj);
    }
}
