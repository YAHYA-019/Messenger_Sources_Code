package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1wk, reason: invalid class name */
/* loaded from: 1wk.class */
public final class C1wk {
    public final 1Br A01 = 1Bq.A00(99390);
    public final 1Br A02 = 1Bq.A00(33013);
    public final 1Br A03 = 1Bu.A00(65998);
    public final 1Br A00 = 1Bq.A00(65997);

    public static final C0dp A00(C1wk c1wk) {
        return (C0dp) c1wk.A01.A00.get();
    }

    public static final C1wg A01(C1wk c1wk) {
        return (C1wg) c1wk.A03.A00.get();
    }

    public static 1Ql A02(C1wk c1wk) {
        return A03(c1wk).edit();
    }

    public static final FbSharedPreferences A03(C1wk c1wk) {
        return (FbSharedPreferences) c1wk.A02.A00.get();
    }

    public static final void A04(C1wk c1wk) {
        FbSharedPreferences A03 = A03(c1wk);
        1G9 r0 = 1NK.A5x;
        11T.A0F(A01(c1wk), 1);
        int ArU = A03.ArU(C1wg.A02(r0), 0);
        1Ql edit = A03(c1wk).edit();
        11T.A0F(A01(c1wk), 1);
        edit.CaE(C1wg.A02(r0), ArU + 1);
        edit.commitImmediately();
    }

    public static final void A05(C1wk c1wk) {
        1Ql A02 = A02(c1wk);
        A02.CaH(C1wg.A00(c1wk, 1NK.A59), A00(c1wk).now());
        A02.commitImmediately();
    }

    public static final void A06(C1wk c1wk, Long l) {
        if (l != null) {
            1Ql A02 = A02(c1wk);
            A02.CaH(C1wg.A00(c1wk, 1NK.A4i), l.longValue());
            A02.commitImmediately();
        }
    }

    public static boolean A07(C1wk c1wk) {
        11T.A0F(A01(c1wk), 1);
        return true;
    }

    public final int A08() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A4x;
        11T.A0F(A01(this), 1);
        return A03.ArU(C1wg.A02(r0), 0);
    }

    public final int A09() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A5x;
        11T.A0F(A01(this), 1);
        return A03.ArU(C1wg.A02(r0), 0);
    }

    public final int A0A() {
        return A03(this).ArU(C1wg.A00(this, 1NK.A52), 0);
    }

    public final long A0B() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A54;
        11T.A0F(A01(this), 1);
        return A03.Av1(C1wg.A02(r0), 0L);
    }

    public final long A0C() {
        return 1BL.A0A(A03(this), C1wg.A00(this, 1NK.A59));
    }

    public final Long A0D() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A4l;
        11T.A0F(A01(this), 1);
        if (!A03.BNM(C1wg.A02(r0))) {
            return null;
        }
        FbSharedPreferences A032 = A03(this);
        11T.A0F(A01(this), 1);
        return Long.valueOf(A032.Av1(C1wg.A02(r0), 0L));
    }

    public final Long A0E() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A4t;
        11T.A0F(A01(this), 1);
        if (!A03.BNM(C1wg.A02(r0))) {
            return null;
        }
        FbSharedPreferences A032 = A03(this);
        11T.A0F(A01(this), 1);
        return Long.valueOf(A032.Av1(C1wg.A02(r0), 0L));
    }

    public final void A0F() {
        1Ql A02 = A02(this);
        1G9 r0 = 1NK.A4o;
        boolean A07 = A07(this);
        A02.Cdj(C1wg.A02(r0));
        A02.commitImmediately();
        1Ql.A02(A02(this), C1wg.A01(this, 1NK.A4m, A07 ? 1 : 0), A07);
    }

    public final void A0G() {
        A04(this);
        1Ql edit = A03(this).edit();
        1G9 r0 = 1NK.A5r;
        11T.A0F(A01(this), 1);
        edit.putBoolean(C1wg.A02(r0), true).commitImmediately();
    }

    public final void A0H() {
        1Ql A02 = A02(this);
        1G9 r0 = 1NK.A5s;
        1Ql.A02(A02, C1wg.A02(r0), A07(this));
    }

    public final void A0I() {
        1Ql A02 = A02(this);
        A02.CaE(C1wg.A00(this, 1NK.A52), 3);
        A02.commitImmediately();
    }

    public final void A0J() {
        0fH.A0j("NuxFlagManager", "trigger resetNuxFlags");
        1Ql edit = A03(this).edit();
        1G9 r0 = 1NK.A5r;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r0));
        1G9 r02 = 1NK.A5x;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r02));
        1G9 r03 = 1NK.A5u;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r03));
        1G9 r04 = 1NK.A4l;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r04));
        1G9 r05 = 1NK.A4t;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r05));
        1G9 r06 = 1NK.A5s;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r06));
        1G9 r07 = 1NK.A4x;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r07));
        1G9 r08 = 1NK.A54;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r08));
        1G9 r09 = 1NK.A55;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r09));
        1G9 r010 = 1NK.A4j;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r010));
        1G9 r011 = 1NK.A4k;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r011));
        1G9 r012 = 1NK.A4i;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r012));
        1G9 r013 = 1NK.A5m;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r013));
        1G9 r014 = 1NK.A4V;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r014));
        1G9 r015 = 1NK.A4U;
        11T.A0F(A01(this), 1);
        edit.Cdj(C1wg.A02(r015));
        edit.commitImmediately();
    }

    public final void A0K() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A4l;
        boolean A07 = A07(this);
        if (A03.BNM(C1wg.A02(r0))) {
            return;
        }
        1Ql A02 = A02(this);
        A02.CaH(C1wg.A01(this, r0, A07 ? 1 : 0), A00(this).now());
        A02.commitImmediately();
    }

    public final boolean A0L() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A4l;
        11T.A0F(A01(this), 1);
        return A03.BNM(C1wg.A02(r0));
    }

    public final boolean A0M() {
        FbSharedPreferences A03 = A03(this);
        1G9 r0 = 1NK.A5r;
        11T.A0F(A01(this), 1);
        boolean AZn = A03.AZn(C1wg.A02(r0), false);
        0fH.A0j("NuxFlagManager", 0Pz.A1C("encrypted backup Nux flow has finished: ", AZn));
        return AZn;
    }

    public final boolean A0N() {
        long A0A = 1BL.A0A(A03(this), C1wg.A00(this, 1NK.A57));
        C1ud c1ud = (C1ud) 1Br.A0B(this.A00);
        return AnonymousClass001.A1O((A0A > C1ud.A00(c1ud).Av9(c1ud.A02, 36597901667208999L) ? 1 : (A0A == C1ud.A00(c1ud).Av9(c1ud.A02, 36597901667208999L) ? 0 : -1)));
    }

    public final boolean A0O() {
        boolean A1T = 1BK.A1T(A03(this), C1wg.A00(this, 1NK.A5A));
        0fH.A0j("NuxFlagManager", 0Pz.A1C("encrypted backup HSM restore with non-pin method completed: ", A1T));
        return A1T;
    }
}
