package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sm, reason: invalid class name */
/* loaded from: 2sm.class */
public abstract class C2sm implements C1fI {
    public static final int[] A01 = new int[0];
    public final C1eF A00;

    public C2sm(C1eF c1eF) {
        this.A00 = c1eF;
    }

    public void A00(List list, int i) {
        if (i < 0 || i > 100) {
            return;
        }
        double d = i / 100.0d;
        int i2 = 800;
        boolean z = false;
        if (i >= 50) {
            i2 = 1000;
            z = true;
        }
        C1eF c1eF = this.A00;
        int[] iArr = c1eF.A0B;
        int i3 = iArr[1];
        int max = Math.max((iArr[0] + ((int) ((i3 - r0) * d))) / 1000, i2);
        int i4 = c1eF.A02;
        int[] iArr2 = 3Hm.A00;
        int min = Math.min(i4, 8);
        int i5 = (max - 1000) / 100;
        if (i5 < 0) {
            i5 = 0;
        }
        for (int i6 = 0; i6 < min; i6++) {
            list.add(Integer.valueOf(iArr2[i6] + i5));
        }
        list.add(7681);
        if (z) {
            list.add(15873);
            list.add(1795);
        }
    }

    public void A01(List list, int i) {
    }

    @Override // X.C1fI
    public int[] AZt(C1hi c1hi) {
        int[] iArr;
        if (c1hi != null) {
            ArrayList arrayList = new ArrayList();
            int i = c1hi.A01;
            int i2 = c1hi.A02;
            if (i == 2) {
                A01(arrayList, i2);
            } else {
                A00(arrayList, i2);
            }
            if (!arrayList.isEmpty()) {
                iArr = new int[arrayList.size()];
                int i3 = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iArr[i3] = ((Number) it.next()).intValue();
                    i3++;
                }
                return iArr;
            }
        }
        iArr = A01;
        return iArr;
    }
}
