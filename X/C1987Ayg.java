package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ayg, reason: case insensitive filesystem */
/* loaded from: Ayg.class */
public final class C1987Ayg extends C1rj {
    public FbUserSession A00;
    public 2RK A01;
    public C2q2 A02;
    public C2qg A03;
    public ImmutableList A04;

    public C1987Ayg() {
        super("LegacyMigProfileImage");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A00, this.A01, null, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        ImmutableList immutableList = this.A04;
        2RK r0 = this.A01;
        C2q2 c2q2 = this.A02;
        C2qg c2qg = this.A03;
        11T.A0H(r302, fbUserSession);
        11T.A0F(r0, 4);
        1Br A00 = 1Lm.A00(7zL.A0A(r302), fbUserSession, 67995);
        if (!09K.A00(immutableList)) {
            throw 1BK.A0g();
        }
        C1914Awf c1914Awf = new C1914Awf(r302, new DzT(), 2132607576);
        int i = r0.resId;
        DzT dzT = c1914Awf.A01;
        dzT.A01 = ((C1rs) c1914Awf).A02.A06(i);
        if (c2qg != null) {
            dzT.A03 = c2qg;
        }
        if (immutableList != null) {
            CHx cHx = (CHx) 1Br.A0B(A00);
            c1914Awf.A2X(c2q2 != null ? AbL.A0H(cHx.A00, c2q2.tileBadge, immutableList) : cHx.A01(immutableList));
        }
        return c1914Awf.A2V();
    }
}
