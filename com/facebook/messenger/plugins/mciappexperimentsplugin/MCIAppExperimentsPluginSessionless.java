package com.facebook.messenger.plugins.mciappexperimentsplugin;

import X.1BK;
import X.1BQ;
import X.1BY;
import X.2yD;
import X.C00i;
import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: MCIAppExperimentsPluginSessionless.class */
public class MCIAppExperimentsPluginSessionless extends Sessionless {
    public 1BY _UL_mInjectionContext;
    public final C00i mAppStateManager;
    public final C00i mMobileConfig;

    public MCIAppExperimentsPluginSessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        super(messengerSessionlessMCPContext);
        this.mMobileConfig = new 1BQ(16385);
        this.mAppStateManager = new 1BQ(16616);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowLoadThreadViewDataReadOnly() {
        return ((2yD) this.mMobileConfig.get()).AZk(36323607871572781L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForEchoInitialization() {
        return ((2yD) this.mMobileConfig.get()).AZk(36323607871966003L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForMailboxThreadThemeLoad() {
        return ((2yD) this.mMobileConfig.get()).AZk(36323607871900466L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForPinnedMessages() {
        return 1BK.A0N(this.mMobileConfig).AZk(36323607871441707L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewDataOnlyMediaMessagesReadOnly() {
        return 1BK.A0N(this.mMobileConfig).AZk(36323607871507244L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewReadOnlyConnectionUsage() {
        return ((2yD) this.mSessionlessAppContext.sessionlessMobileConfig.get()).AZk(36323607871310633L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnableMccErrorLoggingOnArmadilloMediaS2sQPL() {
        return ((2yD) this.mMobileConfig.get()).AZk(36318552692962067L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnablePlatformTTCTracking() {
        return ((2yD) this.mMobileConfig.get()).AZk(36315249864155750L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableAuthDataCheck() {
        return false;
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableBoxedAllocForDasm() {
        return 1BK.A0N(this.mSessionlessAppContext.sessionlessMobileConfig).AZk(36315249864024677L);
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableReadOnlyForAllReadOnlyFunctions() {
        return false;
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableTraceIDGenerationV2() {
        return false;
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableVMStackCachingInDasm() {
        return ((2yD) this.mSessionlessAppContext.sessionlessMobileConfig.get()).AZk(18309986748747396L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (((X.1Od) r301.mAppStateManager.get()).A0o != false) goto L6;
     */
    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsIsOnUpgradeOrInstall() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.mAppStateManager
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0p
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2e
            r0 = r301
            X.00i r0 = r0.mAppStateManager
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            boolean r0 = r0.A0o
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L30
        L2e:
            r0 = 1
            r303 = r0
        L30:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.plugins.mciappexperimentsplugin.MCIAppExperimentsPluginSessionless.MCIAppExperimentsPluginImpl_MCIAppExperimentsIsOnUpgradeOrInstall():boolean");
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsRunContactPkMigrationOnUpgrade() {
        return true;
    }

    @Override // com.facebook.messenger.plugins.mciappexperimentsplugin.Sessionless
    public boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsUseNativeQPL() {
        return ((2yD) this.mMobileConfig.get()).AZk(36326678770767644L);
    }
}
