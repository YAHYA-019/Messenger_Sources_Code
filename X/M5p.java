package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5p.class */
public final class M5p extends C00q implements Function1 {
    public static final M5p A00 = new M5p();

    public M5p() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        MHv mHv = Kz2.A0B;
        L5H l5h = null;
        L5H l5h2 = (11T.A0O(obj2, false) || obj2 == null) ? null : (L5H) mHv.CiD(obj2);
        Object A13 = DKC.A13(list);
        L5H l5h3 = (11T.A0O(A13, false) || A13 == null) ? null : (L5H) mHv.CiD(A13);
        Object obj3 = list.get(2);
        L5H l5h4 = (11T.A0O(obj3, false) || obj3 == null) ? null : (L5H) mHv.CiD(obj3);
        Object obj4 = list.get(3);
        if (!11T.A0O(obj4, false) && obj4 != null) {
            l5h = (L5H) mHv.CiD(obj4);
        }
        return new L37(l5h2, l5h3, l5h4, l5h);
    }
}
