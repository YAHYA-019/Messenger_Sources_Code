package com.facebook.messaging.business.informationidentify.activity;

import X.06Z;
import X.07S;
import X.0Pz;
import X.0S2;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Du;
import X.1Hv;
import X.1Iw;
import X.1VX;
import X.2JX;
import X.2Jf;
import X.2K3;
import X.2KD;
import X.2MG;
import X.2RH;
import X.4YT;
import X.4YU;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zO;
import X.8kV;
import X.AbE;
import X.AbF;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AbstractC05414dq;
import X.AnonymousClass001;
import X.C00i;
import X.C06c;
import X.C1rg;
import X.C1rh;
import X.C1rq;
import X.C1rs;
import X.C1u2;
import X.C1u3;
import X.C2069Dau;
import X.C2083Db8;
import X.C26z;
import X.C2cl;
import X.C2cm;
import X.C30G;
import X.C3sa;
import X.C3sb;
import X.C4Nb;
import X.C4Nc;
import X.C5yy;
import X.C6bn;
import X.C83r;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DYx;
import X.Dsf;
import X.Eda;
import X.Edb;
import X.Eq0;
import X.F8L;
import X.F8W;
import X.FHb;
import X.FXr;
import X.FkE;
import X.FkI;
import X.JQw;
import X.Roc;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.common.calltoaction.model.CTAInformationIdentify;
import com.facebook.messaging.business.informationidentify.model.PIIQuestion;
import com.facebook.messaging.business.informationidentify.model.PIISinglePage;
import com.facebook.messaging.business.informationidentify.ui.PIICancelFormConfirmationDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.AbstractCollection;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/* loaded from: PIIActivity.class */
public class PIIActivity extends FbFragmentActivity {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InputMethodManager A04;
    public ScrollView A05;
    public 06Z A06;
    public FbUserSession A07;
    public 2JX A08;
    public LithoView A09;
    public LithoView A0A;
    public C4Nc A0B;
    public DYx A0C;
    public DYx A0D;
    public PIISinglePage A0E;
    public F8W A0F;
    public FbFrameLayout A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public HashMap A0O;
    public HashSet A0P;
    public CTAInformationIdentify A0S;
    public final C00i A0e = DKG.A0T();
    public final C00i A0Y = AbH.A0Q();
    public final C00i A0Z = 1BQ.A02(98877);
    public final C00i A0b = 7zL.A0R(this, 99428);
    public final C00i A0c = 7zL.A0R(this, 99429);
    public final C00i A0X = DKD.A0W(this);
    public final C00i A0a = 1BV.A00(99431);
    public final C00i A0W = 1BV.A00(99430);
    public final C00i A0d = AbH.A0M();
    public boolean A0R = false;
    public final HashMap A0f = AnonymousClass001.A0u();
    public final LinkedList A0g = AbF.A1F();
    public boolean A0Q = false;
    public final View.OnClickListener A0U = FXr.A02(this, 72);
    public final View.OnClickListener A0T = FXr.A02(this, 73);
    public final View.OnClickListener A0V = FXr.A02(this, 74);

