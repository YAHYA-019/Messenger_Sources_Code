package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.9iB, reason: invalid class name */
/* loaded from: 9iB.class */
public final class C9iB {
    public 1X9 A00;
    public final 1De A01;
    public final 1Br A02 = 7zM.A0P();

    public C9iB(1De r302) {
        this.A01 = r302;
    }

    public static final Integer A00(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == -791707519) {
            if (str.equals("weekly")) {
                return 0S2.A01;
            }
            return null;
        }
        if (hashCode == 95346201) {
            if (str.equals("daily")) {
                return 0S2.A00;
            }
            return null;
        }
        if (hashCode == 2002414854 && str.equals("one_time")) {
            return 0S2.A0C;
        }
        return null;
    }

    public final void A01(FbUserSession fbUserSession, long j) {
        11T.A0F(fbUserSession, 0);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A01, 68341);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A1U(25, j, mailboxFeature, A0P), A0P, false);
    }

    public final void A02(FbUserSession fbUserSession, long j, long j2) {
        11T.A0F(fbUserSession, 0);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A01, 68341);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A1W(8, j2, j, mailboxFeature, A0P), A0P, false);
    }

    public final void A03(FbUserSession fbUserSession, String str, long j) {
        8yO r0 = (8yO) 4YU.A0o(fbUserSession, this.A01, 68341);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0c(A0P, r0, new C8z7(AQV, r0), str, 5, j), A0P, false);
        this.A00 = A0P;
    }

    public final void A04(FbUserSession fbUserSession, List list, long j) {
        4YV.A1N(fbUserSession, list);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A01, 68341);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0O(18, j, list, mailboxFeature, A0P), A0P, false);
    }
}
