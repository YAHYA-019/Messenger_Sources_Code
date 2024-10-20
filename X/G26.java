package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: G26.class */
public final class G26 implements Runnable {
    public static final String __redex_internal_original_name = "LithoRootUITracker$onAttachedToWindow$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C00813op A01;

    public G26(FbUserSession fbUserSession, C00813op c00813op) {
        this.A01 = c00813op;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C00813op c00813op = this.A01;
        Q6C A00 = Q6F.A00.A00(c00813op);
        if (A00 != null) {
            FbUserSession fbUserSession = this.A00;
            Ehj ehj = c00813op.A04;
            Ecv ecv = c00813op.A03;
            11T.A0F(fbUserSession, 0);
            boolean A1Z = 7zP.A1Z(ecv);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            boolean A1W = DKE.A1W(A0M, "hierarchy_json", Qzc.A00(A00).toString());
            A0M.A05("hierarchy_platform", "ANDROID");
            RRv rRv = AbstractC2138Der.A00;
            View view = (View) ((FFu) A00).A03;
            Integer valueOf = Integer.valueOf(rRv.A00(view).width());
            A0M.A04("hierarchy_screen_width", valueOf);
            boolean A1T = AnonymousClass001.A1T(valueOf);
            Integer valueOf2 = Integer.valueOf(rRv.A00(view).height());
            A0M.A04("hierarchy_screen_height", valueOf2);
            boolean A1T2 = AnonymousClass001.A1T(valueOf2);
            Preconditions.checkArgument(A1W);
            Preconditions.checkArgument(A1T);
            Preconditions.checkArgument(A1T2);
            2Jf r0 = new 2Jf(2JX.class, (Class) null, "FDSAdoptionViewerQuery", (String) null, "fbandroid", -1575053716, 0, 1037566202L, 1037566202L, false, A1Z);
            r0.A00 = A0M;
            1Hz r02 = new 1Hz();
            AbH.A1W(r02, 110746355);
            r02.A07();
            1FV A0n = 7zR.A0n(ehj.A00, C3sa.A00(r0));
            1Br.A0D(ehj.A01, FwL.A00(ecv, 14), A0n);
        }
    }
}
