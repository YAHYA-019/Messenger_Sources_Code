package X;

import android.view.View;

/* renamed from: X.8jy, reason: invalid class name */
/* loaded from: 8jy.class */
public final class C8jy extends C1rj {
    public 9Ui A00;

    public C8jy() {
        super("RtcFilledTertiaryButtonTitleBarLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        9Ui r0 = this.A00;
        boolean A1X = 1BL.A1X(r302, r0);
        C1rq A01 = C1rg.A01(r302, null, 0);
        8Ph r02 = new 8Ph(r302, new 8mF());
        CharSequence charSequence = r0.A05;
        8mF r03 = r02.A01;
        r03.A05 = charSequence;
        r02.A02.set(0);
        r03.A07 = A1X;
        r03.A01 = r02.A02.A0B(r0.A01);
        r03.A00 = r0.A00;
        r03.A04 = r0.A02;
        r02.A2S(r0.A03);
        7zO.A1K(r02, 2RH.A05);
        7zN.A1C(r02, r302, C8jy.class, "RtcFilledTertiaryButtonTitleBarLayout");
        return 7zL.A0c(r02, A01);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        9Ui r02 = ((C8jy) r0).A00;
        1BL.A1F(r02, view);
        r02.A04.onClick(view);
        return null;
    }
}
