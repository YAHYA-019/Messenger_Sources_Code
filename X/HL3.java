package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

/* loaded from: HL3.class */
public abstract class HL3 {
    public static final void A00(Rect rect, C2632Gji c2632Gji) {
        11T.A0F(c2632Gji, 0);
        List list = c2632Gji.A09;
        if (list.isEmpty()) {
            return;
        }
        int i = (-1) >>> 1;
        rect.top = i;
        rect.bottom = 0;
        rect.left = i;
        rect.right = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2626GjK A00 = C2628GjQ.A00(it);
            int i2 = A00.A01;
            if (i2 > 0 || A00.A03 > 0 || A00.A02 > 0 || A00.A00 > 0) {
                rect.left = Math.min(rect.left, i2);
                rect.top = Math.min(rect.top, A00.A03);
                rect.right = Math.max(rect.right, A00.A02);
                rect.bottom = Math.max(rect.bottom, A00.A00);
            }
        }
    }
}
