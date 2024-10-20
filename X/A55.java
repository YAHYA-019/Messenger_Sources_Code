package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: A55.class */
public final class A55 implements 5Q4 {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1De A04;
    public final 5oZ A05;

    public A55(FbUserSession fbUserSession, 1De r303, 5oZ r304) {
        11T.A0F(r304, 2);
        this.A04 = r303;
        this.A05 = r304;
        this.A03 = fbUserSession;
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 65962);
        this.A01 = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A02 = 7zQ.A0I(r0);
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        return c5fv instanceof C5n6;
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        C5n6 c5n6;
        String A01;
        long A00;
        Long A0e;
        11T.A0F(threadKey, 0);
        1BL.A1F(r304, c5fv);
        C5fu c5fu = (C5fu) c5fv;
        String str3 = c5fu.A0A;
        if (str3 != null) {
            this.A05.Bc6(this.A02, threadKey, str3, false);
        }
        Long l = null;
        if (!(c5fv instanceof C5n6) || (c5n6 = (C5n6) c5fv) == null) {
            return;
        }
        Uri uri = c5n6.A01;
        C00i c00i = this.A00.A00;
        String A012 = I6M.A01(uri, (22C) c00i.get());
        if (A012 == null || (A01 = I6M.A01(uri, (22C) c00i.get())) == null) {
            return;
        }
        String str4 = c5fu.A0B;
        if (str4 == null || (A0e = 0CW.A0e(str4)) == null) {
            1Br.A0C(this.A01);
            A00 = 0Mt.A00();
        } else {
            A00 = A0e.longValue();
        }
        String A002 = 4YT.A00(0CV.A0Z(11T.A02(uri), ".ogg", false) ? 260 : 259);
        22C r0 = (22C) c00i.get();
        long A0s = threadKey.A0s();
        Long B33 = r304.B33();
        if (B33 == null) {
            throw 1BK.A0h();
        }
        long longValue = B33.longValue();
        List A03 = 11T.A03(5);
        List A032 = 11T.A03(A002);
        Integer A0h = 7zN.A0h();
        List A033 = 11T.A03(A0h);
        List A034 = 11T.A03(A0h);
        List A035 = 11T.A03("");
        List A036 = 11T.A03(A0h);
        List A037 = 11T.A03(A0h);
        List A038 = 11T.A03("");
        List A039 = 11T.A03((Object) null);
        List A0r = 7zU.A0r(c5n6.A00);
        List A0310 = 11T.A03(0);
        List A0311 = 11T.A03((Object) null);
        List A0312 = 11T.A03(A01);
        List A0313 = 11T.A03(A012);
        List A0314 = 11T.A03((Object) null);
        List A0315 = 11T.A03((Object) null);
        List A0316 = 11T.A03((Object) null);
        List A0317 = 11T.A03((Object) null);
        List A0318 = 11T.A03((Object) null);
        List A0319 = 11T.A03((Object) null);
        String A013 = C5vD.A01(c5fv);
        if (A013 != null) {
            l = 1BK.A0n(A013);
        }
        r0.A09((5oV) null, A1S.A00, l, Long.valueOf(A00), (Number) null, str3, str, str2, A03, A032, A033, A034, A035, A036, A037, A038, A039, A0r, A0310, A0311, A0312, A0313, A0314, A0315, A0316, A0317, A0318, A0319, A0s, longValue, false);
    }
}
