package com.facebook.traffic.knob;

import X.0Pz;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1my;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: InbandTelemetryBweEstimate.class */
public final class InbandTelemetryBweEstimate {
    public static final String COMPACT_DEBUG_STR_DELIMITER_LEVEL_1 = ",";
    public static final String HTTP_HEADER_INBAND_ESTIMATE_PREFIX = "inbandbwe-estimate";
    public static final String KEY_VALUE_SEPARATOR = "=";
    public static final int PRIME = 31;
    public final List alternateEstimates;
    public final Map debugInfo;
    public final long httpBytesMultiplexed;
    public final long httpDelaysMs;
    public final String httpLastRequestAppMarker;
    public final String httpRequestTypeId;
    public final long transportDelaysMs;
    public final Map transportGfrKbps;

    /* loaded from: InbandTelemetryBweEstimate$Builder.class */
    public final class Builder {
        public long httpBytesMultiplexed;
        public long httpDelaysMs;
        public long transportDelaysMs;
        public Map transportGfrKbps = new HashMap();
        public String httpRequestTypeId = "";
        public String httpLastRequestAppMarker = "";
        public Map debugInfo = new HashMap();
        public List alternateEstimates = new ArrayList();

        public Builder() {
            long j = -1;
            this.transportDelaysMs = j;
            this.httpBytesMultiplexed = j;
            this.httpDelaysMs = j;
        }

        public Builder alternateEstimates(List list) {
            this.alternateEstimates = list;
            return this;
        }

        public InbandTelemetryBweEstimate build() {
            return new InbandTelemetryBweEstimate(this);
        }

        public Builder debugInfo(Map map) {
            this.debugInfo = map;
            return this;
        }

        public Builder httpBytesMultiplexed(long j) {
            this.httpBytesMultiplexed = j;
            return this;
        }

        public Builder httpDelaysMs(long j) {
            this.httpDelaysMs = j;
            return this;
        }

        public Builder httpLastRequestAppMarker(String str) {
            this.httpLastRequestAppMarker = str;
            return this;
        }

        public Builder httpRequestTypeId(String str) {
            this.httpRequestTypeId = str;
            return this;
        }

        public Builder transportDelaysMs(long j) {
            this.transportDelaysMs = j;
            return this;
        }

        public Builder transportGfrKbps(Map map) {
            this.transportGfrKbps = map;
            return this;
        }
    }

    public InbandTelemetryBweEstimate(Builder builder) {
        this.transportGfrKbps = builder.transportGfrKbps;
        this.transportDelaysMs = builder.transportDelaysMs;
        this.httpBytesMultiplexed = builder.httpBytesMultiplexed;
        this.httpDelaysMs = builder.httpDelaysMs;
        this.httpRequestTypeId = builder.httpRequestTypeId;
        this.httpLastRequestAppMarker = builder.httpLastRequestAppMarker;
        this.debugInfo = builder.debugInfo;
        this.alternateEstimates = builder.alternateEstimates;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && getClass() == obj.getClass()) {
            InbandTelemetryBweEstimate inbandTelemetryBweEstimate = (InbandTelemetryBweEstimate) obj;
            if (this.transportGfrKbps.equals(inbandTelemetryBweEstimate.transportGfrKbps) && this.transportDelaysMs == inbandTelemetryBweEstimate.transportDelaysMs && this.httpBytesMultiplexed == inbandTelemetryBweEstimate.httpBytesMultiplexed && this.httpDelaysMs == inbandTelemetryBweEstimate.httpDelaysMs && this.httpRequestTypeId.equals(inbandTelemetryBweEstimate.httpRequestTypeId) && this.httpLastRequestAppMarker.equals(inbandTelemetryBweEstimate.httpLastRequestAppMarker) && this.debugInfo.equals(inbandTelemetryBweEstimate.debugInfo) && this.alternateEstimates.equals(inbandTelemetryBweEstimate.alternateEstimates)) {
                z = true;
            }
        }
        return z;
    }

    public List getAlternateEstimates() {
        return this.alternateEstimates;
    }

    public long getBandwidthBps(double d) {
        Number A0o = 1BK.A0o(Double.valueOf(d), this.transportGfrKbps);
        return A0o == null ? -1 : A0o.longValue() * 1000;
    }

    public Map getDebugInfo() {
        return this.debugInfo;
    }

    public String getDebugStr(DebugStrOptions debugStrOptions) {
        Map map;
        Joiner.MapJoiner mapJoiner = new Joiner.MapJoiner(new Joiner(COMPACT_DEBUG_STR_DELIMITER_LEVEL_1), KEY_VALUE_SEPARATOR);
        if (debugStrOptions.allowListByFieldId.size() > 0) {
            map = C1my.A03(new Predicates.InPredicate(debugStrOptions.allowListByFieldId), this.debugInfo);
        } else {
            map = this.debugInfo;
        }
        Iterator A0y = AnonymousClass001.A0y(map);
        StringBuilder A0k = AnonymousClass001.A0k();
        mapJoiner.appendTo(A0k, A0y);
        return A0k.toString();
    }

    public long getHttpBytesMultiplexed() {
        return this.httpBytesMultiplexed;
    }

    public long getHttpDelaysMs() {
        return this.httpDelaysMs;
    }

    public Map getHttpHeaders(HttpHeaderOptions httpHeaderOptions) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(0Pz.A0W(httpHeaderOptions.prependStr, HTTP_HEADER_INBAND_ESTIMATE_PREFIX), getDebugStr(new DebugStrOptions(httpHeaderOptions.allowListByFieldId)));
        return A0u;
    }

    public String getHttpLastRequestAppMarker() {
        return this.httpLastRequestAppMarker;
    }

    public String getHttpRequestIdType() {
        return this.httpRequestTypeId;
    }

    public long getTransportDelaysMs() {
        return this.transportDelaysMs;
    }

    public Map getTransportGfrKbps() {
        return this.transportGfrKbps;
    }

    public long getTtfbMs() {
        long j = this.httpDelaysMs;
        if (j <= 0) {
            j = 0;
        }
        long j2 = this.transportDelaysMs;
        if (j2 > 0) {
            j += j2;
        }
        return j;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (AnonymousClass002.A05(Long.valueOf(this.httpDelaysMs), AnonymousClass002.A05(Long.valueOf(this.httpBytesMultiplexed), AnonymousClass002.A05(Long.valueOf(this.transportDelaysMs), (this.transportGfrKbps.hashCode() + 31) * 31))) + 1BL.A05(this.httpRequestTypeId)) * 31;
        String str = this.httpLastRequestAppMarker;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A05 + i) * 31) + this.debugInfo.hashCode()) * 31) + this.alternateEstimates.hashCode();
    }
}
