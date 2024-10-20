package X;

/* loaded from: Lkr.class */
public final class Lkr implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayFbLocationManager$1";
    public final /* synthetic */ Ju8 A00;

    public Lkr(Ju8 ju8) {
        this.A00 = ju8;
    }

    @Override // java.lang.Runnable
    public void run() {
        Ju8 ju8 = this.A00;
        synchronized (ju8) {
            if (ju8.A02) {
                ju8.A01.A08();
            } else {
                ju8.A0D("end_reason", "not currently running");
                ju8.A0F((short) 3);
            }
        }
    }
}
