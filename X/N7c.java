package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: N7c.class */
public final class N7c implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 22I A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ PrivacyContext A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public N7c(22I r302, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, int i, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r302;
        this.A05 = mailboxFutureImpl;
        this.A06 = privacyContext;
        this.A00 = i;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A0A = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        PrivacyContext privacyContext = this.A06;
        N85 A00 = N85.A00(this, 26);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxCommunity", "BlockOrUnblockFromCommunity", A00);
    }
}
