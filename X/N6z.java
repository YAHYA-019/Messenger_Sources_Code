package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: N6z.class */
public final class N6z implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ 22B A04;

    public N6z(MailboxFutureImpl mailboxFutureImpl, 22B r303, int i, int i2, long j) {
        this.A04 = r303;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxOrca", 1BJ.A00(1488), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        MailboxNullable A0T = 1BL.A0T();
        N85 A00 = N85.A00(this, 73);
        C1qL c1qL = 22B.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxOrca", "OrcaMessageTextPayload", A00);
    }
}
