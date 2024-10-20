package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.UserKey;
import java.util.concurrent.Executor;

/* loaded from: C2o.class */
public final class C2o {
    public final 1Br A00;
    public final 1De A01;

    public C2o(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 67579);
    }

    public final void A00(FbUserSession fbUserSession, DF6 df6, UserKey userKey, String str) {
        AbK.A1S(fbUserSession, df6);
        1BY r0 = this.A01.A00;
        C2se c2se = (C2se) 1Lo.A04((Context) null, fbUserSession, r0, 67578);
        AnonymousClass479 anonymousClass479 = (AnonymousClass479) 1Lo.A04((Context) null, fbUserSession, r0, 82714);
        String str2 = userKey.id;
        11T.A0A(str2);
        C6j8 c6j8 = new C6j8(new C47B(new C47B(new Cjq(str2, str), new C4O1(anonymousClass479, 2)), new C4O1(anonymousClass479, 1)), (Executor) c2se.A01.get());
        String str3 = userKey.id;
        11T.A0A(str3);
        C30U c30u = new C30U(new 47C(c6j8, new Cjq(str3, str)), c2se, 0);
        AnonymousClass474 A00 = ((AnonymousClass472) 1Br.A0B(this.A00)).A00(userKey);
        A00.A01 = c30u;
        A00.A02(new Cjv(df6, 2));
    }
}
