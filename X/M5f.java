package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5f.class */
public final class M5f extends C00q implements Function1 {
    public static final M5f A00 = new M5f();

    public M5f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        L37 l37 = null;
        String str = obj2 != null ? (String) obj2 : null;
        11T.A0D(str);
        Object A13 = DKC.A13(list);
        MHv mHv = Kz2.A0F;
        if (!1BK.A1X(A13, false) && A13 != null) {
            l37 = (L37) mHv.CiD(A13);
        }
        return new JeL(l37, str);
    }
}
