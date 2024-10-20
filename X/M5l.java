package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5l.class */
public final class M5l extends C00q implements Function1 {
    public static final M5l A00 = new M5l();

    public M5l() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        long j = LDp.A01;
        MN5 mn5 = Kz2.A0J;
        11T.A0O(obj2, false);
        LDp lDp = obj2 != null ? (LDp) mn5.CiD(obj2) : null;
        11T.A0D(lDp);
        long j2 = lDp.A00;
        Object A13 = DKC.A13(list);
        KsT[] ksTArr = LCI.A02;
        MN5 mn52 = Kz2.A0L;
        11T.A0O(A13, false);
        LCI lci = A13 != null ? (LCI) mn52.CiD(A13) : null;
        11T.A0D(lci);
        long j3 = lci.A00;
        Object obj3 = list.get(2);
        Liq liq = (11T.A0O(obj3, false) || obj3 == null) ? null : (Liq) Kz2.A05.CiD(obj3);
        Object obj4 = list.get(3);
        KsO ksO = obj4 != null ? (KsO) obj4 : null;
        Object obj5 = list.get(4);
        KsP ksP = obj5 != null ? (KsP) obj5 : null;
        Object obj6 = list.get(6);
        String str = obj6 != null ? (String) obj6 : null;
        Object obj7 = list.get(7);
        11T.A0O(obj7, false);
        LCI lci2 = obj7 != null ? (LCI) mn52.CiD(obj7) : null;
        11T.A0D(lci2);
        long j4 = lci2.A00;
        Object obj8 = list.get(8);
        KsR ksR = (11T.A0O(obj8, false) || obj8 == null) ? null : (KsR) Kz2.A03.CiD(obj8);
        Object obj9 = list.get(9);
        L8Z l8z = (11T.A0O(obj9, false) || obj9 == null) ? null : (L8Z) Kz2.A0D.CiD(obj9);
        Object obj10 = list.get(10);
        Ls1 ls1 = Ls1.A02;
        Ls1 ls12 = (11T.A0O(obj10, false) || obj10 == null) ? null : (Ls1) Kz2.A07.CiD(obj10);
        Object obj11 = list.get(11);
        11T.A0O(obj11, false);
        LDp lDp2 = obj11 != null ? (LDp) mn5.CiD(obj11) : null;
        11T.A0D(lDp2);
        long j5 = lDp2.A00;
        Object obj12 = list.get(12);
        L3t l3t = (11T.A0O(obj12, false) || obj12 == null) ? null : (L3t) Kz2.A0C.CiD(obj12);
        Object obj13 = list.get(13);
        L4D l4d = L4D.A03;
        return new L5H((11T.A0O(obj13, false) || obj13 == null) ? null : (L4D) Kz2.A0A.CiD(obj13), (KR9) null, (Kbj) null, ksO, ksP, liq, ls12, ksR, l3t, L6N.A00(j2), l8z, str, j3, j4, j5);
    }
}
