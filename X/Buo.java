package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Buo.class */
public final class Buo {
    public final FbUserSession A00;
    public final C0dp A01;
    public final 1Br A02;
    public final 1Br A03;
    public final CN8 A04;

    public Buo(Context context, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 2);
        this.A00 = fbUserSession;
        this.A03 = 1Bq.A00(16826);
        1Br A01 = 1Bu.A01(context, 84382);
        this.A02 = A01;
        1Br.A0C(A01);
        this.A04 = new CN8(context, fbUserSession);
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A01 = r0;
    }
}
