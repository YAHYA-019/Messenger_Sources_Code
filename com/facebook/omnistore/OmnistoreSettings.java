package com.facebook.omnistore;

/* loaded from: OmnistoreSettings.class */
public class OmnistoreSettings {
    public boolean deleteDbIfDbHealthTrackerIsCorrupt;
    public boolean deleteDbIfDbIsCorrupt;
    public boolean disableCheckpointOnDBInit;
    public boolean enableDatabaseHealthTracker;
    public boolean enableDelayIntegrityProcessWithRetries;
    public boolean enableFlatbufferRuntimeVerifier;
    public boolean enableFlatbufferRuntimeVerifierForDelta;
    public boolean enableIrisAckOptimization;
    public boolean enablePerCollectionIntegrityProcessTiming;
    public boolean enableReportChangedBlob;
    public boolean enableServerSideUnsubscribe;
    public boolean shouldSkipConnectForPreviousSession;
    public boolean deleteDbOnOpenError = true;
    public boolean deleteObjectsBeforeResnapshot = true;
    public boolean enableSelfCheck = false;
    public boolean enableServerSync = false;
    public boolean enableApiEventLogger = false;
    public long dbVacuumInterval = 0;
    public long minDeleteDBSizeMB = 0;
    public boolean sendCollectionWithConnectSubscription = false;
    public boolean enableStrongConsistencyOnQueueBasedSubscription = false;
    public long sendBaseRetryTimeoutInSecond = -1;
    public boolean enableThrowExceptionOnOpening = false;
}
