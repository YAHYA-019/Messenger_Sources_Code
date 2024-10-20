package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* renamed from: X.6ql, reason: invalid class name */
/* loaded from: 6ql.class */
public final class C6ql extends MailboxFeature {
    public void A00(MailboxCallback mailboxCallback, PrivacyContext privacyContext, int i) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, mailboxCallback);
        1Um.A02(AQV, new Cxw(i, 0, this, A0Q, privacyContext), A0Q, false);
    }
}
