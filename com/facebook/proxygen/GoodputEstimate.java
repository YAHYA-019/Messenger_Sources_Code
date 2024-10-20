package com.facebook.proxygen;

import X.AnonymousClass001;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: GoodputEstimate.class */
public class GoodputEstimate {
    public final long achievableBps;
    public final long cdfMsSinceLastUpdated;
    public final long cdfSamplesSinceInit;
    public final String cdfSrc;
    public final long ctmNumKnobFrameErrors;
    public final long ctmNumKnobFramesReceived;
    public final long ctmNumSocketObserversAttached;
    public boolean isMaximumAchievableBps;
    public final Long minRttUs;

    public GoodputEstimate(long j, boolean z, Long l, String str, long j2, long j3, long j4, long j5, long j6) {
        this.achievableBps = j;
        this.isMaximumAchievableBps = z;
        this.minRttUs = l;
        this.cdfSrc = str;
        this.cdfMsSinceLastUpdated = j2;
        this.cdfSamplesSinceInit = j3;
        this.ctmNumKnobFramesReceived = j4;
        this.ctmNumKnobFrameErrors = j5;
        this.ctmNumSocketObserversAttached = j6;
    }

    public long getAchievableBps() {
        return this.achievableBps;
    }

    public long getCdfMsSinceLastUpdated() {
        return this.cdfMsSinceLastUpdated;
    }

    public long getCdfSamplesSinceInit() {
        return this.cdfSamplesSinceInit;
    }

    public String getCdfSrc() {
        return this.cdfSrc;
    }

    public long getCtmNumKnobFrameErrors() {
        return this.ctmNumKnobFrameErrors;
    }

    public long getCtmNumKnobFramesReceived() {
        return this.ctmNumKnobFramesReceived;
    }

    public long getCtmNumSocketObserversAttached() {
        return this.ctmNumSocketObserversAttached;
    }

    public String getDebugString() {
        return getDebugString(false);
    }

    public String getDebugString(boolean z) {
        StringBuilder A0k = AnonymousClass001.A0k();
        if (z) {
            A0k.append("achievableBps=");
            A0k.append(this.achievableBps);
            A0k.append(",isMaximumAchievableBps=");
            A0k.append(this.isMaximumAchievableBps ? 1 : 0);
            A0k.append(",minRttUs=");
            Long l = this.minRttUs;
            A0k.append(l == null ? -1 : l.longValue());
            A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        A0k.append("cdfSrc=");
        A0k.append(this.cdfSrc);
        A0k.append(",cdfMsSinceLastUpdated=");
        A0k.append(this.cdfMsSinceLastUpdated);
        A0k.append(",cdfSamplesSinceInit=");
        A0k.append(this.cdfSamplesSinceInit);
        A0k.append(",ctmNumKnobFramesReceived=");
        A0k.append(this.ctmNumKnobFramesReceived);
        A0k.append(",ctmNumKnobFrameErrors=");
        A0k.append(this.ctmNumKnobFrameErrors);
        A0k.append(",ctmNumSocketObserversAttached=");
        return AnonymousClass001.A0h(A0k, this.ctmNumSocketObserversAttached);
    }

    public Long getMinRttUs() {
        return this.minRttUs;
    }

    public String getMiniDebugString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("s=");
        A0k.append(this.cdfSrc);
        A0k.append(",mrttus=");
        Long l = this.minRttUs;
        A0k.append(l == null ? -1 : l.longValue());
        A0k.append(",mslu=");
        A0k.append(this.cdfMsSinceLastUpdated);
        A0k.append(",ssi=");
        A0k.append(this.cdfSamplesSinceInit);
        A0k.append(",nkfr=");
        A0k.append(this.ctmNumKnobFramesReceived);
        A0k.append(",nkfe=");
        A0k.append(this.ctmNumKnobFrameErrors);
        A0k.append(",nsoa=");
        return AnonymousClass001.A0h(A0k, this.ctmNumSocketObserversAttached);
    }

    public boolean isMaximumAchievableBps() {
        return this.isMaximumAchievableBps;
    }
}
