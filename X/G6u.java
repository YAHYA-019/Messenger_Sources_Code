package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Callable;

/* loaded from: G6u.class */
public final class G6u implements Callable {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FHD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public G6u(FbUserSession fbUserSession, FHD fhd, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A01 = fhd;
        this.A06 = z2;
        this.A05 = z3;
        this.A00 = fbUserSession;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A04("count", 10);
        A0M.A05("app_id", this.A02);
        A0M.A03("disable_gaming_redirect", Boolean.valueOf(this.A04));
        A0M.A05("context_token_id", this.A03);
        FHD fhd = this.A01;
        A0M.A05("funnel_session_key", ((F90) 1Br.A0B(fhd.A0B)).A00());
        boolean z = this.A06;
        boolean z2 = this.A05;
        A0M.A03("add_nt_components", 7zM.A17(FHD.A02(fhd, z, z2)));
        A0M.A03("add_bloks_arcade", Boolean.valueOf(FHD.A02(fhd, z, z2)));
        2Jf r0 = new 2Jf(DiD.class, (Class) null, "InstantGameArcadeInitialQuery", (String) null, "fbandroid", -806720750, 0, 358349073L, 358349073L, false, true);
        DKF.A1P(A0M, r0);
        C3sa A0O = DKH.A0O(r0);
        AbstractC05414dq A08 = 1VX.A08(fhd.A0A, this.A00);
        DKH.A1H(A0O);
        return A08.A03(A0O);
    }
}
