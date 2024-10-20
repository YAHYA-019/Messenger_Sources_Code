package X;

/* loaded from: Ivg.class */
public final /* synthetic */ class Ivg implements Runnable {
    public static final String __redex_internal_original_name = "MsqrdCameraViewCoordinator$$ExternalSyntheticLambda1";
    public final /* synthetic */ I5B A00;
    public final /* synthetic */ IRS A01;

    public /* synthetic */ Ivg(I5B i5b, IRS irs) {
        this.A01 = irs;
        this.A00 = i5b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IRS irs = this.A01;
        I5B i5b = this.A00;
        HqE hqE = irs.A03;
        if (hqE != null) {
            hqE.A00(i5b.A01 / i5b.A00);
        }
    }
}
