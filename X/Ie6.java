package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: Ie6.class */
public final class Ie6 implements JGJ {
    public int[] B4M(List list, int i) {
        int i2;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i3 = (-1) >>> 1;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (i2 = iArr2[0]) < i3) {
                iArr = iArr2;
                i3 = i2;
            }
        }
        if (iArr == null) {
            iArr = (int[]) list.get(GOn.A0A(list, 1));
        }
        return iArr;
    }
}
