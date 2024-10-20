package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Duw.class */
public final class Duw extends 1LH {
    public final C00m A00;
    public final FbUserSession A01;

    public Duw(FbUserSession fbUserSession, C00m c00m) {
        this.A01 = fbUserSession;
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.CENTER;
        C2sn A0L = 7zR.A0L(c2k5);
        FbUserSession fbUserSession = this.A01;
        9Wr r0 = (9Wr) 1Lm.A06(fbUserSession, 68909);
        1Iw r02 = A0L.A00;
        Context A0A = 7zL.A0A(r02);
        ContextThemeWrapper A01 = ((C1os) 1Lm.A05(A0A, fbUserSession, 66301)).A00() ? 5YG.A01(A0A) : 5YG.A02(A0A);
        C2cq A00 = C2cp.A00(r02, 0);
        A00.A0T();
        A00.A10(60.0f);
        A00.A2Z(r0.A00());
        A0L.A00(A00.A2W());
        C2152Dfg c2152Dfg = new C2152Dfg(r02);
        c2152Dfg.A05 = 3yH.A09(A0L, 2131953114);
        c2152Dfg.A03 = EP4.A0G;
        c2152Dfg.A0e(true);
        C26z c26z = C26z.ALL;
        c2152Dfg.A0h(c26z, 8.0f);
        FAa A002 = FAa.A00();
        2Mg r03 = 2Me.A02;
        A002.A05(r03.A02(A01));
        AbstractC2178Dg6.A0H(c2152Dfg, A002);
        CallerContext callerContext = Ea0.A00;
        AbstractC2178Dg6.A08(callerContext, c2152Dfg, A0L);
        C2152Dfg c2152Dfg2 = new C2152Dfg(r02);
        c2152Dfg2.A05 = 3yH.A09(A0L, 2131953113);
        c2152Dfg2.A03 = EP4.A08;
        AbstractC2178Dg6.A06(c2152Dfg2).A10(70.0f);
        c2152Dfg2.A0h(c26z, 6.0f);
        FAa A003 = FAa.A00();
        A003.A05(r03.A03(A01, 2MR.A2B));
        AbstractC2178Dg6.A0H(c2152Dfg2, A003);
        AbstractC2178Dg6.A08(callerContext, c2152Dfg2, A0L);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r02);
        abstractC2162Dfq.A0h(3yH.A09(A0L, 2131953115));
        abstractC2162Dfq.A04 = ENO.A02;
        abstractC2162Dfq.A0X(c26z, 8.0f);
        abstractC2162Dfq.A0T(120.0f);
        abstractC2162Dfq.A06 = 7zO.A0U(new AeI(this, 8));
        AbstractC2178Dg6.A08(callerContext, abstractC2162Dfq, A0L);
        return new 2cL(c1ro, c1ro, c1rp, (EnumC00743oh) null, A0L.A01, false);
    }
}
