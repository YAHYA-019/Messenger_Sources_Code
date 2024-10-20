package X;

import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.graphqlrealtimeservice.fbsubscription.FbGraphQLRealtimeSubscriptionService;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.fb.GraphQLConsistencyJNI;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: F1g.class */
public final class F1g {
    private final HybridData initHybridData(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy, GraphQLConsistencyJNI graphQLConsistencyJNI) {
        return FbGraphQLRealtimeSubscriptionService.initHybridData(str, graphQLSubscriptionsSDKProviderBase, graphServiceAsset, scheduledExecutorService, realtimeConfigSourceProxy, graphQLConsistencyJNI);
    }
}
