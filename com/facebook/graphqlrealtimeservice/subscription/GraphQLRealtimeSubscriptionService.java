package com.facebook.graphqlrealtimeservice.subscription;

import X.C00j;
import X.C0gh;
import X.Fgc;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: GraphQLRealtimeSubscriptionService.class */
public class GraphQLRealtimeSubscriptionService implements GraphQLRealtimeService {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphqlrt-subscription-jni");
    }

    public GraphQLRealtimeSubscriptionService(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy) {
        this.mHybridData = initHybridData(str, graphQLSubscriptionsSDKProviderBase, graphServiceAsset, scheduledExecutorService, realtimeConfigSourceProxy);
    }

    private native GraphQLRealtimeService.Token handleQueryJNI(GraphQLQuery graphQLQuery, GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, Executor executor);

    public static native HybridData initHybridData(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    @Override // com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService
    public GraphQLRealtimeService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, Executor executor) {
        C00j.A07("GSRT.handleQuery(%s)", graphQLQuery.queryName(), 762219547);
        try {
            GraphQLRealtimeService.Token handleQueryJNI = handleQueryJNI(graphQLQuery, new Fgc(realtimeDataCallbacks, graphQLQuery), executor);
            C00j.A01(-87533646);
            return handleQueryJNI;
        } catch (Throwable th) {
            C00j.A01(-2134090008);
            throw th;
        }
    }
}
