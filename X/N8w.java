package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.media.prefetch.XMACacheData;
import com.facebook.messaging.model.messages.Message;

/* loaded from: N8w.class */
public final class N8w implements Runnable {
    public static final String __redex_internal_original_name = "XMAAttachmentCache$2$1";
    public final /* synthetic */ XMACacheData A00;
    public final /* synthetic */ N8c A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public N8w(XMACacheData xMACacheData, N8c n8c, String str, String str2) {
        this.A01 = n8c;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = xMACacheData;
    }

    @Override // java.lang.Runnable
    public void run() {
        N8c n8c = this.A01;
        6Cd r0 = (6Cd) n8c.A03;
        Message message = (Message) n8c.A05;
        String str = this.A02;
        String str2 = this.A03;
        if (message != null && 1JF.A0B(str)) {
            1JF.A0B(str2);
        }
        if (r0.A06(this.A00, n8c.A07)) {
            r0.A04.A0C((FbUserSession) n8c.A04, message, (Integer) n8c.A06, false, true);
        } else {
            0fH.A0F(6Cd.class, "failed to save xma");
        }
    }
}
