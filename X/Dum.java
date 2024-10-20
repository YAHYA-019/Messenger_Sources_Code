package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dum.class */
public final class Dum extends 1LH {
    public final C00m A00;

    public Dum(C00m c00m) {
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        int i2;
        Configuration configuration;
        11T.A0F(c2k5, 0);
        1BQ A00 = 1BQ.A00();
        boolean A1V = AnonymousClass001.A1V(1Bi.A03(83605));
        1BV A002 = 1BV.A00(83905);
        if (A1V) {
            i = 2132344934;
            if (((2yD) A00.get()).AZk(36325647978943353L)) {
                i = 2132347272;
            }
            i2 = 2131968175;
        } else {
            i = 2132344934;
            if (((C2K) A002.get()).A00()) {
                i = 2132346772;
            }
            i2 = 2131956770;
        }
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.CENTER;
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        Context context = r0.A0D;
        Resources resources = context.getResources();
        ContextThemeWrapper A02 = (resources == null || (configuration = resources.getConfiguration()) == null || 32 != (configuration.uiMode & 48)) ? 5YG.A02(context) : 5YG.A01(context);
        C2cq A003 = C2cp.A00(r0, 0);
        A003.A0T();
        A003.A10(60.0f);
        A003.A2Z(i);
        A0L.A00(A003.A2W());
        C2152Dfg c2152Dfg = new C2152Dfg(r0);
        c2152Dfg.A05 = 3yH.A09(A0L, i2);
        c2152Dfg.A03 = EP4.A08;
        c2152Dfg.A0R(0.0f);
        c2152Dfg.A0h(C26z.ALL, 6.0f);
        AbstractC2178Dg6.A06(c2152Dfg).A10(60.0f);
        FAa A004 = FAa.A00();
        A004.A05(7zM.A02(A02, 2MR.A2B));
        AbstractC2178Dg6.A0H(c2152Dfg, A004);
        CallerContext callerContext = EaJ.A00;
        AbstractC2178Dg6.A08(callerContext, c2152Dfg, A0L);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r0);
        abstractC2162Dfq.A0h(3yH.A09(A0L, 2131956769));
        abstractC2162Dfq.A04 = ENO.A02;
        abstractC2162Dfq.A03 = ENu.A02;
        abstractC2162Dfq.A0X(C26z.TOP, 4.0f);
        abstractC2162Dfq.A06 = 7zO.A0U(new JBV(this, 27));
        AbstractC2178Dg6.A08(callerContext, abstractC2162Dfq, A0L);
        return new 2cL(c1ro, c1ro, c1rp, (EnumC00743oh) null, A0L.A01, false);
    }
}
