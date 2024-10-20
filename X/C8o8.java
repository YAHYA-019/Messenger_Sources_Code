package X;

import android.R;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMarketplaceThreadBannerFaviconType;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8o8, reason: invalid class name */
/* loaded from: 8o8.class */
public final class C8o8 extends C1rj {
    public FbUserSession A00;
    public 2JX A01;
    public 2JX A02;
    public 5zD A03;
    public 6Il A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public 6Il[] A08;
    public 6Il[] A09;

    public C8o8() {
        super("MarketplaceBannerComponent");
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r304 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(X.2JX r301, java.lang.String r302) {
        /*
            r0 = r301
            if (r0 == 0) goto L5c
            r0 = r302
            if (r0 == 0) goto L5c
            r0 = r301
            X.2JX r0 = r0.A1l()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            java.lang.Class<X.2JX> r0 = X.2JX.class
            r304 = r0
            r0 = -906014849(0xffffffffc9ff4f7f, float:-2091503.9)
            r305 = r0
            r0 = 1913970260(0x7214de54, float:2.9486438E30)
            r306 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            r3 = r306
            X.2JY r0 = X.1BK.A0B(r0, r1, r2, r3)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L36
            r0 = r307
            java.lang.String r0 = r0.A0k()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L38
        L36:
            r0 = 0
            r304 = r0
        L38:
            r0 = r301
            java.lang.String r0 = X.CQi.A04(r0)
            r308 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4c
            r0 = r304
            return r0
        L4c:
            r0 = r302
            r1 = r308
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r308
            return r0
        L5c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o8.A00(X.2JX, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0178, code lost:
    
        if (r318 == null) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.EAX, android.app.Dialog, X.DeZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.auth.usersession.FbUserSession r301, X.2JX r302, X.2JX r303, X.AbR r304, X.1Iw r305, com.facebook.mig.scheme.interfaces.MigColorScheme r306, X.6Ii r307, java.lang.String r308, X.6Il[] r309) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o8.A01(com.facebook.auth.usersession.FbUserSession, X.2JX, X.2JX, X.AbR, X.1Iw, com.facebook.mig.scheme.interfaces.MigColorScheme, X.6Ii, java.lang.String, X.6Il[]):void");
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A04, Boolean.valueOf(this.A06), this.A00, this.A01, Boolean.valueOf(this.A07), this.A02, this.A09, this.A03, this.A05};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1u3 c1u3;
        int i;
        1LI A2W;
        1LI A2W2;
        r302.A06();
        5zD r0 = this.A03;
        6Il[] r02 = this.A08;
        boolean z = this.A07;
        String str = this.A05;
        2JX r03 = this.A01;
        6Il r04 = this.A04;
        6Il[] r05 = this.A09;
        2JX r06 = this.A02;
        boolean z2 = this.A06;
        C1u2 A0R = 7zP.A0R();
        C5ye c5ye = (C5ye) 1Bn.A0A(66207);
        6Ii r07 = (6Ii) 1Bn.A0A(68165);
        2cL r318 = null;
        if (r03 != null) {
            String A0k = r03.A0k();
            String A00 = A00(r06, str);
            C1rq A01 = C1rg.A01(r302, null, 0);
            C1ro c1ro = C1ro.CENTER;
            A01.A2h(c1ro);
            A01.A2B(C26z.BOTTOM, 2132279305);
            GraphQLMarketplaceThreadBannerFaviconType A002 = CQi.A00(r06);
            String A03 = CQi.A03(r06);
            String A02 = CQi.A02(r06);
            Resources A0E = 4YU.A0E(r302);
            if (A002 == GraphQLMarketplaceThreadBannerFaviconType.BSG) {
                c1u3 = C1u3.A3A;
                i = 2132213904;
            } else {
                c1u3 = C1u3.A4G;
                i = 2132214387;
            }
            C2cm A003 = C2cl.A00(r302);
            A003.A0S();
            A003.A1M(2132279326);
            A003.A1W(2132279326);
            7zN.A18(A003, c1u3, A0R);
            A003.A0v(0.8f);
            A003.A2W();
            A003.A2X(-1);
            A003.A0D(C2cn.A02(7zL.A01(A0E, 2132279320), A0E.getColor(i)));
            2RH r08 = 2RH.A04;
            7zO.A1J(A003, r08);
            A01.A2X(7zL.A0J(A003));
            MigColorScheme Axg = r0.Axg();
            2cM A012 = 2cK.A01(r302, (String) null, 0);
            C1ro c1ro2 = C1ro.STRETCH;
            A012.A2g(c1ro2);
            A012.A0j(1.0f);
            if (A02 == null) {
                A2W = null;
            } else {
                2KD A0f = 7zR.A0f(r302, A02, false);
                A0f.A2k();
                A0f.A2b();
                A0f.A2x(Axg);
                7zU.A1V(A0f);
                A0f.A0k(1.0f);
                A2W = A0f.A2W();
            }
            A012.A2e(A2W);
            if (A03 == null) {
                A2W2 = null;
            } else {
                2KD A0f2 = 7zR.A0f(r302, A03, false);
                A0f2.A2j();
                A0f2.A2c();
                A0f2.A2x(Axg);
                7zU.A1V(A0f2);
                A0f2.A0N();
                A2W2 = A0f2.A2W();
            }
            A012.A2e(A2W2);
            A01.A2W(A012);
            if (r04 != null) {
                A01.A2T(1LI.A0C(r302, C8o8.class, "MarketplaceBannerComponent", new Object[]{r04}, -40421984));
            }
            if (z2 && r05 != null && r05.length > 0) {
                r07.A04("MESSENGER_BANNER_OVERFLOW_BUTTON", "MESSENGER_BANNER_OVERFLOW_BUTTON", A0k, A00);
                MigColorScheme Axg2 = r0.Axg();
                C2cm A004 = C2cl.A00(r302);
                A004.A0S();
                A004.A1I(R.color.transparent);
                A004.A1y(c1ro);
                A004.A2T(1LI.A0C(r302, C8o8.class, "MarketplaceBannerComponent", new Object[]{r05}, 193257300));
                A004.A1J(2131959131);
                A004.A00.A03 = A0E.getString(2131959131);
                7zN.A18(A004, C1u3.A2N, A0R);
                A004.A2X(Axg2.BEi());
                7zU.A1D(A004, r08);
                A01.A2X(7zL.A0J(A004));
            }
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            A013.A2g(c1ro2);
            A013.A2d(A01);
            A013.A1X(2132279348);
            A013.A2B(C26z.VERTICAL, 2132279298);
            if (!z) {
                8P9 r09 = new 8P9(r302, new C8o6());
                1Im A09 = 1LI.A09(r302, C8o8.class, "MarketplaceBannerComponent", 1407332025);
                C8o6 c8o6 = r09.A01;
                c8o6.A01 = A09;
                c8o6.A03 = r02;
                BitSet bitSet = r09.A02;
                bitSet.set(0);
                c8o6.A00 = r03;
                bitSet.set(1);
                c8o6.A02 = r0.Axg();
                C1rs.A00(bitSet, r09.A03);
                r09.A0J();
                A013.A2X(c8o6);
            }
            2cM A014 = 2cK.A01(r302, (String) null, 0);
            A014.A2d(A013);
            A014.A0D(C9iU.A00(c5ye, r0.Axg(), r0.BEz()));
            C6bn.A00(A014);
            C6bn.A01(A014, com.mapbox.mapboxsdk.R.dimen.mapbox_four_dp);
            r318 = A014.A00;
        }
        return r318;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Iw r310;
        6Ik r307;
        FbUserSession fbUserSession;
        String str;
        2JY r314;
        2JX r315;
        6Il[] r311;
        AbR A0C;
        6Ii r317;
        MigColorScheme Axg;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -40421984:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                r310 = r0.A00;
                r307 = (6Il) r302.A03[0];
                fbUserSession = ((C8o8) r02).A00;
                r307.CX7(fbUserSession, r310.A0D);
                return null;
            case 193257300:
                1Iv r03 = r302.A00;
                1Is r04 = r03.A01;
                r310 = r03.A00;
                r311 = (6Il[]) r302.A03[0];
                C8o8 c8o8 = (C8o8) r04;
                fbUserSession = c8o8.A00;
                5zD r05 = c8o8.A03;
                str = c8o8.A05;
                r314 = c8o8.A01;
                r315 = c8o8.A02;
                A0C = 7zN.A0C(421);
                r317 = (6Ii) 1Bn.A0A(68165);
                r317.A03("MESSENGER_BANNER_OVERFLOW_BUTTON", "MESSENGER_BANNER_OVERFLOW_BUTTON", r314 != null ? r314.A0k() : null);
                Axg = r05.Axg();
                A01(fbUserSession, r314, r315, A0C, r310, Axg, r317, str, r311);
                return null;
            case 1407332025:
                RJ5 rj5 = (RJ5) obj;
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                r310 = r06.A00;
                r307 = rj5.A00;
                String str2 = rj5.A01;
                C8o8 c8o82 = (C8o8) r07;
                fbUserSession = c8o82.A00;
                5zD r08 = c8o82.A03;
                str = c8o82.A05;
                r314 = c8o82.A01;
                r315 = c8o82.A02;
                r311 = c8o82.A09;
                A0C = 7zN.A0C(421);
                r317 = (6Ii) 1Bn.A0A(68165);
                String A0k = r314 != null ? r314.A0k() : null;
                r317.A03(r307.A03, str2, A0k);
                if (r307 instanceof 7gG) {
                    r317.A01(0S2.A0C, A0k);
                    Axg = r08.Axg();
                    A01(fbUserSession, r314, r315, A0C, r310, Axg, r317, str, r311);
                    return null;
                }
                r307.CX7(fbUserSession, r310.A0D);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
