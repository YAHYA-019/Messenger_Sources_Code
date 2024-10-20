package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.9da, reason: invalid class name */
/* loaded from: 9da.class */
public abstract class C9da {
    public static final ShapeDrawable A00(float f, int i) {
        float[] fArr = new float[8];
        fArr[0] = f;
        7zS.A1X(fArr, f, 1);
        7zT.A1X(fArr, f);
        ShapeDrawable A09 = 7zS.A09(fArr);
        A09.mutate();
        A09.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return A09;
    }

    public static void A01(C1rs c1rs, float f, int i) {
        c1rs.A0D(A00(f, i));
    }
}
