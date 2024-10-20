package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5v.class */
public final class M5v extends C00q implements Function1 {
    public static final M5v A00 = new M5v();

    public M5v() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        L3n l3n = null;
        Lie lie = (11T.A0O(obj2, false) || obj2 == null) ? null : (Lie) Kz2.A00.CiD(obj2);
        11T.A0D(lie);
        Object A13 = DKC.A13(list);
        MHv mHv = Kz2.A0G;
        if (!11T.A0O(A13, false) && A13 != null) {
            l3n = (L3n) mHv.CiD(A13);
        }
        11T.A0D(l3n);
        return new L3y(lie, l3n.A00);
    }
}
