package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5o.class */
public final class M5o extends C00q implements Function1 {
    public static final M5o A00 = new M5o();

    public M5o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        L3z l3z = L3z.A02;
        Object obj2 = list.get(0);
        KsT[] ksTArr = LCI.A02;
        MN5 mn5 = Kz2.A0L;
        11T.A0O(obj2, false);
        LCI lci = null;
        LCI lci2 = obj2 != null ? (LCI) mn5.CiD(obj2) : null;
        11T.A0D(lci2);
        long j = lci2.A00;
        Object A13 = DKC.A13(list);
        11T.A0O(A13, false);
        if (A13 != null) {
            lci = (LCI) mn5.CiD(A13);
        }
        11T.A0D(lci);
        return new L3z(j, lci.A00);
    }
}
