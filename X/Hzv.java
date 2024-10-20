package X;

import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hzv.class */
public final class Hzv {
    public int A00;
    public final Handler A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Object A05;
    public final Runnable A06;
    public final 1De A07;
    public final 2JM A08;

    public Hzv(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A03 = AbG.A0M();
        this.A02 = GOn.A0g(fbUserSession, r0);
        this.A01 = AnonymousClass001.A07();
        this.A05 = new Object();
        this.A06 = new IsC(this);
        IY8 A01 = IY8.A01(this, 56);
        this.A08 = A01;
        GOn.A1U(A01, GOp.A0O(this.A02));
    }

    public static final void A00(Hzv hzv) {
        hzv.A01.removeCallbacks(hzv.A06);
        4zI.A03.A05("RoomsAppDeathObserver", "Clearing rooms funnel session id", AnonymousClass001.A1Z());
        0WB.A01(hzv.A05);
        C0ft.A05(C0g6.A9G);
        1Br.A0C(hzv.A03);
    }
}
