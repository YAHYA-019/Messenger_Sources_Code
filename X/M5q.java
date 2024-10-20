package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5q.class */
public final class M5q extends C00q implements Function1 {
    public static final M5q A00 = new M5q();

    public M5q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object A0r = 1BK.A0r(list);
        Number number = null;
        Number number2 = A0r != null ? (Number) A0r : null;
        11T.A0D(number2);
        int intValue = number2.intValue();
        Object A13 = DKC.A13(list);
        if (A13 != null) {
            number = (Number) A13;
        }
        11T.A0D(number);
        return new L3n(KUx.A00(intValue, number.intValue()));
    }
}
