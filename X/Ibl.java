package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.payments.mca.MailboxPaymentsJNI;

/* loaded from: Ibl.class */
public final class Ibl implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public Ibl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = obj5;
        this.A09 = str4;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            AccountSession accountSession = (AccountSession) obj;
            String A1D = 7zM.A1D(GsL.A00, 32);
            NotificationScope A00 = Ic4.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 10);
            7zL.A1O(A00, this.A02, A1D);
            MailboxPaymentsJNI.dispatchVOOOOOOOOOOOO(2, accountSession, this.A03, null, this.A05, this.A06, this.A04, this.A08, null, this.A07, this.A09, null, A00);
            return;
        }
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A05;
        MailboxNullable A0T = 1BL.A0T();
        Ic0 A002 = Ic0.A00(this, 11);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 1, "MCAMailboxCommunity", "CreateStandaloneCommunityWithChatTemplates", A002);
    }
}
