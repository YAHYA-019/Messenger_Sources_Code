package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.2cx, reason: invalid class name */
/* loaded from: 2cx.class */
public final class C2cx extends MailboxFeature {
    public static C1qL A00 = new 38C(1);

    public MailboxFutureImpl A00() {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new LXJ(mailboxFutureImpl, this, 1))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public MailboxFutureImpl A01() {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new LXJ(mailboxFutureImpl, this, 2))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
