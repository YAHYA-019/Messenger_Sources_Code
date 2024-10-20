package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Ial.class */
public final class Ial implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ C00683ob A02;

    public Ial(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, int i) {
        this.A02 = c00683ob;
        this.A01 = mailboxFutureImpl;
        this.A00 = i;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable A0T = 1BL.A0T();
        Ic0 A00 = Ic0.A00(this, ActionId.VIDEO_PLAYING);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxSearch", "SearchNullstatePymk", A00);
    }
}
