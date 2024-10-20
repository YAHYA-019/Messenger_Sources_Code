package com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;
import java.util.Map;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public MessengerSessionedMCPContext mAppContext;
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mPluginContext = accountSession;
        this.mAppContext = messengerSessionedMCPContext;
    }

    private void MsysOpenMessagingAttachmentCleanupExtensionsImpl_MsysOpenMessagingAttachmentCleanupProxyDeleteAttachmentJNI(Map map) {
        MsysOpenMessagingAttachmentCleanupExtensionsImpl_MsysOpenMessagingAttachmentCleanupProxyDeleteAttachment(map);
    }

    public abstract void MsysOpenMessagingAttachmentCleanupExtensionsImpl_MsysOpenMessagingAttachmentCleanupProxyDeleteAttachment(Map map);

    public void MsysOpenMessagingAttachmentDeletionPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }
}
