package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Fpe.class */
public final class Fpe implements GGE {
    public final String A00;
    public final boolean A01;
    public final /* synthetic */ F8P A02;

    public Fpe(F8P f8p, String str, boolean z) {
        this.A02 = f8p;
        this.A00 = str;
        this.A01 = z;
    }

    public 2FT AIj() {
        F8P f8p = this.A02;
        FbUserSession A03 = 1Br.A03(f8p.A07);
        String str = this.A00;
        boolean z = this.A01;
        EjU ejU = (EjU) f8p.A01.get();
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("defer_tos_version", "");
        A0M.A05("app_name", str);
        A0M.A03("add_dma_query", Boolean.valueOf(z));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(C2318Dk2.class, (Class) null, "QuicksilverGameInfo", (String) null, "fbandroid", -1224243274, 0, 572506448L, 572506448L, false, true));
        11T.A0D(A0L);
        11T.A0D(A0L);
        DKD.A1G(A0L);
        1Vd A0K = 7zM.A0K(ejU.A00);
        DKH.A1H(A0L);
        return Fvf.A00(A0K.A09(A0L), f8p, 51);
    }
}
