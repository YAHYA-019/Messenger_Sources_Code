package X;

/* loaded from: Ipw.class */
public final class Ipw implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerAdsGrootVideoController$1";
    public final /* synthetic */ IUT A00;

    public Ipw(IUT iut) {
        this.A00 = iut;
    }

    @Override // java.lang.Runnable
    public void run() {
        IUT iut = this.A00;
        GRD A00 = IUT.A00(iut);
        if (iut.A03 != null && A00 != null) {
            if (A00.A02() >= iut.A01) {
                iut.A09.BrH();
            } else {
                iut.A0A.A03(Math.min(Math.max(0.0f, A00.A02() / iut.A01), 1.0f));
            }
        }
        iut.A07.postDelayed(iut.A0C, 42);
    }
}
