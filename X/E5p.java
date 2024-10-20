package X;

import android.net.Uri;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.google.common.collect.ImmutableMap;

/* loaded from: E5p.class */
public abstract class E5p extends FmS {
    public static final java.util.Map A01;
    public static final java.util.Map A02;
    public final Throwable A00;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(1353066, "740285419354669");
        DKF.A1U(builder, "740285419354669", 1353047);
        DKF.A1U(builder, "740285419354669", 1463001);
        DKF.A1U(builder, "740285419354669", 1834012);
        builder.put(1834016, "242462812536016");
        DKF.A1U(builder, "740285419354669", 1834018);
        DKF.A1U(builder, "740285419354669", 1834020);
        DKF.A1U(builder, "740285419354669", 1834029);
        DKF.A1U(builder, "740285419354669", 1834041);
        DKF.A1U(builder, "740285419354669", 1834043);
        DKF.A1U(builder, "740285419354669", 1834044);
        DKF.A1U(builder, "242462812536016", 1834049);
        DKF.A1U(builder, "242462812536016", 1834058);
        DKF.A1U(builder, "740285419354669", 1834073);
        builder.put(1834077, "1495718484027862");
        DKF.A1U(builder, "1495718484027862", 1834079);
        DKF.A1U(builder, "1495718484027862", 1834085);
        DKF.A1U(builder, "1495718484027862", 1834088);
        DKF.A1U(builder, "1495718484027862", 1834090);
        DKF.A1U(builder, "1495718484027862", 1834091);
        DKF.A1U(builder, "1495718484027862", 1834092);
        DKF.A1U(builder, "1495718484027862", 1834093);
        builder.put(1834095, "217942441564255");
        DKF.A1U(builder, "1495718484027862", 1834096);
        DKF.A1U(builder, "1495718484027862", 1834097);
        ImmutableMap build = builder.build();
        11T.A0A(build);
        A02 = build;
        ImmutableMap A10 = AbG.A10(new ImmutableMap.Builder(4), 1834126, "1032538800469748");
        11T.A0A(A10);
        A01 = A10;
    }

    public E5p(Throwable th) {
        11T.A0F(th, 1);
        this.A00 = th;
    }

    public GI9 Ays() {
        String A0b;
        Uri.Builder buildUpon;
        RuO ruO;
        2L0 A022 = 0G8.A02(2L0.class, this.A00);
        if (A022 == null) {
            ruO = null;
        } else {
            GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(A022);
            int A00 = graphQLErrorFromException != null ? graphQLErrorFromException.A00() : A022.result.mErrorSubCode;
            java.util.Map map = A02;
            Integer valueOf = Integer.valueOf(A00);
            int i = 2131962851;
            if (map.containsKey(valueOf)) {
                i = 2131962852;
            }
            if (map.containsKey(valueOf)) {
                buildUpon = 7zM.A0D("https://www.facebook.com/help/").buildUpon();
                A0b = AnonymousClass001.A0b(valueOf, map);
            } else {
                Uri A0D = 7zM.A0D("https://www.facebook.com/help/contact/");
                java.util.Map map2 = A01;
                A0b = map2.containsKey(valueOf) ? AnonymousClass001.A0b(valueOf, map2) : "1333677766662195";
                buildUpon = A0D.buildUpon();
            }
            Uri A0A = AbM.A0A(buildUpon.appendPath(A0b), "entry", String.valueOf(A00));
            11T.A0D(A0A);
            ruO = new RuO(A0A, this, i);
        }
        return (GI9) ruO;
    }
}
