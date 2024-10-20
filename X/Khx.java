package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: Khx.class */
public final class Khx {
    public final SparseArray A00;
    public final 6YJ A01;

    public Khx(SparseArray sparseArray, 6YJ r303) {
        this.A01 = r303;
        SparseBooleanArray sparseBooleanArray = r303.A00;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= sparseBooleanArray.size()) {
                this.A00 = sparseArray2;
                return;
            }
            int A00 = r303.A00(i2);
            Object obj = sparseArray.get(A00);
            obj.getClass();
            sparseArray2.append(A00, obj);
            i = i2 + 1;
        }
    }
}
