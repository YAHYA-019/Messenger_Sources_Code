package X;

/* loaded from: Lku.class */
public final class Lku implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayFbLocationManager$ClientCallback$2";
    public final /* synthetic */ LcG A00;

    public Lku(LcG lcG) {
        this.A00 = lcG;
    }

    @Override // java.lang.Runnable
    public void run() {
        Ju8 ju8 = this.A00.A00;
        synchronized (ju8) {
            if (ju8.A02) {
                Ju8.A00(ju8, false);
                0fH.A0n("GooglePlayFbLocationManager", "Client disconnected unexpectedly");
                ju8.A0B(new KQd(KMw.A05));
            }
        }
    }
}
