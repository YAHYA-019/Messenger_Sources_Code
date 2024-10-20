package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9h0, reason: invalid class name */
/* loaded from: 9h0.class */
public final class C9h0 {
    public final Class A00;
    public final List A01 = C0s8.A11(new GAa(this, 19));

    public C9h0(Class cls) {
        this.A00 = cls;
    }

    public static void A00(9Xn r301, Class cls, Function2 function2) {
        r301.A00.A00.put(new C9h0(cls), new AVM(function2, 19));
    }

    public final boolean A01(Object obj) {
        11T.A0F(obj, 0);
        List list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!7zR.A1a(obj, (Function1) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
