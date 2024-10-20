package X;

import com.facebook.rtc.chatd.ChatDHandlerPluginPostmailbox;
import com.facebook.wamsys.wcp.MultiwaySendResult;

/* loaded from: J13.class */
public final class J13 implements Runnable {
    public static final String __redex_internal_original_name = "ChatDHandlerPluginPostmailbox$ChatDHandlerPluginPostMailboxImpl_MEMMultiwayMessageSessionedHandler$1";
    public final /* synthetic */ ChatDHandlerPluginPostmailbox A00;
    public final /* synthetic */ MultiwaySendResult A01;
    public final /* synthetic */ Object A02;

    public J13(ChatDHandlerPluginPostmailbox chatDHandlerPluginPostmailbox, MultiwaySendResult multiwaySendResult, Object obj) {
        this.A00 = chatDHandlerPluginPostmailbox;
        this.A01 = multiwaySendResult;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.internalHandleMessageResponse(this.A01, this.A02);
    }
}
