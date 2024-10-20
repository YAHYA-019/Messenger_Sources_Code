package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8kz, reason: invalid class name */
/* loaded from: 8kz.class */
public final class C8kz extends C1rj {
    public 1LI A00;
    public HG7 A01;
    public MigColorScheme A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C8kz() {
        super("RtcPromotionBanner");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A04, this.A05, this.A01, this.A00, 1BK.A0d(), this.A06};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8kz c8kz = (C8kz) super.A0l();
        c8kz.A00 = 4YV.A0J(c8kz.A00);
        return c8kz;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2K3 r315;
        2K3 r3152;
        2K3 r3153;
        C2cp c2cp;
        2K3 r3154;
        MigColorScheme migColorScheme = this.A02;
        1LI r0 = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        String str4 = this.A03;
        HG7 hg7 = this.A01;
        11T.A0F(r302, 0);
        C1u2 A0G = 7zS.A0G(migColorScheme, 1);
        C1rq A01 = C1rg.A01(r302, null, 0);
        2cM A0L = 7zN.A0L(r0, r302);
        C1ro c1ro = C1ro.CENTER;
        A0L.A1y(c1ro);
        A0L.A11(24.0f);
        2RH r02 = 2RH.A04;
        7zO.A1J(A0L, r02);
        A0L.A0S();
        2cM A0K = 7zN.A0K(A0L, r302, A01);
        if (str == null || str.length() == 0) {
            r315 = null;
        } else {
            2KD A0f = 7zR.A0f(r302, str, false);
            A0f.A2y((str2 == null || str2.length() == 0) ? 2KE.A03 : 2KE.A0C);
            A0f.A2b();
            r315 = 7zN.A0Z(migColorScheme, A0f);
        }
        A0K.A2e(r315);
        C1rq A012 = C1rg.A01(r302, null, 0);
        if (str2 == null || str2.length() == 0) {
            r3152 = null;
        } else {
            2KD A0Y = 7zN.A0Y(r302, false);
            7zR.A1L(migColorScheme, A0Y, str2);
            4YU.A1N(A0Y, 2RH.A09);
            r3152 = A0Y.A2W();
        }
        A012.A2f(r3152);
        if (str4 == null || str4.length() == 0) {
            r3153 = null;
        } else {
            2KD A0f2 = 7zR.A0f(r302, str4, false);
            A0f2.A2n();
            A0f2.A2b();
            r3153 = 7zN.A0Z(migColorScheme, A0f2);
        }
        A012.A2f(r3153);
        if (hg7 != null) {
            Context A0A = 7zL.A0A(r302);
            int A00 = C0A8.A00(A0A, 18.0f);
            int A03 = A0G.A03(C1u3.A3r);
            C2cq A002 = C2cp.A00(r302, 0);
            A002.A2a(C1uu.A03.A02(4YU.A0C(A0A), A03, migColorScheme.AYz()));
            A002.A2b(ImageView.ScaleType.CENTER);
            A002.A1L(A00);
            A002.A0C(A00);
            7zN.A1C(A002, r302, C8kz.class, "RtcPromotionBanner");
            A002.A1J(2131963930);
            c2cp = A002.A2W();
        } else {
            c2cp = null;
        }
        A012.A2f(c2cp);
        A012.A2h(C1ro.FLEX_END);
        A0K.A2d(A012);
        A0K.A2Q(true);
        A0K.A1y(c1ro);
        A0K.A0R();
        2cM A0K2 = 7zN.A0K(A0K, r302, A01);
        if (str3 == null || str3.length() == 0) {
            r3154 = null;
        } else {
            2KD A0f3 = 7zR.A0f(r302, str3, false);
            A0f3.A2k();
            A0f3.A2b();
            A0f3.A2x(migColorScheme);
            7zL.A1J(A0f3);
            r3154 = A0f3.A2W();
        }
        A0K2.A2e(r3154);
        A0K2.A1y(c1ro);
        A0K2.A14(24.0f);
        7zU.A1D(A0K2, r02);
        A0K2.A2Q(true);
        A0K2.A0S();
        A01.A2e(A0K2);
        A01.A2g(c1ro);
        A01.A2h(c1ro);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        HG7 hg7 = ((C8kz) r302.A00.A01).A01;
        if (hg7 == null) {
            return null;
        }
        hg7.A00();
        return null;
    }
}
