package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.List;

/* loaded from: B19.class */
public final class B19 extends C1rj {
    public int A00;
    public FbUserSession A01;
    public DIj A02;
    public BKr A03;
    public CHq A04;
    public MigColorScheme A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public static final BKr A0F = BKr.A03;
    public static final int A0D = 2RH.A06.A00();
    public static final int A0A = 7zL.A03();
    public static final int A0B = 7zL.A02();
    public static final int A0C = 7zM.A01();
    public static final int A0E = 2RH.A07.A00();

    public B19() {
        super("AccountSSORootComponent");
        this.A03 = A0F;
    }

    public static C1rj A00(1Iw r301, MigColorScheme migColorScheme, float f, float f2, float f3, int i, boolean z) {
        if (i <= 0) {
            return AbK.A0N(r301).A00;
        }
        2KE r0 = 2KE.A09;
        Context context = r301.A0D;
        String A00 = 6Pt.A00(context, i);
        Resources resources = context.getResources();
        String quantityString = z ? resources.getQuantityString(2131820548, i) : 4YV.A0o(resources, i, 2131820547);
        C1rq A01 = C1rg.A01(r301, null, 0);
        3yF A0v = 7zM.A0v(r301, A00, 0);
        A0v.A2R(new Object[]{A00}, 2131952190);
        A0v.A0F("android.view.View");
        A0v.A32(2KK.A03(r0).textSizeResId);
        A0v.A2z(2132213766);
        A0v.A0l(22.0f);
        A0v.A0s(22.0f);
        float f4 = 0.0f;
        if (i > 9) {
            f4 = 6.0f;
        }
        A0v.A1C(f4);
        A0v.A1I(2132411315);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        A0v.A35(alignment);
        A0v.A39(2K4.A03);
        A0v.A0S();
        A01.A2f(A0v.A2W());
        2KD A0i = AbK.A0i(r301, migColorScheme);
        A0i.A2z(quantityString);
        A0i.A2y(r0);
        A0i.A2c();
        A0i.A2s(alignment);
        A0i.A11(f3);
        A0i.A0S();
        7zN.A1T(A01, A0i);
        A01.A0R();
        A01.A17(f);
        A01.A18(f2);
        A01.A2c();
        return A01.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C8mn A01(com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo r301, X.1Iw r302, X.1Im r303, X.Bxp r304, com.facebook.mig.scheme.interfaces.MigColorScheme r305, float r306) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B19.A01(com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo, X.1Iw, X.1Im, X.Bxp, com.facebook.mig.scheme.interfaces.MigColorScheme, float):X.8mn");
    }

