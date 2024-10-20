package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jvg.class */
public final class Jvg extends C66m {
    public final /* synthetic */ L2O A00;

    public Jvg(L2O l2o) {
        this.A00 = l2o;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        SettableFuture settableFuture = this.A00.A00;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMS(C66i c66i) {
        if (c66i.A0C()) {
            if (JQx.A01(c66i.A09.A00, c66i.A01) <= c66i.A00) {
                0fH.A0j("ChatHeadsFullViewBackgroundAnimator", "Spring set with same end value, notifying listeners.");
                SettableFuture settableFuture = this.A00.A00;
                if (settableFuture != null) {
                    settableFuture.set((Object) null);
                }
            }
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        this.A00.A01.setAlpha((float) c66i.A09.A00);
    }
}
