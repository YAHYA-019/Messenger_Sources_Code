package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A7W.class */
public final class A7W implements 1Vf {
    public boolean A00;
    public final 2UF A01;
    public final C9mY A02 = 7zQ.A0i();
    public final Context A03;
    public final FbUserSession A04;

    public A7W(Context context, FbUserSession fbUserSession) {
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A01 = (2UF) 1Lo.A04(context, fbUserSession, (1BY) null, 67249);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 4YV.A0f(str);
        }
        if (this.A00) {
            return;
        }
        this.A00 = true;
        2UF r0 = this.A01;
        A1d A00 = A1d.A00(this, 75);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, A1f.A00(r0, A0Q, 25), A0Q, false);
    }
}
