package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Ibh.class */
public final class Ibh implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ GsM A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Ibh(MailboxFutureImpl mailboxFutureImpl, GsM gsM, String str, String str2, int i, long j, long j2, long j3, long j4) {
        this.A06 = gsM;
        this.A05 = mailboxFutureImpl;
        this.A00 = i;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A07 = str;
        this.A08 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        Ic0 A00 = Ic0.A00(this, ActionId.ON_VIEW_CREATED_END);
        C1qL c1qL = GsM.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxReactionV2", "OptimisticUpsertUserCentricReaction", A00);
    }
}
