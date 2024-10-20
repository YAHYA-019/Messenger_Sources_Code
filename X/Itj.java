package X;

/* loaded from: Itj.class */
public final class Itj implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$FbHeroPlayerListener$8";
    public final /* synthetic */ GQ1 A00;

    public Itj(GQ1 gq1) {
        this.A00 = gq1;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("FbHeroPlayer.mVideoPlayerListener.onDrawnToSurface", -540573966);
        try {
            GQ1 gq1 = this.A00;
            GPn gPn = gq1.A01;
            if (gPn != null) {
                gq1.A02.A0Q.BiJ(gPn.A0o);
            }
            C00j.A01(-1638945554);
        } catch (Throwable th) {
            C00j.A01(-973202978);
            throw th;
        }
    }
}