    public static B0n A0L(1Iw r301, Bxp bxp, float f, float f2, boolean z) {
        String str;
        BLZ blz = bxp.A02 == BKr.A01 ? BLZ.A02 : BLZ.A07;
        C1913Awe A00 = B0n.A00(r301);
        A00.A2X(blz);
        A00.A2K("continue_as_button");
        B0n b0n = A00.A01;
        b0n.A00 = 2131952240;
        b0n.A04 = (!z || (str = bxp.A04) == null) ? bxp.A04 : str.split(" ")[0];
        7zN.A1D(A00, r301, B19.class, "AccountSSORootComponent", 1371937264);
        A00.A17(f);
        A00.A18(f2);
        A00.A0J();
        return A00.A01;
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A06, this.A05, this.A01, this.A02, this.A04, Boolean.valueOf(this.A09), this.A03, Integer.valueOf(this.A00), this.A07};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        2cL A2W;
        2cM A01;
        B0n b0n;
        Dzc dzc;
        2cL A2W2;
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A05;
        BKr bKr = this.A03;
        String str = this.A06;
        List list = this.A08;
        String str2 = this.A07;
        int i3 = this.A00;
        boolean z = this.A09;
        1yM r0 = (1yM) 1Bi.A03(16885);
        int size = View.MeasureSpec.getSize(i2);
        Context context = r302.A0D;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mapbox_locationComponentTrackingMultiFingerMoveThreshold);
        Bxp bxp = new Bxp(r0, bKr, migColorScheme, str, str2, list, i3, z, 4YV.A1X(dimensionPixelSize, size));
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.TOP;
        2RH r02 = 2RH.A06;
        4YU.A1O(A012, r02, c26z);
        C26z c26z2 = C26z.BOTTOM;
        4YU.A1O(A012, r02, c26z2);
        C26z c26z3 = C26z.HORIZONTAL;
        4YU.A1O(A012, r02, c26z3);
        if (size == 0) {
            size = dimensionPixelSize;
        }
        A012.A1L(size);
        if (bxp.A02 == BKr.A02) {
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            List list2 = bxp.A06;
            if (list2.size() > 0) {
                A013.A2e(A01((FirstPartySsoSessionInfo) list2.get(0), r302, 1LI.A09(r302, B19.class, "AccountSSORootComponent", -1031035739), bxp, migColorScheme, 0.0f));
            }
            if (list2.size() > 1) {
                A013.A2e(A01((FirstPartySsoSessionInfo) list2.get(1), r302, 1LI.A09(r302, B19.class, "AccountSSORootComponent", -1002406588), bxp, migColorScheme, A0B));
            }
            if (list2.size() > 2) {
                A013.A2e(A01((FirstPartySsoSessionInfo) list2.get(2), r302, 1LI.A09(r302, B19.class, "AccountSSORootComponent", -973777437), bxp, migColorScheme, A0B));
            }
            Dud A014 = Dzc.A01(r302);
            2cM A0M = 7zN.A0M(r302, (String) null);
            2cM A015 = 2cK.A01(r302, (String) null, 0);
            float f = 0.0f;
            float f2 = 40.0f;
            if (AnonymousClass001.A1Q(4YU.A0B(context).orientation, 2)) {
                f2 = 0.0f;
            }
            A015.A24(c26z, f2);
            if (bxp.A07) {
                A2W2 = 2cK.A01(r302, (String) null, 0).A00;
            } else {
                C2cq A00 = C2cp.A00(r302, 0);
                A00.A2Z(2132346577);
                A00.A24(c26z, 0.0f);
                A00.A24(c26z2, 0.0f);
                A00.A0l(62.0f);
                A2W2 = A00.A2W();
            }
            7zO.A1C(A015, A0M, A2W2);
            2cM A016 = 2cK.A01(r302, (String) null, 0);
            2KD A0i = AbK.A0i(r302, migColorScheme);
            7zP.A1K(A0i, 2131958822);
            A0i.A24(c26z, 0.0f);
            AbN.A18(A016, A0i, c26z2, 0.0f);
            2KD A0i2 = AbK.A0i(r302, migColorScheme);
            7zP.A1J(A0i2, 2131958812);
            A0i2.A24(c26z, 0.0f);
            AbN.A18(A016, A0i2, c26z2, 0.0f);
            float f3 = A0A;
            A016.A24(c26z, f3);
            7zL.A1G(A016, A0M);
            2cM A017 = 2cK.A01(r302, (String) null, 0);
            7zL.A1G(A013, A017);
            A017.A24(c26z, 32.0f);
            if (4YU.A0B(context).orientation == 2) {
                f = 20.0f;
            }
            A017.A26(c26z3, f);
            AbL.A0z(A0M, A017.A00, r302);
            2cM A018 = 2cK.A01(r302, (String) null, 0);
            float f4 = A0D;
            C1913Awe A002 = B0n.A00(r302);
            A002.A2X(BLZ.A05);
            A002.A2W(2131958811);
            A002.A2K("skip_button");
            A002.A24(c26z, f4);
            A002.A24(c26z2, f3);
            C1913Awe.A07(A018, 1LI.A09(r302, B19.class, "AccountSSORootComponent", 2037761066), A002);
            7zL.A1G(A018, A0M);
            dzc = 7zM.A0w(A0M.A00, A014);
        } else {
            String str3 = bxp.A05;
            2cM A0M2 = 7zN.A0M(r302, (String) null);
            if (str3 != null) {
                2cM A019 = 2cK.A01(r302, (String) null, 0);
                2RH r03 = 2RH.A04;
                7zO.A1M(A019, r03, c26z);
                A019.A0R();
                C1912Awd A06 = C1912Awd.A06(fbUserSession, r302);
                ImmutableList of = ImmutableList.of((Object) 1BK.A0X(str3));
                C1987Ayg c1987Ayg = A06.A01;
                c1987Ayg.A04 = of;
                c1987Ayg.A02 = C2q2.A0F;
                C2qg c2qg = C2qg.A0C;
                C2qh c2qh = new C2qh();
                c2qh.A00 = -1;
                C2fd c2fd = C2fd.A0P;
                int i4 = A0E;
                c2qh.A01(c2fd, 2132346577, 0, i4);
                c1987Ayg.A03 = new C2qg(c2qh);
                A06.A2W(2RK.A04);
                float f5 = 129.0f;
                if (4YU.A0B(context).orientation == 2) {
                    f5 = 0.0f;
                }
                A06.A24(c26z, f5);
                7zO.A1M(A06, r03, c26z2);
                A06.A0L();
                AbJ.A1R(A019, A06, c1987Ayg, A06.A02, A06.A03);
                2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
                A0X.A2Q(true);
                A0X.A32(false);
                A0X.A2z(bxp.A04);
                A0X.A2y(2KE.A06);
                float f6 = A0C;
                A0X.A24(c26z, f6);
                A0X.A2X();
                A0X.A2b();
                4YU.A1K(A019, A0X);
                float f7 = i4;
                7zO.A1C(A019, A0M2, A00(r302, migColorScheme, f7, f7, f6, bxp.A00, true));
                A01 = 2cK.A01(r302, (String) null, 0);
                float f8 = A0B;
                A01.A2e(A0L(r302, bxp, f8, f7, true));
                C1913Awe A062 = C1913Awe.A06(r302);
                A062.A2K("skip_button");
                A062.A17(f8);
                A062.A18(f7);
                7zN.A1D(A062, r302, B19.class, "AccountSSORootComponent", 2037761066);
                A062.A0J();
                b0n = A062.A01;
            } else {
                2cM A0M3 = 7zN.A0M(r302, (String) null);
                A0M3.A2c();
                if (bxp.A07) {
                    A2W = 2cK.A01(r302, (String) null, 0).A00;
                } else {
                    C2cq A003 = C2cp.A00(r302, 0);
                    A003.A2Z(2132346577);
                    A003.A24(c26z, 0.0f);
                    A003.A24(c26z2, 0.0f);
                    A003.A0l(158.0f);
                    A2W = A003.A2W();
                }
                7zO.A1C(A0M3, A0M2, A2W);
                A01 = 2cK.A01(r302, (String) null, 0);
                float f9 = A0B;
                float f10 = A0E;
                A01.A2e(A0L(r302, bxp, f9, f10, false));
                A01.A2e(A00(r302, migColorScheme, f9, f10, f9, bxp.A00, false));
                C1913Awe A063 = C1913Awe.A06(r302);
                A063.A2K("skip_button");
                A063.A17(f9);
                A063.A18(f10);
                7zN.A1D(A063, r302, B19.class, "AccountSSORootComponent", 2037761066);
                A063.A0J();
                b0n = A063.A01;
            }
            A01.A2e(b0n);
            A01.A24(c26z, A0A);
            7zL.A1G(A01, A0M2);
            dzc = A0M2.A00;
        }
        return 7zL.A0V(A012, dzc);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -1031035739:
                DIj dIj = ((B19) r302.A00.A01).A02;
                if (dIj == null) {
                    return null;
                }
                dIj.BhK();
                return null;
            case -1002406588:
                DIj dIj2 = ((B19) r302.A00.A01).A02;
                if (dIj2 == null) {
                    return null;
                }
                dIj2.BhL();
                return null;
            case -973777437:
                DIj dIj3 = ((B19) r302.A00.A01).A02;
                if (dIj3 == null) {
                    return null;
                }
                dIj3.BhM();
                return null;
            case 1371937264:
                DIj dIj4 = ((B19) r302.A00.A01).A02;
                if (dIj4 == null) {
                    return null;
                }
                dIj4.BrY();
                return null;
            case 1566867166:
                DIj dIj5 = ((B19) r302.A00.A01).A02;
                if (dIj5 == null) {
                    return null;
                }
                dIj5.C52();
                return null;
            case 2037761066:
                DIj dIj6 = ((B19) r302.A00.A01).A02;
                if (dIj6 == null) {
                    return null;
                }
                dIj6.CLn();
                return null;
            default:
                return null;
        }
    }
}
