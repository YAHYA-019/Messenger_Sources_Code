package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5n.class */
public final class M5n extends C00q implements Function1 {
    public static final M5n A00 = new M5n();

    public M5n() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new L8Z(GOp.A00(list, 0), GOp.A00(list, 1));
    }
}
