package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.navigation.home.drawer.fragment.HomeDrawerSwipeStateController$DrawerSwipeAction;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4Fl, reason: invalid class name */
/* loaded from: 4Fl.class */
public final class C4Fl extends C4Fm {
    public static final String __redex_internal_original_name = "HomeDrawerFragment";
    public FbUserSession A00;
    public 2OW A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public 1PA A06;
    public final C2iw A07;
    public final 4OM A08;
    public final C4La A09;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2iw, java.lang.Object] */
    public C4Fl() {
        ?? obj = new Object();
        this.A07 = obj;
        this.A09 = new C4La(obj, this);
        this.A08 = new 4OM(this);
    }

    public static final void A03(C4Fl c4Fl) {
        C00j.A05("HomeDrawerFragment.clearSwipeInitialization", 1150525243);
        try {
            c4Fl.A02 = false;
            C00j.A01(-1607089040);
        } catch (Throwable th) {
            C00j.A01(564404749);
            throw th;
        }
    }

    public static final void A06(C4Fl c4Fl, Integer num) {
        C00j.A05("HomeDrawerFragment.ensureStateForDrawerOpening", 1447921163);
        try {
            c4Fl.A1Y().A02(num);
            c4Fl.A1g();
            2YJ r0 = ((C4Fm) c4Fl).A03;
            if (r0 != null) {
                r0.A04(true);
                2YJ r02 = ((C4Fm) c4Fl).A03;
                if (r02 != null) {
                    r02.A05(true);
                    if (num.equals(0S2.A0N) && ((1CO) c4Fl.A0N.A00.get()).AZk(36325922856653888L)) {
                        c4Fl.A1c();
                    } else {
                        c4Fl.A1d();
                    }
                    C00j.A01(1088823537);
                    return;
                }
            }
            11T.A0L("passiveImpressionTracker");
            throw 0Q8.createAndThrow();
        } catch (Throwable th) {
            C00j.A01(1097892704);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4Fm
    public void A1S(Bundle bundle) {
        C4La c4La;
        HomeDrawerSwipeStateController$DrawerSwipeAction homeDrawerSwipeStateController$DrawerSwipeAction;
        C4Lc c4Lc;
        C00j.A05("HomeDrawerFragment.onFragmentCreate", 245327898);
        try {
            super.A1S(bundle);
            this.A00 = ((1Fv) 1Bi.A03(66351)).A06(this);
            if (this.A0G && !this.A02) {
                A1Y().A02(0S2.A01);
            }
            Parcelable parcelable = bundle != null ? bundle.getParcelable("drawer_swipe_action") : null;
            if (this.A02) {
                c4La = this.A09;
                homeDrawerSwipeStateController$DrawerSwipeAction = HomeDrawerSwipeStateController$DrawerSwipeAction.A03;
                c4Lc = C4Vt.A00;
            } else if (this.A0G || parcelable == HomeDrawerSwipeStateController$DrawerSwipeAction.A02) {
                c4La = this.A09;
                homeDrawerSwipeStateController$DrawerSwipeAction = HomeDrawerSwipeStateController$DrawerSwipeAction.A03;
                Resources resources = requireContext().getResources();
                11T.A0A(resources);
                new 4NY(c4La.A02(resources));
            } else {
                c4La = this.A09;
                homeDrawerSwipeStateController$DrawerSwipeAction = HomeDrawerSwipeStateController$DrawerSwipeAction.A03;
                c4Lc = C4Lb.A02;
            }
            C4Lc c4Lc2 = c4Lc;
            11T.A0F(c4Lc2, 1);
            c4La.A00 = homeDrawerSwipeStateController$DrawerSwipeAction;
            c4La.A01 = c4Lc2;
            1PA A00 = 83Y.A00(requireContext(), new C4O1(this, 6));
            this.A06 = A00;
            A00.A00();
            C00j.A01(1612733657);
        } catch (Throwable th) {
            C00j.A01(-555808251);
            throw th;
        }
    }

    public void A1j() {
        C00j.A05("HomeDrawerFragment.onDrawerFinishedClosing", -286977009);
        try {
            this.A0G = false;
            A03(this);
            A1h();
            C4Lm.A00(A1Y(), "drawer_finished_closing", (short) 4, false);
            2YJ r0 = super.A03;
            if (r0 != null) {
                r0.A04(false);
                2YJ r02 = super.A03;
                if (r02 != null) {
                    r02.A05(false);
                    A1b();
                    C00j.A01(63006904);
                    return;
                }
            }
            11T.A0L("passiveImpressionTracker");
            throw 0Q8.createAndThrow();
        } catch (Throwable th) {
            C00j.A01(-260006276);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1k() {
        C00j.A05("HomeDrawerFragment.onDrawerFinishedOpening", -1078119179);
        try {
            this.A0G = true;
            A03(this);
            C4Lm A1Y = A1Y();
            ((QuickPerformanceLogger) A1Y.A02.A00.get()).markerPoint(231281612, "DRAWER_FULLY_OPEN");
            ((5Ty) A1Y.A01.A00.get()).A0K("DRAWER_FULLY_OPEN");
            A1g();
            2YJ r0 = super.A03;
            if (r0 != null) {
                r0.A04(true);
                2YJ r02 = super.A03;
                if (r02 != null) {
                    r02.A05(true);
                    if (AnonymousClass524.A00(getContext())) {
                        View findViewWithTag = A1X().findViewWithTag("drawer_main_content_component");
                        if (findViewWithTag != null) {
                            findViewWithTag.postDelayed(new FzO(findViewWithTag), 0L);
                        }
                    }
                    C00j.A01(-355366142);
                    return;
                }
            }
            11T.A0L("passiveImpressionTracker");
            throw 0Q8.createAndThrow();
        } catch (Throwable th) {
            C00j.A01(-2123074772);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1705508076);
        C00j.A05("HomeDrawerFragment.onCreateView", 2113524766);
        try {
            Context requireContext = requireContext();
            1Iw r0 = new 1Iw(requireContext);
            MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0D(requireContext, 16979);
            11T.A0F(migColorScheme, 0);
            this.A0A = migColorScheme;
            A1f();
            super.A02 = LithoView.A02(A1Z(r0), r0);
            ((C1sx) 1Bi.A03(33085)).A00(this, new 4NH(this));
            LithoView A1X = A1X();
            C00j.A01(-1700194331);
            0FI.A08(1771141786, A02);
            return A1X;
        } catch (Throwable th) {
            C00j.A01(-1037181154);
            0FI.A08(15953215, A02);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-969268421);
        C00j.A05("HomeDrawerFragment.onDestroy", -409864075);
        try {
            super/*androidx.fragment.app.Fragment*/.onDestroy();
            1PA r0 = this.A06;
            if (r0 != null) {
                r0.A01();
            }
            this.A06 = null;
            C00j.A01(-1398436988);
            0FI.A08(800140558, A02);
        } catch (Throwable th) {
            C00j.A01(-805476337);
            0FI.A08(316392277, A02);
            throw th;
        }
    }

    @Override // X.C4Fm
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("drawer_swipe_action", this.A09.A00);
    }

    @Override // X.C4Fm
    public void onStart() {
        int A02 = 0FI.A02(-1898340793);
        C00j.A05("HomeDrawerFragment.onStart", 2019081822);
        try {
            super.onStart();
            if (this.A02) {
                A1g();
            }
            C00j.A01(-907444929);
            0FI.A08(-1866665500, A02);
        } catch (Throwable th) {
            C00j.A01(-1296262491);
            0FI.A08(-15457479, A02);
            throw th;
        }
    }
}
