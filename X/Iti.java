package X;

/* loaded from: Iti.class */
public final class Iti implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$FbHeroPlayerListener$4";
    public final /* synthetic */ GQ1 A00;

    public Iti(GQ1 gq1) {
        this.A00 = gq1;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("FbHeroPlayer.mVideoPlayerListener.onStreamComplete", -198625355);
        try {
            GPm gPm = this.A00.A02;
            gPm.A0Q.CNz(gPm.A04.A0M);
            C00j.A01(-1908550446);
        } catch (Throwable th) {
            C00j.A01(-1703890463);
            throw th;
        }
    }
}
