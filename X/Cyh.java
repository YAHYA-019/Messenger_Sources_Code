package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Cyh.class */
public final class Cyh implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public Cyh(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A06 = obj5;
        this.A07 = obj3;
        this.A05 = obj;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = obj4;
        this.A04 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        NotificationScope A0j;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        PrivacyContext privacyContext;
        Czm A02;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                A0j = AbM.A0j(22I.A00, mailbox, this.A06);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                privacyContext = (PrivacyContext) this.A05;
                A02 = Czm.A02(this, 57);
                str = "MCAMailboxCommunity";
                str2 = "RejectSinglePendingMemberRequest";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, A0j, privacyContext, str, str2, A02);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                A0j = AbM.A0j(22I.A00, mailbox, this.A06);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                privacyContext = (PrivacyContext) this.A05;
                A02 = Czm.A02(this, ActionId.ON_VIEW_CREATED_END);
                str = "MCAMailboxCommunity";
                str2 = "AcceptSinglePendingMemberRequest";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, A0j, privacyContext, str, str2, A02);
                return;
            case 2:
                5Qb r0 = (5Qb) obj;
                if (((AtomicBoolean) this.A06).compareAndSet(false, true)) {
                    int i = r0.A00;
                    if (i != 0) {
                        if (i == 1) {
                            ((DEu) this.A04).CHT(null);
                            return;
                        } else if (i != 2) {
                            return;
                        }
                    }
                    CQc cQc = (CQc) this.A07;
                    CQc.A06((FbUserSession) this.A05, (DEu) this.A04, cQc, (Executor) this.A03, this.A02, this.A01, false);
                    return;
                }
                return;
            default:
                mailbox = (Mailbox) obj;
                A0j = AbM.A0j(8yY.A00, mailbox, this.A07);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                bool = false;
                A02 = Czm.A02(this, ActionId.ASNYC_FAILED);
                privacyContext = null;
                str = 7zK.A00(196);
                str2 = "IssuePollUpdateForThread";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, A0j, privacyContext, str, str2, A02);
                return;
        }
    }
}
