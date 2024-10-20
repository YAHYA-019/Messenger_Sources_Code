package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.smartcapture.logging.SmartCaptureQpl;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: E1T.class */
public final class E1T extends E1z {
    public static final String __redex_internal_original_name = "FxCalDetailsSettingsFragment";
    public Bundle A00;
    public FbUserSession A01;
    public 2JX A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C00i A0M = 1Bn.A08(this, FHQ.class);
    public final C00i A0H = 1Bn.A08(this, Ewx.class);
    public final 1Oe A0L = (1Oe) 1Bi.A05(1Oe.class, (Class) null);
    public final C00i A0G = 1Bn.A09(FGd.class, (Class) null);
    public final C00i A0E = 1Bn.A09(F9e.class, (Class) null);
    public final C00i A0I = 1Bn.A08(this, FIu.class);
    public final C00i A0J = 1Bn.A09(C1i.class, (Class) null);
    public final C00i A0D = 1Bn.A09(EwN.class, (Class) null);
    public final C00i A0F = 1Bn.A08(this, Euc.class);
    public final C5xv A0K = new FkI(this, 13);
    public final DialogInterface.OnClickListener A0C = FK6.A00(this, 24);

    public static Integer A03(2JX r301) {
        2JX A01 = FJ2.A01(r301);
        if (A01 != null) {
            if (A01.A0Y(2JX.class, "FXCALSettingsGroupBasedService", 211318907, 1171239528) != null) {
                return 0S2.A00;
            }
            if (A01.A1A() != null) {
                return 0S2.A0C;
            }
        }
        return 0S2.A0N;
    }

