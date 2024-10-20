package X;

import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.zero.cms.ZeroCmsUtil;
import com.mapbox.mapboxsdk.R;

/* loaded from: Dyi.class */
public final class Dyi extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("DialtoneManualSwitcherNuxRedesignComponent");
    public GCY A00;
    public boolean A01;

    public Dyi() {
        super("DialtoneManualSwitcherNuxRedesignComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A01), this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A04;
        int i;
        boolean z = this.A01;
        ZeroCmsUtil zeroCmsUtil = (ZeroCmsUtil) 1Bi.A03(49293);
        String A042 = zeroCmsUtil.A04("switch_between_modes", r302.A0D(2131958630));
        String str = null;
        if (z) {
            A04 = zeroCmsUtil.A04("fb_select_nux_description", r302.A0D(2131956967));
            if (A04.equals(r302.A0D(2131956967))) {
                i = 2131956968;
                str = r302.A0D(i);
            }
        } else {
            A04 = zeroCmsUtil.A04("zero_nux_subdescription", r302.A0D(2131956961));
            if (A04.equals(r302.A0D(2131956961))) {
                i = 2131956962;
                str = r302.A0D(i);
            }
        }
        FAa A00 = FAa.A00();
        A00.A04();
        2K4 r0 = 2K4.A03;
        A00.A09(r0);
        F6u A01 = A00.A01();
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A2K("dialtone_nux_redesign");
        C2cq A002 = C2cp.A00(r302, 0);
        C1ro c1ro = C1ro.CENTER;
        A002.A1y(c1ro);
        A002.A2Z(2132345084);
        A002.A1Y(2132279310);
        A002.A2B(C26z.BOTTOM, R.dimen.mapbox_eight_dp);
        A002.A2b(ImageView.ScaleType.FIT_START);
        A012.A2d(A002);
        C2152Dfg c2152Dfg = new C2152Dfg(r302);
        if (A042 == null) {
            ((ESq) c2152Dfg).A00 = true;
        }
        c2152Dfg.A05 = A042;
        c2152Dfg.A03 = EP4.A0F;
        c2152Dfg.A0e(true);
        C26z c26z = C26z.ALL;
        c2152Dfg.A0k(c26z, 2132279314);
        c2152Dfg.A0W(c1ro);
        c2152Dfg.A04 = A01;
        c2152Dfg.A0d("nux_title");
        CallerContext callerContext = A02;
        AbstractC2178Dg6.A07(callerContext, c2152Dfg, A012);
        C2152Dfg c2152Dfg2 = new C2152Dfg(r302);
        c2152Dfg2.A05 = A04;
        EP4 ep4 = EP4.A04;
        c2152Dfg2.A03 = ep4;
        c2152Dfg2.A0k(c26z, 2132279314);
        c2152Dfg2.A0W(c1ro);
        FAa A003 = FAa.A00();
        A003.A02();
        A003.A04();
        A003.A09(r0);
        AbstractC2178Dg6.A0G(c2152Dfg2, A003);
        c2152Dfg2.A0d("nux_description");
        AbstractC2178Dg6.A07(callerContext, c2152Dfg2, A012);
        if (str != null) {
            C2152Dfg c2152Dfg3 = new C2152Dfg(r302);
            c2152Dfg3.A05 = str;
            c2152Dfg3.A03 = ep4;
            c2152Dfg3.A0k(c26z, 2132279314);
            c2152Dfg3.A0W(c1ro);
            FAa A004 = FAa.A00();
            A004.A02();
            A004.A04();
            A004.A09(r0);
            AbstractC2178Dg6.A0G(c2152Dfg3, A004);
            AbstractC2178Dg6.A07(callerContext, c2152Dfg3, A012);
        }
        Dud A013 = Dzc.A01(r302);
        A013.A2c(A012.A00);
        A013.A2g(false);
        A013.A2e(true);
        A013.A0R();
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        A014.A2e(A013.A2V());
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r302);
        abstractC2162Dfq.A0h(r302.A0D(2131955755));
        abstractC2162Dfq.A0d("nux_continue");
        abstractC2162Dfq.A03 = ENu.A02;
        abstractC2162Dfq.A06 = 1LI.A06(r302, Dyi.class, "DialtoneManualSwitcherNuxRedesignComponent");
        abstractC2162Dfq.A0a(c26z, 2132279314);
        AbstractC2178Dg6.A07(callerContext, abstractC2162Dfq, A014);
        DKG.A1F(r302.A0D, A014);
        return A014.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        ((Dyi) r302.A00.A01).A00.finish();
        return null;
    }
}
