package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C4n.class */
public final class C4n {
    public final 1De A00;
    public final 1Br A01 = 1BK.A0D();
    public final 1Br A02 = 1Bq.A00(84489);
    public final 1EZ A03;

    public C4n(1De r302) {
        this.A00 = r302;
        this.A03 = (1EZ) 1De.A00(r302, 16428);
    }

    public C82 A00(String str) {
        FbUserSession A04 = 1Fw.A04(this.A03);
        2R2 A08 = AbF.A08(AbG.A0A(1ZG.A02, 1Br.A02(this.A01), 1BJ.A00(1996)), 287);
        IFc iFc = (IFc) 4YU.A0n(A04, this.A00, 67965);
        C0dr c0dr = (C0dr) 1Br.A0B(this.A02);
        11T.A0D(A08);
        return new C82(A08, c0dr, str, iFc.A07.A03());
    }
}
