package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.9ck, reason: invalid class name */
/* loaded from: 9ck.class */
public final class C9ck {
    public 9LY A00;
    public Bnh A01;
    public Boolean A02;
    public Long A03;
    public String A04;
    public String A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C1qM A09;
    public final 1De A0A;

    public C9ck(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        1BY r0 = r303.A00;
        this.A08 = 1Lm.A03(fbUserSession, r0, 33123);
        this.A07 = 1Bu.A03(r0, 66725);
        this.A06 = 7zM.A0d();
        this.A09 = new C9zx(this, 10);
    }

    public final SettableFuture A00(boolean z, boolean z2) {
        SettableFuture A0j = 4YU.A0j();
        MailboxFeature A0d = 7zP.A0d(this.A08);
        int i = (z2 ? 0S2.A00 : 0S2.A01).intValue() != 0 ? 2 : 1;
        Cxp cxp = new Cxp(0, this, A0j, z);
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, cxp);
        1Um.A02(A0O, new A0G(i, 7, A0d, A0Q), A0Q, false);
        return A0j;
    }

    public final void A01() {
        this.A03 = null;
        this.A05 = null;
        this.A02 = null;
        1Uj mailboxProvider = 7zP.A0d(this.A08).getMailboxProvider();
        if (mailboxProvider != null) {
            mailboxProvider.A06(new A03(this, 13));
        }
    }

    public final void A02(String str, String str2, boolean z) {
        boolean A1X = 1BL.A1X(str, str2);
        this.A04 = str2;
        MailboxFeature A0d = 7zP.A0d(this.A08);
        int i = (str.length() == 0 ? 0S2.A00 : 0S2.A01).intValue() != 0 ? 2 : 1;
        String str3 = z ? this.A05 : null;
        Integer A10 = 7zQ.A10(2TI.A00((2TI) 1Br.A0B(this.A07)), 36603042739918832L);
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0P2 = 1BK.A0P(A0O);
        1Um.A01(A0O, new Cyn(A0P2, A0P, A0d, A10, str2, str3, str, i, A1X ? 1 : 0), A0P, A0P2);
    }
}
