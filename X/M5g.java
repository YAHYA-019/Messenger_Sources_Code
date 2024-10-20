package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M5g.class */
public final class M5g extends C00q implements Function1 {
    public static final M5g A00 = new M5g();

    public M5g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList A1B = AbJ.A1B(list);
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return new Ls1(A1B);
            }
            Object obj2 = list.get(i2);
            MHv mHv = Kz2.A08;
            Object obj3 = null;
            if (!1BK.A1X(obj2, false) && obj2 != null) {
                obj3 = mHv.CiD(obj2);
            }
            11T.A0D(obj3);
            A1B.add(obj3);
            i = i2 + 1;
        }
    }
}
