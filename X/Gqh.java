package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqh.class */
public final class Gqh extends GS2 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final IY8 A0A;
    public final Context A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqh(FbUserSession fbUserSession, Context context) {
        super("LeaveCallScreenButtonRsysPresenter");
        1BL.A1F(fbUserSession, context);
        this.A00 = fbUserSession;
        this.A0B = context;
        this.A0A = IY8.A01(this, 6);
        this.A08 = GOn.A0U(context, fbUserSession);
        this.A05 = 1Lm.A00(context, fbUserSession, 98493);
        this.A03 = 1Bu.A01(context, 84939);
        this.A09 = 1Bu.A01(context, 115092);
        this.A02 = 1Bu.A01(context, 147806);
        this.A06 = 1Bu.A01(context, 82460);
        this.A07 = GOn.A0V(context, fbUserSession);
        this.A01 = 1Bu.A01(context, 68141);
        this.A04 = GOn.A0W(context, fbUserSession);
    }
}
