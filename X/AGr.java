package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: AGr.class */
public final class AGr implements Runnable {
    public static final String __redex_internal_original_name = "ChatEntityLogger$logChatEntityVideoMessageClick$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ 6KB A02;
    public final /* synthetic */ String A03;

    public AGr(FbUserSession fbUserSession, Message message, 6KB r304, String str) {
        this.A02 = r304;
        this.A00 = fbUserSession;
        this.A01 = message;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6KB r0 = this.A02;
        FbUserSession fbUserSession = this.A00;
        Message message = this.A01;
        1FV A00 = 6KB.A00(fbUserSession, message);
        1Br.A0D(r0.A00, new AC6(r0, message, this.A03, 4), A00);
    }
}
