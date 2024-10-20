package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit;
import java.util.ArrayList;

/* renamed from: X.3cr, reason: invalid class name */
/* loaded from: 3cr.class */
public final class C3cr implements 1Vf {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;

    public C3cr(Context context, FbUserSession fbUserSession) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 33183);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged")) {
            OnThreadTypeFilterChanged onThreadTypeFilterChanged = (OnThreadTypeFilterChanged) r302;
            11T.A0F(onThreadTypeFilterChanged, 0);
            if (onThreadTypeFilterChanged.A00 == 1Hb.A06) {
                MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A00);
                ArrayList A0s = AnonymousClass001.A0s();
                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                1Um.A02(A0O, new A1e(12, A0s, mailboxFeature, A0P), A0P, false);
                return;
            }
            return;
        }
        if (!str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        OnThreadTypeFilterInit onThreadTypeFilterInit = (OnThreadTypeFilterInit) r302;
        11T.A0F(onThreadTypeFilterInit, 0);
        if (onThreadTypeFilterInit.A00 == 1Hb.A06) {
            MailboxFeature mailboxFeature2 = (MailboxFeature) 1Br.A0B(this.A00);
            ArrayList A0s2 = AnonymousClass001.A0s();
            1Um A0O2 = 1BK.A0O(mailboxFeature2, 0);
            MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
            1Um.A02(A0O2, new A1e(12, A0s2, mailboxFeature2, A0P2), A0P2, false);
        }
    }
}
