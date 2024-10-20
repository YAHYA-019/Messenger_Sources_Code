package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: A8h.class */
public final class A8h implements AaP {
    public static final A8h A00 = new Object();

    public 1LI AJG(1LI r302, 1Iw r303) {
        11T.A0H(r303, r302);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Context context = r303.A0D;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{context.getColor(2132213878), context.getColor(2132213877)});
        2cM A002 = 2cK.A00(r303);
        2dD A0p = 7zM.A0p(r302, r303);
        A0p.A0D(gradientDrawable);
        return 7zL.A0V(A002, A0p.A2W());
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        1BK.A1M(r303, r302);
        int A002 = 7zR.A00(r303.A0D);
        2cM A003 = 2cK.A00(r303);
        8TM r0 = new 8TM(r303, new DxJ());
        r0.A2X(r302);
        r0.A2W(A002);
        r0.A2Z("Fire");
        r0.A2Y(A8l.A00);
        r0.A01.A01 = 0;
        r0.A0r(0.0f);
        A003.A2d(r0);
        A003.A2g(C1ro.FLEX_END);
        A003.A2O(false);
        A003.A2P(false);
        return new 8WU(A003.A00);
    }

    public boolean CXV(Context context) {
        return false;
    }

    public void Cln(View view) {
    }
}
