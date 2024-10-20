package X;

import com.facebook.messaging.model.messages.Message;

/* loaded from: AFv.class */
public final class AFv implements Runnable {
    public static final String __redex_internal_original_name = "OrcaMessageSender$sendMessage$1";
    public final /* synthetic */ 7S2 A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ String A02;

    public AFv(7S2 r302, Message message, String str) {
        this.A00 = r302;
        this.A01 = message;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Qe r0 = this.A00.A01;
        Message message = this.A01;
        r0.A00.A1r(HHk.A00(this.A02), message);
    }
}
