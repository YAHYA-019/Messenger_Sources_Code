package X;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1sf, reason: invalid class name */
/* loaded from: 1sf.class */
public final class C1sf implements C1sg {
    public static final C1si A03 = new Object();
    public final java.util.Map A02 = new HashMap();
    public final java.util.Map A00 = new HashMap();
    public final java.util.Map A01 = new HashMap();

    public static final void A00(Pair pair, C1sf c1sf, C1rn c1rn) {
        if (c1rn != null) {
            java.util.Map map = c1sf.A02;
            Set set = (Set) map.get(c1rn);
            if (set == null) {
                set = new HashSet();
                map.put(c1rn, set);
                c1rn.A01.add(c1sf);
            }
            set.add(pair);
        }
    }

    @Override // X.C1sg
    public void CTW(C1rn c1rn) {
        Set set = (Set) this.A02.get(c1rn);
        if (set == null) {
            return;
        }
        Pair[] pairArr = (Pair[]) set.toArray(new Pair[0]);
        int length = pairArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Pair pair = pairArr[i2];
            1LI r0 = (1LI) pair.first;
            SparseArray sparseArray = (SparseArray) pair.second;
            Object obj = this.A01.get(r0);
            if (obj != null) {
                if (sparseArray != null && sparseArray.size() != 0 && (obj instanceof View)) {
                    int size = sparseArray.size();
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= size) {
                            break;
                        }
                        if (sparseArray.valueAt(i4) == c1rn) {
                            C1si.A00((View) obj, c1rn, sparseArray.keyAt(i4));
                        }
                        i3 = i4 + 1;
                    }
                }
                11T.A0D(r0);
                C1rn[] A1b = r0 instanceof C1rj ? ((C1rj) r0).A1b() : new C1rn[0];
                int length2 = A1b.length;
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < length2) {
                        if (c1rn == A1b[i6]) {
                            ((C1rj) r0).A17(i6, c1rn.A00, obj);
                        }
                        i5 = i6 + 1;
                    }
                }
            }
            i = i2 + 1;
        }
    }
}
