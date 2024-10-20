package com.facebook.pando.primaryexecution.livequery;

import X.C0il;
import X.HJl;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;

/* loaded from: PandoLiveQueryService.class */
public final class PandoLiveQueryService extends PandoPrimaryExecution {
    public static final HJl Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJl] */
    static {
        C0il.A0B("pando-client-livequery-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, GraphQLLiveQueriesSDKProviderBase graphQLLiveQueriesSDKProviderBase, RealtimeConfigSourceProxy realtimeConfigSourceProxy);
}
