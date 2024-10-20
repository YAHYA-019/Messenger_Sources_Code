package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: B7f.class */
public final class B7f extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7f(FbUserSession fbUserSession, Context context) {
        super("HaloScreenSharingPresenter");
        1BL.A1F(fbUserSession, context);
        this.A02 = context;
        this.A01 = 1Lm.A00(context, fbUserSession, 114855);
        this.A00 = 1Lm.A00(context, fbUserSession, 67965);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        boolean A06 = ((IDd) 1Br.A0B(this.A01)).A06();
        if (AbM.A1Z(this)) {
            A0Z(new C1799At8(A06));
        }
    }
}
