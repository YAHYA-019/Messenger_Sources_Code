package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jve.class */
public final class Jve extends C66m {
    public final /* synthetic */ JwT A00;

    public Jve(JwT jwT) {
        this.A00 = jwT;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        this.A00.setVisibility(0);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        if (c66i.A09.A00 == 0.0d) {
            this.A00.setVisibility(8);
        }
        JwT jwT = this.A00;
        SettableFuture settableFuture = jwT.A08;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
            jwT.A08 = null;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        JwT.A01(this.A00);
    }
}
