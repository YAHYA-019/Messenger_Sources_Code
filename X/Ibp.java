package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Ibp.class */
public final class Ibp implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ MailboxFutureImpl A07;
    public final /* synthetic */ GsM A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public Ibp(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, GsM gsM, Number number, String str, String str2, int i, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.A08 = gsM;
        this.A07 = mailboxFutureImpl;
        this.A06 = mailboxFutureImpl2;
        this.A00 = i;
        this.A01 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A04 = j4;
        this.A02 = j5;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = number;
        this.A0C = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A06, false, 0, 1, MailboxFeature.listenForTaskCompletion(GsM.A00, this.A07, mailbox), null, "MCAMailboxReactionV2", "OptimisticUpsertReactionV2", Ic0.A00(this, 100));
    }
}
