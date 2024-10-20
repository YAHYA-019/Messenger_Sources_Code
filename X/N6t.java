package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;

/* loaded from: N6t.class */
public final class N6t implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public N6t(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                PrivacyContext privacyContext = (PrivacyContext) this.A03;
                N85 A00 = N85.A00(this, 34);
                C1qL c1qL = 22Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxContactShareSettings", "RefreshContactSharingSettings", A00);
                return;
            case 1:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(1xC.A00, 51);
                NotificationScope A002 = N89.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 1);
                7zL.A1O(A002, this.A02, A1D);
                MailboxCoreJNI.dispatchVOOO(33, accountSession, this.A03, A002);
                return;
            case 2:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, "MCAMailboxRtcCallEvents", "RtcCallEventBatchedWrite", N85.A00(this, 83));
                return;
            default:
                Mailbox mailbox = (Mailbox) obj;
                String A1D2 = 7zM.A1D(5Xd.A00, 18);
                NotificationScope A003 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D2, 26);
                7zL.A1O(A003, this.A02, A1D2);
                MailboxSecureMessageJNI.dispatchVOOO(9, mailbox, this.A03, A003);
                return;
        }
    }
}
