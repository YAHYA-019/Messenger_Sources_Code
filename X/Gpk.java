package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import java.util.Iterator;

/* loaded from: Gpk.class */
public final class Gpk extends HbN {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final Gpy A03;

    public Gpk(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 33088);
        1Br A0f = GOn.A0f(fbUserSession, r0);
        this.A01 = A0f;
        Gpy gpy = new Gpy(this, 5);
        this.A03 = gpy;
        GOn.A1V(AbJ.A0X(A0f), gpy);
        A00(this);
    }

    public static final void A00(Gpk gpk) {
        C00i c00i = gpk.A00.A00;
        2JS A0o = GOq.A0o(c00i);
        11T.A0F(A0o, 0);
        CallModel A0j = GOq.A0j(A0o);
        boolean z = true;
        if ((!AbJ.A0X(gpk.A01).A0Q() && (A0j == null || A0j.inCallState != 6)) || IFr.A0C(A0j)) {
            z = false;
        }
        if (((HbN) gpk).A00 != z) {
            ((HbN) gpk).A00 = z;
            Iterator it = ((HbN) gpk).A01.iterator();
            while (it.hasNext()) {
                ((JFY) it.next()).C4r();
            }
        }
        GOo.A0R(c00i).A04(HAp.A0C);
    }
}
