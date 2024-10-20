package com.facebook.rtc.chatd;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import com.facebook.wamsys.wcp.MultiwaySendResult;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public MessengerSessionedMCPContext mAppContext;
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mPluginContext = accountSession;
        this.mAppContext = messengerSessionedMCPContext;
    }

    private boolean ChatDHandlerPluginPostMailboxImpl_MEMHandleInMultiwaySessionedNotificationJNI(MultiwayNotificationResult multiwayNotificationResult) {
        return ChatDHandlerPluginPostMailboxImpl_MEMHandleInMultiwaySessionedNotification(multiwayNotificationResult);
    }

    private void ChatDHandlerPluginPostMailboxImpl_MEMMultiwayMessageSessionedHandlerJNI(MultiwaySendResult multiwaySendResult, Object obj) {
        if (obj == null) {
            obj = null;
        }
        ChatDHandlerPluginPostMailboxImpl_MEMMultiwayMessageSessionedHandler(multiwaySendResult, obj);
    }

    public void ChatDHandlerPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract boolean ChatDHandlerPluginPostMailboxImpl_MEMHandleInMultiwaySessionedNotification(MultiwayNotificationResult multiwayNotificationResult);

    public abstract void ChatDHandlerPluginPostMailboxImpl_MEMMultiwayMessageSessionedHandler(MultiwaySendResult multiwaySendResult, Object obj);
}
