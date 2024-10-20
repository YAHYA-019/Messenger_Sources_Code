package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7g3, reason: invalid class name */
/* loaded from: 7g3.class */
public final class C7g3 extends C1rj {
    public 1LI A00;
    public 74E A01;
    public 5vW A02;

    public C7g3() {
        super("MessageClickHandlerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C7g3 c7g3 = (C7g3) super.A0l();
        c7g3.A00 = 4YV.A0J(c7g3.A00);
        return c7g3;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A00;
        11T.A0H(r302, r0);
        2dD A00 = C2dB.A00(r302);
        A00.A2T(1LI.A06(r302, C7g3.class, "MessageClickHandlerComponent"));
        A00.A2X(r0);
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        View view = ((3xC) obj).A00;
        C7g3 c7g3 = (C7g3) r02;
        5vW r04 = c7g3.A02;
        74E r05 = c7g3.A01;
        11T.A0F(r03, 0);
        1BL.A1H(r04, r05, view);
        Context context = r03.A0D;
        11T.A0A(context);
        r05.BoE(context, view, r04);
        return null;
    }
}
