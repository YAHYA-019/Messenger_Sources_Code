package com.facebook.realtime.pulsar;

import X.1BL;
import X.2yD;

/* loaded from: PulsarOptions.class */
public final class PulsarOptions {
    public final long amendmentIntervalSec;
    public final long amendmentPayloadSizeBytes;
    public final long concurrency;
    public final boolean continueWhenAppBackgrounded;
    public final boolean continueWhenPayloadLost;
    public final long numAmendment;
    public final long numPayloadExpected;
    public final long payloadIntervalSec;
    public final long payloadSize;
    public final String publishModeStr;
    public final String timeSpanModeStr;

    public PulsarOptions() {
        2yD A0Q = 1BL.A0Q();
        this.numPayloadExpected = A0Q.Auy(36594899479366005L);
        this.payloadIntervalSec = A0Q.Auy(36594899479431542L);
        this.payloadSize = A0Q.Auy(36594899479497079L);
        this.timeSpanModeStr = 2yD.A02(A0Q, 36876374456402636L);
        this.publishModeStr = 2yD.A02(A0Q, 36876374456271562L);
        this.concurrency = 1L;
        this.numAmendment = A0Q.Auy(36594899481004410L);
        this.amendmentIntervalSec = A0Q.Auy(36594899480938873L);
        this.amendmentPayloadSizeBytes = A0Q.Auy(36594899483494779L);
        this.continueWhenAppBackgrounded = A0Q.AZk(36313424505281088L);
        this.continueWhenPayloadLost = A0Q.AZk(36313424505674307L);
    }

    public final long getAmendmentIntervalSec() {
        return this.amendmentIntervalSec;
    }

    public final long getAmendmentPayloadSizeBytes() {
        return this.amendmentPayloadSizeBytes;
    }

    public final long getConcurrency() {
        return 1L;
    }

    public final boolean getContinueWhenAppBackgrounded() {
        return this.continueWhenAppBackgrounded;
    }

    public final boolean getContinueWhenPayloadLost() {
        return this.continueWhenPayloadLost;
    }

    public final long getNumAmendment() {
        return this.numAmendment;
    }

    public final long getNumPayloadExpected() {
        return this.numPayloadExpected;
    }

    public final long getPayloadIntervalSec() {
        return this.payloadIntervalSec;
    }

    public final long getPayloadSize() {
        return this.payloadSize;
    }

    public final String getPublishModeStr() {
        return this.publishModeStr;
    }

    public final String getTimeSpanModeStr() {
        return this.timeSpanModeStr;
    }
}
