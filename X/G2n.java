package X;

/* loaded from: G2n.class */
public final class G2n implements Runnable {
    public static final String __redex_internal_original_name = "InstantGameArcadeDataFetcher$maybePrefetchArcadeNTScreen$1";
    public final /* synthetic */ 2JX A00;
    public final /* synthetic */ FHD A01;

    public G2n(2JX r302, FHD fhd) {
        this.A00 = r302;
        this.A01 = fhd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2JX r0 = this.A00;
        FHD fhd = this.A01;
        new Rsz(r0, ((F9o) 1Br.A0B(fhd.A0D)).A01("instant_games_arcade_prefetch").A00(fhd.A09)).A00();
    }
}
