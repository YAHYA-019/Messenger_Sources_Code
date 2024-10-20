package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: H0r.class */
public final class H0r extends H0s {
    public Runnable A00;
    public final C00i A01;
    public final C00i A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1De A08;

    public H0r(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        1BY r0 = r303.A00;
        this.A04 = 1Bu.A03(r0, 115857);
        this.A06 = 7zM.A0P();
        this.A07 = 1Bq.A00(33054);
        this.A03 = 1Bu.A03(r0, 16452);
        this.A05 = 1BK.A0D();
        this.A00 = new Itd(this);
        Context A00 = FbInjector.A00();
        11T.A0D(A00);
        this.A01 = 1HG.A00(A00, 115836);
        ((I2G) this).A00 = 15;
        this.A02 = 1Lm.A03(fbUserSession, r0, 115861);
    }
}
