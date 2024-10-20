package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6mi, reason: invalid class name */
/* loaded from: 6mi.class */
public abstract class C6mi {
    public static final boolean A00(2Yy r301, Function1 function1) {
        List<C2hp> list = r301.A00;
        11T.A0A(list);
        if (list.isEmpty()) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C2hp c2hp : list) {
            List list2 = (List) function1.invoke(c2hp.A06);
            List list3 = (List) function1.invoke(c2hp.A05);
            if ((!list3.isEmpty()) || (!list2.isEmpty())) {
                if (list2.size() != list3.size() || !list2.equals(list3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
