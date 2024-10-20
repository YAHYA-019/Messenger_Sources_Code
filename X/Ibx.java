package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Ibx.class */
public final class Ibx implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    public Ibx(MailboxFutureImpl mailboxFutureImpl, 22C r303, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = r303;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        if (3 - i2 != 0) {
            this.A03 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A03 = j2;
        }
    }

    public Ibx(Object obj, Object obj2, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = obj;
        this.A05 = obj2;
        this.A01 = i;
        this.A03 = j;
        this.A02 = j2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A00;
        String str;
        String str2;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                bool = false;
                A00 = Ic0.A00(this, 31);
                str = "MCAMailboxCommunity";
                str2 = "ReportGeneratedCommunityChatTopic";
                i = 1;
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 1:
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                bool = false;
                A00 = Ic0.A00(this, 65);
                str = "MCAMailboxJewelNotification";
                str2 = "SetJewelSecurityAlertSeenTimestamp";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 2:
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A05;
                MailboxNullable A0T = 1BL.A0T();
                Ic0 A002 = Ic0.A00(this, 92);
                C1qL c1qL2 = AnonymousClass231.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, A0T, 0, 1, "MCAMailboxQP", "QuickPromotionEvent", A002);
                return;
            case 3:
                4uZ.A06("MailboxTam", "loadTamPollVotersList", this.A01);
                MailboxFutureImpl mailboxFutureImpl3 = (MailboxFutureImpl) this.A05;
                MailboxNullable A0T2 = 1BL.A0T();
                Ic0 A003 = Ic0.A00(this, ActionId.ASYNC_ACTION_FAIL);
                C1qL c1qL3 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl3, A0T2, 0, 0, "MCAMailboxTam", "TamPollVotersList", A003);
                return;
            default:
                4uZ.A06("MailboxTam", AbE.A00(709), this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                bool = false;
                A00 = new Ibz(this, 10);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadMuteUntil";
                i = 1;
                C1qL c1qL4 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
        }
    }
}
