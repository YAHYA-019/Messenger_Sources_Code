package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.74e, reason: invalid class name */
/* loaded from: 74e.class */
public abstract class C74e {
    public static final void A00(C6qu c6qu, C71q c71q, String str, C01i c01i) {
        C6z2 c6z2 = C6z2.A0z;
        final ThreadKey BF7 = c6qu.A00.BF7();
        c6qu.A03(new C82x(C6qt.A00(c6z2, new 6zD(BF7) { // from class: X.74f
            public final 1Br A00;
            public final ThreadKey A01;

            {
                11T.A0F(BF7, 1);
                this.A01 = BF7;
                this.A00 = 1Bu.A00(147851);
            }

            public boolean BUV(5vW r302, int i) {
                11T.A0F(r302, 0);
                7J2 r0 = (7J2) ((5vV) r302).A01.A01.A00(7J2.A02);
                return r0 != null && r0.A01 && ((C5jl) this.A00.A00.get()).A00(this.A01);
            }
        }, new C83M(c71q, c01i, c6qu, str, 1)), 25));
    }
}
