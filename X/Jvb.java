package X;

import android.view.View;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jvb.class */
public final class Jvb extends C66m {
    public final /* synthetic */ JwQ A00;

    public Jvb(JwQ jwQ) {
        this.A00 = jwQ;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        JwQ jwQ = this.A00;
        SettableFuture settableFuture = jwQ.A02;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
            jwQ.A02 = null;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        View view = this.A00.A06;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(f);
    }
}
