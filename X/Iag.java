package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iag.class */
public final class Iag implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Iag(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object A0T;
        Ic0 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
        switch (i2) {
            case 0:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 10);
                str = "MCAMailboxClientNotifications";
                str2 = "RemoveClientNotifications";
                i = 1;
                break;
            case 1:
                A0T = false;
                A00 = Ic0.A00(this, 14);
                str = "MCAMailboxCommunity";
                str2 = "FetchCommunitiesActivityStatus";
                i = 1;
                C1qL c1qL = 22I.A00;
                break;
            case 2:
                A0T = false;
                A00 = Ic0.A00(this, 20);
                str = "MCAMailboxCommunity";
                str2 = "IssueCommunityBadgesMetadataFetch";
                i = 1;
                C1qL c1qL2 = 22I.A00;
                break;
            case 3:
                A0T = false;
                A00 = Ic0.A00(this, 26);
                str = "MCAMailboxCommunity";
                str2 = "MaybeBumpCommunityChatToInbox";
                i = 1;
                C1qL c1qL22 = 22I.A00;
                break;
            case 4:
                A0T = false;
                A00 = Ic0.A00(this, 37);
                str = "MCAMailboxCommunity";
                str2 = "VerifyCommunityIdentifiersSynced";
                i = 1;
                C1qL c1qL222 = 22I.A00;
                break;
            case 5:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.RTMP_CONNECTION_CONNECTED);
                str = "MCAMailboxSearch";
                str2 = "SearchNullstateSections";
                C1qL c1qL3 = C00683ob.A00;
                i = 0;
                break;
            default:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
                str = "MCAMailboxSearch";
                str2 = "UniversalSearchAttachmentGetQueryTimestamp";
                C1qL c1qL32 = C00683ob.A00;
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
    }
}
