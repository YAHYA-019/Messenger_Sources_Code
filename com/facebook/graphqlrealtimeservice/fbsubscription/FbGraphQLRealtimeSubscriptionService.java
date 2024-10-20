package com.facebook.graphqlrealtimeservice.fbsubscription;

import X.11T;
import X.4YV;
import X.7zT;
import X.C00j;
import X.C0gh;
import X.F1g;
import X.Fgc;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.fb.GraphQLConsistencyJNI;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: FbGraphQLRealtimeSubscriptionService.class */
public final class FbGraphQLRealtimeSubscriptionService implements GraphQLRealtimeService {
    public static final F1g Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.F1g, java.lang.Object] */
    static {
        C0gh.A02("fb-graphqlrt-subscription-jni");
    }

    public FbGraphQLRealtimeSubscriptionService(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy, GraphQLConsistencyJNI graphQLConsistencyJNI) {
        7zT.A1W(str, graphQLSubscriptionsSDKProviderBase, graphServiceAsset, scheduledExecutorService);
        11T.A0F(realtimeConfigSourceProxy, 5);
        this.mHybridData = initHybridData(str, graphQLSubscriptionsSDKProviderBase, graphServiceAsset, scheduledExecutorService, realtimeConfigSourceProxy, graphQLConsistencyJNI);
    }

    private final native GraphQLRealtimeService.Token handleQueryJNI(GraphQLQuery graphQLQuery, GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, Executor executor);

    public static final native HybridData initHybridData(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy, GraphQLConsistencyJNI graphQLConsistencyJNI);

    @Override // com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService
    public GraphQLRealtimeService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, Executor executor) {
        4YV.A1N(graphQLQuery, executor);
        C00j.A07("GSRT.handleQuery(%s)", graphQLQuery.queryName(), -784762019);
        try {
            GraphQLRealtimeService.Token handleQueryJNI = handleQueryJNI(graphQLQuery, new Fgc(realtimeDataCallbacks, graphQLQuery), executor);
            C00j.A01(1955965420);
            return handleQueryJNI;
        } catch (Throwable th) {
            C00j.A01(1830132757);
            throw th;
        }
    }
}
