package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* renamed from: X.231, reason: invalid class name */
/* loaded from: 231.class */
public final class AnonymousClass231 extends MailboxFeature {
    public static C1qL A00 = new 38C(10);

    public MailboxFutureImpl A00(MailboxCallback mailboxCallback, PrivacyContext privacyContext, long j) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0S = 1BL.A0S(AQV, mailboxCallback);
        1Um.A02(AQV, new A0J(10, j, this, privacyContext, A0S), A0S, false);
        return A0S;
    }

    public void A01(MailboxCallback mailboxCallback, int i, int i2) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Cu4(mailboxCallback);
        }
        if (AQV.Cj2(new C3av(this, i, mailboxFutureImpl, i2, 2))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A02(MailboxCallback mailboxCallback, String str) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0S = 1BL.A0S(AQV, mailboxCallback);
        1Um.A02(AQV, new C3ar(A0S, this, str, 2), A0S, false);
    }
}
