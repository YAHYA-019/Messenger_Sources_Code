package X;

import android.content.Context;
import android.location.Location;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Clu.class */
public final class Clu implements JEw, CallerContextable {
    public static final CallerContext A03 = CallerContext.A06(Clu.class);
    public static final String __redex_internal_original_name = "NearbyPlaceGraphQLFetcher";
    public 1BY A00;
    public final Context A02 = 7zP.A0J();
    public final C00i A01 = FbInjector.A00;

    public Clu(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.JEw
    public ListenableFuture ARy(Location location, Long l, String str, String str2, String str3) {
        C30G A0H = AbF.A0H(60);
        C03z c03z = GraphQlCallInput.A02;
        07S r310 = null;
        if (!1JF.A0B(str)) {
            r310 = c03z.A02();
            07S.A00(r310, str, "query");
        }
        2Jd A08 = AbO.A08(location);
        AbO.A0M(location, A08);
        if (r310 == null) {
            r310 = c03z.A02();
        }
        r310.A0H(A08.A03(), "viewer_coordinates");
        if (1JF.A0B(str3)) {
            0fH.A0k(__redex_internal_original_name, "callerPlatform is null. This may cause query results to be empty");
        } else {
            07S.A00(r310, str3, "caller_platform");
        }
        4YV.A1A(r310, ((2Jf) A0H).A00, "search_params");
        A0H.A06("profile_picture_size", 1BL.A0B(this.A01).getDimensionPixelSize(2132279326));
        C3sa A00 = C3sa.A00(AbF.A0H(60));
        A00.A0K.A00 = ((2Jf) A0H).A00;
        A00.A0A(300L);
        A00.A09(300L);
        A00.A01 = A03;
        AbstractC05414dq A07 = 1VX.A07(this.A02, 1Fw.A05(this.A00));
        4YU.A1J(A00, 1645341882290020L);
        return AeR.A01(A07.A03(A00));
    }
}
