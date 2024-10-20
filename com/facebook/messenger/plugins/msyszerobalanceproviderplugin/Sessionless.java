package com.facebook.messenger.plugins.msyszerobalanceproviderplugin;

import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    public MessengerSessionlessMCPContext mSessionlessAppContext;

    public Sessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        this.mSessionlessAppContext = messengerSessionlessMCPContext;
    }

    private String MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceStateJNI() {
        String MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState = MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState();
        if (MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState == null) {
            MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState = null;
        }
        return MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState;
    }

    private boolean MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderIsZeroBalanceJNI() {
        return MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderIsZeroBalance();
    }

    public abstract String MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState();

    public abstract boolean MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderIsZeroBalance();
}
