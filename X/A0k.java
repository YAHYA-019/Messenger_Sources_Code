package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A0k.class */
public final class A0k implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Object A05;
    public final Object A06;

    public A0k(Object obj, Object obj2, int i, int i2, int i3, long j, long j2) {
        this.A00 = i3;
        this.A05 = obj;
        this.A06 = obj2;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A04 = j2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        A1g A01;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A06;
        if (i2 != 0) {
            A01 = A1g.A01(this, 32);
            str = "MCAMailboxCommunityMessagingTrending";
            str2 = "FetchTrendingChannels";
            i = 1;
        } else {
            A01 = A1g.A01(this, 23);
            str = "MCAMailboxCommunity";
            str2 = "OptimisticUpdateEventRSVP";
            i = 1;
            C1qL c1qL = 22I.A00;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, false, 0, i, str, str2, A01);
    }
}
