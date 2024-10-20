package X;

/* loaded from: G4w.class */
public final class G4w implements Runnable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager$loadEffectInternalV2$loadToken$1$onFail$1";
    public final /* synthetic */ JHj A00;
    public final /* synthetic */ Fcf A01;
    public final /* synthetic */ FEf A02;
    public final /* synthetic */ String A03;

    public G4w(JHj jHj, Fcf fcf, FEf fEf, String str) {
        this.A01 = fcf;
        this.A00 = jHj;
        this.A02 = fEf;
        this.A03 = str;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Eti] */
    @Override // java.lang.Runnable
    public final void run() {
        Fcf fcf = this.A01;
        JHj jHj = this.A00;
        FEf fEf = this.A02;
        ?? obj = new Object();
        obj.A00 = ENM.A0A;
        obj.A01 = this.A03;
        Fcf.A01(jHj, obj.A00(), fcf, fEf);
    }
}
