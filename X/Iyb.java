package X;

/* loaded from: Iyb.class */
public final class Iyb implements Runnable {
    public static final String __redex_internal_original_name = "FbGrootPlayer$GrootPlayerListenerImpl$onSurfaceDestroyed$1";
    public final /* synthetic */ GRT A00;
    public final /* synthetic */ GRS A01;

    public Iyb(GRT grt, GRS grs) {
        this.A00 = grt;
        this.A01 = grs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GRS grs = this.A00.A00;
        if (grs.ignoreSurfaceDestroy.get()) {
            grs.ignoreSurfaceDestroy.set(false);
            return;
        }
        IhF A0e = GOo.A0e(grs);
        if (A0e != null) {
            A0e.A0y = C52j.A2O;
        }
        GRS.A0J(C52j.A2O, grs);
    }
}
