package com.facebook.livequery.core.requeststream;

import X.C0il;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.GraphQLLiveQueriesSDKProvider;
import com.facebook.jni.HybridData;
import com.facebook.livequery.auxiliary.LiveQueryClientInfo;
import com.facebook.livequery.core.common.LiveQueryService;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.RequestStreamClient;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: LiveQueryServiceRSImpl.class */
public class LiveQueryServiceRSImpl extends LiveQueryService {
    public static final LiveQueryServiceRSImpl $redex_init_class = null;

    static {
        C0il.A0B("live-query-rs-impl-jni");
    }

    public static native HybridData initHybrid(LiveQueryClientInfo liveQueryClientInfo, RealtimeConfigSourceProxy realtimeConfigSourceProxy, XAnalyticsHolder xAnalyticsHolder, RequestStreamClient requestStreamClient, GraphQLLiveQueriesSDKProvider graphQLLiveQueriesSDKProvider);
}
