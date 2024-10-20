package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Cya.class */
public final class Cya implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public Cya(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, long j) {
        this.A00 = i;
        this.A05 = obj4;
        this.A06 = str;
        this.A04 = obj2;
        this.A01 = j;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        Czm A02;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, 63);
                str = "MCAMailboxCommunity";
                str2 = "SendChatLevelInviteWithOneToOneMessage";
                break;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, 64);
                str = "MCAMailboxCommunity";
                str2 = "SendCommunityLevelInviteWithOneToOneMessage";
                break;
            default:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                11T.A0F(mailboxNullable, 0);
                1qX r0 = (1qX) mailboxNullable.value;
                if (r0 == null || 1qX.A00(r0) <= 0) {
                    return;
                }
                C10264sx c10264sx = (C10264sx) this.A05;
                String str3 = this.A06;
                ThreadSummary threadSummary = (ThreadSummary) this.A04;
                long j = this.A01;
                Object obj2 = this.A02;
                FbUserSession fbUserSession = (FbUserSession) this.A03;
                if (r0.mResultSet.getInteger(0, 2) == 2) {
                    PrivacyContext A0t = AbH.A0t("AdvancedCrypto", "2971616476299527");
                    String A0y = 4YU.A0y(AbF.A0f(threadSummary));
                    MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0n(fbUserSession, c10264sx.A02, 67629);
                    Long valueOf = Long.valueOf(j);
                    1Um A0O = 1BK.A0O(mailboxFeature, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new Cyb(A0P, A0t, mailboxFeature, valueOf, str3, 2, 1), A0P, false);
                    A0P.addResultCallback(new CyE(c10264sx, obj2, threadSummary, fbUserSession, A0y, 2));
                    return;
                }
                return;
        }
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
    }
}
