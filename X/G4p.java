package X;

/* loaded from: G4p.class */
public final class G4p implements Runnable {
    public static final String __redex_internal_original_name = "BodyParametricSliderPreviewUnit$addSliderListener$listener$1$onStopTrackingTouch$1";
    public final /* synthetic */ EHz A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ DLQ A02;
    public final /* synthetic */ GJj A03;

    public G4p(EHz eHz, FyG fyG, DLQ dlq, GJj gJj) {
        this.A00 = eHz;
        this.A03 = gJj;
        this.A02 = dlq;
        this.A01 = fyG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GJj gJj = this.A03;
        DLQ dlq = this.A02;
        FyG fyG = this.A01;
        if (gJj != null) {
            FAv.A01(dlq, fyG, DKM.A08(fyG), gJj);
        }
    }
}
