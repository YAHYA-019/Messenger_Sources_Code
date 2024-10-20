package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jva.class */
public final class Jva extends C66m {
    public final /* synthetic */ JwT A00;

    public Jva(JwT jwT) {
        this.A00 = jwT;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        JwT jwT = this.A00;
        SettableFuture settableFuture = jwT.A07;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
            jwT.A07 = null;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        JwT.A01(this.A00);
    }
}
