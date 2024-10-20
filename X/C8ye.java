package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.8ye, reason: invalid class name */
/* loaded from: 8ye.class */
public final class C8ye extends MailboxFeature {
    public static C1qL A00 = new MWw(1);

    public 5QE A00() {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
        1Um.A01(AQV, new N6v(3, this, mailboxFutureImpl, mailboxFutureImpl2), mailboxFutureImpl, mailboxFutureImpl2);
        return new 5QE(mailboxFutureImpl, mailboxFutureImpl2);
    }

    public 5QE A01(String str, List list, int i, boolean z) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
        1Um.A01(AQV, new N7I(this, mailboxFutureImpl2, mailboxFutureImpl, str, list, i, z), mailboxFutureImpl, mailboxFutureImpl2);
        return new 5QE(mailboxFutureImpl, mailboxFutureImpl2);
    }
}
