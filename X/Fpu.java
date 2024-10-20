package X;

/* loaded from: Fpu.class */
public final class Fpu implements GJw {
    public final /* synthetic */ FHM A00;

    public Fpu(FHM fhm) {
        this.A00 = fhm;
    }

    @Override // X.GJw
    public void C01(boolean z) {
        this.A00.A08 = z;
    }

    @Override // X.GJw
    public void CBy() {
        this.A00.A09(true);
    }

    @Override // X.GJw
    public void CI2() {
        GK8 gk8 = this.A00.A01;
        if (gk8 != null) {
            gk8.CI6();
        }
    }

    @Override // X.GJw
    public void CMN() {
        FHM fhm = this.A00;
        fhm.A05 = true;
        fhm.A07();
    }
}
