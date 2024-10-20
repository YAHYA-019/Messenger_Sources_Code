package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.4ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ui.class */
public final class C10754ui implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ 22B A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public C10754ui(MailboxFutureImpl mailboxFutureImpl, 22B r303, List list, List list2, int i, int i2) {
        this.A03 = r303;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = i2;
        this.A05 = list;
        this.A04 = list2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxOrca", "loadOrcaThreadUnreadAttachments", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        30P r0 = new 30P(this, 3);
        C1qL c1qL = 22B.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, "MCAMailboxOrca", "OrcaThreadUnreadAttachments", r0);
    }
}
