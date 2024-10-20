package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: A8c.class */
public final class A8c implements AaP {
    public final 2S4 A00;
    public final String A01;

    public A8c(2S4 r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        11T.A0H(r303, r302);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Context context = r303.A0D;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{context.getColor(2132213878), context.getColor(2132213877)});
        2cM A00 = 2cK.A00(r303);
        2dD A0p = 7zM.A0p(r302, r303);
        A0p.A0D(gradientDrawable);
        return 7zL.A0V(A00, A0p.A2W());
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        1BK.A1M(r303, r302);
        2S4 r0 = this.A00;
        Context A0A = 7zL.A0A(r303);
        8AR r02 = (8AR) r0.A00(68016);
        int A00 = 7zR.A00(A0A);
        2cM A002 = 2cK.A00(r303);
        8TM r03 = new 8TM(r303, new DxJ());
        r03.A2X(r302);
        r03.A2W(A00);
        r03.A2Z(this.A01);
        r03.A2Y(r02);
        r03.A01.A01 = 0;
        r03.A0r(50.0f);
        A002.A2d(r03);
        A002.A2g(C1ro.FLEX_END);
        return A002.A00;
    }

    public boolean CXV(Context context) {
        11T.A0F(context, 0);
        return ((8AR) this.A00.A00(68016)).A00(this.A01);
    }

    public void Cln(View view) {
    }
}
