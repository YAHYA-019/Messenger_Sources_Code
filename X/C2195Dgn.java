package X;

import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.util.TriState;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.http.protocol.ApiErrorResult;
import com.google.common.base.Preconditions;

/* renamed from: X.Dgn, reason: case insensitive filesystem */
/* loaded from: Dgn.class */
public final class C2195Dgn extends C4r3 {
    public static final String __redex_internal_original_name = "AuthenticatePageAccountGraphQLMethod";
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;

    public C2195Dgn() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = 1BQ.A02(65755);
        this.A02 = 1BV.A00(33059);
        this.A01 = 1BQ.A02(16386);
    }

    public static final C2195Dgn A02() {
        return new C2195Dgn();
    }

    public static 2L0 A03(String str) {
        0fH.A0o(__redex_internal_original_name, str);
        return new 2L0(new ApiErrorResult(C5om.API_EC_DOMAIN, str, null, null, null, null, null, null, 1, 0, true));
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        Preconditions.checkArgument(DKE.A1W(A0M, "page_id", (String) obj));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchPageLoginDataQuery", (String) null, "fbandroid", 1138841598, 0, 1016343336L, 1016343336L, false, true));
        ViewerContext Aue = ((1Ey) this.A00.get()).Aue();
        if (Aue != ViewerContext.A01 && Aue.mIsPageContext) {
            Aue = (ViewerContext) this.A02.get();
        }
        A0L.A00 = Aue;
        return A0L.A01();
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JY A0B;
        String A0r;
        String A0r2;
        String str = (String) obj;
        2JY r0 = (2JY) obj2;
        ViewerContext Aue = ((1Ey) this.A00.get()).Aue();
        ViewerContext viewerContext = ViewerContext.A01;
        if (Aue != viewerContext && Aue.mIsPageContext) {
            Aue = (ViewerContext) this.A02.get();
        }
        if (Aue == viewerContext) {
            throw A03("Invalid response: page admin viewer context is null.");
        }
        if (r0 == null) {
            throw A03("Invalid response: empty response.");
        }
        2JY A0U = r0.A0U(2JX.class, -1207781380);
        if (A0U == null || A0U.A0k() == null || (A0B = 1BK.A0B(A0U, 2JX.class, 687788958, -2035790650)) == null || (A0r = A0B.A0r(-1938933922)) == null) {
            throw A03("Invalid response: page access token fetch failed.");
        }
        2JY A0B2 = 1BK.A0B(r0, 2JX.class, -2085467097, 1915215);
        if (A0B2 == null || (A0r2 = A0B2.A0r(601564825)) == null) {
            throw A03("Invalid response: user storage key fetch failed.");
        }
        return new AuthenticationResultImpl(new FacebookCredentials(str, A0r, Aue.mUserId, Aue.mAuthToken, 1BK.A0N(this.A01).AZk(18299249332067138L) ? Aue.mSessionCookiesString : null, null, null, null, Aue.A00, false), TriState.UNSET, str, "", A0r2, "");
    }
}
