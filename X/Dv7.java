package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* loaded from: Dv7.class */
public final class Dv7 extends 1LH {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02 = true;

    public Dv7(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C6tP A00 = F2c.A00(c2k5);
        if (this.A00.intValue() != 0) {
            throw 1BK.A1F();
        }
        int A002 = FHT.A00(MfW.A2A, A00);
        Drawable drawable = (Drawable) 2rO.A00(c2k5, new AKd(A002, 14, this, c2k5), Arrays.copyOf(AnonymousClass001.A1a(A002), 1));
        if (drawable == null) {
            drawable = null;
        }
        DwQ dwQ = null;
        if (drawable != null) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            2lQ r0 = 2lO.A02;
            dwQ = new DwQ(drawable, scaleType, 7zS.A0d(7zR.A0Q((2lO) null, 0S2.A00, Boolean.valueOf(this.A02)), 3yH.A09(c2k5, 2131953490)), 0, false);
        }
        return dwQ;
    }
}
