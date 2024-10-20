package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6x.class */
public final class N6x implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1xC A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;

    public N6x(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, String str, long j) {
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = number;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        N85 A00 = N85.A00(this, 39);
        C1qL c1qL = 1xC.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxCore", "LoadMessagesAroundMessage", A00);
    }
}
