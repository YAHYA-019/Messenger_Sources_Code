package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6w.class */
public final class N6w implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 22I A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ String A04;

    public N6w(22I r302, MailboxFutureImpl mailboxFutureImpl, String str, long j, long j2) {
        this.A02 = r302;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        N85 A00 = N85.A00(this, 21);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxCommunity", "IssueCommunityChatPollVotersFetch", A00);
    }
}
