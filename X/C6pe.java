package X;

import android.R;
import android.content.res.ColorStateList;
import android.util.SparseIntArray;

/* renamed from: X.6pe, reason: invalid class name */
/* loaded from: 6pe.class */
public final class C6pe {
    public static final int[] A01 = {R.attr.state_pressed, -16842910, R.attr.state_enabled};
    public SparseIntArray A00 = new SparseIntArray();

    /* JADX WARN: Type inference failed for: r0v10, types: [int[], int[][]] */
    public static ColorStateList A00(SparseIntArray sparseIntArray) {
        int size = sparseIntArray.size();
        int[] iArr = A01;
        if (size > 3) {
            throw AnonymousClass001.A0N("More states have been set than specified by build order.");
        }
        int size2 = sparseIntArray.size();
        ?? r0 = new int[size2];
        int size3 = sparseIntArray.size();
        int[] iArr2 = new int[size3];
        if (size2 < sparseIntArray.size() || size3 < sparseIntArray.size() || size2 != size3) {
            throw AnonymousClass001.A0L("Provided states or color array not large enough or size of states and colors not same.");
        }
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (sparseIntArray.indexOfKey(i3) >= 0) {
                int[] iArr3 = new int[1];
                iArr3[0] = i3;
                r0[i2] = iArr3;
                iArr2[i2] = sparseIntArray.get(i3);
                i2++;
            }
            i++;
        } while (i < 3);
        return new ColorStateList(r0, iArr2);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [int[], int[][]] */
    public ColorStateList A01() {
        SparseIntArray sparseIntArray = this.A00;
        int size = sparseIntArray.size();
        int[] iArr = A01;
        if (size > 3) {
            throw AnonymousClass001.A0N("More states have been set than specified by build order.");
        }
        int size2 = sparseIntArray.size();
        ?? r0 = new int[size2];
        int size3 = sparseIntArray.size();
        int[] iArr2 = new int[size3];
        if (size2 < sparseIntArray.size() || size3 < sparseIntArray.size() || size2 != size3) {
            throw AnonymousClass001.A0L("Provided states or color array not large enough or size of states and colors not same.");
        }
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (sparseIntArray.indexOfKey(i3) >= 0) {
                int[] iArr3 = new int[1];
                iArr3[0] = i3;
                r0[i2] = iArr3;
                iArr2[i2] = sparseIntArray.get(i3);
                i2++;
            }
            i++;
        } while (i < 3);
        return new ColorStateList(r0, iArr2);
    }

    public void A02(int i) {
        this.A00.put(R.attr.state_enabled, i);
    }
}
