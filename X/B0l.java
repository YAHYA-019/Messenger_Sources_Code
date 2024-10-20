package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.graphql.enums.GraphQLWorkForeignEntityType;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.User;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.user.model.WorkUserInfo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: B0l.class */
public final class B0l extends C1rj {
    public View.OnClickListener A00;
    public DJ2 A01;
    public MigColorScheme A02;
    public 2K3 A03;

    public B0l() {
        super("CallInfoLobbyDetailsLayout");
    }

    public static final C1rh A00(Fcg fcg, 3Eh r302, 1Iw r303, MigColorScheme migColorScheme, String str, String str2) {
        1LI A0Z;
        11T.A0F(fcg, 5);
        Drawable A03 = fcg.A03(r303.A0D, r302);
        11T.A0A(A03);
        C1rq A01 = C1rg.A01(r303, null, 0);
        A01.A1X(2RH.A06.sizeRes);
        2RH r0 = 2RH.A04;
        A01.A1Y(r0.sizeRes);
        A01.A2h(C1ro.FLEX_START);
        C2cm A00 = C2cl.A00(r303);
        A00.A2b(A03);
        A00.A2X(migColorScheme.BKg());
        A00.A1Y(2RH.A09.sizeRes);
        A01.A2f(7zL.A0J(A00));
        2cM A012 = 2cK.A01(r303, (String) null, 0);
        2KD A013 = 2K3.A01(r303, 0);
        7zQ.A1W(A013, str);
        C26z c26z = C26z.START;
        AbF.A1R(A013, r0, c26z);
        A013.A2x(migColorScheme);
        4YU.A1K(A012, A013);
        if (str2 == null) {
            A0Z = null;
        } else {
            2KD A014 = 2K3.A01(r303, 0);
            7zQ.A1T(A014, str2);
            AbF.A1R(A014, r0, c26z);
            A0Z = 7zN.A0Z(migColorScheme, A014);
        }
        A012.A2e(A0Z);
        A01.A2e(A012);
        return A01.A00;
    }

