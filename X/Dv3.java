package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: Dv3.class */
public final class Dv3 extends 1LH {
    public final 2lO A00;
    public final Fy2 A01;

    public Dv3(2lO r302, Fy2 fy2) {
        11T.A0F(r302, 2);
        this.A01 = fy2;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        EyB eyB = (EyB) F2c.A01(c2k5, this.A01);
        long A08 = 7zL.A08(eyB.A00);
        Drawable A00 = EZ3.A00(c2k5, new GAW(eyB, 48), new Object[]{eyB});
        2lO r304 = this.A00;
        C02963wp A0i = 7zL.A0i(0S2.A00, A08);
        if (r304 == 2lO.A02) {
            r304 = null;
        }
        return new DwQ(A00, ImageView.ScaleType.CENTER_CROP, 4YV.A0K(7zL.A0g(r304, A0i), 0S2.A01, A08), 0, false);
    }
}
