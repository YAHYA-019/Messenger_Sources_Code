package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Platform;

/* loaded from: C3r.class */
public final class C3r {
    public DGx A00;
    public final 1Br A01;
    public final 1De A02;

    public C3r(1De r302) {
        this.A02 = r302;
        this.A01 = 7zM.A0h(r302, 83485);
    }

    public final void A00(FbUserSession fbUserSession, String str) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        Bsz bsz = (Bsz) 1Br.A0B(this.A01);
        BlO blO = new BlO(fbUserSession, this);
        if (Platform.stringIsNullOrEmpty(str)) {
            return;
        }
        Cas cas = bsz.A03;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("group_id", str);
        A0M.A04("profile_pic_size", 40);
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "AssociatedGroupQuery", (String) null, "fbandroid", 2078851832, 0, 1901344594L, 1901344594L, false, A1X);
        r0.A00 = A0M;
        1Hz A10 = AbF.A10();
        AbH.A1W(A10, 109250890);
        A10.A07();
        C3sa A0C = AbL.A0C(r0);
        A0C.A01 = AbH.A0B(cas);
        4YU.A1J(A0C, 1699980486824338L);
        1Vd A0K = 7zM.A0K(cas.A00);
        4YU.A1J(A0C, 1699980486824338L);
        2FT A00 = AeR.A00(A0K, A0C);
        1Kd.A0D(bsz.A02, D4p.A00(blO, bsz, 58), A00);
    }
}
