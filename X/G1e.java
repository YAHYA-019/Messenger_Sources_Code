package X;

/* loaded from: G1e.class */
public final class G1e implements Runnable {
    public static final String __redex_internal_original_name = "CDSBottomSheetContainerView$fadeOutGradientBackground$1$1";
    public final /* synthetic */ DOi A00;
    public final /* synthetic */ DPv A01;

    public G1e(DOi dOi, DPv dPv) {
        this.A00 = dOi;
        this.A01 = dPv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DOi dOi = this.A00;
        dOi.post(new G1d(dOi, this.A01));
    }
}
