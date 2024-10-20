package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.21N, reason: invalid class name */
/* loaded from: 21N.class */
public final class C21N {
    public final 1Br A00;
    public final 1De A01;

    public C21N(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = 1Lm.A03(fbUserSession, r303.A00, 16686);
    }

    public final void A00(C1qM c1qM) {
        11T.A0F(c1qM, 0);
        C21S.A00(c1qM, (1Uj) this.A00.A00.get());
    }

    public final void A01(C1qM c1qM) {
        11T.A0F(c1qM, 0);
        C21S.A01(c1qM, (1Uj) this.A00.A00.get());
    }
}
