package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Buy.class */
public final class Buy {
    public final 1Br A00;
    public final Cc2 A01;
    public final C8o A02;
    public final Context A03;
    public final 1De A04;

    public Buy(Context context, FbUserSession fbUserSession, 1De r304, C8o c8o) {
        7zT.A1U(context, c8o, fbUserSession);
        this.A04 = r304;
        this.A03 = context;
        1BY r0 = r304.A00;
        1Br A03 = 1Bu.A03(r0, 792);
        this.A00 = A03;
        this.A01 = AbJ.A0J(A03).A0s(7zQ.A0I(r0), fbUserSession);
        this.A02 = c8o;
    }
}