    public static C5yy A12(LithoView lithoView, PIIActivity pIIActivity, boolean z) {
        C1rh c1rh;
        1Iw r0 = lithoView.A09;
        String str = pIIActivity.A0J;
        boolean z2 = true;
        if (pIIActivity.A01 < pIIActivity.A02 - 1) {
            z2 = false;
        }
        C83r A00 = C5yy.A00(r0);
        C5yy c5yy = A00.A01;
        c5yy.A0H = false;
        C00i c00i = pIIActivity.A0X;
        A00.A2Y(AbF.A0p(c00i));
        if (pIIActivity.A0Q) {
            c1rh = null;
        } else {
            C1rq A01 = C1rg.A01(r0, null, 0);
            C2cm A002 = C2cl.A00(r0);
            A002.A2X(AbF.A0p(c00i).B4h());
            A002.A2a(2132345425);
            C26z c26z = C26z.RIGHT;
            2RH r02 = 2RH.A05;
            4YU.A1O(A002, r02, c26z);
            float f = 0.0f;
            A002.A0k(0.0f);
            A002.A0J();
            A01.A2f(A002.A00);
            2KD A012 = 2K3.A01(r0, 0);
            A012.A32(false);
            A012.A2x(AbF.A0p(c00i));
            A012.A2z(str);
            C00i c00i2 = pIIActivity.A0a;
            c00i2.get();
            A012.A2h();
            A012.A2b();
            A012.A0k(0.0f);
            if (((Eq0) c00i2.get()).A01 && z) {
                f = 4YU.A00(r02);
            }
            A012.A19(f);
            7zN.A1T(A01, A012);
            A01.A2f((((Eq0) c00i2.get()).A01 && z) ? pIIActivity.A3B(r0, z2) : null);
            C6bn.A01(A01, R.dimen.mapbox_four_dp);
            c1rh = A01.A00;
        }
        A00.A2X(c1rh);
        A00.A0e();
        c5yy.A08 = 2MG.A03;
        A00.A2Z(new FkI(pIIActivity, 3));
        A00.A0w(0.0f);
        return A00.A2V();
    }

    public static void A15(PIIActivity pIIActivity) {
        if (TextUtils.isEmpty(pIIActivity.A0L)) {
            return;
        }
        String str = pIIActivity.A0L;
        String str2 = pIIActivity.A0K;
        String str3 = pIIActivity.A0H;
        int i = pIIActivity.A03;
        LinkedList linkedList = pIIActivity.A0g;
        HashMap hashMap = pIIActivity.A0f;
        Integer num = 0S2.A00;
        String A00 = FHb.A00(num, str, str2, str3, hashMap, linkedList, i);
        if (TextUtils.isEmpty(A00) || TextUtils.isEmpty(pIIActivity.A0N) || TextUtils.isEmpty(pIIActivity.A0M)) {
            return;
        }
        Bundle A05 = 1BK.A05();
        A05.putInt("form_num_screens", pIIActivity.A02);
        A05.putSerializable("user_input_data", hashMap);
        pIIActivity.A0F.A01(A05, num, A00, pIIActivity.A0N, pIIActivity.A0M, true);
    }

    public static void A16(PIIActivity pIIActivity) {
        if (pIIActivity.A0B == C4Nc.A08) {
            pIIActivity.finish();
            return;
        }
        String str = pIIActivity.A0I;
        PIICancelFormConfirmationDialogFragment pIICancelFormConfirmationDialogFragment = new PIICancelFormConfirmationDialogFragment();
        Bundle A05 = 1BK.A05();
        A05.putString(JQw.A00(239), str);
        pIICancelFormConfirmationDialogFragment.setArguments(A05);
        pIICancelFormConfirmationDialogFragment.A00 = new Eda(pIIActivity);
        pIICancelFormConfirmationDialogFragment.A0m(pIIActivity.BDe(), PIICancelFormConfirmationDialogFragment.class.getName());
    }

