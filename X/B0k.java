package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: B0k.class */
public final class B0k extends C1rj {
    public FbUserSession A00;
    public MigColorScheme A01;

    public B0k() {
        super("Rooms2LiveInsightsComponent");
    }

    public static C1rq A00(Drawable drawable, 1Iw r302, MigColorScheme migColorScheme, String str, String str2) {
        2K3 r307;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0e();
        A01.A2i(C1rp.FLEX_START);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A0z(40.0f);
        A00.A0l(40.0f);
        2RH r310 = 2RH.A05;
        7zO.A1I(A00, r310);
        7zU.A1D(A00, r310);
        A00.A2a(drawable);
        A01.A2e(A00);
        C1rs A012 = 2cK.A01(r302, (String) null, 0);
        7zO.A1K(A012, 2RH.A04);
        if (str2 == null) {
            r310 = 2RH.A03;
        }
        7zO.A1I(A012, r310);
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        A0e.A2z(str);
        A0e.A2f();
        A0e.A2b();
        A012.A2d(A0e);
        if (str2 != null) {
            2KD A0n = 7zQ.A0n(r302, migColorScheme, str2, 0);
            A0n.A2d();
            A0n.A2n();
            r307 = A0n.A2W();
        } else {
            r307 = null;
        }
        A012.A2e(r307);
        A01.A2e(A012);
        return A01;
    }

    public static 8A4 A01(1Iw r301, MigColorScheme migColorScheme) {
        8A3 A00 = 8A4.A00(r301);
        A00.A11(40.0f);
        7zO.A1I(A00, 2RH.A07);
        4YU.A1L(A00, 2RH.A06);
        A00.A2X(migColorScheme);
        return A00.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A01;
        Context context = r302.A0D;
        CH4 ch4 = (CH4) 1Bn.A0E(context, (1BY) null, 85039);
        Object A0E = 1Bn.A0E(context, (1BY) null, 115683);
        I5k i5k = (I5k) 1Lo.A04(context, fbUserSession, (1BY) null, 84176);
        2cM A0i = 7zM.A0i(r302);
        7zO.A1F(A0i, 2RH.A04);
        4YU.A1L(A0i, 2RH.A05);
        A0i.A1H(migColorScheme.AjC());
        Dud A01 = Dzc.A01(r302);
        A01.A2f(true);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        2cM A0j = 7zM.A0j(r302, 0);
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        7zN.A1F(r302, A0e, 2131965122);
        A0e.A2m();
        A0e.A2b();
        A0e.A2X();
        A0e.A1B(24.0f);
        A0e.A1C(40.0f);
        7zO.A1C(A0j, A012, A0e.A2W());
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A2g(C1ro.FLEX_START);
        int i = i5k.A01;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String A1E = AbI.A1E(simpleDateFormat, i * 1000);
        Resources resources = context.getResources();
        11T.A0F(resources, 0);
        CpE cpE = new CpE(2132410418, 0);
        CpE cpE2 = new CpE(2132410420, 0);
        1Br r0 = ch4.A02;
        CpE A0a = AbM.A0a(C1u3.A1i, 7zP.A0S(r0));
        7zL.A1I(A013, A00(CPw.A03(resources, cpE, cpE2, cpE, cpE2, A0a, A0a, A0a, A0a), r302, migColorScheme, A1E, null));
        A012.A2d(A013);
        A012.A2e(A01(r302, migColorScheme));
        String A0w = 7zO.A0w("%,d", AnonymousClass001.A1a(i5k.A03));
        String A0D = r302.A0D(2131965123);
        Resources resources2 = context.getResources();
        11T.A0F(resources2, 0);
        CpE cpE3 = new CpE(2132410418, 0);
        CpE cpE4 = new CpE(2132410420, 0);
        CpE A0a2 = AbM.A0a(C1u3.A2c, 7zP.A0S(r0));
        7zL.A1I(A012, A00(CPw.A03(resources2, cpE3, cpE4, cpE3, cpE4, A0a2, A0a2, A0a2, A0a2), r302, migColorScheme, A0w, A0D));
        A012.A2e(A01(r302, migColorScheme));
        String A0w2 = 7zO.A0w("%,d", AnonymousClass001.A1a(i5k.A02));
        String A0D2 = r302.A0D(2131965120);
        Resources resources3 = context.getResources();
        11T.A0F(resources3, 0);
        CpE cpE5 = new CpE(2132410418, 0);
        CpE cpE6 = new CpE(2132410420, 0);
        CpE A0a3 = AbM.A0a(C1u3.A1m, 7zP.A0S(r0));
        7zL.A1I(A012, A00(CPw.A03(resources3, cpE5, cpE6, cpE5, cpE6, A0a3, A0a3, A0a3, A0a3), r302, migColorScheme, A0w2, A0D2));
        A012.A2e(A01(r302, migColorScheme));
        String A0w3 = 7zO.A0w("%,d", AnonymousClass001.A1a(i5k.A04));
        String A0D3 = r302.A0D(2131965121);
        Resources resources4 = context.getResources();
        11T.A0F(resources4, 0);
        CpE cpE7 = new CpE(2132410418, 0);
        CpE cpE8 = new CpE(2132410420, 0);
        CpE A0a4 = AbM.A0a(C1u3.A42, 7zP.A0S(r0));
        7zL.A1I(A012, A00(CPw.A03(resources4, cpE7, cpE8, cpE7, cpE8, A0a4, A0a4, A0a4, A0a4), r302, migColorScheme, A0w3, A0D3));
        A01.A2b(A012);
        A0i.A2d(A01);
        8Ti A014 = 8oM.A01(r302);
        A014.A2X(2131965119);
        A014.A2Y(Cx1.A01(A0E, 32));
        A014.A2Z(migColorScheme);
        A014.A19(24.0f);
        return 7zL.A0V(A0i, A014.A2W());
    }
}
