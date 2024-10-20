package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: A7Q.class */
public final class A7Q implements 1Vf {
    public final 1Br A00 = 1Bq.A00(68450);
    public final 1Br A01;
    public final FbUserSession A02;

    public A7Q(FbUserSession fbUserSession) {
        this.A02 = fbUserSession;
        this.A01 = 1Lm.A01(fbUserSession, 67662);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        ((6qY) 1Br.A0B(this.A01)).B6A(new A98(this, 0));
    }
}
