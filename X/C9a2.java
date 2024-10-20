package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9a2, reason: invalid class name */
/* loaded from: 9a2.class */
public final class C9a2 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1De A08;

    public C9a2(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A00 = fbUserSession;
        this.A07 = 7zM.A0O();
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 67877);
        this.A01 = 1Lm.A03(fbUserSession, r0, 67403);
        this.A02 = 1Bu.A03(r0, 83430);
        this.A03 = 1Bu.A03(r0, 68433);
        this.A06 = 1Lm.A03(fbUserSession, r0, 49712);
        this.A05 = 1Lm.A03(fbUserSession, r0, 67488);
    }

    public final void A00(ThreadKey threadKey, String str, String str2, Function1 function1) {
        11T.A0F(threadKey, 0);
        MailboxFeature A0d = 7zP.A0d(this.A01);
        long A0s = threadKey.A0s();
        long parseLong = Long.parseLong(str);
        long A0H = 7zQ.A0H((User) 1Br.A0B(this.A02));
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A0m(A0d, A0P, str2, 0, A0s, parseLong, A0H), A0P, false);
        A0P.addResultCallback(new A0B(str2, function1, 3));
    }
}
