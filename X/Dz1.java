package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dz1.class */
public final class Dz1 extends C1rj {
    public static final CallerContext A06 = CallerContext.A0B("MarketplaceBannerMarkAsPaidInterstitialBottomSheetComponentSpec");
    public View.OnClickListener A00;
    public FbUserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public Dz1() {
        super("MarketplaceBannerMarkAsPaidInterstitialBottomSheetComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A01, this.A03, this.A04, this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A02;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C2152Dfg A04 = AbstractC2178Dg6.A04(r302, 0);
        String A0u = 4YU.A0u(4YU.A0E(r302), str, 2131959115);
        if (A0u == null) {
            ((ESq) A04).A00 = true;
        }
        A04.A05 = A0u;
        FAa A05 = AbstractC2178Dg6.A05(A04, EP4.A06);
        A05.A02();
        AbstractC2178Dg6.A0H(A04, A05);
        C26z c26z = C26z.ALL;
        2RH r0 = 2RH.A03;
        A04.A0h(c26z, 4YU.A00(r0));
        CallerContext callerContext = A06;
        AbstractC2178Dg6.A07(callerContext, A04, A01);
        C2149Dfd c2149Dfd = new C2149Dfd(r302);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r302);
        AbstractC2178Dg6.A0A(abstractC2162Dfq, r302, Dz1.class, "MarketplaceBannerMarkAsPaidInterstitialBottomSheetComponent", -2045263308);
        abstractC2162Dfq.A0f(2131959114);
        abstractC2162Dfq.A03 = ENu.A02;
        c2149Dfd.A01 = abstractC2162Dfq;
        AbstractC2162Dfq abstractC2162Dfq2 = new AbstractC2162Dfq(r302);
        AbstractC2178Dg6.A0A(abstractC2162Dfq2, r302, Dz1.class, "MarketplaceBannerMarkAsPaidInterstitialBottomSheetComponent", -1676405796);
        abstractC2162Dfq2.A0f(2131959113);
        abstractC2162Dfq2.A03 = ENu.A06;
        c2149Dfd.A02 = abstractC2162Dfq2;
        c2149Dfd.A0X(C26z.HORIZONTAL, 4YU.A00(r0));
        c2149Dfd.A0X(C26z.TOP, 4YU.A00(r0));
        c2149Dfd.A0X(C26z.BOTTOM, 4YU.A00(2RH.A06));
        AbstractC2178Dg6.A07(callerContext, c2149Dfd, A01);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2045263308) {
            if (i != -1676405796) {
                4YV.A1G(r302, obj, i);
                return null;
            }
            Dz1 dz1 = (Dz1) r302.A00.A01;
            View.OnClickListener onClickListener = dz1.A00;
            String str = dz1.A05;
            6Ii r0 = (6Ii) 1Bn.A0A(68165);
            onClickListener.onClick(null);
            r0.A01(0S2.A05, str);
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        Dz1 dz12 = (Dz1) r03;
        Dzx dzx = (Dzx) 4YU.A0P(r04);
        FbUserSession fbUserSession = dz12.A01;
        View.OnClickListener onClickListener2 = dz12.A00;
        String str2 = dz12.A03;
        String str3 = dz12.A04;
        String str4 = dz12.A05;
        6JH r05 = dzx.A00;
        6Ii r06 = (6Ii) 1Bn.A0A(68165);
        onClickListener2.onClick(null);
        r05.A00(r04.A0D, fbUserSession, 1BK.A0d(), str2, str3, str4);
        r06.A01(0S2.A06, str4);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        Dzx dzx = (Dzx) r303;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 50057);
        if (A0E != null) {
            dzx.A00 = (6JH) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
