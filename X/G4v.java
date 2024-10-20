package X;

/* loaded from: G4v.class */
public final class G4v implements Runnable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager$loadEffectInternalV2$2$1";
    public final /* synthetic */ JHj A00;
    public final /* synthetic */ Eti A01;
    public final /* synthetic */ Fcf A02;
    public final /* synthetic */ FEf A03;

    public G4v(JHj jHj, Eti eti, Fcf fcf, FEf fEf) {
        this.A02 = fcf;
        this.A00 = jHj;
        this.A03 = fEf;
        this.A01 = eti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fcf fcf = this.A02;
        Fcf.A01(this.A00, this.A01.A00(), fcf, this.A03);
    }
}
