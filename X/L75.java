package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: L75.class */
public final class L75 {
    public static final Set A00;
    public static final Logger A02 = JQx.A15(L75.class);
    public static final ConcurrentMap A01 = JQx.A13();

    static {
        HashSet A0v = AnonymousClass001.A0v();
        A0v.add(MIz.class);
        A0v.add(MJ0.class);
        A0v.add(MDT.class);
        A0v.add(MDQ.class);
        A0v.add(MDP.class);
        A0v.add(MGU.class);
        A0v.add(MGW.class);
        A0v.add(MDR.class);
        A0v.add(MDS.class);
        A00 = Collections.unmodifiableSet(A0v);
    }

    public static Object A00(KDC kdc, Class cls) {
        String str = kdc.typeUrl_;
        Lj4 lj4 = kdc.value_;
        Kq9 A002 = L8M.A00(L8M.A02, str);
        Class cls2 = A002.A02;
        if (cls2.equals(cls)) {
            return L3p.A01.A00(LCx.A01.A04(Lfu.A00(A002.A00, KPX.A03, lj4, null, A002.A03)), cls2);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Primitive type ");
        JQz.A1I(cls, A0k);
        A0k.append(" not supported by key manager of type ");
        A0k.append(A002.getClass());
        throw JQy.A0y(cls2, ", which only supports: ", A0k);
    }
}