    public static final String A01(1Iw r301, DJ2 dj2) {
        int i;
        String A0j;
        if (dj2.BQa()) {
            i = 2131958720;
        } else {
            2JX BKt = dj2.BKt();
            if (BKt != null && (A0j = BKt.A0j()) != null) {
                return 7zN.A0u(r301, A0j, 2131958740);
            }
            i = 2131958741;
        }
        return r301.A0D(i);
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2kV A0Z;
        ImmutableList AVW;
        int i;
        2JY A0B;
        1LI r0 = this.A03;
        final MigColorScheme migColorScheme = this.A02;
        DJ2 dj2 = this.A01;
        View.OnClickListener onClickListener = this.A00;
        7zS.A16(0, r302, migColorScheme, dj2);
        11T.A0F(onClickListener, 4);
        Object A0A = 1Bn.A0A(49502);
        1BV A00 = 1BV.A00(85038);
        Fcg fcg = (Fcg) 1Bi.A03(99773);
        Context A0A2 = 7zL.A0A(r302);
        2fZ r02 = (2fZ) 1Lm.A05(A0A2, IDw.A00(A0A2, "CallInfoLobbyDetailsLayoutSpec"), 17067);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0j(1.0f);
        A01.A1H(migColorScheme.Abp());
        A01.A0r(400.0f);
        C2k3 A002 = C2k2.A00(r302);
        A002.A2X(migColorScheme.Atp());
        A002.A1W(2132279312);
        A002.A1M(2132279332);
        C1ro c1ro = C1ro.CENTER;
        A002.A1y(c1ro);
        A002.A21(C26z.TOP);
        C26z c26z = C26z.BOTTOM;
        A002.A22(c26z);
        A002.A1I(2132410428);
        A01.A2e(A002.A2V());
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2g(c1ro);
        A012.A2c();
        A012.A24(c26z, 16.0f);
        A012.A2f(r0);
        A01.A2d(A012);
        C2k3 A003 = C2k2.A00(r302);
        A003.A2X(migColorScheme.Atp());
        A003.A1H(migColorScheme.Atp());
        A003.A0l(0.8f);
        A003.A0S();
        A003.A1y(C1ro.STRETCH);
        A01.A2e(A003.A2V());
        2JX AwT = dj2.AwT();
        2K3 r328 = null;
        if (AwT != null && (A0B = 1BK.A0B(AwT, 2JX.class, 2069605368, 1047077134)) != null) {
            2KD A013 = 2K3.A01(r302, 0);
            11T.A0D(AwT);
            7zQ.A1W(A013, A0B.A0r(998260012));
            A013.A1Y(2RH.A03.sizeRes);
            A013.A1X(2RH.A06.sizeRes);
            r328 = 7zN.A0Z(migColorScheme, A013);
        }
        A01.A2e(r328);
        2KD A014 = 2K3.A01(r302, 0);
        2RH r03 = 2RH.A03;
        A014.A1Y(r03.sizeRes);
        7zN.A1F(r302, A014, 2131958736);
        A014.A2f();
        A014.A2d();
        2RH r04 = 2RH.A06;
        A014.A1X(r04.sizeRes);
        A014.A2x(migColorScheme);
        4YU.A1K(A01, A014);
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        if (AwT == null) {
            A015.A2e(A00(fcg, 3Eh.A8z, r302, migColorScheme, 7zN.A0u(r302, dj2.Aev(), 2131958723), A01(r302, dj2)));
        } else {
            BjJ bjJ = (BjJ) A00.get();
            11T.A0D(AwT);
            long timeValue = AwT.getTimeValue(1786616158);
            Integer num = 0S2.A00;
            5Ou r05 = (5Ou) 1Br.A0B(bjJ.A00);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String A0J = r05.A0J(num, timeUnit.toMillis(timeValue));
            11T.A0A(A0J);
            String A0J2 = ((5Ou) 1Br.A0B(((BjJ) A00.get()).A00)).A0J(num, timeUnit.toMillis(AwT.getTimeValue(-883069737)));
            11T.A0A(A0J2);
            A015.A2e(A00(fcg, 3Eh.A5M, r302, migColorScheme, r302.A0E(2131958737, new Object[]{A0J, A0J2}), null));
            11T.A0F(fcg, 2);
            C1rq A016 = C1rg.A01(r302, null, 0);
            2KD A017 = 2K3.A01(r302, 0);
            11T.A0D(AwT);
            2JY A0B2 = 1BK.A0B(AwT, 2JX.class, -354432263, -1518217628);
            11T.A0D(A0B2);
            ImmutableList A0b = A0B2.A0b(-1431603857, 2JX.class);
            11T.A0D(A0b);
            7zQ.A1W(A017, 7zN.A0u(r302, 1BK.A0k(A0b), 2131958731));
            C26z c26z2 = C26z.START;
            2RH r06 = 2RH.A04;
            AbF.A1R(A017, r06, c26z2);
            A017.A2x(migColorScheme);
            7zN.A1T(A016, A017);
            11T.A0D(AwT);
            TreeJNI A0L = AwT.A0L(1691625349, 2JX.class, -1740261492);
            11T.A0D(A0L);
            int A018 = AbG.A01(A0L);
            if (A018 > 0) {
                2KD A019 = 2K3.A01(r302, 0);
                7zQ.A1W(A019, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A019.A2x(migColorScheme);
                7zN.A1T(A016, A019);
                2KD A0110 = 2K3.A01(r302, 0);
                A0110.A2z(4YV.A0o(A0A2.getResources(), A018, 2131820639));
                A0110.A2l();
                A0110.A2w(C1u7.A05);
                AbF.A1R(A0110, 2RH.A07, c26z2);
                A0110.A2x(migColorScheme);
                7zN.A1T(A016, A0110);
            }
            C1rq A0111 = C1rg.A01(r302, null, 0);
            A0111.A1X(r04.sizeRes);
            A0111.A1Y(r06.sizeRes);
            A0111.A2h(C1ro.FLEX_START);
            C2cm A004 = C2cl.A00(r302);
            A004.A2b(fcg.A03(A0A2, 3Eh.A8k));
            A004.A2X(migColorScheme.BKg());
            A004.A1Y(2RH.A09.sizeRes);
            A0111.A2f(7zL.A0J(A004));
            2cM A0112 = 2cK.A01(r302, (String) null, 0);
            7zL.A1I(A0112, A016);
            2KD A0113 = 2K3.A01(r302, 0);
            7zQ.A1T(A0113, A01(r302, dj2));
            AbF.A1R(A0113, r06, c26z2);
            A0113.A2x(migColorScheme);
            4YU.A1K(A0112, A0113);
            A0111.A2e(A0112);
            7zL.A1I(A015, A0111);
            2JY A0B3 = 1BK.A0B(AwT, 2JX.class, -2141605073, -135137534);
            11T.A0D(A0B3);
            2JY A0O = A0B3.A0O(2JX.class, 203954259);
            11T.A0D(A0O);
            A015.A2e(A00(fcg, 3Eh.A8z, r302, migColorScheme, 7zN.A0u(r302, A0O.A0j(), 2131958723), null));
        }
        A01.A2d(A015);
        11T.A0F(A0A, 3);
        11T.A0F(r02, 4);
        2cM A0114 = 2cK.A01(r302, (String) null, 0);
        A0114.A0j(1.0f);
        A0114.A0k(1.0f);
        A0114.A2e(C55b.A00(r302, new C55c(null, null, 2K5.A04, migColorScheme, null, r302.A0D(2131958724), null, null, null, 1, 0L, false)));
        if (dj2.AVV() <= 0 || (AVW = dj2.AVW()) == null) {
            2KD A0115 = 2K3.A01(r302, 0);
            7zQ.A1W(A0115, r302.A0D(2131958739));
            AbF.A1R(A0115, r03, C26z.START);
            A0Z = 7zN.A0Z(migColorScheme, A0115);
        } else {
            11T.A0D(AVW);
            ArrayList A0z = 1BL.A0z(AVW);
            Iterator it = AVW.iterator();
            while (it.hasNext()) {
                User A0t = AbG.A0t(it);
                11T.A0D(A0t);
                11T.A0F(A0t, 3);
                AnonymousClass557 A0p = 7zL.A0p();
                A0p.A08(A0t.A0X.displayName);
                A0p.A00 = A0t.A13.hashCode();
                A0p.A05(migColorScheme);
                A0p.A08 = r02.A0I(A0t.A0k);
                WorkUserForeignEntityInfo workUserForeignEntityInfo = A0t.A0m;
                String str = workUserForeignEntityInfo != null ? workUserForeignEntityInfo.A01 : null;
                WorkUserInfo workUserInfo = A0t.A0n;
                if (workUserInfo == null || 11T.A0O(str, "ROOMS_GUEST") || 11T.A0O(str, "LIMITED_ACCOUNT") || 11T.A0O(str, "RP4SMB_GUEST") || 11T.A0O(str, "IS_EXTERNAL") || 11T.A0O(str, "EXTERNAL_ACCOUNT")) {
                    String str2 = null;
                    if ((workUserForeignEntityInfo != null ? workUserForeignEntityInfo.A00 : null) == GraphQLWorkForeignEntityType.FOREIGN) {
                        i = 2131965248;
                    } else if (workUserInfo == null || workUserInfo.A01 == null) {
                        i = 2131965247;
                    }
                    final String A0D = r302.A0D(i);
                    if (workUserInfo != null) {
                        str2 = workUserInfo.A01;
                    }
                    final String str3 = str2;
                    A0p.A04 = new 55B(migColorScheme, A0D, str3) { // from class: X.5On
                        public final MigColorScheme A00;
                        public final String A01;
                        public final String A02;

                        {
                            this.A02 = A0D;
                            this.A01 = str3;
                            this.A00 = migColorScheme;
                        }

                        public boolean BVh(55B r3022) {
                            boolean z = false;
                            if (r3022 != null && 11T.A0O(r3022.getClass(), C5On.class)) {
                                C5On c5On = (C5On) r3022;
                                if (11T.A0O(this.A02, c5On.A02) && 11T.A0O(this.A01, c5On.A01)) {
                                    z = 4YV.A1a(this.A00, c5On.A00, false);
                                }
                            }
                            return z;
                        }
                    };
                }
                A0z.add(AbG.A0q(A0p));
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0z);
            C2ki A005 = C2kV.A00(r302);
            7zL.A1K(r302);
            5P2 r07 = new 5P2();
            if (copyOf != null) {
                AbL.A0k(r07).add(copyOf);
            }
            A005.A2d(r07);
            A005.A2j(true);
            A005.A0j(1.0f);
            A0Z = A005.A2W();
        }
        7zO.A1C(A0114, A01, A0Z);
        2cM A0116 = 2cK.A01(r302, (String) null, 0);
        8TZ A006 = C8nr.A00(r302);
        A006.A2c(true);
        A006.A2Y(2131958721);
        A006.A2Z(onClickListener);
        A006.A2a(migColorScheme);
        A0116.A2d(A006);
        A0116.A0S();
        7zO.A1M(A0116, r03, c26z);
        7zL.A1G(A0116, A01);
        2cM A0117 = 2cK.A01(r302, (String) null, 0);
        A0117.A0S();
        7zO.A1M(A0117, r03, c26z);
        2cL A0U = 7zL.A0U(A01, A0117);
        8Tm A007 = C8mf.A00(r302);
        7zP.A13(A007);
        A007.A2Z(12.0f);
        A007.A2a(migColorScheme.AZN());
        A007.A2X();
        A007.A2g(A0U);
        return A007.A2W();
    }
}
