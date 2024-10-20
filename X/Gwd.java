package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.coplay.gen.CoplayApi;
import com.facebook.rsys.coplay.gen.CoplayOutputState;
import com.facebook.rsys.coplay.gen.CoplayProxy;

/* loaded from: Gwd.class */
public final class Gwd extends CoplayProxy {
    public CoplayOutputState A00;
    public CoplayApi A01;
    public final 1De A02;
    public final 1Br A03;
    public final FbUserSession A04;
    public final IY8 A05;

    public Gwd(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A04 = fbUserSession;
        1Br A0S = 7zL.A0S(fbUserSession, r303, 33088);
        this.A03 = A0S;
        IY8 A01 = IY8.A01(this, 16);
        this.A05 = A01;
        GOn.A1U(A01, GOp.A0O(A0S));
        IY8.A03(this.A03.A00, A01);
    }

    @Override // com.facebook.rsys.coplay.gen.CoplayProxy
    public void setApi(CoplayApi coplayApi) {
        11T.A0F(coplayApi, 0);
        this.A01 = coplayApi;
    }
}
