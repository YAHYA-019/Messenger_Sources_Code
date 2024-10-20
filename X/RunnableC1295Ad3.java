package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* renamed from: X.Ad3, reason: case insensitive filesystem */
/* loaded from: Ad3.class */
public final class RunnableC1295Ad3 implements Runnable {
    public static final String __redex_internal_original_name = "ThreadPresenceManager$reportCoPresenceForCommunityChannel$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ FbUserSession A03;

    public RunnableC1295Ad3(FbUserSession fbUserSession, int i, long j, long j2) {
        this.A03 = fbUserSession;
        this.A01 = j;
        this.A00 = i;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A06(this.A03, 84156);
        PrivacyContext A0t = AbH.A0t("FBLegacyBroker", Long.toString(2919983818288001L));
        long j = this.A01;
        int i = this.A00;
        long j2 = this.A02;
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new CyV(i, 3, j2, j, mailboxFeature, A0t, A0P), A0P, false);
    }
}
