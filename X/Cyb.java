package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyb.class */
public final class Cyb implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public Cyb(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A06 = str;
        this.A05 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                String A1D = 7zM.A1D(AbF.A0r("setThreadMagicWordsWithThreadIdentifier", this.A01), 32);
                NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 49);
                7zL.A1O(A00, this.A03, A1D);
                MailboxSDKJNI.dispatchVOOOOO(85, mailbox, this.A06, this.A04, this.A05, A00);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                MailboxNullable A0s = 7zL.A0s((Object) null);
                PrivacyContext privacyContext = (PrivacyContext) this.A04;
                Czl A002 = Czl.A00(this, 29);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0s, 0, 0, null, privacyContext, "MCAMailboxSearch", "MessageSearchResults", A002);
                return;
            default:
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                PrivacyContext privacyContext2 = (PrivacyContext) this.A05;
                Czl A003 = Czl.A00(this, 42);
                C1qL c1qL2 = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, false, 0, 1, null, privacyContext2, "MCAMailboxSearch", "InsertSearchFeedbackResults", A003);
                return;
        }
    }
}
