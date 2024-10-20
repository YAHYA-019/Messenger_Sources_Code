package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.2ws, reason: invalid class name */
/* loaded from: 2ws.class */
public final class C2ws implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ 1yC A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public C2ws(MailboxFutureImpl mailboxFutureImpl, 1yC r303, List list, List list2, List list3, int i, boolean z) {
        this.A02 = r303;
        this.A01 = mailboxFutureImpl;
        this.A00 = i;
        this.A03 = list;
        this.A05 = list2;
        this.A04 = list3;
        this.A06 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        30Q r0 = new 30Q(this, 2);
        C1qL c1qL = 1yC.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, "MCAMailboxStories", "OrcaFetchStories", r0);
    }
}
