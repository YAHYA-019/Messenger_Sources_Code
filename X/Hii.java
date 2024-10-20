package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hii.class */
public final class Hii {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Hlw A05;
    public final FbUserSession A06;

    public Hii(Context context, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A06 = fbUserSession;
        this.A01 = fbUserSession;
        this.A02 = 1Bu.A01(context, 115390);
        this.A04 = 1Bu.A01(context, 115397);
        this.A03 = 1Bu.A01(context, 114891);
        this.A05 = new Hlw(this);
    }
}
