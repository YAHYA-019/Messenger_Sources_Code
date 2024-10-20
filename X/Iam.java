package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iam.class */
public final class Iam implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public Iam(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        Ic0 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                obj2 = false;
                A00 = Ic0.A00(this, 12);
                str = "MCAMailboxCommunity";
                str2 = "DeclineCMLevelInvite";
                i = 1;
                C1qL c1qL = 22I.A00;
                break;
            case 1:
                obj2 = false;
                A00 = Ic0.A00(this, 13);
                str = "MCAMailboxCommunity";
                str2 = "FetchAdditionalThreadData";
                i = 1;
                C1qL c1qL2 = 22I.A00;
                break;
            case 2:
                obj2 = false;
                A00 = Ic0.A00(this, 23);
                str = "MCAMailboxCommunity";
                str2 = "IssueDismissCommunityListNewBadge";
                i = 1;
                C1qL c1qL22 = 22I.A00;
                break;
            case 3:
                obj2 = false;
                A00 = Ic0.A00(this, 29);
                str = "MCAMailboxCommunity";
                str2 = "RemoveCommunityFromInbox";
                i = 1;
                C1qL c1qL222 = 22I.A00;
                break;
            case 4:
                obj2 = false;
                A00 = Ic0.A00(this, 34);
                str = "MCAMailboxCommunity";
                str2 = "UpdateHasSeenDisablingAlert";
                i = 1;
                C1qL c1qL2222 = 22I.A00;
                break;
            case 5:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, 40);
                str = "MCAMailboxCommunity";
                str2 = "GetCommunityLeaveDeleteStatus";
                C1qL c1qL3 = 22I.A00;
                i = 0;
                break;
            case 6:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, 42);
                str = "MCAMailboxCommunity";
                str2 = "GetMessengerCommunityIdForUpgradedGroupChat";
                C1qL c1qL32 = 22I.A00;
                i = 0;
                break;
            case 7:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, 45);
                str = "MCAMailboxCommunity";
                str2 = "GetUnreadThreadsForCommunity";
                C1qL c1qL322 = 22I.A00;
                i = 0;
                break;
            case 8:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, 66);
                str = "MCAMailboxJewelNotification";
                str2 = "UnreadAggregatedJewelSecurityAlerts";
                i = 0;
                break;
            case 9:
                obj2 = false;
                A00 = Ic0.A00(this, 75);
                str = "MCAMailboxMarkInboxSeen";
                str2 = "MarkFolderSeen";
                i = 1;
                break;
            default:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, 94);
                str = "MCAMailboxQP";
                str2 = "QuickPromotionsByPromotionId";
                C1qL c1qL4 = AnonymousClass231.A00;
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
    }
}
