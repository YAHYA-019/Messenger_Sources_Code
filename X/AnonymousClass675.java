package X;

import android.util.SparseArray;

/* renamed from: X.675, reason: invalid class name */
/* loaded from: 675.class */
public abstract class AnonymousClass675 {
    public static final SparseArray A00(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray.size() == 0) {
            if (sparseArray2 != null) {
                return sparseArray2;
            }
            sparseArray = new SparseArray();
        } else if (sparseArray2 != null && sparseArray2.size() != 0) {
            SparseArray sparseArray3 = new SparseArray(sparseArray.size() + sparseArray2.size());
            int size = sparseArray.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                sparseArray3.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                i = i2 + 1;
            }
            int size2 = sparseArray2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                sparseArray3.put(sparseArray2.keyAt(i3), sparseArray2.valueAt(i3));
            }
            return sparseArray3;
        }
        return sparseArray;
    }
}
