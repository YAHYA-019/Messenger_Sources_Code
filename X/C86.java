package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.ui.emoji.model.Emoji;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: C86.class */
public final class C86 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C86(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 66713);
        this.A03 = 1Lm.A03(fbUserSession, r0, 33123);
        this.A00 = 7zM.A0d();
        this.A02 = AbG.A0U();
    }

    public SettableFuture A00(C1773As7 c1773As7, Integer num, String str, int i) {
        SettableFuture A0j = 4YU.A0j();
        1qG r0 = (1qG) 1Br.A0B(this.A01);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("setStatus(");
        r0.A00("MsysStatusMutator", AnonymousClass002.A0K(c1773As7, A0k), new Object[0]);
        boolean z = c1773As7.A0D;
        long j = c1773As7.A00;
        if (z) {
            j -= 1Br.A00(this.A00);
        }
        2Tk r02 = (2Tk) 1Br.A0B(this.A03);
        Emoji emoji = c1773As7.A02;
        String A07 = emoji != null ? emoji.A07() : null;
        String str2 = c1773As7.A0A;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        Long A0i = 4YV.A0i();
        int i2 = c1773As7.A01.value;
        Long l = c1773As7.A04;
        String str3 = c1773As7.A09;
        String str4 = c1773As7.A07;
        Long l2 = c1773As7.A05;
        String str5 = c1773As7.A08;
        String str6 = c1773As7.A06;
        Integer num2 = c1773As7.A03;
        boolean z2 = c1773As7.A0E;
        boolean z3 = c1773As7.A0C;
        List list = c1773As7.A0B;
        if (list == null) {
            list = C0ty.A00;
        }
        PrivacyContext A00 = AbJ.A0p(this.A02).A00("681066249448173");
        Czg A002 = Czg.A00(c1773As7, this, A0j, 44);
        1Um A0O = 1BK.A0O(r02, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, A002);
        1Um.A01(A0O, new N7v(A0Q, A0P, A00, r02, false, A0i, l, l2, num2, num, A07, str2, str, str3, str4, str5, str6, list, i, i2, seconds, z2, z3), A0P, A0Q);
        return A0j;
    }

    public SettableFuture A01(String str, long j) {
        SettableFuture A0j = 4YU.A0j();
        ((1qG) 1Br.A0B(this.A01)).A00("MsysStatusMutator", 0Pz.A0Q("deleteStatus(", ')', j), new Object[0]);
        MailboxFeature A0d = 7zP.A0d(this.A03);
        PrivacyContext A00 = AbJ.A0p(this.A02).A00("681066249448173");
        CzT czT = new CzT(A0j, 5, j);
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, czT);
        1Um.A02(A0O, new A0c(A0Q, A0d, A00, str, 4, j), A0Q, false);
        return A0j;
    }
}
