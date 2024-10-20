package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Bxk.class */
public final class Bxk {
    public boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final FbUserSession A07;

    public Bxk(Context context, FbUserSession fbUserSession) {
        boolean A1Z = 7zP.A1Z(fbUserSession);
        this.A01 = context;
        this.A07 = fbUserSession;
        this.A03 = 1Lm.A00(context, fbUserSession, 84090);
        this.A04 = 1Lm.A00(context, fbUserSession, 68707);
        this.A05 = 7zM.A0R();
        this.A06 = 1Bu.A01(context, 83453);
        this.A02 = 1Bu.A01(context, 83630);
        this.A00 = A1Z;
    }
}
