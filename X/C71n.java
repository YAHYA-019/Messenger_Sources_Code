package X;

import android.text.SpannableString;
import java.util.Collections;
import java.util.List;

/* renamed from: X.71n, reason: invalid class name */
/* loaded from: 71n.class */
public abstract class C71n {
    public static final void A00(C6qu c6qu) {
        C71o c71o = C71o.A00;
        11T.A0F(c71o, 1);
        6wQ r0 = new 6wQ(c71o);
        final 6rM r02 = (6rM) c6qu.A06;
        C01i A01 = r02.A01();
        final 06Z BdK = r02.A0T.Aoc().BdK();
        C71q c71q = new C71q() { // from class: X.71p
            /* JADX WARN: Type inference failed for: r0v10, types: [X.6kT, java.lang.Object] */
            @Override // X.C71q
            public final SpannableString BGD(Integer num, Integer num2, Long l) {
                6kS r03 = 6kS.A00;
                C6qv c6qv = r02.A0T;
                return r03.A00(c6qv.AWp(), BdK, c6qv.BF7(), (6kT) new Object(), num, num2, l);
            }
        };
        List singletonList = Collections.singletonList(new C70o(new AnonymousClass768(), C01g.A01(new C82z(c6qu, 6))));
        11T.A0A(singletonList);
        C72k c72k = new C72k(singletonList);
        String str = r02.A0A;
        C01i c01i = r02.A0G;
        2KG r03 = 2KG.A01;
        11T.A0F(A01, 2);
        c6qu.A06(new 84N(r03, c6qu, c72k, r0, A01));
        c6qu.A05(new DLR(c71q, c01i, c6qu, str, 2, false));
    }
}
