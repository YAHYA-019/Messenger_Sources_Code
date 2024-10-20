package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: AHp.class */
public final class AHp implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A00;
        String str;
        2JY r0 = (2JY) obj;
        11T.A0F(r0, 0);
        ImmutableList A0c = r0.A0c(-66298368, 2JX.class, -170768459);
        ArrayList A0y = 7zO.A0y(A0c);
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            String A0j = A0P.A0j();
            String A0h = A0P.A0h();
            if (A0j == null || 0CU.A0O(A0j)) {
                Class<?> cls = getClass();
                java.util.Map map = 0BY.A03;
                11T.A0F(cls, 1);
                A00 = C0Bx.A00(cls);
                str = "name is null or empty";
            } else if (A0h == null || 0CU.A0O(A0h)) {
                Class<?> cls2 = getClass();
                java.util.Map map2 = 0BY.A03;
                11T.A0F(cls2, 1);
                A00 = C0Bx.A00(cls2);
                str = "description is null or empty";
            } else {
                A0y.add(new C84j(A0j, A0h, 9));
            }
            0fH.A0k(A00, str);
        }
        return A0y;
    }
}
