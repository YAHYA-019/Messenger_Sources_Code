package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: A7I.class */
public final class A7I implements 1Vf {
    public final Context A00;
    public final 1Br A01;

    public A7I(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = 1Lm.A01(fbUserSession, 67609);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 4YV.A0f(str);
        }
        C83j c83j = (C83j) 1Br.A0B(this.A01);
        Context context = this.A00;
        c83j.A02.clear();
        if (7zQ.A0p().A00.AZk(72340842837446899L)) {
            C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "MessengerNotesEasterEggQuery", (String) null, "fbandroid", 14455326, 0, 2529806684L, 2529806684L, false, true));
            A0L.A0A(86400L);
            A0L.A09(86400L);
            1FV A0n = 7zR.A0n(context, A0L);
            1Br.A0D(c83j.A00, AC8.A00(c83j, 51), A0n);
        }
    }
}
