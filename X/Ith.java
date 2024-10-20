package X;

/* loaded from: Ith.class */
public final class Ith implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$FbHeroPlayerListener$3";
    public final /* synthetic */ GQ1 A00;

    public Ith(GQ1 gq1) {
        this.A00 = gq1;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("FbHeroPlayer.mVideoPlayerListener.onStopBuffering", 136601655);
        try {
            this.A00.A02.A0Q.CNh();
            C00j.A01(1422826529);
        } catch (Throwable th) {
            C00j.A01(1897726688);
            throw th;
        }
    }
}
