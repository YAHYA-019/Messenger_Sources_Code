package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: Ib8.class */
public final class Ib8 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C00683ob A03;
    public final /* synthetic */ List A04;

    public Ib8(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, C00683ob c00683ob, List list, int i) {
        this.A03 = c00683ob;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A00 = i;
        this.A04 = list;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A01, false, 0, 1, MailboxFeature.listenForTaskCompletion(C00683ob.A00, this.A02, mailbox), null, "MCAMailboxSearch", "IssueRealtimeSearchNullstateQuery", Ic0.A00(this, 128));
    }
}
