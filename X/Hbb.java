package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hbb.class */
public final class Hbb {
    public final 1Br A00;
    public final HtS A01;

    public Hbb(Context context, FbUserSession fbUserSession, JPW jpw, long j) {
        7zT.A1U(jpw, fbUserSession, context);
        HtS htS = (HtS) 1Bn.A0A(115613);
        this.A01 = htS;
        this.A00 = 1Bu.A01(context, 115685);
        htS.A01(j);
        jpw.setOneShotDrawListener(new J6o(context, fbUserSession, this));
    }
}
