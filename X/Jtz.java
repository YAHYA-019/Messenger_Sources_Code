package X;

import android.view.View;

/* loaded from: Jtz.class */
public final class Jtz extends JiI {
    public 2XJ A02;
    public int A01 = -1;
    public int A00 = -1;

    public static final View A00(2XA r301, Jtz jtz) {
        2XK r303 = jtz.A02;
        if (r303 == null) {
            r303 = new 2XK(r301);
            jtz.A02 = r303;
        }
        int A0U = r301.A0U();
        View view = null;
        if (A0U != 0) {
            int A06 = r303.A06();
            int i = (-1) >>> 1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= A0U) {
                    break;
                }
                View A0d = r301.A0d(i3);
                int A0B = r303.A0B(A0d);
                int A05 = GOn.A05(A0B, A06);
                if (A0B <= A06 && A05 < i) {
                    view = A0d;
                    i = A05;
                }
                i2 = i3 + 1;
            }
        }
        return view;
    }

    public static final void A01(2XA r301, Jtz jtz, int i) {
        if (i == -1) {
            jtz.A01 = -1;
            jtz.A00 = -1;
        } else {
            jtz.A01 = Math.max(i - 1, -1);
            jtz.A00 = Math.min(i + 1, r301.A0V() - 1);
        }
    }
}
