package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Byo.class */
public final class Byo {
    public final Context A00;
    public final Context A01;
    public final EQq A02;
    public final FbUserSession A03;
    public final FbUserSession A04;
    public final CallerContext A05;
    public final Btl A06;
    public final BrP A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1De A0D;

    public Byo(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        Context A0A = 7zM.A0A();
        EQq eQq = EQq.A01;
        this.A00 = A0A;
        this.A03 = fbUserSession;
        this.A0D = r303;
        this.A04 = fbUserSession;
        1BY r0 = r303.A00;
        this.A0A = 1Bu.A03(r0, 82005);
        Context A0A2 = 7zM.A0A();
        this.A01 = A0A2;
        this.A02 = eQq;
        this.A0C = 1BK.A0C();
        this.A07 = (BrP) 1Lo.A04(A0A2, fbUserSession, (1BY) null, 82012);
        this.A08 = 1Bu.A03(r0, 454);
        this.A09 = 1Bu.A03(r0, 83288);
        this.A05 = CallerContext.A0B("FxFbIgStoryCrosspostingAcUpsellImpl");
        this.A06 = (Btl) 1Lo.A04(A0A2, fbUserSession, (1BY) null, 82004);
        this.A0B = AbH.A0d(A0A2);
    }
}
