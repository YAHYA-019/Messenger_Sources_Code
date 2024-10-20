package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A7K.class */
public final class A7K implements 1Vf {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;

    public A7K(Context context, ThreadKey threadKey) {
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = 7zM.A0e(context);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView")) {
            if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                throw 4YV.A0f(str);
            }
            7Kc.A00(this.A00, this.A02, 1087);
        } else {
            FbUserSession A03 = 1Br.A03(this.A01);
            7G0.A01(this.A00, new 9uP(A03, this, 1), this.A02);
        }
    }
}
