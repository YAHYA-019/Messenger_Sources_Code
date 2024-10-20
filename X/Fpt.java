package X;

/* loaded from: Fpt.class */
public final class Fpt implements GJw {
    public final /* synthetic */ E8M A00;

    public Fpt(E8M e8m) {
        this.A00 = e8m;
    }

    @Override // X.GJw
    public void C01(boolean z) {
        ((FHM) this.A00).A08 = z;
    }

    @Override // X.GJw
    public void CBy() {
        this.A00.A09(true);
    }

    @Override // X.GJw
    public void CI2() {
        GK8 gk8 = ((FHM) this.A00).A01;
        if (gk8 != null) {
            gk8.CI6();
        }
    }

    @Override // X.GJw
    public void CMN() {
        E8M e8m = this.A00;
        ((FHM) e8m).A05 = true;
        e8m.A07();
    }
}
