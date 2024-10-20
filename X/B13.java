package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: B13.class */
public final class B13 extends C1rj {
    public FbUserSession A00;
    public HrJ A01;
    public BLV A02;
    public BLV A03;
    public BLG A04;
    public MigColorScheme A05;
    public I3s A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public B13() {
        super("SettingsAndSecurityLayout");
    }

    public static final 2cL A00(1Iw r301, 1LI... r302) {
        2cM A00 = 2cK.A00(r301);
        List A08 = 02L.A08(r302);
        if (!1BK.A1Y(A08)) {
            return null;
        }
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            A00.A2e((1LI) it.next());
        }
        return A00.A00;
    }

    public static final 55M A01(1Iw r301, C00m c00m, boolean z) {
        if (!z) {
            return null;
        }
        return 7zM.A10((AnonymousClass544) c00m.invoke(), 55M.A00(r301));
    }

    public static void A0L(MigColorScheme migColorScheme, 2RH r302, 2KD r303, int i) {
        r303.A2r(i);
        r303.A2k();
        r303.A2d();
        r303.A2x(migColorScheme);
        r303.A1D(r302.A00());
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A05, this.A06, Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), this.A01, this.A07, this.A02, this.A04, this.A03, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rs A00;
        8OH A01;
        C1rs A002;
        FbUserSession fbUserSession = this.A00;
        BLV blv = this.A03;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        boolean z3 = this.A0A;
        BLG blg = this.A04;
        boolean z4 = this.A09;
        boolean z5 = this.A0B;
        I3s i3s = this.A06;
        List<8Lq> list = this.A08;
        MigColorScheme migColorScheme = this.A05;
        HrJ hrJ = this.A01;
        11T.A0H(r302, fbUserSession);
        7zR.A1R(list, migColorScheme);
        11T.A0F(hrJ, 14);
        if (blv == BLV.A06 && i3s != null) {
            AwD awD = new AwD(r302, new C1982Ayb());
            C1982Ayb c1982Ayb = awD.A01;
            c1982Ayb.A00 = migColorScheme;
            BitSet bitSet = awD.A02;
            bitSet.set(0);
            c1982Ayb.A01 = i3s;
            bitSet.set(1);
            awD.A2L("VIEW_CRYPTO_KEYS");
            C1rs.A00(bitSet, awD.A03);
            awD.A0J();
            return c1982Ayb;
        }
        if (blv == BLV.A04) {
            return new AxH(fbUserSession, (2lO) null, migColorScheme);
        }
        if (blv == BLV.A02) {
            A00 = 2cK.A00(r302);
            A00.A2L("CALL_ADMINS");
            A00.A0R();
            A00.A0m(100.0f);
            AwR A003 = B12.A00(r302);
            A003.A2X(4YU.A0E(r302).getString(2131964685));
            4YU.A1M(A003, 2RH.A03);
            A003.A2Y(true);
            A00.A2d(A003);
            A01 = C8m6.A00(r302);
            A01.A0R();
            A01.A10(100.0f);
            ArrayList A0z = 1BL.A0z(list);
            for (8Lq r0 : list) {
                AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                A0V.A00 = Long.parseLong(r0.A04);
                A0V.A08(r0.A02);
                A0V.A08 = (C2fr) r0.A01;
                A0z.add(A0V.A00());
            }
            A01.A2W(ImmutableList.copyOf((Collection) A0z));
        } else {
            if (blv == BLV.A05) {
                A00 = 2cK.A00(r302);
                A00.A2L("SCREEN_SHARING");
                AwR A004 = B12.A00(r302);
                A004.A2X(4YU.A0E(r302).getString(2131964714));
                4YU.A1M(A004, 2RH.A03);
                A004.A2Y(true);
                A00.A2d(A004);
                CJ4 cj4 = new CJ4();
                cj4.A04 = new C58r(migColorScheme, z2, true);
                cj4.A04(r302.A0D(2131964690));
                cj4.A07 = migColorScheme;
                cj4.A01 = new CvI(4, hrJ, z2);
                AnonymousClass544 A012 = cj4.A01();
                CJ4 cj42 = new CJ4();
                cj42.A04 = new C58r(migColorScheme, !z2, true);
                cj42.A04(r302.A0D(2131964691));
                cj42.A07 = migColorScheme;
                cj42.A01 = new CvI(5, hrJ, z2);
                AnonymousClass544[] anonymousClass544Arr = {A012, cj42.A01()};
                2cM A005 = 2cK.A00(r302);
                for (AnonymousClass544 anonymousClass544 : 02L.A08(anonymousClass544Arr)) {
                    55N A006 = 55M.A00(r302);
                    A006.A2X(anonymousClass544);
                    A005.A2d(A006);
                }
                7zL.A1G(A005, A00);
                return ((2cM) A00).A00;
            }
            if (z5) {
                A00 = 2cK.A00(r302);
                A00.A2L("NONE");
                AwR A007 = B12.A00(r302);
                A007.A2X(4YU.A0E(r302).getString(2131965278));
                2RH r02 = 2RH.A03;
                4YU.A1M(A007, r02);
                A00.A2d(A007);
                A01 = Dzc.A01(r302);
                A002 = 2cK.A00(r302);
                4YU.A1N(A002, 2RH.A04);
                2KD A0Y = 7zN.A0Y(r302, false);
                A0L(migColorScheme, r02, A0Y, 2131964693);
                A0Y.A2M(true);
                A002.A2d(A0Y);
                A002.A2e(A00(r302, A01(r302, new AQj(25, hrJ, migColorScheme, r302, list), true)));
                A002.A2e(A00(r302, A01(r302, new AKm(0, migColorScheme, r302, hrJ, z2), true)));
                2KD A0Y2 = 7zN.A0Y(r302, false);
                A0L(migColorScheme, r02, A0Y2, 2131964692);
                A0Y2.A2M(true);
                A002.A2d(A0Y2);
                A002.A2e(A00(r302, A01(r302, new AQj(26, blg, hrJ, r302, migColorScheme), blg != null)));
            } else {
                A00 = 2cK.A00(r302);
                A00.A2L("NONE");
                AwR A008 = B12.A00(r302);
                A008.A2X(4YU.A0E(r302).getString(2131965278));
                4YU.A1M(A008, 2RH.A03);
                A00.A2d(A008);
                A01 = Dzc.A01(r302);
                A002 = 2cK.A00(r302);
                2cM A009 = 2cK.A00(r302);
                2RH r03 = 2RH.A04;
                4YU.A1N(A009, r03);
                2KD A013 = 2K3.A01(r302, 0);
                A013.A32(false);
                A0L(migColorScheme, r03, A013, 2131953736);
                A013.A2M(true);
                A009.A2d(A013);
                A009.A2e(A01(r302, new AKm(1, migColorScheme, r302, hrJ, z2), z));
                A009.A2e(A01(r302, new AQj(27, blg, hrJ, r302, migColorScheme), blg != null));
                A009.A2e(A01(r302, new AQh(25, hrJ, r302, migColorScheme), z4));
                A009.A2e(A01(r302, new AQh(26, hrJ, r302, migColorScheme), z3));
                A002.A2d(A009);
            }
            A01.A2b(A002);
        }
        A00.A2d(A01);
        return ((2cM) A00).A00;
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        BLV blv = this.A03;
        BLV blv2 = this.A02;
        1BL.A1F(blv, blv2);
        BLV blv3 = BLV.A03;
        boolean z = false;
        if (blv2 == blv3) {
            z = true;
            if (blv == blv3) {
                return null;
            }
        }
        String name = blv.name();
        5Rn r0 = C3s9.A04;
        5X3 A00 = C3s9.A00(r0, name);
        C2jo c2jo = C2jm.A08;
        A00.A03(c2jo);
        5Rm r02 = C3s9.A02;
        ((5X4) A00).A02 = r02;
        float f = 100.0f;
        float f2 = -100.0f;
        if (z) {
            f2 = 100.0f;
        }
        Integer num = 0S2.A0C;
        A00.A04(new C5X1(num, f2));
        5X3 A002 = C3s9.A00(r0, blv2.name());
        A002.A03(c2jo);
        ((5X4) A002).A02 = r02;
        if (z) {
            f = -100.0f;
        }
        A002.A05(new C5X1(num, f));
        return new 5XA(new 5X3[]{A00, A002});
    }
}
