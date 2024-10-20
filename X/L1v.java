package X;

import android.util.SparseArray;

/* loaded from: L1v.class */
public final class L1v {
    public L85 A00;
    public final SparseArray A01;

    public L1v() {
        this(1);
    }

    public L1v(int i) {
        this.A01 = new SparseArray(i);
    }

    public void A00(L85 l85, int i, int i2) {
        int A02 = LA6.A02(L85.A00(l85), i);
        SparseArray sparseArray = this.A01;
        L1v l1v = (L1v) sparseArray.get(A02);
        if (l1v == null) {
            l1v = new L1v(1);
            sparseArray.put(LA6.A02(L85.A00(l85), i), l1v);
        }
        if (i2 <= i) {
            l1v.A00 = l85;
        } else {
            l1v.A00(l85, i + 1, i2);
        }
    }
}
