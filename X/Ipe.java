package X;

/* loaded from: Ipe.class */
public final class Ipe implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomPresencePoller$pollRunnable$1";
    public final /* synthetic */ I0H A00;

    public Ipe(I0H i0h) {
        this.A00 = i0h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I0H i0h = this.A00;
        synchronized (i0h) {
            if (i0h.A0C) {
                I0H.A00(i0h.A02, i0h);
                ((1vU) 1Br.A0B(i0h.A04)).A03(i0h.A07, i0h.A0B);
            }
        }
    }
}
