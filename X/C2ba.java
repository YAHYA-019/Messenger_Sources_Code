package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.2ba, reason: invalid class name */
/* loaded from: 2ba.class */
public final class C2ba extends MailboxFeature {
    public void A00(MailboxCallback mailboxCallback) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new C3b5(mailboxFutureImpl, this, 37))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A01(MailboxCallback mailboxCallback) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new 7Ot(mailboxFutureImpl, this))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A02(MailboxCallback mailboxCallback, Number number, Object obj, Object obj2, long j) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new MS4(mailboxFutureImpl, this, number, obj, obj2, j))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
