package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphqlrealtimeservice.subscription.GraphQLSubscriptionQueryBuilder;
import com.facebook.graphservice.GraphQLQueryBuilder;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.nativeutil.NativeMap;
import com.google.common.base.Preconditions;

/* renamed from: X.3Xc, reason: invalid class name */
/* loaded from: 3Xc.class */
public final class C3Xc implements 1Wk {
    public final GraphServiceAsset A00;

    public C3Xc(GraphServiceAsset graphServiceAsset) {
        this.A00 = graphServiceAsset;
    }

    public GraphQLQuery BfE(2Jg r302, 3tQ r303) {
        2Jf r0 = (2Jf) r302;
        Class cls = r0.A05;
        boolean A1T = AnonymousClass001.A1T(cls);
        String str = r0.A08;
        Preconditions.checkArgument(A1T, "Query not enabled for GraphService (tree models): %s", str);
        NativeMap nativeMap = new NativeMap();
        2Jd r02 = r0.A00.A00;
        GraphQlCallInput.A02(r02.A00, r02, nativeMap);
        GraphQLQueryBuilder graphQLQueryBuilder = new GraphQLQueryBuilder(r303, "Subscription", str, r0.A03, nativeMap, cls, r0.A02, this.A00, r0.A0E);
        synchronized (r302) {
        }
        synchronized (r302) {
        }
        synchronized (r302) {
        }
        return new GraphQLSubscriptionQueryBuilder(graphQLQueryBuilder, "", "", 0).getResult();
    }
}
