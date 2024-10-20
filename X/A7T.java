package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* loaded from: A7T.class */
public final class A7T implements 1Vf {
    public final 6Fz A00;
    public final RfA A01;
    public final Context A02;
    public final FbUserSession A03;

    public A7T(Context context, FbUserSession fbUserSession, 6Fz r304) {
        11T.A0F(r304, 3);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A00 = r304;
        1Bn.A0A(147786);
        this.A01 = new RfA(context, fbUserSession);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                throw 4YV.A0f(str);
            }
            RfA rfA = this.A01;
            ((C21N) 1Br.A0B(rfA.A06)).A01(rfA.A08);
            return;
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        this.A01.A01(this.A00.BDe(), onThreadOpened.A00);
    }
}
