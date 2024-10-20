package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;

/* renamed from: X.9hk, reason: invalid class name */
/* loaded from: 9hk.class */
public final class C9hk {
    public AWh A00;
    public C1qM A01;
    public final 1De A02;
    public final 1Br A03 = 7zM.A0P();
    public final 1K9 A04 = AC8.A00(this, 2);

    public C9hk(1De r302) {
        this.A02 = r302;
    }

    public static final SettableFuture A00(FbUserSession fbUserSession, C9hk c9hk, int i, int i2, boolean z, boolean z2) {
        SettableFuture A0j = 4YU.A0j();
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0n(fbUserSession, c9hk.A02, 68673);
        A1d A00 = A1d.A00(A0j, 35);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, new N7Q(mailboxFeature, A0Q, i, i2, i + i2, 0, z2, z), A0Q, false);
        return A0j;
    }

    public final void A01(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        if (this.A01 != null) {
            1Uj r0 = (1Uj) 4YU.A0o(fbUserSession, this.A02, 16686);
            C1qM c1qM = this.A01;
            if (c1qM == null) {
                11T.A0L("trendingChannelsStoredProcedureChangedListener");
                throw 0Q8.createAndThrow();
            }
            C21S.A01(c1qM, r0);
        }
    }

    public final void A02(final FbUserSession fbUserSession, int i, final int i2, final int i3, final boolean z, final boolean z2, boolean z3) {
        int i4;
        11T.A0F(fbUserSession, 0);
        this.A01 = new C1qM() { // from class: X.9zy
            @Override // X.C1qM
            public final void CNu(Set set) {
                if (set.contains("trending_community_channels")) {
                    C9hk c9hk = this;
                    1FV A00 = C9hk.A00(fbUserSession, c9hk, i2, i3, z, z2);
                    1Br.A0D(c9hk.A03, c9hk.A04, A00);
                }
            }
        };
        1BY r0 = this.A02.A00;
        1Uj r02 = (1Uj) 1Lo.A04((Context) null, fbUserSession, r0, 16686);
        C1qM c1qM = this.A01;
        if (c1qM == null) {
            11T.A0L("trendingChannelsStoredProcedureChangedListener");
            throw 0Q8.createAndThrow();
        }
        C21S.A00(c1qM, r02);
        1Br.A0D(this.A03, this.A04, A00(fbUserSession, this, i2, i3, z, z2));
        if (z3) {
            return;
        }
        Integer num = i2 > 0 ? i3 > 0 ? 0S2.A00 : 0S2.A01 : i3 > 0 ? 0S2.A0C : 0S2.A0N;
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04((Context) null, fbUserSession, r0, 68673);
        switch (num.intValue()) {
            case 0:
                i4 = 0;
                break;
            case 1:
                i4 = 1;
                break;
            case 2:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A0k(mailboxFeature, A0P, i4, i, 1, 1Br.A07(C1ua.A00).Auy(36602076368934593L), i3), A0P, false);
    }
}
