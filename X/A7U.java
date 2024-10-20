package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A7U.class */
public final class A7U implements 1Vf {
    public final 1Br A00;
    public final ThreadKey A01;
    public final Context A02;
    public final FbUserSession A03;

    public A7U(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = threadKey;
        this.A00 = 1Lm.A00(context, fbUserSession, 67710);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
            throw 4YV.A0f(str);
        }
        ((5jC) 1Br.A0B(this.A00)).A00(this.A01).A02.A00(C5o3.A01);
    }
}
