package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqf.class */
public final class Gqf extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final JFn A05;
    public final C01i A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqf(FbUserSession fbUserSession, Context context) {
        super("CallBackgroundPresenter");
        1BL.A1F(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A04 = 1Bu.A01(context, 85079);
        this.A03 = GOn.A0T(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 85166);
        this.A06 = J9t.A01(this, 19);
        this.A05 = new GqG(this, 1);
    }
}
