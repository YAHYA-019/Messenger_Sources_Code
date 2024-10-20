package com.facebook.acra.anr;

import X.0Q8;

/* loaded from: ANRDataProvider.class */
public abstract class ANRDataProvider implements ANRReportProvider {
    public ANRDataProvider() {
        throw 0Q8.createAndThrow();
    }

    public abstract int detectionIntervalTimeMs();

    public abstract int detectorToUse();

    public abstract int getForegroundCheckPeriod();

    public abstract int getRecoveryTimeout();

    public abstract void provideDexStatus();

    public abstract void provideLooperMonitorInfo();

    public abstract void provideLooperProfileInfo();

    public abstract void provideStats();

    @Override // com.facebook.acra.anr.ANRReportProvider
    public abstract void reportSoftError(String str, Throwable th);

    public abstract boolean shouldANRDetectorRun();

    public abstract boolean shouldAvoidMutexOnSignalHandler();

    @Override // com.facebook.acra.anr.ANRReportProvider
    public abstract boolean shouldCollectAndUploadANRReports();

    public abstract boolean shouldDedupDiskPersistence();

    public abstract boolean shouldLogOnSignalHandler();

    public abstract boolean shouldLogProcessPositionInAnrTraceFile();

    public abstract boolean shouldRecordSignalTime();

    public abstract boolean shouldReportSoftErrors();

    public abstract boolean shouldRunANRDetectorOnBrowserProcess();

    public abstract boolean shouldUploadSystemANRTraces();
}
