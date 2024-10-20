package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.4t1, reason: invalid class name */
/* loaded from: 4t1.class */
public final class C4t1 extends MailboxFeature {
    public MailboxFutureImpl A00() {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Iah(this, mailboxFutureImpl, 0))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
