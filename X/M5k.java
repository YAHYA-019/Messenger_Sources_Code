package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5k.class */
public final class M5k extends C00q implements Function1 {
    public static final M5k A00 = new M5k();

    public M5k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        L4D l4d = L4D.A03;
        Object obj2 = list.get(0);
        long j = LDp.A01;
        MN5 mn5 = Kz2.A0J;
        11T.A0O(obj2, false);
        Number number = null;
        LDp lDp = obj2 != null ? (LDp) mn5.CiD(obj2) : null;
        11T.A0D(lDp);
        long j2 = lDp.A00;
        Object A13 = DKC.A13(list);
        MN5 mn52 = Kz2.A0K;
        11T.A0O(A13, false);
        LE0 le0 = A13 != null ? (LE0) mn52.CiD(A13) : null;
        11T.A0D(le0);
        long j3 = le0.A00;
        Object obj3 = list.get(2);
        if (obj3 != null) {
            number = (Number) obj3;
        }
        11T.A0D(number);
        return new L4D(number.floatValue(), j2, j3);
    }
}
