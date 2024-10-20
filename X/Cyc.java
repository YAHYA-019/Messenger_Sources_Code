package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.payments.mca.MailboxPaymentsJNI;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* loaded from: Cyc.class */
public final class Cyc implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public Cyc(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = str;
        this.A06 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(GsL.A00, 30);
                NotificationScope A00 = Czo.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 14);
                7zL.A1O(A00, this.A02, A1D);
                MailboxPaymentsJNI.dispatchVOOOOOOOOO(0, accountSession, this.A03, null, this.A05, this.A04, null, this.A06, null, A00);
                return;
            case 1:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A02, false, 0, 1, null, (PrivacyContext) this.A03, "MCAMailboxRanking", "IssueRankingScore", Czl.A00(this, 19));
                return;
            case 2:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                MailboxNullable A0s = 7zL.A0s((Object) null);
                PrivacyContext privacyContext = (PrivacyContext) this.A03;
                Czl A002 = Czl.A00(this, 27);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0s, 0, 0, null, privacyContext, "MCAMailboxSearch", "LoadStatusForFilteredQuery", A002);
                return;
            default:
                AccountSession accountSession2 = (AccountSession) obj;
                String A1D2 = 7zM.A1D(8yZ.A00, 6);
                NotificationScope A003 = Czo.A00(accountSession2.getSessionedNotificationCenterCallbackManager(), this, A1D2, 53);
                7zL.A1O(A003, this.A03, A1D2);
                MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOOOO(4, accountSession2, this.A02, this.A04, this.A06, this.A05, null, A003);
                return;
        }
    }
}
