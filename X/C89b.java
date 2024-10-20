package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.89b, reason: invalid class name */
/* loaded from: 89b.class */
public final class C89b {
    public final 1Br A00;
    public final 1De A01;

    public C89b(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 67591);
    }

    public final void A00(FbUserSession fbUserSession, Message message) {
        11T.A0F(fbUserSession, 1);
        ThreadKey threadKey = message.A0V;
        if (threadKey == null || 1BK.A1X(message.A17, true) || ((60P) 4YU.A0o(fbUserSession, this.A01, 49926)).A00(message)) {
            return;
        }
        C00i c00i = this.A00.A00;
        if (((7OD) c00i.get()).A04()) {
            ((7OD) c00i.get()).A03(threadKey, true);
        }
    }
}
