package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: A7R.class */
public final class A7R implements 1Vf {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02 = 1Bq.A00(66421);
    public final C01i A03 = AQk.A00(this, C03i.A02, 19);

    public A7R(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 4YV.A0f(str);
        }
        2aK.A03((Integer) null, 2Zo.A00(), new AJT(this, (0DR) null, 7), 7zN.A0y(), 2);
    }
}