    public static void A1D(PIIActivity pIIActivity, Integer num) {
        if (pIIActivity.A0B != C4Nc.A08) {
            GraphQlQueryParamSet A0M = 7zL.A0M();
            4YV.A1A(4YU.A0J(GraphQlCallInput.A02, pIIActivity.A0H, "form_id"), A0M, "input");
            FbUserSession fbUserSession = pIIActivity.A07;
            fbUserSession.getClass();
            AbstractC05414dq A07 = 1VX.A07(pIIActivity, fbUserSession);
            2Jf r0 = new 2Jf(2JX.class, (Class) null, "MessengerPIIUserActionInfoQuery", (String) null, "fbandroid", 1233031474, 0, 3429170697L, 3429170697L, false, true);
            r0.A00 = A0M;
            C3sa A0L = AbK.A0L(r0);
            A0L.A0B = false;
            A0L.A03.A03 = RequestPriority.INTERACTIVE;
            4YU.A1J(A0L, 628899357744450L);
            DKF.A0h(pIIActivity.A0e).A04(new C2069Dau(num, pIIActivity, 6), A07.A03(A0L), "messenger_PII_user_action_query");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A07 = AbL.A08(this);
        C00i c00i = this.A0d;
        1BK.A0U(c00i).markerStart(508639163);
        setContentView(2132543114);
        this.A04 = (InputMethodManager) 1Hv.A02(this, 100189);
        this.A0F = (F8W) 1Bn.A0A(98737);
        Bundle A0H = 7zO.A0H(this);
        if (A0H != null) {
            this.A0K = A0H.getString("page_id");
            String string = A0H.getString("user_id");
            this.A0S = (CTAInformationIdentify) A0H.getParcelable(4YT.A00(358));
            this.A0B = C4Nb.A00(A0H.getString("cta_type"));
            if (this.A0K != null && this.A0S != null) {
                this.A06 = BDe();
                CTAInformationIdentify cTAInformationIdentify = this.A0S;
                PIISinglePage pIISinglePage = cTAInformationIdentify.A00;
                this.A0E = pIISinglePage;
                if (pIISinglePage != null) {
                    this.A01 = Integer.parseInt(cTAInformationIdentify.A02);
                    this.A02 = Integer.parseInt(cTAInformationIdentify.A04);
                    this.A0H = cTAInformationIdentify.A03;
                    this.A00 = TextUtils.isEmpty(cTAInformationIdentify.A01) ? getBaseContext().getColor(2132214411) : Color.parseColor(0Pz.A0W("#", this.A0S.A01));
                    C00i c00i2 = this.A0Z;
                    DKF.A0R(c00i2).A02 = this.A0H;
                    DKF.A0R(c00i2).A03 = this.A0K;
                    DKF.A0R(c00i2).A06 = string;
                    MigColorScheme.A00(A2c(2131366473), AbF.A0p(this.A0X));
                    this.A0J = this.A0E.A01;
                    this.A0R = false;
                    A3C();
                    this.A05 = (ScrollView) A2c(2131366519);
                    this.A09 = (LithoView) A2c(2131365947);
                    this.A0G = (FbFrameLayout) A2c(2131365286);
                    LithoView lithoView = this.A09;
                    lithoView.A0x(A12(lithoView, this, true));
                    this.A0A = (LithoView) A2c(2131367709);
                    if (((Eq0) this.A0a.get()).A01) {
                        this.A0A.setVisibility(8);
                    }
                    this.A0F.A01 = new Edb(this);
                    A1D(this, 0S2.A01);
                    return;
                }
            }
        }
        4YV.A1E(c00i, 508639163, (short) 433);
    }

    public 8kV A3B(1Iw r302, boolean z) {
        int i;
        Dsf dsf = new Dsf(r302, new 8kV());
        int i2 = this.A0R ? this.A00 : 2132213808;
        8kV r0 = dsf.A01;
        r0.A00 = i2;
        BitSet bitSet = dsf.A02;
        bitSet.set(0);
        r0.A03 = AbF.A0p(this.A0X);
        bitSet.set(1);
        r0.A01 = z ? ((C1u2) this.A0Y.get()).A03(C1u3.A48) : 0;
        if (this.A0Q) {
            i = 2131963309;
        } else {
            i = 2131963307;
            if (z) {
                i = 2131963313;
            }
        }
        r0.A04 = r302.A0D(i);
        bitSet.set(2);
        r0.A02 = new FkE(this, 1);
        C1rs.A03(bitSet, dsf.A03);
        dsf.A0J();
        return r0;
    }

    public void A3C() {
        C30G A0H = AbF.A0H(34);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A0H, "form_id");
        A0H.A03("page_id", this.A0K);
        A0H.A06(AbE.A00(677), 100);
        A0H.A06(AbE.A00(678), 100);
        4YV.A1A(A0J, ((2Jf) A0H).A00, "input");
        F8L.A00(this.A0Z, A0H).A01("pii_initial_query_start", null);
        FbUserSession fbUserSession = this.A07;
        fbUserSession.getClass();
        AbstractC05414dq A07 = 1VX.A07(this, fbUserSession);
        C3sa A0L = AbK.A0L(A0H);
        A0L.A0B = false;
        A0L.A03.A03 = RequestPriority.INTERACTIVE;
        4YU.A1J(A0L, 628899357744450L);
        DKF.A0h(this.A0e).A04(C2083Db8.A00(this, 2), A07.A03(A0L), "messenger_PII_business_profile_query");
    }

