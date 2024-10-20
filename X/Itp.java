package X;

import com.facebook.video.exoserviceclient.FbVpsController;

/* loaded from: Itp.class */
public final class Itp implements Runnable {
    public static final String __redex_internal_original_name = "FbVpsController$delayedInitCache$runnable$1";
    public final /* synthetic */ FbVpsController A00;

    public Itp(FbVpsController fbVpsController) {
        this.A00 = fbVpsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5L4 r0 = this.A00.A0S;
        if (r0 != null) {
            5NA.A03("maybeInitCacheForStartup due to app idle", AnonymousClass001.A1Z());
            r0.A02.A09();
        }
    }
}
