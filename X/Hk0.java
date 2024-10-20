package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hk0.class */
public final class Hk0 {
    public 1X9 A00;
    public ListenableFuture A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A06;
    public final 1Br A07;
    public final Hgu A09;
    public final 1Br A05 = 1Bu.A00(115225);
    public final 1Br A04 = 7zM.A0R();
    public final 1Br A08 = 7zM.A0O();

    public Hk0(Context context, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A03 = fbUserSession;
        1Bu.A00(115452).get();
        this.A09 = new Hgu(context, fbUserSession);
        this.A07 = 1Bu.A00(115454);
        this.A06 = 1Bu.A00(115453);
    }
}
