package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: N6y.class */
public final class N6y implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ 22B A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;

    public N6y(MailboxFutureImpl mailboxFutureImpl, 22B r303, Number number, String str, int i) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxOrca", 1BJ.A00(1487), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable A0T = 1BL.A0T();
        N85 A00 = N85.A00(this, 71);
        C1qL c1qL = 22B.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxOrca", "MessageSendErrorsForMessage", A00);
    }
}
