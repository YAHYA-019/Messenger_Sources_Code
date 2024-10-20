package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqp.class */
public final class Gqp extends GS2 {
    public 1BY A00;
    public final 1EZ A01;
    public final 2JM A02;
    public final HUr A03;
    public final JLm A04;
    public final C00i A05;

    public Gqp(1BO r302) {
        super("CowatchDrawerPluginBloksPresenter");
        this.A03 = new HUr(this);
        this.A04 = GpZ.A00(this, 6);
        this.A02 = IY8.A01(this, 9);
        this.A01 = (1EZ) 1Bn.A0E((Context) null, (1BY) null, 16428);
        this.A05 = 1BV.A01((1BY) null, 67593);
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(FbUserSession fbUserSession, Gqp gqp) {
        JOS jos = (JOS) 1Lo.A04((Context) null, fbUserSession, gqp.A00, 99475);
        if (!((ICR) gqp.A05.get()).A04() || jos.AVX() == 4) {
            gqp.A0Z(new Fjr(Boolean.FALSE, null, null));
        }
    }
}
