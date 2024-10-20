package X;

import android.view.ViewGroup;
import java.util.ArrayDeque;

/* renamed from: X.2mo, reason: invalid class name */
/* loaded from: 2mo.class */
public abstract class C2mo {
    public static final void A00(1JX r301, Object obj) {
        if (r301 == null) {
            r301 = 1kF.A01;
        }
        r301.ABk("recursivelyNotifyVisibleBoundsChanged");
        if (obj != null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(obj);
            while (!arrayDeque.isEmpty()) {
                Object pop = arrayDeque.pop();
                if (pop instanceof C1r0) {
                    ((C1r0) pop).Bgo();
                } else if (pop instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) pop;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (-1 < childCount) {
                            arrayDeque.push(viewGroup.getChildAt(childCount));
                        }
                    }
                }
            }
        }
        r301.AQF();
    }
}
