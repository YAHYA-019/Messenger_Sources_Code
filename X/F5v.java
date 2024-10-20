package X;

import android.view.View;

/* loaded from: F5v.class */
public final class F5v {
    public final C23d A00;
    public final C1st A01;
    public final boolean A02;
    public final FIx A03;

    public F5v(FIx fIx, C23d c23d, C1st c1st, boolean z) {
        this.A01 = c1st;
        this.A00 = c23d;
        this.A03 = fIx;
        this.A02 = z;
    }

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = 1073741824;
        } else {
            if (Float.isNaN(f2)) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            round = Math.round(f2);
            i = (-1) << (-1);
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }
}
