package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.93s, reason: invalid class name */
/* loaded from: 93s.class */
public final class C93s extends 2pB {
    public final MigColorScheme A00;

    public C93s(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public 1LI A00(1LI r302, 1Iw r303, C2m6 c2m6, Object obj) {
        String str;
        11T.A0H(r303, r302);
        11T.A0F(c2m6, 3);
        A9X a9x = (A9X) ((2oT) c2m6).A01.A00(A9X.A01);
        if (a9x == null || (str = a9x.A00) == null) {
            return r302;
        }
        String A0u = 7zN.A0u(r303, str, 2131963776);
        C2p8 c2p8 = C2p6.A00;
        C1rq A00 = C1rg.A00(r303);
        A00.A2f(r302);
        return 7zL.A0d(new 8Zl(c2p8.A02, this.A00, c2p8.A06, A0u), A00);
    }
}
