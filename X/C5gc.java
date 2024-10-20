package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5gc, reason: invalid class name */
/* loaded from: 5gc.class */
public final class C5gc extends MailboxFeature {
    public void A00(MailboxCallback mailboxCallback, boolean z) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, mailboxCallback);
        1Um.A02(AQV, new N6p(A0Q, this, z), A0Q, false);
    }
}
