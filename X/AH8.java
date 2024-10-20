package X;

/* loaded from: AH8.class */
public final class AH8 implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedSearchInitialStateWithSuggestions$getSuggestionCyclingRunnable$1";
    public final /* synthetic */ C2lh A00;
    public final /* synthetic */ C2lh A01;
    public final /* synthetic */ C2lh A02;
    public final /* synthetic */ 8hB A03;
    public final /* synthetic */ Runnable A04;

    public AH8(C2lh c2lh, C2lh c2lh2, C2lh c2lh3, 8hB r305, Runnable runnable) {
        this.A04 = runnable;
        this.A01 = c2lh;
        this.A03 = r305;
        this.A02 = c2lh2;
        this.A00 = c2lh3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A03.A01.removeCallbacks(runnable);
        }
        C2lh c2lh = this.A01;
        8hB r0 = this.A03;
        c2lh.A05(AV0.A00(r0, 25));
        if (r0.A07) {
            this.A02.A04(AUO.A00);
        }
        this.A00.A03(7zN.A0i());
        if (runnable != null) {
            r0.A01.postDelayed(runnable, 20);
        }
        r0.A01.postDelayed(this, 4000L);
    }
}
