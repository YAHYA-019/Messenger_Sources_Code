package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jvd.class */
public final class Jvd extends C66m {
    public final /* synthetic */ JwS A00;

    public Jvd(JwS jwS) {
        this.A00 = jwS;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        this.A00.A0X(true);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        JwS jwS = this.A00;
        SettableFuture settableFuture = jwS.A02;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
        }
        if (jwS.A07.A0C() && jwS.A08.A0C()) {
            jwS.A0X(false);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        JwS jwS = this.A00;
        jwS.setScaleX(f);
        jwS.setScaleY(f);
    }
}
