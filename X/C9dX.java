package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9dX, reason: invalid class name */
/* loaded from: 9dX.class */
public abstract class C9dX {
    public static ImmutableList A00(List list) {
        3wL r0 = new 3wL();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            11T.A0F(A0i, 0);
            r0.A02(A0i, false);
        }
        return r0.A00();
    }

    public static ImmutableList A01(String... strArr) {
        3wL r0 = new 3wL();
        int i = 0;
        do {
            String str = strArr[i];
            11T.A0F(str, 0);
            r0.A02(str, false);
            i++;
        } while (i < 2);
        return r0.A00();
    }
}
