package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cy0.class */
public final class Cy0 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Cy0(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                A02 = Czm.A02(this, 28);
                str = "MCAMailboxCommunity";
                str2 = "CreateCommunityChannelCategory";
                i = 1;
                C1qL c1qL = 22I.A00;
                break;
            case 1:
                A02 = Czm.A02(this, 75);
                str = "MCAMailboxCommunity";
                str2 = "UpdateCommunityDescription";
                i = 1;
                C1qL c1qL2 = 22I.A00;
                break;
            case 2:
                A02 = Czm.A02(this, 77);
                str = "MCAMailboxCommunity";
                str2 = "UpdateCommunityName";
                i = 1;
                C1qL c1qL22 = 22I.A00;
                break;
            case 3:
                A02 = Czm.A02(this, ActionId.VIEW_DID_APPEAR_BEGIN);
                str = "MCAMailboxPublicChats";
                str2 = "ShowBroadcastChannelInPersonalInbox";
                i = 1;
                C1qL c1qL3 = BDc.A00;
                break;
            default:
                i = 1;
                A02 = Czl.A00(this, 1);
                str = "MCAMailboxPublicChats";
                str2 = "HideBroadcastChannelFromPersonalInbox";
                C1qL c1qL32 = BDc.A00;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, false, 0, i, str, str2, A02);
    }
}
