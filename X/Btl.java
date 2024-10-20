package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Btl.class */
public final class Btl {
    public final CallerContext A00;
    public final BrP A01;
    public final 1De A02;
    public final 1Br A03;
    public final Context A04;

    public Btl(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A00 = CallerContext.A0B("FxFbUnifiedACUpsellBottomSheet");
        Context A0A = 7zM.A0A();
        this.A04 = A0A;
        this.A01 = (BrP) 1Lo.A04(A0A, fbUserSession, (1BY) null, 82012);
        this.A03 = 7zM.A0h(r303, 82005);
    }
}
