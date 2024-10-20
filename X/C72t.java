package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.72t, reason: invalid class name */
/* loaded from: 72t.class */
public abstract class C72t {
    public static final void A00(C6qu c6qu) {
        c6qu.A03(new C82x(c6qu, 14));
        6rM r0 = (6rM) c6qu.A06;
        C6rN c6rN = r0.A0S;
        final MigColorScheme Ad3 = c6rN.Ad3();
        72D r02 = (72D) r0.A0J.getValue();
        AnonymousClass730 anonymousClass730 = new AnonymousClass730(Ad3) { // from class: X.72z
            public final MigColorScheme A00;

            {
                this.A00 = Ad3;
            }
        };
        C72k c72k = new C72k(c6qu.A09);
        6zE A00 = C6qt.A00(C6z2.A13, 6zM.A00, new C82x(c6qu, 15));
        ThreadKey BF7 = c6qu.A00.BF7();
        boolean equals = "602814669838217".equals(BF7 != null ? String.valueOf(BF7.A0r()) : null);
        boolean AZk = c6rN.Axw().AZk(36323040934512823L);
        C82x c82x = new C82x(c6qu, 16);
        11T.A0F(Ad3, 1);
        11T.A0F(r02, 3);
        c6qu.A06(new AnonymousClass731(Ad3, c6qu, c72k, anonymousClass730, r02, c82x, equals, AZk));
        c6qu.A05(new AV5(c6qu, A00, 16));
    }
}
