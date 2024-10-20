package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: N74.class */
public final class N74 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public N74(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0T;
        N85 A00;
        String str;
        String str2;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 13);
                str = "MCAMailboxCallHistory";
                str2 = "RecentCalls";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
                return;
            case 1:
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A03, false, 0, 1, MailboxFeature.listenForTaskCompletion(C8ye.A00, (MailboxFutureImpl) this.A04, mailbox), null, "MCAMailboxCuckoo", "UpdateAllowedThirdPartyIntegrators", N85.A00(this, 45));
                return;
            default:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 46);
                str = "MCAMailboxCuckoo";
                str2 = "CUKClientThreadInsertOptimistic";
                i = 1;
                C1qL c1qL = C8ye.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
                return;
        }
    }
}
