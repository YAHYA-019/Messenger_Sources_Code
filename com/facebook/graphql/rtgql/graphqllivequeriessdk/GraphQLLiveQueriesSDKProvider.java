package com.facebook.graphql.rtgql.graphqllivequeriessdk;

import X.1BL;
import X.C0il;
import X.HHS;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

/* loaded from: GraphQLLiveQueriesSDKProvider.class */
public final class GraphQLLiveQueriesSDKProvider extends GraphQLLiveQueriesSDKProviderBase {
    public static final HHS Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HHS, java.lang.Object] */
    static {
        C0il.A0B("graphqllivequeriessdk");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLiveQueriesSDKProvider(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy) {
        super(initHybrid(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy));
        1BL.A1H(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy);
    }

    public static final native HybridData initHybrid(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy);
}
