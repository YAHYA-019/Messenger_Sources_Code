package X;

import com.facebook.messaging.internalprefs.fxpf.FXPFServiceCacheDebugFragment;

/* loaded from: D4u.class */
public final class D4u implements GJD {
    public final /* synthetic */ FXPFServiceCacheDebugFragment A00;

    public D4u(FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment) {
        this.A00 = fXPFServiceCacheDebugFragment;
    }

    public void BxV() {
        FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment = this.A00;
        fXPFServiceCacheDebugFragment.A04.runOnUiThread(new S81(fXPFServiceCacheDebugFragment));
    }

    public void onSuccess() {
        FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment = this.A00;
        fXPFServiceCacheDebugFragment.A04.runOnUiThread(new S82(fXPFServiceCacheDebugFragment));
        fXPFServiceCacheDebugFragment.runOnUiThread(new S80(fXPFServiceCacheDebugFragment));
    }
}
