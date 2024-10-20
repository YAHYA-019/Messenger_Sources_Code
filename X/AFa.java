package X;

/* loaded from: AFa.class */
public final class AFa implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedSearchInitialStateWithSuggestions$render$2";
    public final /* synthetic */ 4NU A00;
    public final /* synthetic */ 8hB A01;

    public AFa(4NU r302, 8hB r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) 7zL.A10(this.A00);
        if (runnable != null) {
            this.A01.A01.removeCallbacks(runnable);
        }
    }
}
