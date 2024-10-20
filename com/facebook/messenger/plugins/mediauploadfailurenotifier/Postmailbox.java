package com.facebook.messenger.plugins.mediauploadfailurenotifier;

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

    private void OrcaMediaUploadFailurePushNotificationIssuer_MsysMediaUploadFailureNotifierNotifyJNI(String str) {
        OrcaMediaUploadFailurePushNotificationIssuer_MsysMediaUploadFailureNotifierNotify(str);
    }

    public void OrcaMediaUploadFailureNotifierPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract void OrcaMediaUploadFailurePushNotificationIssuer_MsysMediaUploadFailureNotifierNotify(String str);
}
