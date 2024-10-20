package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.8l9, reason: invalid class name */
/* loaded from: 8l9.class */
public final class C8l9 extends C1rj {
    public 1LI A00;
    public boolean A01;

    public C8l9() {
        super("FadeDownDecoratorComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, Boolean.valueOf(this.A01), null};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8l9 c8l9 = (C8l9) super.A0l();
        c8l9.A00 = 4YV.A0J(c8l9.A00);
        return c8l9;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r303 = this.A00;
        boolean z = this.A01;
        11T.A0H(r302, r303);
        boolean AZk = 1BL.A0Q().AZk(36318269224857924L);
        2cM A00 = 2cK.A00(r302);
        if (!z) {
            r303 = null;
        } else if (AZk) {
            2dD A0p = 7zM.A0p(r303, r302);
            String name = r303.getClass().getName();
            11T.A0A(name);
            A0p.A2L(name);
            A0p.A0d();
            r303 = A0p.A2W();
        }
        return 7zL.A0V(A00, r303);
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        1LI r0 = this.A00;
        11T.A0F(r0, 1);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        11T.A0A(displayMetrics);
        String name = r0.getClass().getName();
        11T.A0A(name);
        5X3 A02 = C3s9.A02(name);
        A02.A03(C2jm.A09);
        float f = displayMetrics.heightPixels;
        A02.A01(f);
        A02.A02(f);
        A02.A02(7zQ.A01(A02, C2jm.A00));
        return A02;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 2698774113730146L);
        return A00;
    }
}
