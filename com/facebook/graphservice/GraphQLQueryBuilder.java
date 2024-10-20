package com.facebook.graphservice;

import X.3tQ;
import X.C00j;
import X.C0gh;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;

/* loaded from: GraphQLQueryBuilder.class */
public class GraphQLQueryBuilder {
    public static final GraphQLQueryBuilder $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.graphservice.GraphQLConfigHintsJNI, java.lang.Object] */
    public GraphQLQueryBuilder(3tQ r302, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z) {
        C00j.A07("GraphQLQueryBuilder(%s)", str2, 2067294751);
        ?? obj = new Object();
        obj.mHybridData = GraphQLConfigHintsJNI.initHybridData(r302.cacheTtlSeconds, r302.freshCacheTtlSeconds, r302.additionalHttpHeaders, r302.networkTimeoutSeconds, r302.retryPolicy, r302.terminateAfterFreshResponse, r302.friendlyNameOverride, r302.privacyFeature, r302.locale, r302.parseOnClientExecutor, r302.analyticTags, r302.requestPurpose, r302.ensureCacheWrite, r302.onlyCacheInitialNetworkResponse, r302.enableOfflineCaching, r302.markHttpRequestReplaySafe, r302.adaptiveFetchClientParams, r302.clientTraceId, r302.overrideRequestURL, r302.enableAsyncQuery, r302.sequencingKey, r302.queriesToClearFromCache);
        this.mHybridData = initHybridData(obj, str, str2, j, nativeMap, cls, i, graphServiceAsset, z);
        C00j.A01(190937289);
    }

    public static native HybridData initHybridData(GraphQLConfigHintsJNI graphQLConfigHintsJNI, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z);

    public native GraphQLQuery getResult();

    public native void setAcsToken(String str, String str2, String str3, String str4, String str5, String str6);

    public native void setOhaiConfig(int i, int i2, int i3, int i4, String str);
}
