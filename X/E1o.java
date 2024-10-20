package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: E1o.class */
public final class E1o extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final Runnable A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1o(FbUserSession fbUserSession, Context context) {
        super("BugNubPresenter");
        1BL.A1F(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A02 = 1Bu.A01(context, 16430);
        this.A03 = new S8N(this);
    }

    public void A0b() {
        DKE.A0K(this.A02).removeCallbacks(this.A03);
    }
}
