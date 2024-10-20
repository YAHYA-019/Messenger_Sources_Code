package X;

import com.facebook.messaging.model.messages.Message;

/* loaded from: AG4.class */
public final class AG4 implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerReplySender$sendMessage$1";
    public final /* synthetic */ Message A00;
    public final /* synthetic */ A4u A01;
    public final /* synthetic */ String A02;

    public AG4(Message message, A4u a4u, String str) {
        this.A01 = a4u;
        this.A00 = message;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01.CKU(this.A00, this.A02);
    }
}
