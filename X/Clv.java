package X;

import android.content.Context;
import android.location.Location;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Clv.class */
public final class Clv implements JEw, CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(Clv.class);
    public static final String __redex_internal_original_name = "AddressPickerPlacesFetcher";
    public 1BY A00;
    public final FbUserSession A03;
    public final Context A02 = 7zP.A0J();
    public final Context A01 = FbInjector.A00();

    public Clv(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = fbUserSession;
    }

    @Override // X.JEw
    public ListenableFuture ARy(Location location, Long l, String str, String str2, String str3) {
        GraphQlCallInput graphQlCallInput = new 2Jd(12);
        if (!1JF.A0B(str)) {
            graphQlCallInput.A09("query", str);
        }
        GraphQlCallInput A08 = AbO.A08(location);
        AbO.A0M(location, A08);
        graphQlCallInput.A05(A08, "viewer_coordinates");
        graphQlCallInput.A09("provider", "HERE_THRIFT");
        graphQlCallInput.A09("search_type", "STREET_PLACE_TYPEAHEAD");
        graphQlCallInput.A09("integration_strategy", "STRING_MATCH");
        graphQlCallInput.A09("result_ordering", "INTERLEAVE");
        graphQlCallInput.A09("caller", "GRAPHQL");
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(graphQlCallInput, "query_params");
        A0M.A04("num_results", 20);
        A0M.A04("place_photo_size", Integer.valueOf(AbK.A00(this.A01)));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "AddressLocationSearchQuery", (String) null, "fbandroid", 595182695, 0, 1793956270L, 1793956270L, false, true));
        A0L.A0A(604800L);
        A0L.A09(604800L);
        A0L.A01 = A04;
        AbstractC05414dq A07 = 1VX.A07(this.A02, this.A03);
        4YU.A1J(A0L, 1645341882290020L);
        return AeR.A01(A07.A03(A0L));
    }
}
