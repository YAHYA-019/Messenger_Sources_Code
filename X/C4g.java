package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C4g.class */
public final class C4g {
    public 1BY A00;
    public final Context A01 = AbF.A04((1BY) null);
    public final C00i A02 = 1BV.A01((1BY) null, 68165);
    public final C00i A03 = 1BQ.A00();

    public C4g(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, FbUserSession fbUserSession, String str) {
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A06(2131959091);
        c2121Dea.A05(2131959090);
        c2121Dea.A0E(new CRB(this, fbUserSession, str, 3), 2131959089);
        c2121Dea.A0D(new CR2(str, this, 2), 2131959094);
        new Handler().postDelayed(new D7n(c2121Dea, this), 500L);
    }
}
