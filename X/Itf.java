package X;

/* loaded from: Itf.class */
public final class Itf implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$FbHeroPlayerListener$1";
    public final /* synthetic */ GQ1 A00;

    public Itf(GQ1 gq1) {
        this.A00 = gq1;
    }

    @Override // java.lang.Runnable
    public void run() {
        GQ1 gq1 = this.A00;
        GPm gPm = gq1.A02;
        if (gPm.A0v) {
            C00j.A05("FbHeroPlayer.mVideoPlayerListener.onAfterVideoPlayed", -1900660987);
            try {
                GPn gPn = gq1.A01;
                if (gPn != null) {
                    gPm.A0Q.Bia(gPn.A0o, gPm.A07.A0S);
                }
                C00j.A01(589837385);
            } catch (Throwable th) {
                C00j.A01(-1976233063);
                throw th;
            }
        }
    }
}
