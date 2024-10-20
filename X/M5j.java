package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5j.class */
public final class M5j extends C00q implements Function1 {
    public static final M5j A00 = new M5j();

    public M5j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        L3h l3h = obj2 != null ? (L3h) obj2 : null;
        11T.A0D(l3h);
        int i = l3h.A00;
        Object A13 = DKC.A13(list);
        L3i l3i = A13 != null ? (L3i) A13 : null;
        11T.A0D(l3i);
        int i2 = l3i.A00;
        Object obj3 = list.get(2);
        KsT[] ksTArr = LCI.A02;
        MN5 mn5 = Kz2.A0L;
        11T.A0O(obj3, false);
        LCI lci = obj3 != null ? (LCI) mn5.CiD(obj3) : null;
        11T.A0D(lci);
        long j = lci.A00;
        Object obj4 = list.get(3);
        L3z l3z = L3z.A02;
        return new LB4((Ks9) null, (11T.A0O(obj4, false) || obj4 == null) ? null : (L3z) Kz2.A0E.CiD(obj4), (L48) null, i, i2, 0, (-1) << (-1), j);
    }
}
