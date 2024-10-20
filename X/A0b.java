package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.livelocation.bindings.msys.MsysLiveLocationSendingRepository;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: A0b.class */
public final class A0b implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public A0b(Object obj, Object obj2, String str, int i, long j, long j2) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = j;
        this.A05 = str;
        this.A01 = j2;
        this.A04 = obj2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        A1g A01;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A01 = A1g.A01(this, 25);
                str = "MCAMailboxCommunity";
                str2 = "UpdateCommunityChannelCategoryName";
                i = 1;
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A01);
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A01 = A1g.A01(this, 54);
                str = 1BJ.A00(291);
                str2 = "InsertScreenTimeRecordAndUploadToServer";
                break;
            case 2:
                2Zs r0 = 2aN.A00;
                2aH A02 = 2aG.A02(4ZJ.A00);
                5fT r02 = (5fT) this.A03;
                long j = this.A02;
                2aK.A03((Integer) null, (0DE) null, new MsysLiveLocationSendingRepository.startSession.1.1(r02, (ITQ) this.A04, (MailboxNullable) obj, this.A05, (0DR) null, j, this.A01), A02, 3);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A01 = A1g.A01(this, ActionId.RTMP_STREAM_PREPARED);
                str = "MCAMailboxSharedAlbum";
                str2 = "IssueRenameSharedAlbum";
                break;
        }
        i = 1;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A01);
    }
}
