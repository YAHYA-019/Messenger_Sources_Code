package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.6qk, reason: invalid class name */
/* loaded from: 6qk.class */
public final class C6qk extends MailboxFeature {
    public static C1qL A00 = new C83p(2);

    public MailboxFutureImpl A00(Number number) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Cxn(0, mailboxFutureImpl, number, this))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public void A01(MailboxCallback mailboxCallback, long j, boolean z) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        if (mailboxCallback != null) {
            A0P.Cu4(mailboxCallback);
        }
        1Um.A02(AQV, new Cxi(this, A0P, j, z), A0P, false);
    }
}
