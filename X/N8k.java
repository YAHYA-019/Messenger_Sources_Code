package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: N8k.class */
public final class N8k implements Runnable {
    public static final String __redex_internal_original_name = "XMAAttachmentCache$2$2";
    public final /* synthetic */ N8c A00;

    public N8k(N8c n8c) {
        this.A00 = n8c;
    }

    @Override // java.lang.Runnable
    public void run() {
        N8c n8c = this.A00;
        ((6Cd) n8c.A03).A03((FbUserSession) n8c.A04, (Message) n8c.A05, (Integer) n8c.A06, n8c.A07, n8c.A01 + 1, n8c.A02 * 2);
    }
}
