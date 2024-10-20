package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.zero.cms.ZeroCmsUtil;
import com.facebook.zero.zerobalance.ui.AutoflexDataAvailableScreen;

/* loaded from: Dyh.class */
public final class Dyh extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("AutoflexDataAvailableScreenComponentSpec");
    public GDZ A00;

    public Dyh() {
        super("AutoflexDataAvailableScreenComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ZeroCmsUtil zeroCmsUtil = (ZeroCmsUtil) 1Bi.A03(49293);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C2cq A00 = C2cp.A00(r302, 0);
        C1ro c1ro = C1ro.CENTER;
        A00.A1y(c1ro);
        A00.A2Z(2132346937);
        A012.A2d(A00);
        C2152Dfg A04 = AbstractC2178Dg6.A04(r302, 0);
        String A042 = zeroCmsUtil.A04("autoflex_upgrade_interstitial_title", r302.A0D(2131953068));
        if (A042 == null) {
            ((ESq) A04).A00 = true;
        }
        A04.A05 = A042;
        AbstractC2178Dg6.A0H(A04, AbstractC2178Dg6.A05(A04, EP4.A0G));
        A04.A0i(C26z.TOP, 16.0f);
        CallerContext callerContext = A01;
        AbstractC2178Dg6.A07(callerContext, A04, A012);
        C2152Dfg c2152Dfg = new C2152Dfg(r302);
        String A043 = zeroCmsUtil.A04("autoflex_upgrade_interstitial_desc", r302.A0D(2131953066));
        if (A043 == null) {
            ((ESq) c2152Dfg).A00 = true;
        }
        c2152Dfg.A05 = A043;
        AbstractC2178Dg6.A0H(c2152Dfg, AbstractC2178Dg6.A05(c2152Dfg, EP4.A04));
        C26z c26z = C26z.VERTICAL;
        c2152Dfg.A0i(c26z, 10.0f);
        c2152Dfg.A0i(C26z.HORIZONTAL, 40.0f);
        AbstractC2178Dg6.A07(callerContext, c2152Dfg, A012);
        Dub A002 = DzO.A00(r302);
        A002.A1y(c1ro);
        DzO dzO = A002.A00;
        dzO.A04 = true;
        A002.A2a(1LI.A09(r302, Dyh.class, "AutoflexDataAvailableScreenComponent", 826983461));
        A002.A24(c26z, 10.0f);
        dzO.A03 = zeroCmsUtil.A04("autoflex_upgrade_interstitial_confirm", r302.A0D(2131953065));
        A002.A2Z(8196);
        A012.A2d(A002);
        A012.A2f(c1ro);
        A012.A2c();
        return A012.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 826983461) {
            return null;
        }
        GDZ gdz = ((Dyh) r302.A00.A01).A00;
        ((1vL) 1Bi.A03(99939)).A0I("switch_to_full_fb");
        AutoflexDataAvailableScreen autoflexDataAvailableScreen = (AutoflexDataAvailableScreen) gdz;
        autoflexDataAvailableScreen.finish();
        F8d.A00(autoflexDataAvailableScreen.A00);
        return null;
    }
}
