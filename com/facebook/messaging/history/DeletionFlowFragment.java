package com.facebook.messaging.history;

import X.0FI;
import X.0KB;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1Iw;
import X.1pK;
import X.1pN;
import X.2Om;
import X.2On;
import X.3OE;
import X.4YU;
import X.4YV;
import X.6T0;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zS;
import X.9zI;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AfK;
import X.AnonymousClass553;
import X.BeN;
import X.C00i;
import X.C06c;
import X.C0s8;
import X.C0ty;
import X.C1t1;
import X.C1t3;
import X.C1u2;
import X.C1u3;
import X.C3Ob;
import X.C5xv;
import X.C5yu;
import X.C5yw;
import X.C5z1;
import X.Ctz;
import X.Cx1;
import X.Cx9;
import X.CxE;
import X.DG2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.collect.ImmutableSet;

/* loaded from: DeletionFlowFragment.class */
public final class DeletionFlowFragment extends 1pK implements 1pN {
    public long A01;
    public FbUserSession A02;
    public 1Iw A03;
    public LithoView A04;
    public 2On A06;
    public MigColorScheme A07;
    public C1t3 A08;
    public final C1t1 A0G = new Cx9(this, 2);
    public final 1Br A09 = 1Bu.A00(83684);
    public int A00 = 1;
    public final 1Br A0A = 7zM.A0U();
    public final 1Br A0B = 7zM.A0T();
    public final DG2 A0C = new Ctz(this);
    public final 0KB A0F = new AfK(this, 5);
    public final C5xv A0E = CxE.A00(this, 47);
    public BeN A05 = new BeN(this);
    public final AnonymousClass553 A0D = Cx1.A01(this, 18);

    public static final UserFlowLogger A03(DeletionFlowFragment deletionFlowFragment) {
        return 4YV.A0Z(deletionFlowFragment.A0B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(DeletionFlowFragment deletionFlowFragment) {
        LithoView lithoView;
        2On r0 = deletionFlowFragment.A06;
        if (r0 != null) {
            if (!r0.BUL()) {
                r0.APR();
                return;
            }
            ImmutableSet B9m = r0.B9m();
            9zI r02 = new 9zI(B9m, deletionFlowFragment, 7);
            int i = C5yu.A00;
            6T0 r03 = new 6T0();
            C00i c00i = deletionFlowFragment.A0A.A00;
            r03.A00 = ((C1u2) c00i.get()).A03(C1u3.A6a);
            r03.A04 = r02;
            MigColorScheme migColorScheme = deletionFlowFragment.A07;
            String str = "colorScheme";
            if (migColorScheme != null) {
                r03.A06 = migColorScheme;
                2On r04 = deletionFlowFragment.A06;
                r03.A0A = r04 != null ? r04.BNU() : false;
                r03.A07 = 7zO.A0D(deletionFlowFragment).getString(2131957661);
                C5z1 c5z1 = new C5z1(r03);
                String string = B9m.isEmpty() ? 7zO.A0D(deletionFlowFragment).getString(2131957665) : 4YU.A0u(7zO.A0D(deletionFlowFragment), 1BK.A0k(B9m), 2131957666);
                11T.A0D(string);
                LithoView lithoView2 = deletionFlowFragment.A04;
                if (lithoView2 != null) {
                    1Iw r05 = deletionFlowFragment.A03;
                    if (r05 != null) {
                        C5yw A0b = 7zN.A0b(r05, true);
                        A0b.A2f(string);
                        6T0 r06 = new 6T0();
                        MigColorScheme migColorScheme2 = deletionFlowFragment.A07;
                        if (migColorScheme2 != null) {
                            r06.A06 = migColorScheme2;
                            r06.A00 = ((C1u2) c00i.get()).A03(C1u3.A2Q);
                            r06.A04 = deletionFlowFragment.A0D;
                            2On r07 = deletionFlowFragment.A06;
                            r06.A0A = r07 != null ? r07.BNf() : false;
                            r06.A07 = 7zO.A0D(deletionFlowFragment).getString(2131960470);
                            A0b.A2g(C0s8.A14(c5z1, new C5z1(r06)));
                            MigColorScheme migColorScheme3 = deletionFlowFragment.A07;
                            if (migColorScheme3 != null) {
                                A0b.A2b(migColorScheme3);
                                A0b.A2i(false);
                                A0b.A2X();
                                A0b.A2d(deletionFlowFragment.A0E);
                                AbH.A1R(lithoView2, A0b);
                            }
                        }
                    }
                    str = "componentContext";
                }
                2On r08 = deletionFlowFragment.A06;
                if (r08 == null || r08.BNf() || (lithoView = deletionFlowFragment.A04) == null) {
                    return;
                }
                1Iw r09 = deletionFlowFragment.A03;
                if (r09 != null) {
                    C5yw A0b2 = 7zN.A0b(r09, true);
                    A0b2.A2f(7zO.A0D(deletionFlowFragment).getString(2131957665));
                    A0b2.A2g(C0ty.A00);
                    MigColorScheme migColorScheme4 = deletionFlowFragment.A07;
                    if (migColorScheme4 != null) {
                        A0b2.A2b(migColorScheme4);
                        A0b2.A2i(false);
                        A0b2.A2X();
                        A0b2.A2d(deletionFlowFragment.A0E);
                        AbH.A1R(lithoView, A0b2);
                        return;
                    }
                }
                str = "componentContext";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A03 = 7zP.A0T(this);
    }

    public boolean Bkd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        getChildFragmentManager().A1K(this.A0F, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(399038329);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541839, viewGroup, false);
        if (bundle == null) {
            C06c A09 = AbJ.A09(this);
            3OE r0 = new 3OE();
            r0.A00(1F9.A0H);
            r0.A06 = false;
            r0.A07 = true;
            r0.A01 = ThreadKey.A07(0L);
            A09.A0M(2Om.A03(new C3Ob(r0)), 2131364228);
            C06c.A00(A09, false);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A01 = activity.getIntent().getLongExtra("user_flow_id", 0L);
        }
        if (this.A01 == 0) {
            1Br r02 = this.A0B;
            this.A01 = 4YV.A0Z(r02).generateNewFlowId(586026158);
            AbI.A1U(4YV.A0Z(r02), "thread_list_impression", this.A01, false);
        }
        0FI.A08(1806733080, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(29074031);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        C1t3 c1t3 = this.A08;
        if (c1t3 != null) {
            c1t3.A01(this.A0G);
        }
        this.A04 = null;
        this.A05 = null;
        0FI.A08(-500399406, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A07 = 7zS.A0j(this);
        this.A04 = (LithoView) 7zL.A0F(this, 2131364496);
        A06(this);
        FbUserSession A01 = 1BM.A01(this);
        this.A02 = A01;
        if (A01 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C1t3 c1t3 = (C1t3) 7zN.A0m(this, A01, 33086);
        this.A08 = c1t3;
        if (c1t3 != null) {
            c1t3.A00(this.A0G);
        }
        4YV.A0Z(this.A0B).flowMarkPoint(this.A01, "thread_list_impression");
    }
}
