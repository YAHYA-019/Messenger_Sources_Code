package X;

/* loaded from: Itg.class */
public final class Itg implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$FbHeroPlayerListener$2";
    public final /* synthetic */ GQ1 A00;

    public Itg(GQ1 gq1) {
        this.A00 = gq1;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("FbHeroPlayer.mVideoPlayerListener.onStartBuffering", 580146846);
        try {
            this.A00.A02.A0Q.CMh();
            C00j.A01(-1698511069);
        } catch (Throwable th) {
            C00j.A01(656751864);
            throw th;
        }
    }
}
