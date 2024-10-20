package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5i.class */
public final class M5i extends C00q implements Function1 {
    public static final M5i A00 = new M5i();

    public M5i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A002;
        if (1BK.A1X(obj, false)) {
            A002 = 9205357640488583168L;
        } else {
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Number number = null;
            Number number2 = obj2 != null ? (Number) obj2 : null;
            11T.A0D(number2);
            float floatValue = number2.floatValue();
            Object A13 = DKC.A13(list);
            if (A13 != null) {
                number = (Number) A13;
            }
            11T.A0D(number);
            A002 = KvH.A00(floatValue, number.floatValue());
        }
        return new LE0(A002);
    }
}
