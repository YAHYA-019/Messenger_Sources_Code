package com.facebook.pando;

import X.04R;
import X.11T;
import X.2Jg;
import X.2tU;
import X.4SN;
import X.AnonymousClass001;
import X.C0il;
import X.C0ty;
import X.C3o5;
import X.C3s4;
import X.C3s5;
import X.C4Th;
import X.C4Tn;
import X.EMp;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: PandoGraphQLRequest.class */
public final class PandoGraphQLRequest implements C3s4, C3s5 {
    public static final 4SN Companion = new Object();
    public boolean _hasAcsToken;
    public boolean _hasOhaiConfig;
    public final int injectionCapabilities;
    public final boolean isMutation;
    public final HybridData mHybridData;
    public final Map params;
    public final String queryName;
    public final String rootCallVariable;
    public String schemaName;
    public final Map transientParams;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SN, java.lang.Object] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoGraphQLRequest(2tU r302, String str, Map map, Map map2, Class cls, boolean z, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, int i, String str2, String str3, List list) {
        List list2 = list;
        Map map3 = map2;
        Map map4 = map;
        C3o5.A0k(str, 2, cls);
        this.isMutation = z;
        this.injectionCapabilities = i;
        this.rootCallVariable = str2;
        String clientDocIdForQuery = r302.clientDocIdForQuery(str);
        String persistIdForQuery = clientDocIdForQuery == null ? r302.persistIdForQuery(str) : null;
        this.queryName = str;
        this.schemaName = r302.schemaForQuery(str);
        if (list != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((PandoGraphQLConnectionConfig) it.next()).setGeneratedPaginationQueryClientDocId(r302);
            }
        }
        this.params = map4;
        this.transientParams = map3;
        persistIdForQuery = persistIdForQuery == null ? "" : persistIdForQuery;
        clientDocIdForQuery = clientDocIdForQuery == null ? "" : clientDocIdForQuery;
        NativeMap nativeMap = NativeMap.$redex_init_class;
        NativeMap nativeMap2 = new NativeMap(map == null ? 04R.A0G() : map4);
        NativeMap nativeMap3 = new NativeMap(map2 == null ? 04R.A0G() : map3);
        list2 = list == null ? C0ty.A00 : list2;
        String str4 = this.schemaName;
        this.mHybridData = initHybridData(persistIdForQuery, clientDocIdForQuery, str, "", nativeMap2, nativeMap3, cls, pandoRealtimeInfoJNI, list2, str4 == null ? "" : str4);
    }

    private final native void addAdditionalHttpHeaderNative(String str, String str2);

    private final native void addAdditionalHttpRequestParamNative(String str, String str2);

    private final native void addTrackedHttpResponseHeaderNative(String str);

    private final native int getTimeoutSeconds();

    private final native boolean hasRealtimeSubscriptionInfo();

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, NativeMap nativeMap, NativeMap nativeMap2, Class cls, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, List list, String str5);

    private final native void removeAdditionalHttpHeaderNative(String str);

    private final native void setAcsTokenNative(String str, String str2, String str3, String str4, String str5, String str6);

    private final native void setCacheFallbackByDuration_EXPERIMENTALNative(long j);

    private final native void setCacheTtlMs(long j);

    private final native void setEnableCacheReadWriteOnCallerThreadNative(boolean z);

    private final native void setEnsureCacheWriteNative(boolean z);

    private final native void setForceCacheOnNetworkError_EXPERIMENTALNative(boolean z);

    private final native void setFreshCacheTtlMs(long j);

    private final native void setIsPeakNative(boolean z);

    private final native void setOhaiConfigNative(int i, String str, int i2, int i3, int i4);

    private final native void setOptimisticUpdater(TreeUpdaterJNI treeUpdaterJNI);

    private final native void setPublishMode(int i);

    private final native void setQueryVariablesNative(NativeMap nativeMap, NativeMap nativeMap2);

    private final native void setRealtimeBackgroundPolicyNative(int i);

    private final native void setRequestPurposeNative(int i);

    private final native void setTimeoutSeconds(int i);

    @Override // X.C3s4
    public Map getAdaptiveFetchClientParams() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public Map getAdditionalHttpHeaders() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public List getAnalyticTags() {
        throw AnonymousClass001.A0p();
    }

    public native long getCacheFallbackByDuration_EXPERIMENTAL();

    @Override // X.C3s4
    public String getClientTraceId() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public boolean getEnableAsyncQuery() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public boolean getEnableOfflineCaching() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public native boolean getEnsureCacheWrite();

    public native boolean getForceCacheOnNetworkError_EXPERIMENTAL();

    @Override // X.C3s4
    public native long getFreshCacheAgeMs();

    @Override // X.C3s4
    public String getFriendlyName() {
        return this.queryName;
    }

    @Override // X.C3s4
    public boolean getMarkHttpRequestAsReplaySafe() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public native long getMaxToleratedCacheAgeMs();

    @Override // X.C3s4
    public int getNetworkTimeoutSeconds() {
        return getTimeoutSeconds();
    }

    @Override // X.C3s4
    public boolean getOnlyCacheInitialNetworkResponse() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public String getOverrideRequestURL() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public boolean getParseOnClientExecutor() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s5
    public List getQueriesToClearFromCache() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public 2Jg getQuery() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public native int getRequestPurpose();

    @Override // X.C3s4
    public native int getRetryPolicy();

    @Override // X.C3s4
    public String getSequencingKey() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public boolean getTerminateAfterFreshResponse() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C3s4
    public boolean hasAcsToken() {
        return this._hasAcsToken;
    }

    @Override // X.C3s4
    public boolean hasOhaiConfig() {
        return this._hasOhaiConfig;
    }

    @Override // X.C3s4
    public boolean isMutation() {
        return this.isMutation;
    }

    public PandoGraphQLRequest setAcsToken(C4Tn c4Tn) {
        this._hasAcsToken = true;
        setAcsTokenNative(c4Tn.A03, c4Tn.A01, c4Tn.A00, c4Tn.A02, c4Tn.A04, c4Tn.A05);
        return this;
    }

    public final native void setAdditionalCacheQueryKey(String str);

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setEnsureCacheWrite(boolean z) {
        setEnsureCacheWriteNative(false);
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    @Override // X.C3s4
    public PandoGraphQLRequest setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    public final native void setLocale(String str);

    public final native void setManuallyManageActiveFieldUpdates(boolean z);

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }

    @Override // X.C3s4
    public PandoGraphQLRequest setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setNetworkTimeoutSeconds(int i) {
        setTimeoutSeconds(Math.max(i, 0));
        return this;
    }

    public PandoGraphQLRequest setOhaiConfig(C4Th c4Th) {
        this._hasOhaiConfig = true;
        setOhaiConfigNative(c4Th.A03, c4Th.A04, c4Th.A02, c4Th.A01, c4Th.A00);
        return this;
    }

    public final native void setPerformOptimisticMerge(boolean z);

    public final PandoGraphQLRequest setPublishMode(EMp eMp) {
        11T.A0F(eMp, 0);
        setPublishMode(eMp.intMode);
        return this;
    }

    public final void setQueryVariables(Map map, Map map2) {
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            map = 04R.A0G();
        }
        NativeMap nativeMap2 = new NativeMap(map);
        if (map2 == null) {
            map2 = 04R.A0G();
        }
        setQueryVariablesNative(nativeMap2, new NativeMap(map2));
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setRequestPurpose(int i) {
        setRequestPurposeNative(2);
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setRetryPolicy(int i) {
        setRetryPolicyNative(i);
        return this;
    }

    public final native void setRetryPolicyNative(int i);
}
