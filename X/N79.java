package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N79.class */
public final class N79 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ BDL A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;

    public N79(BDL bdl, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, int i, long j) {
        this.A02 = bdl;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A05 = number;
        this.A04 = number2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A03, false, 0, 1, AbE.A00(ActionId.RTMP_CONNECTION_RELEASE), "ThreadCentricThreadsRangesQuery", N85.A00(this, 54));
    }
}
