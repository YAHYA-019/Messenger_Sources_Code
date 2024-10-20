package X;

import android.util.SparseArray;

/* renamed from: X.3Q5, reason: invalid class name */
/* loaded from: 3Q5.class */
public final class C3Q5 {
    public 3Fr A00;
    public 3Fr A01;
    public final SparseArray A02 = new SparseArray();

    public static void A00(3Fr r301, C3Q5 c3q5) {
        synchronized (c3q5) {
            3Fr r0 = r301.A02;
            3Fr r02 = r301.A01;
            if (r0 != null) {
                r0.A01 = r02;
            }
            if (r02 != null) {
                r02.A02 = r0;
            }
            r301.A02 = null;
            r301.A01 = null;
            if (r301 == c3q5.A00) {
                c3q5.A00 = r02;
            }
            if (r301 == c3q5.A01) {
                c3q5.A01 = r0;
            }
        }
    }
}
