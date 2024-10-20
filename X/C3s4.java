package X;

import java.util.List;

/* renamed from: X.3s4, reason: invalid class name */
/* loaded from: 3s4.class */
public interface C3s4 {
    java.util.Map getAdaptiveFetchClientParams();

    java.util.Map getAdditionalHttpHeaders();

    List getAnalyticTags();

    String getClientTraceId();

    boolean getEnableAsyncQuery();

    boolean getEnableOfflineCaching();

    boolean getEnsureCacheWrite();

    long getFreshCacheAgeMs();

    String getFriendlyName();

    boolean getMarkHttpRequestAsReplaySafe();

    long getMaxToleratedCacheAgeMs();

    int getNetworkTimeoutSeconds();

    boolean getOnlyCacheInitialNetworkResponse();

    String getOverrideRequestURL();

    boolean getParseOnClientExecutor();

    2Jg getQuery();

    int getRequestPurpose();

    int getRetryPolicy();

    String getSequencingKey();

    boolean getTerminateAfterFreshResponse();

    boolean hasAcsToken();

    boolean hasOhaiConfig();

    boolean isMutation();

    C3s4 setEnsureCacheWrite(boolean z);

    C3s4 setFreshCacheAgeMs(long j);

    C3s4 setMaxToleratedCacheAgeMs(long j);

    C3s4 setNetworkTimeoutSeconds(int i);

    C3s4 setRequestPurpose(int i);

    C3s4 setRetryPolicy(int i);
}
