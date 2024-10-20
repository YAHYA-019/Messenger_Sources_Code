package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: M7h.class */
public final class M7h extends C00q implements Function2 {
    public static final M7h A00 = new M7h();

    public M7h() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LO0 lo0 = (LO0) obj2;
        LinkedHashMap A06 = 04R.A06(lo0.A02);
        Iterator A1A = 1BK.A1A(lo0.A01);
        while (A1A.hasNext()) {
            Kju kju = (Kju) A1A.next();
            if (kju.A00) {
                java.util.Map CXL = kju.A01.CXL();
                if (CXL.isEmpty()) {
                    A06.remove(kju.A02);
                } else {
                    A06.put(kju.A02, CXL);
                }
            }
        }
        if (A06.isEmpty()) {
            A06 = null;
        }
        return A06;
    }
}
