package X;

/* loaded from: Ir5.class */
public final /* synthetic */ class Ir5 implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerVideoController$$ExternalSyntheticLambda0";
    public final /* synthetic */ GoY A00;

    @Override // java.lang.Runnable
    public final void run() {
        GoY goY = this.A00;
        IPl iPl = goY.A05;
        if (iPl != null) {
            JKA jka = goY.A0E;
            int BJL = iPl.A06.BJL();
            jka.D7g(BJL <= 0 ? 0.0f : r0.Afn() / BJL);
        }
        4YU.A0G(goY.A0D).postDelayed(goY.A06, 42);
    }
}
