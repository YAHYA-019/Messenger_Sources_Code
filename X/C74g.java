package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.74g, reason: invalid class name */
/* loaded from: 74g.class */
public abstract class C74g {
    public static final void A00(C6qu c6qu) {
        C6z2 c6z2 = C6z2.A0K;
        C6qv c6qv = c6qu.A00;
        final ThreadKey BF7 = c6qv.BF7();
        final HeterogeneousMap BF6 = c6qv.BF6();
        6zE A00 = C6qt.A00(c6z2, new 6zD(BF7, BF6) { // from class: X.74h
            public final ThreadKey A00;
            public final HeterogeneousMap A01;

            {
                11T.A0F(BF7, 1);
                11T.A0F(BF6, 2);
                this.A00 = BF7;
                this.A01 = BF6;
            }

            public boolean BUV(5vW r302, int i) {
                11T.A0F(r302, 0);
                5gC r0 = ((5vV) r302).A00;
                boolean z = false;
                if (r0 instanceof 5gC) {
                    C5fu c5fu = (C5fu) r0;
                    if (c5fu.A09.length() > 0) {
                        String str = r0.A03;
                        C65h c65h = C65h.A04;
                        if ((!c65h.A09() && C65h.A00(c65h, this.A00, this.A01, str, false) && !((2yD) C65h.A02.A00.get()).AZr(1GD.A07, 36322001552884739L)) || c65h.A0B(c5fu.A0H, c65h.A0A(str), false)) {
                            z = true;
                        }
                    }
                }
                return z;
            }
        }, new C82z(c6qu, 26));
        c6qu.A03(new C82z(A00, 24));
        c6qu.A04(new C82z(A00, 25));
    }
}
