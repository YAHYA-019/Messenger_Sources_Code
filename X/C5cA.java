package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.5cA, reason: invalid class name */
/* loaded from: 5cA.class */
public final class C5cA implements MailboxCallback {
    public final /* synthetic */ 1yI A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C5cA(1yI r302, MailboxFutureImpl mailboxFutureImpl, List list, boolean z, boolean z2) {
        this.A00 = r302;
        this.A01 = mailboxFutureImpl;
        this.A02 = list;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        30P r0 = new 30P(this, 2);
        String A00 = 7zK.A00(65);
        C1qL c1qL = 1yI.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 1, A00, "HighlightsTabFeed", r0);
    }
}
