package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.media.prefetch.XMACacheData;
import com.facebook.messaging.model.messages.Message;

/* loaded from: N8p.class */
public final class N8p implements Runnable {
    public static final String __redex_internal_original_name = "XMAAttachmentCache$1$1";
    public final /* synthetic */ XMACacheData A00;
    public final /* synthetic */ N8c A01;

    public N8p(XMACacheData xMACacheData, N8c n8c) {
        this.A01 = n8c;
        this.A00 = xMACacheData;
    }

    @Override // java.lang.Runnable
    public void run() {
        N8c n8c = this.A01;
        6Cd r0 = (6Cd) n8c.A03;
        if (!r0.A06(this.A00, n8c.A07)) {
            0fH.A0F(6Cd.class, "failed to save xma");
            return;
        }
        r0.A04.A0C((FbUserSession) n8c.A04, (Message) n8c.A05, (Integer) n8c.A06, false, true);
    }
}
