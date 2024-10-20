package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8nw, reason: invalid class name */
/* loaded from: 8nw.class */
public final class C8nw extends C1rj {
    public Aak A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public static final 9Dt A0A = new Object();
    public static final CallerContext A09 = CallerContext.A0B("QuicksilverSeparateProcessNavBarSpec");

    public C8nw() {
        super("QuicksilverSeparateProcessNavBar");
        this.A08 = false;
    }

    public static final void A00(C1rr c1rr, 1Iw r302, boolean z) {
        C1rq A00 = z ? C1rg.A00(r302) : 2cK.A00(r302);
        A00.A2Y(C1ro.CENTER);
        A00.A2a(C1rp.CENTER);
        7zN.A1D(A00, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -1982213279);
        DfX A0C = 7zV.A0C(r302);
        A0C.A0i(2MR.A1x);
        A00.A2X(A0C.A0O(A09));
        c1rr.A2W(A00);
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, Boolean.valueOf(this.A04), this.A01, this.A02, this.A03, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), Boolean.valueOf(this.A08)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z;
        Context context;
        2cL A0c;
        boolean z2 = this.A05;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A01;
        boolean z3 = this.A04;
        boolean z4 = this.A07;
        boolean z5 = this.A08;
        boolean z6 = this.A06;
        11T.A0F(r302, 0);
        7zT.A1U(str, str2, str3);
        if (z2) {
            2cM A00 = 2cK.A00(r302);
            A00.A0R();
            z = true;
            if (z6) {
                A00(A00, r302, true);
            }
            if (z3) {
                C8Sa A002 = C8m7.A00(r302);
                A002.A2W(2132345599);
                7zN.A1D(A002, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -1613216430);
                A002.A2S(str2);
                A00.A2W(A002);
            }
            if (z5) {
                C8Sa A003 = C8m7.A00(r302);
                A003.A2W(2132345500);
                7zN.A1D(A003, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -72169690);
                A00.A2W(A003);
            }
            if (z4) {
                C8Sa A004 = C8m7.A00(r302);
                A004.A2W(2132345219);
                7zN.A1D(A004, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", 980189452);
                A00.A2W(A004);
            }
            2cM A005 = 2cK.A00(r302);
            A005.A2h(C1rp.FLEX_START);
            A005.A2b();
            context = r302.A0D;
            A005.A1H(context.getColor(2132214622));
            A005.A0V();
            A0c = 7zL.A0U(A005, A00);
        } else {
            z = false;
            C1rq A006 = C1rg.A00(r302);
            A006.A1X(R.dimen.mapbox_four_dp);
            C1rq A007 = C1rg.A00(r302);
            A007.A1X(R.dimen.mapbox_four_dp);
            if (z5) {
                C8Sa A008 = C8m7.A00(r302);
                A008.A2W(2132345500);
                7zN.A1D(A008, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -72169690);
                A006.A2W(A008);
            }
            if (z4) {
                C8Sa A009 = C8m7.A00(r302);
                A009.A2W(2132345219);
                7zN.A1D(A009, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", 980189452);
                A006.A2W(A009);
            }
            if (z3) {
                C8Sa A0010 = C8m7.A00(r302);
                A0010.A2W(2132345599);
                7zN.A1D(A0010, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -1613216430);
                A0010.A2S(str2);
                A006.A2W(A0010);
            }
            if (z6) {
                A00(A006, r302, false);
            }
            C1rq A0011 = C1rg.A00(r302);
            C1rq A0012 = C1rg.A00(r302);
            A0012.A0R();
            A0012.A2e(A007);
            A0011.A2e(A0012);
            C1rq A0013 = C1rg.A00(r302);
            A0013.A0R();
            C1rp c1rp = C1rp.FLEX_END;
            A0013.A2i(c1rp);
            A0013.A2e(A006);
            A0011.A2e(A0013);
            A0011.A0z(0.0f);
            A0011.A0R();
            C1rq A0014 = C1rg.A00(r302);
            A0014.A2i(c1rp);
            A0014.A2b();
            A0014.A0R();
            context = r302.A0D;
            A0014.A1H(context.getColor(2132214622));
            A0c = 7zL.A0c(A0011, A0014);
        }
        C8Sa A0015 = C8m7.A00(r302);
        A0015.A2W(2132345587);
        A0015.A2K("quicksilver_close_button");
        7zN.A1D(A0015, r302, C8nw.class, "QuicksilverSeparateProcessNavBar", -513663253);
        A0015.A2S(str);
        C1rs.A01(A0015.A02, A0015.A03);
        A0015.A0J();
        C8m7 c8m7 = A0015.A01;
        int color = context.getColor(2132213801);
        float A0016 = C0A8.A00(context, 2.1322794E9f);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A01.A2g(c1ro);
        A01.A2c();
        7zQ.A1B(A01);
        A01.A0S();
        C9da.A01(A01, A0016, color);
        1LI A0V = 7zL.A0V(A01, c8m7);
        C1rq A012 = C1rg.A01(r302, null, 0);
        float f = 8.0f;
        A012.A1C(8.0f);
        float f2 = 0.0f;
        if (z) {
            f2 = 8.0f;
        }
        A012.A19(f2);
        if (!z) {
            f = 0.0f;
        }
        A012.A1A(f);
        8O9 A0017 = C8nh.A00(r302);
        A0017.A0J();
        C1rh A0d = 7zL.A0d(A0017.A01, A012);
        if (!z) {
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A0Q();
            A013.A0Y();
            C1rq A014 = C1rg.A01(r302, null, 0);
            A014.A0Q();
            A014.A2h(c1ro);
            A014.A2f(A0V);
            A014.A2f(A0d);
            A013.A2e(A014);
            return 7zL.A0d(A0c, A013);
        }
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        A015.A0Q();
        A015.A1B(16.0f);
        A015.A2e(A0c);
        2cM A016 = 2cK.A01(r302, (String) null, 0);
        A016.A0Q();
        A016.A0S();
        A016.A2g(c1ro);
        A016.A2e(A0d);
        A016.A2e(A0V);
        return 7zL.A0U(A015, A016);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1982213279:
                Aak aak = ((C8nw) r302.A00.A01).A00;
                if (aak == null) {
                    return null;
                }
                aak.Bpl();
                return null;
            case -1613216430:
                Aak aak2 = ((C8nw) r302.A00.A01).A00;
                if (aak2 == null) {
                    return null;
                }
                aak2.CLF();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -744544163:
                Aak aak3 = ((C8nw) r302.A00.A01).A00;
                if (aak3 == null) {
                    return null;
                }
                aak3.BjG();
                return null;
            case -513663253:
                Aak aak4 = ((C8nw) r302.A00.A01).A00;
                if (aak4 == null) {
                    return null;
                }
                aak4.BpP();
                return null;
            case -72169690:
                Aak aak5 = ((C8nw) r302.A00.A01).A00;
                if (aak5 == null) {
                    return null;
                }
                aak5.CRB();
                return null;
            case 980189452:
                Aak aak6 = ((C8nw) r302.A00.A01).A00;
                if (aak6 == null) {
                    return null;
                }
                aak6.CPl();
                return null;
            case 1577686927:
                Aak aak7 = ((C8nw) r302.A00.A01).A00;
                if (aak7 == null) {
                    return null;
                }
                aak7.CFG();
                return null;
            default:
                return null;
        }
    }
}
