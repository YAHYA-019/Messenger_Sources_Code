package com.facebook.acra.anr.base;

import X.04W;
import X.0EP;
import X.AnonymousClass001;
import X.C04a;
import X.C04m;
import android.os.SystemClock;
import com.facebook.acra.anr.ANRDetectorListener;
import com.facebook.acra.anr.ANRReportProvider;
import com.facebook.acra.anr.IANRDetector;

/* loaded from: AbstractANRDetector.class */
public abstract class AbstractANRDetector implements IANRDetector {
    public final C04a mANRConfig;
    public ANRReportProvider mANRReportProvider;
    public long mANRReportTime;
    public ANRDetectorListener mAnrDetectorListener;
    public long mDetectorStartTime;
    public boolean mInAnr;
    public volatile boolean mInForegroundV1;
    public volatile boolean mInForegroundV2;
    public final Object mStateLock = AnonymousClass001.A0R();

    public AbstractANRDetector(C04a c04a) {
        this.mANRConfig = c04a;
    }

    public static boolean isTest() {
        return false;
    }

    public void anrHasEnded(boolean z) {
        if (z) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.mANRReportTime;
            04W r0 = this.mANRConfig.A03;
            r0.A0B = uptimeMillis;
            04W.A00(r0);
            r0.A0R = false;
        }
    }

    public abstract void collectStackTrace();

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedTime() {
        return 0L;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedUpTime() {
        return 0L;
    }

    public long getDetectorStartTime() {
        return this.mDetectorStartTime;
    }

    public long getReadyTime() {
        return 0L;
    }

    public long getSwitchTime() {
        return 0L;
    }

    public boolean inAnrState() {
        boolean z;
        synchronized (this.mStateLock) {
            z = this.mInAnr;
        }
        return z;
    }

    public boolean isDebuggerConnected() {
        return false;
    }

    public boolean isInForegroundV1() {
        return this.mInForegroundV1;
    }

    public void logMainThreadUnblocked(long j) {
        04W r0 = this.mANRConfig.A03;
        r0.A07 = j;
        04W.A00(r0);
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void nativeLibraryLoaded(boolean z) {
    }

    public abstract void notifyStateListeners(C04m c04m);

    public void processMonitorStarted() {
        if (shouldCollectAndUploadANRReportsNow()) {
            04W r0 = this.mANRConfig.A03;
            r0.A0A = SystemClock.uptimeMillis();
            04W.A00(r0);
        }
    }

    public void processMonitorStopped(int i) {
        if (shouldCollectAndUploadANRReportsNow()) {
            04W r0 = this.mANRConfig.A03;
            r0.A09 = SystemClock.uptimeMillis();
            r0.A01 = i;
            04W.A00(r0);
        }
    }

    public void reportSoftError(String str, Throwable th) {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            aNRReportProvider.reportSoftError(str, th);
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setANRReportProvider(ANRReportProvider aNRReportProvider) {
        this.mANRReportProvider = aNRReportProvider;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setCheckIntervalMs(long j) {
    }

    public void setInAnrState(boolean z) {
        synchronized (this.mStateLock) {
            this.mInAnr = z;
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setListener(ANRDetectorListener aNRDetectorListener) {
        synchronized (this) {
            this.mAnrDetectorListener = aNRDetectorListener;
        }
    }

    public boolean shouldCollectAndUploadANRReports() {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            return aNRReportProvider.shouldCollectAndUploadANRReports();
        }
        return true;
    }

    public boolean shouldCollectAndUploadANRReportsNow() {
        if (shouldCollectAndUploadANRReports()) {
            return this.mInForegroundV2 || this.mInForegroundV1;
        }
        return false;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void start() {
        start(-1);
    }

    public abstract void start(long j);

    public void startReport(String str, String str2, Long l, boolean z) {
        ANRDetectorListener aNRDetectorListener;
        String str3;
        synchronized (this) {
            aNRDetectorListener = this.mAnrDetectorListener;
        }
        String str4 = null;
        if (aNRDetectorListener != null) {
            str3 = aNRDetectorListener.getBlackBoxTraceId();
            str4 = aNRDetectorListener.getLongStallTraceId();
            aNRDetectorListener.onStartANRDataCapture();
        } else {
            str3 = null;
        }
        collectStackTrace();
        this.mANRReportTime = SystemClock.uptimeMillis();
        this.mANRConfig.A03.A01((0EP) null, (0EP) null, (C04m) null, l, (Long) null, (Long) null, (Long) null, str3, str4, str, str2, this.mANRReportTime, this.mDetectorStartTime, AnonymousClass001.A1U(this.mANRReportProvider), this.mInForegroundV1, this.mInForegroundV2, z, this.mANRConfig.A09);
        if (aNRDetectorListener != null) {
            aNRDetectorListener.onEndANRDataCapture();
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public abstract void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener);
}
