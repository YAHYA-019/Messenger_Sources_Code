package com.facebook.messenger.plugins.msysdbmetricsexperimentplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public MessengerSessionedMCPContext mAppContext;
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mPluginContext = accountSession;
        this.mAppContext = messengerSessionedMCPContext;
    }

    private int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRateJNI(int i) {
        return MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(i);
    }

    private int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRateJNI(int i) {
        return MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(i);
    }

    private int MsysMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutesJNI(int i) {
        return MsysMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(i);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabledJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(z, z2);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentDropLoggingOnBackgroundJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(z, z2);
    }

    private int MsysMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRateJNI(int i) {
        return MsysMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(i);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoringJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(z, z2);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQueryJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(z, z2);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentSkipSyncAppForegroundedJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(z, z2);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentSyncPerfOptimizationJNI(boolean z, boolean z2) {
        return MsysMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(z, z2);
    }

    private boolean MsysMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlistJNI(boolean z, boolean z2) {
        return z;
    }

    public void MsysDBMetricsExperimentPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(int i);

    public abstract int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(int i);

    public abstract int MsysMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(int i);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(boolean z, boolean z2);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(boolean z, boolean z2);

    public abstract int MsysMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(int i);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(boolean z, boolean z2);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(boolean z, boolean z2);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(boolean z, boolean z2);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(boolean z, boolean z2);

    public abstract boolean MsysMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlist(boolean z, boolean z2);
}
