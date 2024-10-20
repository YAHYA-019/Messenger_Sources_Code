package X;

/* loaded from: Lkv.class */
public final class Lkv implements Runnable {
    public static final String __redex_internal_original_name = "BaseFbLocationManager$scheduleTimeout$1";
    public final /* synthetic */ LDH A00;

    public Lkv(LDH ldh) {
        this.A00 = ldh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LDH ldh = this.A00;
        synchronized (ldh) {
            ldh.A08();
            KMw kMw = KMw.A04;
            LDH.A01(ldh, "TIMEOUT");
            ldh.A05.execute(new LnW(new KQd(kMw), ldh));
        }
    }
}
