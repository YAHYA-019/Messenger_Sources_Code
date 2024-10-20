package X;

import android.util.SparseArray;

/* renamed from: X.6ar, reason: invalid class name */
/* loaded from: 6ar.class */
public final class C6ar {
    public int A00;
    public final SparseArray A01;
    public final C6aq A02;

    public C6ar() {
        this(new 7wV());
    }

    public C6ar(C6aq c6aq) {
        this.A01 = new SparseArray();
        this.A02 = c6aq;
        this.A00 = -1;
    }

    public Object A00(int i) {
        SparseArray sparseArray;
        int i2 = this.A00;
        if (i2 == -1) {
            i2 = 0;
            this.A00 = 0;
        }
        while (i2 > 0 && i < this.A01.keyAt(i2)) {
            i2 = this.A00 - 1;
            this.A00 = i2;
        }
        while (true) {
            int i3 = this.A00;
            sparseArray = this.A01;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(i3 + 1)) {
                break;
            }
            this.A00++;
        }
        return sparseArray.valueAt(this.A00);
    }
}
