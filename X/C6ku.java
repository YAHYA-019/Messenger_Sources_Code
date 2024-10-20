package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.6ku, reason: invalid class name */
/* loaded from: 6ku.class */
public final class C6ku extends MailboxFeature {
    public static C1qL A00 = new C83p(1);

    public 5QE A00(long j) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
        if (!AQV.Cj2(new N72(0, j, this, A0P2, A0P))) {
            A0P.cancel(false);
            A0P2.cancel(false);
        }
        return new 5QE(A0P, A0P2);
    }

    public 5QE A01(String str, List list) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
        if (!AQV.Cj2(new IbJ(this, A0P, list, A0P2, str, 0))) {
            A0P.cancel(false);
            A0P2.cancel(false);
        }
        return new 5QE(A0P, A0P2);
    }

    public 5QE A02(String str, List list, List list2) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new CyU(mailboxFutureImpl, list2, mailboxFutureImpl2, list, this, str, 0))) {
            mailboxFutureImpl.cancel(false);
            mailboxFutureImpl2.cancel(false);
        }
        return new 5QE(mailboxFutureImpl, mailboxFutureImpl2);
    }
}
