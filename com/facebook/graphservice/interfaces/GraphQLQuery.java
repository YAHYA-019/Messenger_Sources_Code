package com.facebook.graphservice.interfaces;

import X.C0gh;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLQuery.class */
public class GraphQLQuery {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni");
    }

    public GraphQLQuery(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native int cacheTtlSeconds();

    public native int freshCacheTtlSeconds();

    public native boolean hasAnalyticsHints();

    public native boolean isLiveQuery();

    public native String queryName();

    public native boolean terminateAfterFreshResponse();
}
