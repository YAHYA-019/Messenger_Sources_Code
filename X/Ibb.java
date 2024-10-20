package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Ibb.class */
public final class Ibb implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public Ibb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, long j) {
        this.A00 = i;
        this.A06 = obj4;
        this.A04 = obj2;
        this.A01 = j;
        this.A07 = str;
        this.A05 = obj5;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 == 0) {
            MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
            PrivacyContext privacyContext = (PrivacyContext) this.A05;
            Ic0 A00 = Ic0.A00(this, 33);
            C1qL c1qL = 22I.A00;
            MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxCommunity", "SendCommunityChannelDirectInvite", A00);
            return;
        }
        if (AnonymousClass001.A1V(obj)) {
            C10264sx c10264sx = (C10264sx) this.A06;
            if (c10264sx.A00 == null) {
                long j = this.A01;
                String str = this.A07;
                PrivacyContext privacyContext2 = (PrivacyContext) this.A05;
                c10264sx.A00 = new Gs7((FbUserSession) this.A03, (JFR) this.A02, c10264sx, privacyContext2, str, j);
            }
            ((1Uj) ((C00i) this.A04).get()).A06(new Iby(c10264sx, 21));
        }
    }
}
