package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N76.class */
public final class N76 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ 5P5 A03;
    public final /* synthetic */ boolean A04;

    public N76(MailboxFutureImpl mailboxFutureImpl, 5P5 r303, int i, long j, boolean z) {
        this.A03 = r303;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        N85 A00 = N85.A00(this, ActionId.ABORTED);
        C1qL c1qL = 5P5.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxShim", "SHIMClientThreadUpdateEphemeralSettings", A00);
    }
}
