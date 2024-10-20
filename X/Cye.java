package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cye.class */
public final class Cye implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BDT A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public Cye(BDT bdt, MailboxFutureImpl mailboxFutureImpl, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = bdt;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = z3;
        this.A05 = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A03, 1BL.A0T(), 0, 0, "MCAMailboxCommunityMessagingSearch", "CommunityMessagingSearchRankingScores", Czm.A02(this, ActionId.RTMP_CONNECTION_FAILED));
    }
}
