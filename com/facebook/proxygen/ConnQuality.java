package com.facebook.proxygen;

import X.AnonymousClass001;

/* loaded from: ConnQuality.class */
public class ConnQuality {
    public final long mCwnd;
    public final long mMss;
    public final long mRtt;
    public final long mRtx;
    public final long mTotalBytesWritten;
    public final long mTotalPackets;
    public final long mTotalPacketsLost;
    public final long mUploadLatency;
    public final long mUpstreamLatency;

    public ConnQuality(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.mRtt = j;
        this.mRtx = j2;
        this.mCwnd = j3;
        this.mMss = j4;
        this.mTotalBytesWritten = j5;
        this.mTotalPackets = j6;
        this.mTotalPacketsLost = j7;
        this.mUpstreamLatency = j8;
        this.mUploadLatency = j9;
    }

    public long getCwnd() {
        return this.mCwnd;
    }

    public long getMss() {
        return this.mMss;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public long getRtx() {
        return this.mRtx;
    }

    public long getTotalBytesWritten() {
        return this.mTotalBytesWritten;
    }

    public long getTotalPackets() {
        return this.mTotalPackets;
    }

    public long getTotalPacketsLost() {
        return this.mTotalPacketsLost;
    }

    public long getUploadLatency() {
        return this.mUploadLatency;
    }

    public long getUpstreamLatency() {
        return this.mUpstreamLatency;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{\"rtt\":");
        A0k.append(this.mRtt);
        A0k.append(",\"rtx\":");
        A0k.append(this.mRtx);
        A0k.append(",\"cwnd\":");
        A0k.append(this.mCwnd);
        A0k.append(",\"mss\":");
        A0k.append(this.mMss);
        A0k.append(",\"tbw\":");
        A0k.append(this.mTotalBytesWritten);
        A0k.append(",\"tp\":");
        A0k.append(this.mTotalPackets);
        A0k.append(",\"tpl\":");
        A0k.append(this.mTotalPacketsLost);
        A0k.append(",\"uplat\":");
        A0k.append(this.mUpstreamLatency);
        A0k.append(",\"ullat\":");
        A0k.append(this.mUploadLatency);
        return AnonymousClass001.A0d("}", A0k);
    }
}
