package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;

/* loaded from: Hpr.class */
public final class Hpr {
    public H9F A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Set A03;
    public final 1De A04;
    public final Runnable A05;

    public Hpr(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A03 = GOn.A1J();
        this.A02 = 7zM.A0O();
        this.A01 = 7zL.A0S(fbUserSession, r303, 33088);
        this.A05 = new IrZ(this);
    }

    public final void A00(H9F h9f) {
        if (h9f != this.A00) {
            this.A00 = h9f;
            4YV.A11(this.A02).execute(this.A05);
        }
    }
}