    public void A3D() {
        Roc roc = new Roc();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A0H, "form_id");
        07S.A00(A0J, Integer.valueOf(this.A01), "screen_index");
        4YV.A1A(A0J, roc.A01, "input");
        roc.A02 = true;
        F8L.A00(this.A0Z, roc).A01("pii_single_page_query_start", null);
        FbUserSession fbUserSession = this.A07;
        fbUserSession.getClass();
        AbstractC05414dq A07 = 1VX.A07(this, fbUserSession);
        C3sa c3sa = (C3sa) roc.ACe();
        ((C3sb) c3sa).A03 = 0L;
        c3sa.A0B = false;
        c3sa.A03.A03 = RequestPriority.INTERACTIVE;
        4YU.A1J(c3sa, 628899357744450L);
        DKF.A0h(this.A0e).A04(C2083Db8.A00(this, 1), A07.A03(c3sa), "messenger_PII_form_query");
    }

    public void A3E(View.OnClickListener onClickListener, String str, String str2) {
        View findViewById = findViewById(2131366474);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            TextView A0D = DKF.A0D(this, 2131366476);
            A0D.setText(str);
            DKH.A1B(A0D, this.A0X);
            A0D.setVisibility(0);
            TextView A0D2 = DKF.A0D(this, 2131366475);
            if (TextUtils.isEmpty(str2)) {
                A0D2.setVisibility(8);
                return;
            }
            A0D2.setText(str2);
            A0D2.setVisibility(0);
            if (onClickListener != null) {
                A0D2.setOnClickListener(onClickListener);
            }
        }
    }

    public void A3F(ImmutableList immutableList) {
        LinkedList linkedList;
        int i;
        while (true) {
            linkedList = this.A0g;
            int size = linkedList.size();
            i = this.A01;
            if (size > i) {
                break;
            } else {
                linkedList.add(AbF.A1F());
            }
        }
        AbstractCollection abstractCollection = (AbstractCollection) linkedList.get(i);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(((PIIQuestion) it.next()).A02);
        }
    }

    public void A3G(boolean z) {
        this.A0C = this.A06.A0b(String.valueOf(this.A01));
        boolean z2 = true;
        int i = this.A01;
        int i2 = i - 1;
        if (z) {
            i2 = i + 1;
        }
        this.A01 = i2;
        DYx A0b = this.A06.A0b(String.valueOf(i2));
        this.A0D = A0b;
        if (A0b == null) {
            A3D();
            return;
        }
        C06c A0G = 7zL.A0G(this.A06);
        A0G.A0H(this.A0C);
        A0G.A0K(this.A0D);
        A0G.A04();
        this.A0C = this.A0D;
        LithoView lithoView = this.A0A;
        1Iw r0 = lithoView.A09;
        if (this.A01 < this.A02 - 1) {
            z2 = false;
        }
        lithoView.A0x(A3B(r0, z2));
        HashSet hashSet = this.A0P;
        if (hashSet == null || !1BL.A1Z(hashSet, this.A01)) {
            return;
        }
        this.A0C.A1X(this.A0O);
        DKF.A1Y(this.A0P, this.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A01 > 0) {
            A3G(false);
        } else {
            A16(this);
        }
    }
}
