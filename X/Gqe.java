package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqe.class */
public final class Gqe extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final IY8 A03;
    public final Context A04;
    public final FbUserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqe(FbUserSession fbUserSession, Context context) {
        super("HaloCallAdminsPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A03 = IY8.A01(this, 10);
        this.A01 = GOn.A0U(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 17067);
        this.A00 = AbG.A0V();
    }
}
