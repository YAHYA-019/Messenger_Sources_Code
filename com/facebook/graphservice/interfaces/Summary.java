package com.facebook.graphservice.interfaces;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.smartcapture.logging.SCEventNames;
import com.google.common.base.MoreObjects;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.List;

/* loaded from: Summary.class */
public class Summary {
    public final long additiveParseTimeMs;
    public final long additiveThreadHopTimeMs;
    public final int apiErrorCode;
    public final int attempts;
    public final long cacheSyncEnd;
    public final long cacheSyncStart;
    public final long cachedResponseAge;
    public final int code;
    public final String consistencySource;
    public final String debugInfo;
    public final String description;
    public final String fbRequestId;
    public final long fetchCachedResponseEnd;
    public final long fetchCachedResponseStart;
    public final boolean freshResponse;
    public final boolean isFinal;
    public final boolean isNetworkComplete;
    public final boolean isSilent;
    public final boolean isTransient;
    public final long networkChunksCount;
    public final long networkEnd;
    public final long networkStart;
    public final long parseStart;
    public final int parsedDataSize;
    public final String prefetchPredictionID;
    public final GraphQLQuery query;
    public final boolean rejectedFromAdaptiveFetch;
    public final long requestEnd;
    public final long requestStart;
    public final boolean requiresReauth;
    public final List retryTimes;
    public final long rtt;
    public final long serverFlushTime;
    public final long serverStartTime;
    public final String source;
    public final String summary;
    public final long upstreamLatency;

    public Summary(String str, boolean z, boolean z2, String str2, int i, List list, long j, long j2, long j3, long j4, long j5, int i2, long j6, long j7, long j8, long j9, long j10, long j11, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j12, long j13, long j14, long j15, boolean z7, String str7, long j16, long j17) {
        this(str, z, z2, str2, i, list, j, j2, j3, j4, j5, i2, j6, j7, j8, j9, j10, j11, z3, i3, i4, str3, str4, str5, z4, z5, z6, str6, j12, j13, j14, j15, z7, str7, j16, j17, null);
    }

    public Summary(String str, boolean z, boolean z2, String str2, int i, List list, long j, long j2, long j3, long j4, long j5, int i2, long j6, long j7, long j8, long j9, long j10, long j11, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j12, long j13, long j14, long j15, boolean z7, String str7, long j16, long j17, GraphQLQuery graphQLQuery) {
        this.source = str;
        this.isFinal = z;
        this.isNetworkComplete = z2;
        this.fbRequestId = str2;
        this.attempts = i;
        this.retryTimes = list;
        this.requestStart = j;
        this.networkStart = j2;
        this.networkEnd = j3;
        this.parseStart = j4;
        this.requestEnd = j5;
        this.parsedDataSize = i2;
        this.additiveParseTimeMs = j6;
        this.networkChunksCount = j7;
        this.additiveThreadHopTimeMs = j8;
        this.fetchCachedResponseStart = j9;
        this.fetchCachedResponseEnd = j10;
        this.cachedResponseAge = j11;
        this.freshResponse = z3;
        this.code = i3;
        this.apiErrorCode = i4;
        this.summary = str3;
        this.description = str4;
        this.debugInfo = str5;
        this.isSilent = z4;
        this.isTransient = z5;
        this.requiresReauth = z6;
        this.consistencySource = str6;
        this.serverStartTime = j12;
        this.serverFlushTime = j13;
        this.cacheSyncStart = j14;
        this.cacheSyncEnd = j15;
        this.rejectedFromAdaptiveFetch = z7;
        this.prefetchPredictionID = str7;
        this.rtt = j16;
        this.upstreamLatency = j17;
        this.query = graphQLQuery;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(Property.SYMBOL_Z_ORDER_SOURCE, this.source);
        stringHelper.add("isFinal", this.isFinal);
        stringHelper.add("isNetworkComplete", this.isNetworkComplete);
        stringHelper.add(SCEventNames.Params.PERMISSION_ATTEMPTS, this.attempts);
        stringHelper.add("retryTimes", this.retryTimes);
        stringHelper.add("fbRequestId", this.fbRequestId);
        stringHelper.add("requestStart", this.requestStart);
        stringHelper.add("networkStart", this.networkStart);
        stringHelper.add("networkEnd", this.networkEnd);
        stringHelper.add("parseStart", this.parseStart);
        stringHelper.add("requestEnd", this.requestEnd);
        stringHelper.add("parsedDataSize", this.parsedDataSize);
        stringHelper.add("additiveParseTimeMs", this.additiveParseTimeMs);
        stringHelper.add("networkChunksCount", this.networkChunksCount);
        stringHelper.add("additiveThreadHopTimeMs", this.additiveThreadHopTimeMs);
        stringHelper.add("fetchCachedResponseStart", this.fetchCachedResponseStart);
        stringHelper.add("fetchCachedResponseEnd", this.fetchCachedResponseEnd);
        stringHelper.add("cachedResponseAge", this.cachedResponseAge);
        stringHelper.add("freshResponse", this.freshResponse);
        stringHelper.add("consistencySource", this.consistencySource);
        stringHelper.add("serverStartTime", this.serverStartTime);
        stringHelper.add("serverFlushTime", this.serverFlushTime);
        stringHelper.add("rejectedFromAdaptiveFetch", this.rejectedFromAdaptiveFetch);
        stringHelper.add("prefetchPredictionID", this.prefetchPredictionID);
        stringHelper.add(TraceFieldType.RTT, this.rtt);
        stringHelper.add("upstreamLatency", this.upstreamLatency);
        return stringHelper.toString();
    }
}
