package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;

/* loaded from: Cxq.class */
public final class Cxq implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Cxq(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        Czm A02;
        String str;
        String str2;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        MailboxNullable A0T;
        MailboxFeature.DbConnectionResolutionCallback A022;
        String str3;
        String str4;
        Object obj2;
        switch (this.A00) {
            case 0:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A022 = Czm.A02(this, 15);
                str3 = "MCAMailboxBroadcastFlow";
                str4 = "CheckPendingTasksStatus";
                C1qL c1qL = BDU.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 1:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A022 = Czm.A02(this, ActionId.HEADER_DATA_LOADED);
                str3 = "MCAMailboxCutover";
                str4 = "CutoverFetchMessagePkFromOpenMessageId";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 2:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A022 = Czm.A02(this, ActionId.APP_DID_BECOME_ACTIVE);
                str3 = "MCAMailboxGroupLinks";
                str4 = "PendingInvitationQuery";
                C1qL c1qL2 = BDa.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                bool = false;
                A02 = Czm.A02(this, ActionId.BEGIN_START_ACTIVITY);
                str = "MCAMailboxMediaReceiverFetch";
                str2 = "MediaReceiverFetchTransportInsertPendingDownload";
                break;
            case 4:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                bool = false;
                A02 = Czm.A02(this, ActionId.END_START_ACTIVITY);
                str = "MCAMailboxMediaReceiverFetch";
                str2 = "MediaReceiverFetchTransportDeletePendingDownload";
                break;
            case 5:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null || AnonymousClass001.A05(obj2) <= 0) {
                    COr.A01((COr) this.A01, (BM9) this.A02, this.A03, (Throwable) null);
                    return;
                }
                return;
            case 6:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A022 = Czl.A00(this, 28);
                str3 = "MCAMailboxSearch";
                str4 = "MessageSearchQuerySectionRanking";
                C1qL c1qL3 = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 7:
                Mailbox mailbox3 = (Mailbox) obj;
                String A1D = 7zM.A1D(5Xd.A00, 14);
                NotificationScope A00 = Czo.A00(mailbox3.getSessionedNotificationCenterCallbackManager(), this, A1D, 56);
                7zL.A1O(A00, this.A02, A1D);
                MailboxSecureMessageJNI.dispatchVOOO(18, mailbox3, this.A03, A00);
                return;
            default:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A022 = Czl.A00(this, 47);
                str3 = "MCAMailboxSecureMessage";
                str4 = "SecureMessageFetchMessage";
                C1qL c1qL4 = 5Xd.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
        }
        C1qL c1qL5 = GsI.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
    }
}