    public static String A06(E1T e1t) {
        1Oe r0 = e1t.A0L;
        C1fe c1fe = C1fe.A2S;
        return r0.A04(c1fe) != null ? r0.A04(c1fe) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(2JX r301, E1T e1t) {
        EwN A0a;
        Context context;
        MigColorScheme migColorScheme;
        DialogInterface.OnClickListener onClickListener;
        String str;
        2JY A0B;
        2JY A0B2;
        if (1JF.A0B(e1t.A05)) {
            0fH.A0k(__redex_internal_original_name, "Error invalid id upon launching the flow");
            A0a = DKG.A0a(e1t);
            context = e1t.getContext();
            migColorScheme = ((BJB) e1t).A01;
            onClickListener = e1t.A0C;
            str = "Error invalid id upon launching reauth flow";
        } else {
            if (!FJ2.A08(r301)) {
                C00i c00i = e1t.A0M;
                FHQ fhq = (FHQ) c00i.get();
                67T r0 = 67T.A04;
                String str2 = e1t.A05;
                11T.A0F(str2, 2);
                2Jd A00 = F8B.A00((F8B) 1Br.A0B(fhq.A04), str2, r0);
                FGd fGd = (FGd) e1t.A0G.get();
                String str3 = e1t.A05;
                11T.A0F(str3, 0);
                FGd.A01(EQr.A05, fGd, str3);
                e1t.A0B = true;
                FHQ fhq2 = (FHQ) c00i.get();
                FbUserSession fbUserSession = e1t.A01;
                fbUserSession.getClass();
                fhq2.A09(fbUserSession, A00, (2Jd) null, FwJ.A00(e1t.getContext(), e1t, 15), "MESSENGER_SETTINGS", e1t.A05);
                return;
            }
            2JY A0B3 = 1BK.A0B(r301, 2JX.class, 990651814, 176700151);
            if (A0B3 != null && (A0B = 1BK.A0B(A0B3, 2JX.class, -719011917, 713814227)) != null && (A0B2 = 1BK.A0B(A0B3, 2JX.class, -1102944367, -1508161795)) != null && !1JF.A0B(A0B2.A0o()) && !1JF.A0B(A0B2.A0h()) && !1JF.A0B(A0B2.A0r(-1126520037)) && !1JF.A0B(A0B2.A0r(1864641493))) {
                1Iw A0P = AbI.A0P(e1t);
                Euc euc = (Euc) e1t.A0F.get();
                MigColorScheme migColorScheme2 = ((BJB) e1t).A01;
                Context context2 = e1t.getContext();
                2JY A0B4 = 1BK.A0B(A0B3, 2JX.class, -1102944367, -1508161795);
                euc.A00(context2, e1t, A0P, migColorScheme2, A0B4.A0o(), A0B4.A0h(), A0B4.A0r(-1126520037), A0B4.A0r(1864641493), A0B.A0m(), A0B.A0r(1609824068), A0B.A0r(363335049), e1t.A05);
                return;
            }
            A0a = DKG.A0a(e1t);
            context = e1t.getContext();
            migColorScheme = ((BJB) e1t).A01;
            onClickListener = e1t.A0C;
            str = "direct web reauth data not intact in launchReauthFlowFromSettings";
        }
        A0a.A01(context, onClickListener, migColorScheme, str, false);
    }

    public static void A08(2JX r301, E1T e1t, String str, boolean z) {
        e1t.A1e();
        ImmutableList A28 = AbG.A0E(r301.A1U().A2C(), 0).A28();
        Ewx ewx = (Ewx) e1t.A0H.get();
        FbUserSession fbUserSession = e1t.A01;
        fbUserSession.getClass();
        boolean z2 = e1t.A08;
        String A06 = A06(e1t);
        FwG fwG = new FwG(e1t, r301, str, 2);
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        ArrayList A0t = AnonymousClass001.A0t(A28.size());
        1Du it = A28.iterator();
        while (it.hasNext()) {
            2JX A0D = AbG.A0D(it);
            2Jd A0Q = DKC.A0Q();
            A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID, RhP.A03(A0D));
            A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, RhP.A00(A0D));
            A0t.add(A0Q);
        }
        graphQlCallInput.A09("fdid", A06);
        graphQlCallInput.A06("enabled", Boolean.valueOf(z2));
        graphQlCallInput.A09("service_id", str);
        graphQlCallInput.A0A("accounts", A0t);
        graphQlCallInput.A06("skip_custom_action", Boolean.valueOf(z));
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(graphQlCallInput, "input");
        5Dh A00 = 5Dh.A00(A0M, new C01643sd(Dmz.class, "FxCalSettingsChangeServiceMutation", null, "input", "fbandroid", 427657710, 96, 1049315858L, 1049315858L, false, true));
        AbstractC05414dq A07 = 1VX.A07(ewx.A00, fbUserSession);
        4YU.A1J(A00, 1076419692814423L);
        ListenableFuture A04 = A07.A04(A00, 5Dj.A02);
        DKF.A0h(ewx.A01).A04(new C2069Dau(fwG, ewx, 8), A04, 0Pz.A0W("update_settings_status_", str));
    }

    public static void A09(E1T e1t) {
        e1t.A1e();
        Ewx ewx = (Ewx) e1t.A0H.get();
        e1t.A01.getClass();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        Preconditions.checkArgument(DKE.A1W(A0M, "selected_service", e1t.A07));
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FxCalSettingsDetailsQuery", (String) null, "fbandroid", -257849949, 0, 2420580302L, 2420580302L, false, true);
        r0.A00 = A0M;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        ewx.A01(C2083Db8.A00(e1t, 8), A0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0A(E1T e1t, String str, String str2, boolean z) {
        Ewx ewx;
        FwK A01;
        ListenableFuture A04;
        5iG A0h;
        String A0W;
        int i;
        EwN A0a;
        Context context;
        MigColorScheme migColorScheme;
        boolean z2;
        DialogInterface.OnClickListener onClickListener;
        String str3;
        e1t.A08 = z;
        e1t.A06 = str;
        e1t.A04 = str2;
        if (e1t.A02 != null) {
            GraphQLStringDefUtil A00 = GraphQLStringDefUtil.A00();
            String str4 = e1t.A07;
            if (str4 == null) {
                str4 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
            }
            String ATw = A00.ATw("GraphQLFXSettingsServiceIdentifier", str4);
            int intValue = A03(e1t.A02).intValue();
            if (intValue == 0) {
                A08(e1t.A02, e1t, ATw, false);
                return;
            }
            if (intValue == 1) {
                e1t.A1e();
                ewx = (Ewx) e1t.A0H.get();
                FbUserSession fbUserSession = e1t.A01;
                fbUserSession.getClass();
                String str5 = e1t.A06;
                String A06 = A06(e1t);
                A01 = FwK.A01(e1t, 1);
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, A06, "fdid");
                07S.A00(A0J, str5, "radio_choice_name");
                GraphQlQueryParamSet A0N = 4YU.A0N(A0J, ATw, "service_id");
                4YV.A1A(A0J, A0N, "input");
                5Dh A002 = 5Dh.A00(A0N, new C01643sd(Q7x.class, "FxCalSettingsChangeServiceRadioChoiceMutation", null, "input", "fbandroid", -935687766, 96, 177269803L, 177269803L, false, true));
                AbstractC05414dq A07 = 1VX.A07(ewx.A00, fbUserSession);
                4YU.A1J(A002, 1076419692814423L);
                A04 = A07.A04(A002, 5Dj.A02);
                A0h = DKF.A0h(ewx.A01);
                A0W = 0Pz.A0W("update_radio_choice_settings_status_", ATw);
                i = 9;
            } else {
                if (intValue != 2) {
                    A09(e1t);
                    return;
                }
                if (e1t.A04 == null) {
                    A0a = DKG.A0a(e1t);
                    context = e1t.getContext();
                    migColorScheme = ((BJB) e1t).A01;
                    z2 = true;
                    onClickListener = e1t.A0C;
                    str3 = "mMedium unexpectedly null";
                } else {
                    2JX r0 = e1t.A02;
                    e1t.A1e();
                    2JX A02 = FJ2.A02((2JX) 1BK.A0r(r0.A1U().A2C()), e1t.A03);
                    ewx = (Ewx) e1t.A0H.get();
                    FbUserSession fbUserSession2 = e1t.A01;
                    fbUserSession2.getClass();
                    String str6 = e1t.A04;
                    if (str6 == null) {
                        str6 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    }
                    String A062 = A06(e1t);
                    boolean z3 = e1t.A08;
                    A01 = FwK.A01(e1t, 4);
                    C03z c03z = GraphQlCallInput.A02;
                    String A022 = RhP.A02(A02);
                    2Jd A0Q = DKC.A0Q();
                    A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID, RhP.A04(A02));
                    A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A022);
                    07S A0J2 = 4YU.A0J(c03z, A062, "fdid");
                    07S.A00(A0J2, Boolean.valueOf(z3), "enabled");
                    07S.A00(A0J2, str6, SmartCaptureQpl.ANNOTATION_KEY_MEDIUM);
                    DKF.A1L(A0J2, A0Q, "target_account");
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    4YV.A1A(A0J2, A0M, "input");
                    5Dh A003 = 5Dh.A00(A0M, new C01643sd(Q7w.class, "FxCalSettingsAutoPostingMutation", null, "input", "fbandroid", 1719588919, 96, 297359661L, 297359661L, false, true));
                    AbstractC05414dq A072 = 1VX.A07(ewx.A00, fbUserSession2);
                    4YU.A1J(A003, 1076419692814423L);
                    A04 = A072.A04(A003, 5Dj.A02);
                    A0h = DKF.A0h(ewx.A01);
                    A0W = 0Pz.A0v("update_xpost_auto_share_status_", A022, "_", str6);
                    i = 10;
                }
            }
            A0h.A04(new C2069Dau(A01, ewx, i), A04, A0W);
            return;
        }
        A0a = DKG.A0a(e1t);
        context = e1t.getContext();
        migColorScheme = ((BJB) e1t).A01;
        z2 = true;
        onClickListener = e1t.A0C;
        str3 = "mData unexpectedly null";
        A0a.A01(context, onClickListener, migColorScheme, str3, z2);
    }

    public static void A0B(E1T e1t, boolean z) {
        EQr eQr;
        EQr eQr2;
        boolean z2 = e1t.A0B;
        FGd fGd = (FGd) e1t.A0G.get();
        String str = e1t.A05;
        if (!z2) {
            if (z) {
                11T.A0F(str, 0);
                eQr = EQr.A0B;
            } else {
                11T.A0F(str, 0);
                eQr = EQr.A0A;
            }
            FGd.A01(eQr, fGd, str);
            return;
        }
        if (z) {
            11T.A0F(str, 0);
            eQr2 = EQr.A04;
        } else {
            11T.A0F(str, 0);
            eQr2 = EQr.A03;
        }
        FGd.A01(eQr2, fGd, str);
        e1t.A0B = false;
    }

    public 1iF A1R() {
        return AbF.A0C(1076419692814423L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = ((1Fv) 1Bi.A04(1Fv.class)).A06(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        1LI A09;
        1LI r314;
        Dst dst;
        2JX A1U;
        ImmutableList A2C;
        2JX A0L;
        int i;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null || this.A02 == null) {
            return;
        }
        A1b();
        1Iw A0P = AbI.A0P(this);
        int i2 = 0;
        FkE fkE = AnonymousClass553.A01;
        2JX r0 = this.A02;
        String str = "";
        if (r0 != null && (A1U = r0.A1U()) != null && (A2C = A1U.A2C()) != null && A2C.size() == 1 && A2C.get(0) != null && AbF.A0M(A2C, 0).A0j() != null) {
            2JX A0E = AbG.A0E(A2C, 0);
            if (this.A03 != null) {
                1Du it = A0E.A28().iterator();
                while (it.hasNext()) {
                    2JX A0D = AbG.A0D(it);
                    String str2 = this.A03;
                    2JX A10 = A0D.A1V().A10();
                    String A2L = A10.A2L();
                    if (str2.equals(A2L)) {
                        if ("INSTAGRAM".equals(A2L)) {
                            A0L = 1BL.A0L(A10.A1E(), 1738742348, 942865504);
                            i = -265713450;
                        } else if ("FACEBOOK".equals(A2L)) {
                            A0L = 1BL.A0L(A10.A1B(), -1066914450, -1429958140);
                            i = 3373707;
                        } else {
                            str = null;
                        }
                        str = A0L.A0r(i);
                    }
                }
            }
            str = A0E.A0j();
        }
        C5xv c5xv = this.A0K;
        11T.A0F(c5xv, 0);
        Bundle bundle = this.A00;
        if (bundle != null && bundle.getBoolean("should_show_done_button")) {
            i2 = 2131957315;
            fkE = new FkE(this, 6);
        }
        By5 by5 = new By5(null, fkE, c5xv, str, null, 0, i2, false, true);
        if (A03(this.A02) == 0S2.A0C) {
            Dss dss = new Dss(A0P, new Dwt());
            FbUserSession fbUserSession = this.A01;
            fbUserSession.getClass();
            Dwt dwt = dss.A01;
            dwt.A00 = fbUserSession;
            BitSet bitSet = dss.A02;
            bitSet.set(3);
            dwt.A03 = ((BJB) this).A01;
            bitSet.set(1);
            dwt.A01 = this.A02;
            bitSet.set(2);
            dwt.A04 = this.A03;
            bitSet.set(0);
            dwt.A02 = new Edv(this);
            bitSet.set(4);
            dss.A2K("service_screen_CROSS_POSTING");
            C1rs.A04(bitSet, dss.A03);
            dst = dss;
            r314 = dwt;
        } else {
            Integer A03 = A03(this.A02);
            if (A03 != 0S2.A00 && A03 != 0S2.A01) {
                A09 = ((C1i) this.A0J.get()).A00(A0P, ((BJB) this).A01).A09();
                BJB.A0I(A09, A0P, lithoView, this, by5);
            }
            Dst dst2 = new Dst(A0P, new Dyb());
            FbUserSession fbUserSession2 = this.A01;
            fbUserSession2.getClass();
            Dyb dyb = dst2.A01;
            dyb.A00 = fbUserSession2;
            BitSet bitSet2 = dst2.A02;
            bitSet2.set(2);
            dyb.A01 = this.A02;
            bitSet2.set(1);
            dyb.A03 = ((BJB) this).A01;
            bitSet2.set(0);
            dyb.A02 = new EiP(A0P, this);
            bitSet2.set(3);
            dst2.A2K("service_screen_SINGLE_SIGN_ON");
            C1rs.A02(bitSet2, dst2.A03);
            dst = dst2;
            r314 = dyb;
        }
        dst.A0J();
        A09 = r314;
        BJB.A0I(A09, A0P, lithoView, this, by5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder A0k;
        super/*X.DZJ*/.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1524) {
            ((FHQ) this.A0M.get()).A08(intent, this.A05, i2, true);
        }
        if (i2 == -1) {
            if (i != 1524) {
                A0k = AnonymousClass001.A0k();
                A0k.append("Invalid web reauth request code ");
                A0k.append(i);
                A0k.append(" in activity result");
            } else {
                if (intent != null && intent.getStringExtra("KEY_URL") != null) {
                    0fH.A0l(__redex_internal_original_name, "Verifying webreauth in onActivityResult");
                    C00i c00i = this.A0M;
                    2Jd A0M = DZJ.A0M(intent, c00i);
                    FHQ fhq = (FHQ) c00i.get();
                    FbUserSession fbUserSession = this.A01;
                    fbUserSession.getClass();
                    fhq.A09(fbUserSession, (2Jd) null, A0M, FwJ.A00(getContext(), this, 15), "MESSENGER_SETTINGS", this.A05);
                    return;
                }
                A0k = AnonymousClass001.A0k();
                A0k.append("Invalid data in activity result data null=");
                if (intent != null) {
                    z = false;
                }
                A0k.append(z);
            }
            String obj = A0k.toString();
            0fH.A0k(__redex_internal_original_name, obj);
            DKG.A0a(this).A01(getContext(), this.A0C, ((BJB) this).A01, obj, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.E1z
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1382751118);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A07 = bundle2.getString("details");
            this.A03 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
            String string = this.mArguments.getString("account_type");
            if (string != null) {
                this.A03 = GraphQLStringDefUtil.A00().ATw("GraphQLMAEntAccountType", string);
            }
            this.mArguments.getString("product_type");
            this.mArguments.getString("session_id");
            this.A00 = this.mArguments.getBundle("extra_data");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        0FI.A08(1166926180, A02);
        return onCreateView;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-851568805);
        DKG.A1N(((Ewx) this.A0H.get()).A01);
        super/*X.DZJ*/.onDestroyView();
        0FI.A08(274682100, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1059203885);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A09 = false;
        0FI.A08(652786079, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1743776252);
        super/*androidx.fragment.app.Fragment*/.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getIntent() != null) {
            this.A00 = activity.getIntent().getBundleExtra("extra_data");
        }
        this.A09 = true;
        A09(this);
        0FI.A08(-1008370416, A02);
    }
}
