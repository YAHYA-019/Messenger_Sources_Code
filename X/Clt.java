package X;

import android.location.Location;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Clt.class */
public final class Clt implements JEw {
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(131086);

    public Clt(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.JEw
    public ListenableFuture ARy(Location location, Long l, String str, String str2, String str3) {
        String str4 = str;
        Double d = null;
        L5D l5d = new L5D(new Location(location));
        Location location2 = l5d.A00;
        double latitude = location2.getLatitude();
        double longitude = location2.getLongitude();
        1BY r0 = this.A00;
        AbJ.A1P(r0);
        1Vd A0I = AbK.A0I(r0);
        Double valueOf = Double.valueOf(latitude);
        Double valueOf2 = Double.valueOf(longitude);
        if (l5d.A02() != null) {
            d = Double.valueOf(l5d.A02().doubleValue());
        }
        Double valueOf3 = Double.valueOf(((C5ex) this.A01.get()).A01(l5d) / 1000.0d);
        ImmutableList immutableList = RD5.A00;
        GraphQlCallInput graphQlCallInput = new 2Jd(97);
        if (valueOf != null) {
            graphQlCallInput.A07(com.facebook.location.platform.api.Location.LATITUDE, valueOf);
        }
        if (valueOf2 != null) {
            graphQlCallInput.A07("longitude", valueOf2);
        }
        if (d != null) {
            graphQlCallInput.A07(com.facebook.location.platform.api.Location.ACCURACY, d);
        }
        if (valueOf3 != null) {
            graphQlCallInput.A07("stale_time", valueOf3);
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jd r02 = new 2Jd(80);
        if (str == null) {
            str4 = "";
        }
        r02.A09("query", str4);
        r02.A05(graphQlCallInput, "viewer_coordinates");
        r02.A09("caller_platform", "FB_LOCATION_PICKER");
        A0M.A01(r02, "input");
        return AeR.A00(A0I, 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "PlaceTypeaheadSearchQuery", (String) null, "fbandroid", -863957184, 0, 2322600865L, 2322600865L, false, true)));
    }
}
