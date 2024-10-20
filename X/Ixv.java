package X;

import com.facebook.rtc.chatd.ChatDHandlerPluginPostmailbox;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;

/* loaded from: Ixv.class */
public final class Ixv implements Runnable {
    public static final String __redex_internal_original_name = "ChatDHandlerPluginPostmailbox$ChatDHandlerPluginPostMailboxImpl_MEMHandleInMultiwaySessionedNotification$1";
    public final /* synthetic */ ChatDHandlerPluginPostmailbox A00;
    public final /* synthetic */ MultiwayNotificationResult A01;

    public Ixv(ChatDHandlerPluginPostmailbox chatDHandlerPluginPostmailbox, MultiwayNotificationResult multiwayNotificationResult) {
        this.A00 = chatDHandlerPluginPostmailbox;
        this.A01 = multiwayNotificationResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatDHandlerPluginPostmailbox chatDHandlerPluginPostmailbox = this.A00;
        chatDHandlerPluginPostmailbox.internalHandleNotification(chatDHandlerPluginPostmailbox.pluginContext, this.A01);
    }
}
