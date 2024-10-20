package com.facebook.zero.service;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1I0;
import X.1Kd;
import X.1Vd;
import X.1vL;
import X.1vQ;
import X.2BQ;
import X.2JX;
import X.2Jf;
import X.4YU;
import X.C00i;
import X.C15h;
import X.C3sa;
import X.C3t8;
import X.DKN;
import X.Ejo;
import X.EoD;
import X.EoE;
import X.Ev1;
import X.Ezh;
import X.F3V;
import X.Fvu;
import X.G7G;
import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: ZeroInterstitialEligibilityManager.class */
public final class ZeroInterstitialEligibilityManager implements 1vQ {
    public ListenableFuture A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C15h A0C;
    public final C15h A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public static final String A0N = 0Pz.A0W("ZeroInterstitialEligibilityManager", ".ZeroOptin");
    public static final C00i A0M = new 1BQ(16385);

    public ZeroInterstitialEligibilityManager() {
        this.A03 = new 1BQ(16511);
        this.A0K = new 1BV(32811);
        this.A0H = new 1BQ(16931);
        this.A0E = new 1BQ(16616);
        this.A04 = new 1BQ(33013);
        this.A0A = new 1BQ(16964);
        this.A0D = new G7G(this, 22);
        this.A0G = new 1BQ(16456);
        this.A08 = new 1BQ(84011);
        this.A02 = FbInjector.A00;
        this.A05 = new 1BQ(16923);
        this.A07 = new 1BQ(98468);
        this.A0F = new 1BQ(98465);
        this.A01 = new 1BQ(99390);
        this.A06 = new 1BV(33101);
        this.A0J = new 1BQ(98452);
        this.A0L = new 1BQ(98317);
        this.A0I = new 1BQ(98451);
        this.A0B = new 1BQ(16966);
        this.A09 = new 1BQ(147843);
        this.A0C = new G7G(this, 23);
    }

    public ZeroInterstitialEligibilityManager(int i) {
    }

    public static void A00(GraphQlQueryParamSet graphQlQueryParamSet, 2Jf r302) {
        r302.A00 = graphQlQueryParamSet;
        1I0 r0 = new 1I0(4);
        r0.A05(-338181066);
        r0.A05(1735518709);
        r0.A05(109250890);
        r0.A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x03a4, code lost:
    
        if (r318 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x02b9, code lost:
    
        if (r0 != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.zero.service.ZeroInterstitialEligibilityManager r301, java.lang.String r302, java.lang.String r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.service.ZeroInterstitialEligibilityManager.A01(com.facebook.zero.service.ZeroInterstitialEligibilityManager, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A02(Context context, Long l, String str) {
        synchronized (this) {
            C00i c00i = this.A0A;
            if (((2BQ) c00i.get()).A05("dialtone_optin") ? 1BL.A1a(this.A0D) : ((2BQ) c00i.get()).A05("optin_group_interstitial")) {
                0fH.A0j(A0N, "refreshZeroInterstitialEligibility: optin eligible");
                A03(context, str, false);
            } else {
                if (((2BQ) c00i.get()).A05("autoflex_jumpstart_nux")) {
                    0fH.A0j(A0N, "refreshZeroInterstitialEligibility: jumpstart nux eligible");
                    EoE eoE = (EoE) this.A0J.get();
                    Context A00 = FbInjector.A00();
                    if (!eoE.A00.getAndSet(true)) {
                        1Fw.A04((1EZ) 1Bn.A0E(A00, (1BY) null, 16428));
                        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                        graphQlQueryParamSet.A01(((C3t8) eoE.A03.get()).A00(), "nt_context");
                        2Jf r0 = new 2Jf(2JX.class, (Class) null, "ZeroJumpstartNuxIntentQuery", (String) null, "fbandroid", -1793549142, 0, 692383488L, 692383488L, false, true);
                        A00(graphQlQueryParamSet, r0);
                        C3sa A002 = C3sa.A00(r0);
                        1Vd A003 = ((DKN) 1Bn.A0A(68643)).A00();
                        4YU.A1J(A002, 453586272481763L);
                        1Kd.A0D(eoE.A01, new Fvu(A00, eoE, 6), A003.A09(A002));
                    }
                } else {
                    if (((2BQ) c00i.get()).A04("zorp_res_user")) {
                        1BK.A0N(A0M).Ba9(36310675733808020L);
                    }
                    if (((2BQ) c00i.get()).A05("flex_to_olympus_transition_nux") || ((2BQ) c00i.get()).A05("autoflex_to_olympus_transition_nux") || ((2BQ) c00i.get()).A05("transition_out_from_olympus_nux_to_flex") || ((2BQ) c00i.get()).A05("transition_out_from_olympus_nux_to_auto_flex") || ((2BQ) c00i.get()).A05("zorp_to_new_res_transition") || ((2BQ) c00i.get()).A05("new_res_to_zorp_transition") || ((2BQ) c00i.get()).A05("show_transition_screen") || ((2BQ) c00i.get()).A05("transition_to_zorp_flex_nux") || ((2BQ) c00i.get()).A05("zorp_flex_to_flex_transition_nux")) {
                        Ejo A004 = F3V.A00("flex_to_olympus_transition_nux", 238950006);
                        0fH.A0j(A0N, "refreshZeroInterstitialEligibility: transition nux eligible");
                        ((Ezh) this.A0F.get()).A01("flex_to_freemium_transition", l);
                        ((Ev1) this.A0L.get()).A00(FbInjector.A00(), A004, "flex_to_olympus_transition_nux");
                    } else if (((2BQ) c00i.get()).A05("flex_optout_nux")) {
                        0fH.A0j(A0N, "refreshZeroInterstitialEligibility: flex optput nux eligible");
                        EoD eoD = (EoD) this.A0I.get();
                        Context A005 = FbInjector.A00();
                        if (!((1vL) eoD.A01.get()).A0S() && !eoD.A00.getAndSet(true)) {
                            1Fw.A04((1EZ) 1Bn.A0E(A005, (1BY) null, 16428));
                            GraphQlQueryParamSet graphQlQueryParamSet2 = new GraphQlQueryParamSet();
                            graphQlQueryParamSet2.A05("feature", "flex_optout_nux");
                            graphQlQueryParamSet2.A01(((C3t8) eoD.A03.get()).A00(), "nt_context");
                            2Jf r02 = new 2Jf(2JX.class, (Class) null, "FetchZeroFlexOptoutNuxQuery", (String) null, "fbandroid", -1817361256, 0, 2515122402L, 2515122402L, false, true);
                            A00(graphQlQueryParamSet2, r02);
                            C3sa A006 = C3sa.A00(r02);
                            1Vd A007 = ((DKN) 1Bn.A0E(A005, (1BY) null, 68643)).A00();
                            4YU.A1J(A006, 453586272481763L);
                            1Kd.A0F(new Fvu(A005, eoD, 5), A007.A09(A006), (Executor) 1Bi.A03(16467));
                        }
                    }
                }
                0fH.A0j(A0N, "refreshZeroInterstitialEligibility: no eligibility");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(android.content.Context r302, java.lang.String r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.service.ZeroInterstitialEligibilityManager.A03(android.content.Context, java.lang.String, boolean):void");
    }

    public void onAfterDialtoneStateChanged(boolean z, Context context) {
        A02(context, null, "dialtone_state_changed");
    }

    public void onBeforeDialtoneStateChanged(boolean z) {
    }
}
