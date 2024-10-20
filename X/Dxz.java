package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: Dxz.class */
public final class Dxz extends C1rj {
    public MSy A00;
    public C6ce A01;

    public Dxz() {
        super("SottoPaywallPluginComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2JZ A0O;
        E02 e02 = (E02) 4YU.A0P(r302);
        MSy mSy = this.A00;
        C6ce c6ce = this.A01;
        boolean z = e02.A00;
        11T.A0F(mSy, 1);
        if (c6ce != null) {
            c6ce.CqC(C52j.A23, z);
        }
        if (!z || (A0O = mSy.A0O(1307399345)) == null) {
            return null;
        }
        Dky dky = (Dky) EVy.A00(A0O, Dky.class, 369377121);
        DuS A00 = DzF.A00(r302);
        A00.A2X(dky);
        A00.A01.A06 = true;
        A00.A2J("sotto_paywall");
        return A00.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 900907473652242L);
        return A00;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E02 e02 = (E02) r303;
        MSy mSy = this.A00;
        4YV.A1N(r302, mSy);
        Context context = r302.A0D;
        4fE r0 = (4fE) 7zN.A0k(context, 68126);
        Executor A14 = 7zQ.A14();
        r0.A0J(FwK.A01(r302, 48), mSy.A0c(), 7zR.A0s(), A14, false);
        C1en c1en = (C1en) AnonymousClass016.A00(context, C1en.class);
        if (c1en != null) {
            c1en.A5D(new C2061Dam(c1en, r0));
        }
        e02.A00 = true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
