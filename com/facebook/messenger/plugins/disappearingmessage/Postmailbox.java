package com.facebook.messenger.plugins.disappearingmessage;

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

    private boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsDisappearingMessageOccamSupportEnabledJNI(boolean z, boolean z2) {
        return TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsDisappearingMessageOccamSupportEnabled(z, z2);
    }

    private boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsSendBasedDisappearingMessageEnabledJNI(boolean z, boolean z2) {
        return TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsSendBasedDisappearingMessageEnabled(z, z2);
    }

    public void DisappearingMessageExperimentPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsDisappearingMessageOccamSupportEnabled(boolean z, boolean z2);

    public abstract boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsSendBasedDisappearingMessageEnabled(boolean z, boolean z2);
}
