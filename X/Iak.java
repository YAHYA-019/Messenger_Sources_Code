package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iak.class */
public final class Iak implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ C00683ob A02;

    public Iak(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, long j) {
        this.A02 = c00683ob;
        this.A01 = mailboxFutureImpl;
        this.A00 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        Ic0 A00 = Ic0.A00(this, ActionId.RTMP_CONNECTION_REQUESTED);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxSearch", "DeleteUserFromPymk", A00);
    }
}
