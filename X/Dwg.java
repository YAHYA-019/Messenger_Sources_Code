package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Dwg.class */
public final class Dwg extends C1rj {
    public FbUserSession A00;
    public boolean A01;

    public Dwg() {
        super("MediaSyncGrootLiveStatusPluginComponent");
    }

    public final Object[] A0k() {
        return 7zN.A1b(this.A00, this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        boolean z = this.A01;
        boolean A1X = 1BL.A1X(r302, fbUserSession);
        Context A0A = 7zL.A0A(r302);
        1Br A00 = 1Lm.A00(A0A, fbUserSession, 33089);
        1Br A002 = 1Lm.A00(A0A, fbUserSession, 99500);
        2cM A003 = 2cK.A00(r302);
        if (z && !((2Qa) A00.get()).A05() && !((I99) A002.get()).A02) {
            3yF A0L = 2KZ.A0L(r302, 0);
            A0L.A3A(A0A.getResources().getString(2131956683));
            A0L.A3D(A1X);
            A0L.A32(2132279390);
            A0L.A39(2K4.A03);
            A0L.A2z(2132213766);
            A0L.A34(2KQ.A02.A00(A0A));
            A003.A2e(A0L.A2W());
            A003.A1I(2132410682);
            A003.A1C(7.0f);
            A003.A1B(3.5f);
            A003.A24(C26z.ALL, 14.0f);
        }
        return A003.A00;
    }
}
