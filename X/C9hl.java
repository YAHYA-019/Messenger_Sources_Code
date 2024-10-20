package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.9hl, reason: invalid class name */
/* loaded from: 9hl.class */
public final class C9hl {
    public AXX A00;
    public C1qM A01;
    public final 1De A02;
    public final 1Br A03 = 7zM.A0P();
    public final 1K9 A04 = AC8.A00(this, 3);

    public C9hl(1De r302) {
        this.A02 = r302;
    }

    public static final SettableFuture A00(FbUserSession fbUserSession, C9hl c9hl, long j) {
        SettableFuture A0j = 4YU.A0j();
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0n(fbUserSession, c9hl.A02, 68673);
        A1d A00 = A1d.A00(A0j, 36);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, new A0G((int) j, 0, mailboxFeature, A0Q), A0Q, false);
        return A0j;
    }

    public final void A01(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        if (this.A01 != null) {
            1Uj r0 = (1Uj) 4YU.A0o(fbUserSession, this.A02, 16686);
            C1qM c1qM = this.A01;
            if (c1qM == null) {
                11T.A0L("trendingCommunitiesStoredProcedureChangedListener");
                throw 0Q8.createAndThrow();
            }
            C21S.A01(c1qM, r0);
        }
    }

    public final void A02(FbUserSession fbUserSession, long j, boolean z) {
        11T.A0F(fbUserSession, 0);
        this.A01 = new CxT(0, j, fbUserSession, this);
        1BY r0 = this.A02.A00;
        1Uj r02 = (1Uj) 1Lo.A04((Context) null, fbUserSession, r0, 16686);
        C1qM c1qM = this.A01;
        if (c1qM == null) {
            11T.A0L("trendingCommunitiesStoredProcedureChangedListener");
            throw 0Q8.createAndThrow();
        }
        C21S.A00(c1qM, r02);
        1FV A00 = A00(fbUserSession, this, j);
        1Br.A0D(this.A03, this.A04, A00);
        if (z) {
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04((Context) null, fbUserSession, r0, 68673);
            long Auy = 1Br.A07(C1ua.A00).Auy(36602076368934593L);
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new A1U(8, Auy, mailboxFeature, A0P), A0P, false);
        }
    }
}
