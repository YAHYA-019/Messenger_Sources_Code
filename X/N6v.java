package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;

/* loaded from: N6v.class */
public final class N6v implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public N6v(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        N85 A00;
        String str;
        String str2;
        int i;
        NotificationScope listenForTaskCompletion;
        MailboxFutureImpl mailboxFutureImpl2;
        Object obj3;
        N85 A002;
        PrivacyContext privacyContext;
        String str3;
        String str4;
        int i2;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                obj2 = false;
                A00 = N85.A00(this, 10);
                str = "MCAMailboxCallHistory";
                str2 = "DeleteCallLogForThreads";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
                return;
            case 1:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                obj2 = false;
                A00 = N85.A00(this, 11);
                str = "MCAMailboxCallHistory";
                str2 = "DeleteCallLogForArmadilloThreads";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
                return;
            case 2:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                obj2 = 1BL.A0T();
                A00 = N85.A00(this, 12);
                str = "MCAMailboxCallHistory";
                str2 = "RecentArmadilloCalls";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
                return;
            case 3:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C8ye.A00, (MailboxFutureImpl) this.A03, mailbox);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj3 = false;
                A002 = N85.A00(this, 40);
                privacyContext = null;
                str3 = "MCAMailboxCuckoo";
                str4 = "FetchIntegratorList";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            case 4:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C8ye.A00, (MailboxFutureImpl) this.A03, mailbox);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj3 = false;
                A002 = N85.A00(this, 41);
                privacyContext = null;
                str3 = "MCAMailboxCuckoo";
                str4 = "FetchInteropUsername";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            case 5:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C8ye.A00, (MailboxFutureImpl) this.A03, mailbox);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj3 = false;
                A002 = N85.A00(this, 42);
                privacyContext = null;
                str3 = "MCAMailboxCuckoo";
                str4 = "FetchIsUserConsentedToDataCombination";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            case 6:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C8ye.A00, (MailboxFutureImpl) this.A03, mailbox);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj3 = false;
                A002 = N85.A00(this, 44);
                privacyContext = null;
                str3 = "MCAMailboxCuckoo";
                str4 = "OptOutInteropForUser";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            case 7:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                obj2 = 1BL.A0T();
                A00 = N85.A00(this, 80);
                str = "MCAMailboxRooms";
                str2 = "RoomList";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
                return;
            case 8:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                obj2 = 1BL.A0T();
                A00 = N85.A00(this, 81);
                str = "MCAMailboxRooms";
                str2 = "RoomParticipantList";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
                return;
            case 9:
                String A1D = 7zM.A1D(5Xd.A00, 12);
                NotificationScope A003 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 28);
                7zL.A1O(A003, this.A02, A1D);
                MailboxSecureMessageJNI.dispatchVOOO(15, mailbox, this.A03, A003);
                return;
            case 10:
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj3 = false;
                privacyContext = (PrivacyContext) this.A03;
                A002 = N85.A00(this, 95);
                listenForTaskCompletion = null;
                str3 = "MCAMailboxSharing";
                str4 = "IssueSharingContentDiscoveryQuery";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            case 11:
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                listenForTaskCompletion = null;
                obj3 = 7zL.A0s((Object) null);
                privacyContext = (PrivacyContext) this.A03;
                A002 = N85.A00(this, 97);
                str3 = "MCAMailboxSharing";
                str4 = "ContentDiscoveryLifeEventsCount";
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
            default:
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                listenForTaskCompletion = null;
                obj3 = 7zL.A0s((Object) null);
                privacyContext = (PrivacyContext) this.A03;
                A002 = N85.A00(this, 100);
                str3 = "MCAMailboxSharing";
                str4 = "FbFriendUpdatesCount";
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj3, 0, i2, listenForTaskCompletion, privacyContext, str3, str4, A002);
                return;
        }
    }
}
