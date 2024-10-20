package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cy8.class */
public final class Cy8 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    public Cy8(MailboxFutureImpl mailboxFutureImpl, 22C r303, int i, int i2, int i3, long j) {
        this.A00 = i3;
        this.A04 = r303;
        switch (i3) {
            case 0:
            case 1:
            case 2:
                this.A02 = i;
                this.A05 = mailboxFutureImpl;
                this.A01 = i2;
                break;
            default:
                this.A01 = i;
                this.A05 = mailboxFutureImpl;
                this.A02 = i2;
                break;
        }
        this.A03 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        Czl A00;
        String str;
        String str2;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                4uZ.A06("MailboxTam", "runTamClientParticipantUpdateAdminStatus", this.A02);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                obj2 = false;
                A00 = Czl.A00(this, 71);
                str = "MCAMailboxTam";
                str2 = "TamClientParticipantUpdateAdminStatus";
                break;
            case 1:
                4uZ.A06("MailboxTam", "runTamClientDisappearingMessageSendBasedUpgradeInsertAdminMessage", this.A02);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                obj2 = 1BL.A0T();
                A00 = Czl.A00(this, 72);
                str = "MCAMailboxTam";
                str2 = "TamClientDisappearingMessageSendBasedUpgradeInsertAdminMessage";
                break;
            case 2:
                4uZ.A06("MailboxTam", "runTamClientThreadUpdateGroupMemberAddMode", this.A02);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                obj2 = false;
                A00 = Czl.A00(this, 74);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUpdateGroupMemberAddMode";
                break;
            default:
                4uZ.A06("MailboxTam", "runTamClientAttachmentRangeLoadMoreBefore", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                obj2 = false;
                A00 = Czl.A00(this, 78);
                str = "MCAMailboxTam";
                str2 = "TamClientAttachmentRangeLoadMoreBefore";
                break;
        }
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, 1, str, str2, A00);
    }
}
