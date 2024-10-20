package com.facebook.messenger.plugins.mciappexperimentsplugin;

import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    public MessengerSessionlessMCPContext mSessionlessAppContext;

    public Sessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        this.mSessionlessAppContext = messengerSessionlessMCPContext;
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowLoadThreadViewDataReadOnlyJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowLoadThreadViewDataReadOnly();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForEchoInitializationJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForEchoInitialization();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForMailboxThreadThemeLoadJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForMailboxThreadThemeLoad();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForPinnedMessagesJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForPinnedMessages();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewDataOnlyMediaMessagesReadOnlyJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewDataOnlyMediaMessagesReadOnly();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewReadOnlyConnectionUsageJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewReadOnlyConnectionUsage();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnableMccErrorLoggingOnArmadilloMediaS2sQPLJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsEnableMccErrorLoggingOnArmadilloMediaS2sQPL();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnablePlatformTTCTrackingJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsEnablePlatformTTCTracking();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableAuthDataCheckJNI() {
        return false;
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableBoxedAllocForDasmJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableBoxedAllocForDasm();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableReadOnlyForAllReadOnlyFunctionsJNI() {
        return false;
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableTraceIDGenerationV2JNI() {
        return false;
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableVMStackCachingInDasmJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableVMStackCachingInDasm();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsIsOnUpgradeOrInstallJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsIsOnUpgradeOrInstall();
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsRunContactPkMigrationOnUpgradeJNI() {
        return true;
    }

    private boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsUseNativeQPLJNI() {
        return MCIAppExperimentsPluginImpl_MCIAppExperimentsUseNativeQPL();
    }

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowLoadThreadViewDataReadOnly();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForEchoInitialization();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForMailboxThreadThemeLoad();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowROConnectionForPinnedMessages();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewDataOnlyMediaMessagesReadOnly();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsAllowThreadViewReadOnlyConnectionUsage();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnableMccErrorLoggingOnArmadilloMediaS2sQPL();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsEnablePlatformTTCTracking();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableAuthDataCheck();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableBoxedAllocForDasm();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableReadOnlyForAllReadOnlyFunctions();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableTraceIDGenerationV2();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsGetEnableVMStackCachingInDasm();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsIsOnUpgradeOrInstall();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsRunContactPkMigrationOnUpgrade();

    public abstract boolean MCIAppExperimentsPluginImpl_MCIAppExperimentsUseNativeQPL();
}
