package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cy4.class */
public final class Cy4 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 22I A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ MailboxFutureImpl A05;

    public Cy4(22I r302, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, int i, int i2, long j) {
        this.A03 = r302;
        this.A05 = mailboxFutureImpl;
        this.A04 = mailboxFutureImpl2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A04, false, 0, 1, MailboxFeature.listenForTaskCompletion(22I.A00, this.A05, mailbox), null, "MCAMailboxCommunity", "AcceptOrDeclineThreadRoleInvite", Czm.A02(this, 100));
    }
}
