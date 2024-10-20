package X;

/* loaded from: Ixp.class */
public final class Ixp implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setIsCallActive$runnable$1";
    public final /* synthetic */ Gw0 A00;
    public final /* synthetic */ boolean A01;

    public Ixp(Gw0 gw0, boolean z) {
        this.A01 = z;
        this.A00 = gw0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        Gw0 gw0 = this.A00;
        if (z != gw0.A04) {
            if (!z) {
                gw0.A05 = false;
                gw0.A09.A01.reset();
            }
            gw0.A04 = z;
        }
    }
}
