package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8ne, reason: invalid class name */
/* loaded from: 8ne.class */
public final class C8ne extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1Im A05;
    public C2ko A06;
    public C2ko A07;
    public C2ko A08;
    public C2ko A09;
    public C2ko A0A;
    public 7Km A0B;
    public 79G A0C;
    public 79F A0D;
    public 79I A0E;
    public 79J A0F;
    public 9Xf A0G;
    public C00m A0H;
    public Function1 A0I;
    public Function2 A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public C8ne() {
        super("GalleryAlbumSelectionHeader");
        this.A01 = -6841697;
        this.A02 = -16777216;
        this.A04 = -16777216;
    }

    public static void A00(1Iw r301) {
        if (r301.A02 != null) {
            r301.A0G(7zR.A0O(5), "updateState:GalleryAlbumSelectionHeader.onUpdateAlbumListVisibilityState");
        }
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A0K), Integer.valueOf(this.A00), this.A0G, Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0M), this.A0B, Boolean.valueOf(this.A0N), this.A0E, this.A0C, Integer.valueOf(this.A01), this.A0I, this.A0J, this.A0H, this.A0D, Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0Q), null, Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), Boolean.valueOf(this.A0R), this.A0F};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl c2cl;
        C2cl c2cl2;
        C2cp c2cp;
        1LI r313;
        C2cl c2cl3;
        int abs;
        Drawable A08;
        Integer num;
        C8q1 c8q1 = (C8q1) 4YU.A0P(r302);
        boolean z = this.A0O;
        boolean z2 = this.A0P;
        boolean z3 = this.A0R;
        int i = this.A03;
        boolean z4 = this.A0L;
        int i2 = this.A04;
        int i3 = this.A02;
        boolean z5 = c8q1.A05;
        String str = c8q1.A02;
        boolean z6 = c8q1.A06;
        boolean z7 = c8q1.A0A;
        boolean z8 = c8q1.A07;
        boolean z9 = c8q1.A09;
        boolean z10 = c8q1.A08;
        Hcj hcj = c8q1.A01;
        boolean z11 = c8q1.A03;
        boolean z12 = c8q1.A04;
        11T.A0F(str, 14);
        1BQ A02 = 1BQ.A02(16839);
        if (z9) {
            C2cm A00 = C2cl.A00(r302);
            A00.A0F("android.widget.Button");
            A00.A0L();
            A00.A1G(2130971610);
            7zN.A1D(A00, r302, C8ne.class, "GalleryAlbumSelectionHeader", -1757365105);
            A00.A2X(i);
            A00.A1J(2131957109);
            A00.A2a(((C1u2) A02.get()).A00());
            c2cl = 7zL.A0J(A00);
        } else {
            c2cl = null;
        }
        if (z3) {
            C2cm A002 = C2cl.A00(r302);
            int i4 = -6841697;
            if (z10) {
                i4 = i;
            }
            A002.A2X(i4);
            A002.A0L();
            A002.A1J(2131957120);
            7zN.A18(A002, C1u3.A6h, (C1u2) A02.get());
            7zN.A1D(A002, r302, C8ne.class, "GalleryAlbumSelectionHeader", 749794529);
            c2cl2 = 7zL.A0J(A002);
        } else {
            c2cl2 = null;
        }
        int i5 = 1;
        List A0S = 0QD.A0S(C0s8.A14(c2cl, c2cl2));
        if (!z2 || hcj == null) {
            c2cp = null;
        } else {
            C2cq A003 = C2cp.A00(r302, 0);
            7zP.A12(A003);
            A003.A1B(4.0f);
            A003.A2Y();
            A003.A2a(hcj.A01);
            7zN.A1D(A003, r302, C8ne.class, "GalleryAlbumSelectionHeader", -1794151755);
            c2cp = A003.A2W();
        }
        if (z7) {
            2lQ r0 = 2lO.A02;
            Integer num2 = null;
            2lO A0g = 7zL.A0g((2lO) null, new C5z8(0S2.A15, new AR1(z8, 5)));
            if (z12 || z11) {
                boolean z13 = 7Tb.A00;
                C96u c96u = z11 ? z8 ? C96u.A03 : C96u.A02 : z12 ? z8 ? C96u.A05 : C96u.A04 : null;
                C1u2 A0A = 7zN.A0A();
                if (z8) {
                    A08 = A0A.A08(C1u3.A3h, i);
                    11T.A0D(A08);
                } else {
                    C1u3 c1u3 = C1u3.A3i;
                    if (!z4) {
                        i = -6841697;
                    }
                    A08 = A0A.A08(c1u3, i);
                }
                2dP r02 = 2dP.A01;
                Integer num3 = 0S2.A0Y;
                2lO A0L = 4YV.A0L((2lO) null, num3, r02, 0);
                C1ro c1ro = C1ro.CENTER;
                Integer num4 = 0S2.A00;
                2lO A0L2 = 4YV.A0L(A0L, num4, c1ro, 0);
                C1qo c1qo = r302.A0E;
                2lO A004 = 7zS.A0d(4YV.A0K(7zQ.A0Y(A0L2, num3, c1qo.A06(2132279327) | 9221401712017801216L), num4, 9221401712017801216L | c1qo.A06(2132279312)), r302.A0D(2131957111)).A00(A0g);
                if (c96u != null) {
                    num = Integer.valueOf(c96u.minFrame);
                    num2 = Integer.valueOf(c96u.maxFrame);
                } else {
                    num = null;
                }
                r313 = new C8iq(A08, 1LI.A09(r302, C8ne.class, "GalleryAlbumSelectionHeader", -1979352745), A004, num, num2, new AQf(r302, c96u, 13));
            } else {
                C2cm A005 = C2cl.A00(r302);
                if (!z8 && !z4) {
                    i = -6841697;
                }
                A005.A2X(i);
                A005.A0L();
                A005.A1J(2131957111);
                7zN.A18(A005, z8 ? C1u3.A3h : C1u3.A3i, 7zN.A0A());
                7zN.A1D(A005, r302, C8ne.class, "GalleryAlbumSelectionHeader", -1979352745);
                C5z7.A00(A005, A0g);
                r313 = 7zL.A0J(A005);
                11T.A0D(r313);
            }
        } else {
            r313 = null;
        }
        List A0S2 = 0QD.A0S(C0s8.A14(c2cp, r313));
        int size = A0S.size() - A0S2.size();
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A1Z(2132279314);
        A01.A0a();
        3Dx r03 = 3Dx.A02;
        C1ti c1ti = ((C1rj) A01.A00).A00;
        if (c1ti != null) {
            c1ti.A0T(r03, 7zL.A04(A01, 4.0f));
        }
        A01.A2O(false);
        A01.A0e();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A01.A2f((1LI) it.next());
        }
        if (size < 0 && 1 <= (abs = Math.abs(size))) {
            while (true) {
                C1rq A012 = C1rg.A01(r302, null, 0);
                A012.A1W(2132279312);
                7zL.A1M(A012, A01);
                if (i5 == abs) {
                    break;
                }
                i5++;
            }
        }
        C1rq A0m = 7zM.A0m(r302);
        C1ro c1ro2 = C1ro.CENTER;
        A0m.A2h(c1ro2);
        A0m.A2c();
        A0m.A23(C26z.START);
        A0m.A23(C26z.END);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A2g(c1ro2);
        A013.A2f(c1ro2);
        3yF A0v = 7zM.A0v(r302, str, 0);
        A0v.A32(2132279352);
        A0v.A2x(i2);
        A0v.A34(Typeface.DEFAULT_BOLD);
        Integer num5 = 0S2.A01;
        7zN.A1D(A0v, r302, C8ne.class, "GalleryAlbumSelectionHeader", 1845473181);
        7zM.A1L(A013, A0v);
        3yF A0v2 = 7zM.A0v(r302, (CharSequence) null, 0);
        A0v2.A32(2132279337);
        A0v2.A2x(i3);
        7zM.A1L(A013, A0v2);
        7zL.A1H(A013, A0m);
        if (z && z5) {
            C2cm A006 = C2cl.A00(r302);
            2lQ r04 = 2lO.A02;
            C5z7.A00(A006, 7zT.A0k((2lO) null, 0S2.A00, num5, 7zQ.A06()));
            A006.A0F("android.widget.Button");
            A006.A1G(2130971610);
            7zN.A1D(A006, r302, C8ne.class, "GalleryAlbumSelectionHeader", 1845473181);
            A006.A2X(i2);
            int i6 = 2131957119;
            if (z6) {
                i6 = 2131957112;
            }
            A006.A1J(i6);
            7zN.A18(A006, z6 ? C1u3.A1c : C1u3.A1X, (C1u2) A02.get());
            c2cl3 = 7zL.A0J(A006);
        } else {
            c2cl3 = null;
        }
        A0m.A2f(c2cl3);
        7zL.A1M(A0m, A01);
        if (size > 0) {
            int i7 = 1;
            while (true) {
                int i8 = i7;
                C1rq A014 = C1rg.A01(r302, null, 0);
                A014.A1W(2132279312);
                7zL.A1M(A014, A01);
                if (i8 == size) {
                    break;
                }
                i7 = i8 + 1;
            }
        }
        Iterator it2 = A0S2.iterator();
        while (it2.hasNext()) {
            A01.A2f((1LI) it2.next());
        }
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [X.9MG, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        switch (r302.A01) {
            case -1979352745:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                C8ne c8ne = (C8ne) r02;
                C8q1 c8q1 = (C8q1) 4YU.A0P(r03);
                79I r04 = c8ne.A0E;
                Function2 function2 = c8ne.A0J;
                boolean z2 = c8ne.A0K;
                int i = c8ne.A00;
                boolean z3 = c8q1.A07;
                int i2 = c8q1.A00;
                1BL.A1F(r04, function2);
                boolean A02 = 7Tb.A04.A02(i, z2);
                if (r03.A02 != null) {
                    r03.A0G(7zS.A0N(Boolean.valueOf(A02)), "updateState:GalleryAlbumSelectionHeader.onUpdateHdToggleSelectionState");
                }
                boolean z4 = !z3;
                r04.A00(z4);
                function2.invoke(Boolean.valueOf(z4), Integer.valueOf(i2));
                return null;
            case -1794151755:
                1Iv r05 = r302.A00;
                1Is r06 = r05.A01;
                1Iw r07 = r05.A00;
                C8ne c8ne2 = (C8ne) r06;
                Hcj hcj = ((C8q1) 4YU.A0P(r07)).A01;
                Function1 function1 = c8ne2.A0I;
                11T.A0F(function1, 2);
                if (hcj == null) {
                    return null;
                }
                function1.invoke(hcj.A00);
                return null;
            case -1757365105:
                1Iv r08 = r302.A00;
                1Is r09 = r08.A01;
                1Iw r010 = r08.A00;
                9Xf r011 = ((C8ne) r09).A0G;
                boolean A1W = 1BL.A1W(r010, r011);
                79G r012 = ((C8ne) ((C1rj) r010.A02)).A0C;
                boolean z5 = ((C8q1) 4YU.A0P(r010)).A06;
                11T.A0F(r012, A1W ? 1 : 0);
                if (z5) {
                    r012.BNu();
                    A00(r010);
                    z = true;
                } else {
                    z = false;
                }
                if (7zO.A1Y(z)) {
                    return null;
                }
                r011.A00();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 749794529:
                1Iv r013 = r302.A00;
                1Is r014 = r013.A01;
                1Iw r015 = r013.A00;
                C8ne c8ne3 = (C8ne) r014;
                C8q1 c8q12 = (C8q1) 4YU.A0P(r015);
                79J r016 = c8ne3.A0F;
                C00m c00m = c8ne3.A0H;
                boolean z6 = c8q12.A08;
                1BL.A1F(r016, c00m);
                if (r015.A02 != null) {
                    r015.A0G(7zR.A0O(3), "updateState:GalleryAlbumSelectionHeader.onUpdateViewOnceToggleSelectionState");
                }
                boolean z7 = !z6;
                C2ko c2ko = r016.A00;
                ?? obj2 = new Object();
                ((9MG) obj2).A00 = z7;
                7zO.A1P(c2ko, (Object) obj2);
                c00m.invoke();
                return null;
            case 1845473181:
                1Iv r017 = r302.A00;
                1Is r018 = r017.A01;
                1Iw r019 = r017.A00;
                C8ne c8ne4 = (C8ne) r018;
                C8q1 c8q13 = (C8q1) 4YU.A0P(r019);
                79F r020 = c8ne4.A0D;
                79G r021 = c8ne4.A0C;
                boolean z8 = c8q13.A06;
                1BL.A1F(r020, r021);
                if (z8) {
                    r021.BNu();
                } else {
                    7zO.A1P(r020.A01, new Object());
                }
                A00(r019);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        1Iw r306;
        C2l4 A0M;
        String str;
        switch (c2ko.A02) {
            case -1596505398:
                r306 = c2ko.A00;
                C1rl c1rl = c2ko.A01;
                boolean z = ((9ME) obj).A00;
                C8ne c8ne = (C8ne) c1rl;
                boolean z2 = c8ne.A0K;
                int i = c8ne.A00;
                11T.A0F(r306, 0);
                boolean A02 = 7Tb.A04.A02(i, z2);
                1LI r0 = r306.A02;
                if (z) {
                    if (r0 == null) {
                        return null;
                    }
                    A0M = 7zS.A0M(2, A02);
                    str = "updateState:GalleryAlbumSelectionHeader.onSelectHdToggleSelectionState";
                    break;
                } else {
                    if (r0 == null) {
                        return null;
                    }
                    A0M = 7zS.A0M(1, A02);
                    str = "updateState:GalleryAlbumSelectionHeader.onUnselectHdToggleSelectionState";
                    break;
                }
            case 734181858:
                r306 = c2ko.A00;
                boolean z3 = ((9MD) obj).A00;
                11T.A0F(r306, 0);
                if (r306.A02 == null) {
                    return null;
                }
                A0M = 7zS.A0M(6, z3);
                str = "updateState:GalleryAlbumSelectionHeader.onUpdateCloseButtonVisibility";
                break;
            case 1474100937:
                1Iw r02 = c2ko.A00;
                C9cc c9cc = (C9cc) objArr[0];
                1BK.A1M(r02, c9cc);
                String str2 = c9cc.A03;
                if (r02.A02 != null) {
                    r02.A0G(7zQ.A0V(str2, 10), "updateState:GalleryAlbumSelectionHeader.onUpdateTitle");
                }
                A00(r02);
                return null;
            case 2027410760:
                1Iw r03 = c2ko.A00;
                79G r04 = ((C8ne) c2ko.A01).A0C;
                boolean z4 = ((C8q1) 4YU.A0P(r03)).A06;
                boolean z5 = true;
                11T.A0F(r04, 1);
                if (z4) {
                    r04.BNu();
                    A00(r03);
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 2042417689:
                9Pp r05 = (9Pp) obj;
                r306 = c2ko.A00;
                C1rl c1rl2 = c2ko.A01;
                int i2 = r05.A00;
                boolean z6 = r05.A01;
                C8ne c8ne2 = (C8ne) c1rl2;
                boolean z7 = c8ne2.A0Q;
                79I r06 = c8ne2.A0E;
                boolean z8 = c8ne2.A0L;
                boolean z9 = c8ne2.A0M;
                boolean z10 = ((C8q1) 4YU.A0P(r306)).A07;
                boolean A1Y = 7zP.A1Y(r06);
                if (z7) {
                    boolean z11 = false;
                    if (i2 == 0) {
                        if (!z8 && !z9 && r306.A02 != null) {
                            r306.A0G(7zS.A0M(1, A1Y), "updateState:GalleryAlbumSelectionHeader.onUnselectHdToggleSelectionState");
                        }
                        if (r306.A02 != null) {
                            r306.A0G(7zS.A0M(7, z7), "updateState:GalleryAlbumSelectionHeader.onUpdateHdToggleVisibility");
                        }
                    } else {
                        boolean z12 = !z6;
                        if (r306.A02 != null) {
                            r306.A0G(7zS.A0M(7, z12), "updateState:GalleryAlbumSelectionHeader.onUpdateHdToggleVisibility");
                        }
                        if (!z6 && z10) {
                            z11 = true;
                        }
                        r06.A00(z11);
                    }
                }
                if (r306.A02 != null) {
                    r306.A0G(7zL.A0f(AnonymousClass001.A1a(i2), 9), "updateState:GalleryAlbumSelectionHeader.onUpdateSelectedCountState");
                }
                if (r306.A02 == null) {
                    return null;
                }
                A0M = 7zL.A0f(AnonymousClass001.A1a(i2), 8);
                str = "updateState:GalleryAlbumSelectionHeader.onUpdateAlbumToggleState";
                break;
                break;
            default:
                return null;
        }
        r306.A0G(A0M, str);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A09, this, r303);
        7zQ.A1H(r302, this.A07, this, r303);
        7zQ.A1H(r302, this.A08, this, r303);
        7zQ.A1H(r302, this.A0A, this, r303);
        7zQ.A1H(r302, this.A06, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C8q1 c8q1 = (C8q1) r303;
        Object obj = null;
        boolean z = this.A0Q;
        boolean z2 = this.A0K;
        int i = this.A00;
        boolean z3 = this.A0N;
        7Km r0 = this.A0B;
        11T.A0F(r302, 0);
        Boolean valueOf = Boolean.valueOf(z3);
        Boolean valueOf2 = Boolean.valueOf(z);
        String A0D = r302.A0D(2131957108);
        boolean A02 = 7Tb.A04.A02(i, z2);
        if (r0 != null) {
            Context A0A = 7zL.A0A(r302);
            PackageManager packageManager = A0A.getPackageManager();
            11T.A0A(packageManager);
            obj = 0QD.A0E(new Hov(A0A, packageManager, false, 1Br.A07(((HS7) 1Br.A0B(r0.A00)).A00).AZk(36315649295721770L)).A00());
        }
        c8q1.A05 = true;
        c8q1.A07 = valueOf.booleanValue();
        c8q1.A0A = valueOf2.booleanValue();
        c8q1.A09 = false;
        c8q1.A08 = false;
        c8q1.A02 = A0D;
        c8q1.A03 = A02;
        c8q1.A04 = false;
        c8q1.A01 = (Hcj) obj;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
