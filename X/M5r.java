package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5r.class */
public final class M5r extends C00q implements Function1 {
    public static final M5r A00 = new M5r();

    public M5r() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A0S;
        if (1BK.A1X(obj, false)) {
            A0S = LCI.A01;
        } else {
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            KsT ksT = null;
            Number number = obj2 != null ? (Number) obj2 : null;
            11T.A0D(number);
            float floatValue = number.floatValue();
            Object A13 = DKC.A13(list);
            if (A13 != null) {
                ksT = (KsT) A13;
            }
            11T.A0D(ksT);
            A0S = ksT.A00 | JR0.A0S(Float.floatToIntBits(floatValue));
        }
        return new LCI(A0S);
    }
}
