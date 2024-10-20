package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iat.class */
public final class Iat implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C00683ob A03;

    public Iat(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, int i, long j) {
        this.A03 = c00683ob;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        Ic0 A00 = Ic0.A00(this, ActionId.VIEW_WILL_APPEAR_BEGIN);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxSearch", "UpdatePymkFriendStatus", A00);
    }
}
