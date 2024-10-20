package X;

import android.view.View;
import java.util.List;

/* renamed from: X.861, reason: invalid class name */
/* loaded from: 861.class */
public abstract class AnonymousClass861 {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.23P, java.lang.Object] */
    public static final int[] A00(1Iw r301, List list) {
        11T.A0F(list, 1);
        int[] iArr = new int[list.size()];
        ?? obj = new Object();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return iArr;
            }
            1LI r0 = (1LI) list.get(i2);
            11T.A0D(r301);
            r0.A0c(r301, (C23P) obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            iArr[i2] = obj.A01;
            i = i2 + 1;
        }
    }
}
