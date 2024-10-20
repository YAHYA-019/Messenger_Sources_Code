package com.facebook.messaging.storagemanagement.threadmanager.fragment;

import X.0FI;
import X.0KB;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1F9;
import X.1Iw;
import X.1pK;
import X.2Om;
import X.2On;
import X.3OE;
import X.4YU;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zS;
import X.9zI;
import X.AbH;
import X.AbJ;
import X.AfK;
import X.AnonymousClass553;
import X.C06c;
import X.C0s8;
import X.C1t1;
import X.C1t3;
import X.C3Ob;
import X.C5xv;
import X.C5yv;
import X.C5yw;
import X.C5z2;
import X.C9lC;
import X.Cu0;
import X.Cx1;
import X.Cx9;
import X.CxE;
import X.DG2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableSet;

/* loaded from: ThreadManagerSeeAllFragment.class */
public final class ThreadManagerSeeAllFragment extends 1pK {
    public FbUserSession A00;
    public 1Iw A01;
    public LithoView A02;
    public 2On A03;
    public MigColorScheme A04;
    public C1t3 A05;
    public final C1t1 A0B = new Cx9(this, 5);
    public final C5xv A09 = CxE.A00(this, 90);
    public final AnonymousClass553 A08 = Cx1.A01(this, 42);
    public final AnonymousClass553 A07 = Cx1.A01(this, 41);
    public final DG2 A06 = new Cu0(this);
    public final 0KB A0A = new AfK(this, 7);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(ThreadManagerSeeAllFragment threadManagerSeeAllFragment) {
        String str;
        2On r0;
        LithoView lithoView;
        2On r02 = threadManagerSeeAllFragment.A03;
        if (r02 != null) {
            ImmutableSet B9m = r02.B9m();
            2On r03 = threadManagerSeeAllFragment.A03;
            if (r03 != null && r03.BUL()) {
                C9lC A00 = C9lC.A00();
                MigColorScheme migColorScheme = threadManagerSeeAllFragment.A04;
                str = "colorScheme";
                if (migColorScheme != null) {
                    A00.A01 = migColorScheme;
                    A00.A03 = 4YU.A0t(7zO.A0D(threadManagerSeeAllFragment), 2131967004);
                    A00.A03(threadManagerSeeAllFragment.A07);
                    C5z2 A02 = A00.A02();
                    C9lC c9lC = new C9lC();
                    MigColorScheme migColorScheme2 = threadManagerSeeAllFragment.A04;
                    if (migColorScheme2 != null) {
                        c9lC.A01 = migColorScheme2;
                        c9lC.A03 = 4YU.A0t(7zO.A0D(threadManagerSeeAllFragment), 2131967005);
                        c9lC.A03(new 9zI(B9m, threadManagerSeeAllFragment, 18));
                        C5z2 A022 = c9lC.A02();
                        LithoView lithoView2 = threadManagerSeeAllFragment.A02;
                        if (lithoView2 != null) {
                            1Iw r04 = threadManagerSeeAllFragment.A01;
                            if (r04 != null) {
                                C5yw A002 = C5yv.A00(r04);
                                A002.A2j(true);
                                A002.A2f(7zO.A0D(threadManagerSeeAllFragment).getString(2131967010));
                                A002.A2g(C0s8.A14(A02, A022));
                                MigColorScheme migColorScheme3 = threadManagerSeeAllFragment.A04;
                                if (migColorScheme3 != null) {
                                    A002.A2b(migColorScheme3);
                                    A002.A2i(false);
                                    A002.A2X();
                                    A002.A2d(threadManagerSeeAllFragment.A09);
                                    AbH.A1R(lithoView2, A002);
                                }
                            }
                        }
                        r0 = threadManagerSeeAllFragment.A03;
                        if (r0 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            LithoView lithoView3 = threadManagerSeeAllFragment.A02;
            if (lithoView3 != null) {
                1Iw r05 = threadManagerSeeAllFragment.A01;
                if (r05 != null) {
                    C5yw A003 = C5yv.A00(r05);
                    A003.A2j(true);
                    A003.A2f(7zO.A0D(threadManagerSeeAllFragment).getString(2131967010));
                    C9lC A004 = C9lC.A00();
                    MigColorScheme migColorScheme4 = threadManagerSeeAllFragment.A04;
                    str = "colorScheme";
                    if (migColorScheme4 != null) {
                        A004.A01 = migColorScheme4;
                        A004.A03 = 4YU.A0t(7zO.A0D(threadManagerSeeAllFragment), 2131967006);
                        A004.A03(threadManagerSeeAllFragment.A08);
                        A003.A2e(A004.A02());
                        MigColorScheme migColorScheme5 = threadManagerSeeAllFragment.A04;
                        if (migColorScheme5 != null) {
                            A003.A2b(migColorScheme5);
                            A003.A2i(false);
                            A003.A2X();
                            A003.A2d(threadManagerSeeAllFragment.A09);
                            AbH.A1R(lithoView3, A003);
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
            }
            r0 = threadManagerSeeAllFragment.A03;
            if (r0 != null || r0.BNf() || (lithoView = threadManagerSeeAllFragment.A02) == null) {
                return;
            }
            1Iw r06 = threadManagerSeeAllFragment.A01;
            if (r06 != null) {
                C5yw A0b = 7zN.A0b(r06, true);
                A0b.A2f(7zO.A0D(threadManagerSeeAllFragment).getString(2131967010));
                MigColorScheme migColorScheme6 = threadManagerSeeAllFragment.A04;
                if (migColorScheme6 == null) {
                    str = "colorScheme";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                A0b.A2b(migColorScheme6);
                A0b.A2i(false);
                A0b.A2X();
                A0b.A2d(threadManagerSeeAllFragment.A09);
                AbH.A1R(lithoView, A0b);
                return;
            }
            str = "componentContext";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = 7zP.A0T(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        getChildFragmentManager().A1K(this.A0A, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-584411589);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543487, viewGroup, false);
        C06c A09 = AbJ.A09(this);
        3OE r0 = new 3OE();
        r0.A00(1F9.A0Y);
        r0.A06 = false;
        r0.A07 = true;
        r0.A01 = ThreadKey.A07(0L);
        A09.A0M(2Om.A03(new C3Ob(r0)), 2131368010);
        C06c.A00(A09, false);
        0FI.A08(369490766, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(892074159);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = null;
        C1t3 c1t3 = this.A05;
        if (c1t3 != null) {
            c1t3.A01(this.A0B);
        }
        0FI.A08(-1726314318, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = 7zS.A0j(this);
        this.A02 = (LithoView) 7zL.A0F(this, 2131368011);
        A03(this);
        FbUserSession A01 = 1BM.A01(this);
        this.A00 = A01;
        if (A01 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C1t3 c1t3 = (C1t3) 7zN.A0m(this, A01, 33086);
        this.A05 = c1t3;
        if (c1t3 != null) {
            c1t3.A00(this.A0B);
        }
    }
}
