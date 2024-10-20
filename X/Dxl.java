package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* loaded from: Dxl.class */
public final class Dxl extends C1rj {
    public EzJ A00;
    public ImmutableList A01;

    public Dxl() {
        super("FB4ACustomPivotLinksImplComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, null, this.A01, null};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        Dzp dzp = (Dzp) 4YU.A0P(r302);
        EzJ ezJ = this.A00;
        ImmutableList immutableList = this.A01;
        2kG r0 = dzp.A00;
        4YV.A1M(ezJ, 3, r0);
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        E0j e0j = new E0j();
        e0j.A01 = ezJ;
        if (immutableList != null) {
            if (e0j.A02.isEmpty()) {
                e0j.A02 = immutableList;
            } else {
                e0j.A02.addAll(immutableList);
            }
        }
        e0j.A00 = View.MeasureSpec.getSize(i);
        A00.A2d(e0j);
        2kW r02 = new 2kW();
        r02.A01 = 0;
        r02.A08 = false;
        r02.A02 = (-1) << (-1);
        A00.A2f(r02.A00());
        A00.A2Y(r0);
        A00.A0l(36.0f);
        return A00.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.DSo, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        11T.A0F(r302, 0);
        float A01 = F0a.A01(EPJ.A0o, r302);
        float A012 = F0a.A01(EPJ.A09, r302);
        ?? obj = new Object();
        ((DSo) obj).A01 = A01;
        ((DSo) obj).A00 = A012;
        ((Dzp) r303).A00 = obj;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
