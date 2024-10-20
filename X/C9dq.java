package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9dq, reason: invalid class name */
/* loaded from: 9dq.class */
public abstract class C9dq {
    public static final ShapeDrawable A00(1Iw r301, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        float A01 = 7zL.A01(4YU.A0E(r301), 2132279321);
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = A01;
            i++;
        } while (i < 8);
        ShapeDrawable A09 = 7zS.A09(fArr);
        A09.setColorFilter(C2qb.A00(migColorScheme, migColorScheme.AjC()), PorterDuff.Mode.SRC_ATOP);
        return A09;
    }

    public static final 2lO A01(C2k6 c2k6) {
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A06, 3yH.A06(c2k6, 2132279305));
        Integer num = 0S2.A01;
        2lO A0T = 7zS.A0T(4YV.A0L(7zS.A0X(7zR.A0Q(A0g, num, "android.widget.Button"), c2k6, num, 2132279321), 0S2.A0N, false, 1), 3yH.A06(c2k6, 2132279379));
        int dimensionPixelSize = 4YU.A0E(c2k6.AeS()).getDimensionPixelSize(2132279321);
        return 4YV.A0L(A0T, 0S2.A05, dimensionPixelSize == 0 ? C5B1.A00() : C5B1.A01(dimensionPixelSize), 1);
    }
}
