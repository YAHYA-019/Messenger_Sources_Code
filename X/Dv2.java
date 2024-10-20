package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* loaded from: Dv2.class */
public final class Dv2 extends 1LH {
    public final 2lO A00;
    public final Fy3 A01;

    public Dv2(2lO r302, Fy3 fy3) {
        this.A01 = fy3;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C6tP A00 = F2c.A00(c2k5);
        Fy3 fy3 = this.A01;
        EyA eyA = (EyA) F2c.A01(c2k5, fy3);
        Drawable drawable = (Drawable) 2rO.A00(c2k5, new GAW(eyA, 45), Arrays.copyOf(new Object[]{fy3, A00}, 2));
        if (drawable == null) {
            drawable = null;
        }
        DwQ dwQ = null;
        if (drawable != null) {
            long A08 = 7zL.A08(eyA.A00);
            2lQ r0 = 2lO.A02;
            2lO A0i = 7zT.A0i((2lO) null, 0S2.A00, A08);
            2lO r02 = this.A00;
            if (r02 != null) {
                A0i = r02.A00(A0i);
            }
            dwQ = new DwQ(drawable, ImageView.ScaleType.CENTER_CROP, A0i, 0, false);
        }
        return dwQ;
    }
}
