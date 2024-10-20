package com.facebook.messenger.plugins.msysdbmetricsexperimentplugin;

import X.11T;
import X.1Bi;
import X.1GD;
import X.2yD;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;

/* loaded from: MsysDBMetricsExperimentPluginPostmailbox.class */
public final class MsysDBMetricsExperimentPluginPostmailbox extends Postmailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysDBMetricsExperimentPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(accountSession, messengerSessionedMCPContext);
        11T.A0F(accountSession, 1);
        11T.A0F(messengerSessionedMCPContext, 2);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(int i) {
        long Auz = this.mAppContext.getMobileConfig().Auz(36601371994101105L, i);
        return Auz > 2147483647L ? (-1) >>> 1 : (int) Auz;
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int MsysDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(int i) {
        long Auz = this.mAppContext.getMobileConfig().Auz(36601371994166642L, i);
        return Auz > 2147483647L ? (-1) >>> 1 : (int) Auz;
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int MsysMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(int i) {
        return (int) ((2yD) 1Bi.A03(16387)).Auy(72621287020757305L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(boolean z, boolean z2) {
        return ((2yD) 1Bi.A03(16387)).AZk(72339812043983137L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(boolean z, boolean z2) {
        return ((2yD) 1Bi.A03(16387)).AZk(36325579259138892L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int MsysMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(int i) {
        long Auz = this.mAppContext.getMobileConfig().Auz(36601371994297715L, i);
        return Auz > 2147483647L ? (-1) >>> 1 : (int) Auz;
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(boolean z, boolean z2) {
        return this.mAppContext.getMobileConfig().AZr(z2 ? 1GD.A06 : 1GD.A07, 36320438183869829L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(boolean z, boolean z2) {
        return this.mAppContext.getMobileConfig().AZr(z2 ? 1GD.A06 : 1GD.A07, 36316619967637830L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(boolean z, boolean z2) {
        return this.mAppContext.getMobileConfig().AZr(z2 ? 1GD.A06 : 1GD.A07, 36324453977706157L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(boolean z, boolean z2) {
        return this.mAppContext.getMobileConfig().AZr(z2 ? 1GD.A06 : 1GD.A07, 36324466862608062L);
    }

    @Override // com.facebook.messenger.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean MsysMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlist(boolean z, boolean z2) {
        return z;
    }
}
