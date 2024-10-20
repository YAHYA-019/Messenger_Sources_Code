package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Bw1.class */
public final class Bw1 {
    public final 1Br A00;
    public final 1Br A01;
    public final 21P A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1De A05;

    public Bw1(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = fbUserSession;
        this.A01 = 7zL.A0S(fbUserSession, r303, 49792);
        this.A00 = 1BK.A0C();
        Context A00 = FbInjector.A00();
        this.A03 = A00;
        this.A02 = 21P.A00(A00);
    }
}
