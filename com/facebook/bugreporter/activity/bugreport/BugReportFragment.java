package com.facebook.bugreporter.activity.bugreport;

import X.0Dc;
import X.0FI;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Gz;
import X.1JW;
import X.1Mg;
import X.1iF;
import X.1pK;
import X.2MR;
import X.2ZM;
import X.3cK;
import X.4YT;
import X.4YU;
import X.7zK;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.8GF;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C01o;
import X.C06c;
import X.C1x1;
import X.C5fi;
import X.CZD;
import X.DKC;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DLK;
import X.DOT;
import X.ECg;
import X.EPO;
import X.EhO;
import X.Evi;
import X.ExV;
import X.FAc;
import X.FG9;
import X.FWn;
import X.FXL;
import X.FXr;
import X.FZB;
import X.FZD;
import X.FbF;
import X.Fzh;
import X.GEC;
import X.GHX;
import X.Q2J;
import X.Q4S;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.bugreporter.core.model.BugReportExtraData;
import com.facebook.bugreporter.core.model.BugReportExtraDataInternal;
import com.facebook.fbui.widget.contentview.CheckedContentView;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: BugReportFragment.class */
public final class BugReportFragment extends 1pK implements NavigableFragment {
    public ViewStub A00;
    public GHX A01;
    public ExV A02;
    public Q2J A03;
    public 1Mg A04;
    public 1Gz A05;
    public CheckedContentView A06;
    public Boolean A07;
    public String A08;
    public boolean A09;
    public EditText A0B;
    public boolean A0C;
    public boolean A0D;
    public final C00i A0P = AbH.A0D();
    public final C00i A0M = 1BQ.A00();
    public final C00i A0O = 1BQ.A02(147956);
    public final C00i A0E = 1BV.A00(147936);
    public final C00i A0H = AbF.A0S(this, 100309);
    public final C00i A0K = DKC.A0W(this, 100202);
    public final C00i A0I = 1BQ.A02(100321);
    public final C00i A0G = 1BQ.A02(114693);
    public final C00i A0J = 1BQ.A02(100325);
    public final C00i A0Q = DKC.A0W(this, 99435);
    public final C00i A0L = 1BQ.A02(84955);
    public final C00i A0N = 1BQ.A02(33215);
    public boolean A0A = false;
    public final C00i A0F = AbH.A0K();
    public final GEC A0R = new FbF(this);

    /* JADX WARN: Multi-variable type inference failed */
    private String A03() {
        if (!AnonymousClass001.A1T(getChildFragmentManager().A0b("report_description_fragment"))) {
            return AbM.A0u(this.A0B);
        }
        String str = (String) this.A03.A01.getValue();
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(Intent intent, BugReportFragment bugReportFragment) {
        if (intent == null) {
            intent = AbF.A05();
            intent.putExtra("isSendClickedFlag", true);
        }
        Context context = bugReportFragment.getContext();
        if (context != null) {
            HashMap A0u = AnonymousClass001.A0u();
            EPO epo = bugReportFragment.A02.A0B;
            if (epo != null) {
                A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, epo.name);
            }
            ((2ZM) bugReportFragment.A0N.get()).A02(context, new DLK(A0u), "2130103523956620");
        }
        GHX ghx = bugReportFragment.A01;
        if (ghx != null && !bugReportFragment.A0A) {
            ghx.Byj(intent, bugReportFragment);
        }
        bugReportFragment.A0D = true;
    }

    public static void A07(Intent intent, BugReportFragment bugReportFragment) {
        if (bugReportFragment.A02.A0B != EPO.A0K || intent == null) {
            A06(intent, bugReportFragment);
            return;
        }
        bugReportFragment.A05 = new C01o(new 3cK(bugReportFragment, intent, 3), "com.facebook.bugreporter.BUG_REPORT_UPLOAD_FINISHED_ACTION");
        IntentFilter intentFilter = new IntentFilter("com.facebook.bugreporter.BUG_REPORT_UPLOAD_FINISHED_ACTION");
        1Mg r0 = bugReportFragment.A04;
        r0.A01.A01(bugReportFragment.A05, intentFilter);
    }

    public static void A08(BugReportFragment bugReportFragment) {
        if (1BK.A0N(bugReportFragment.A0M).AZk(36314455295664090L)) {
            AbG.A0B(bugReportFragment.A0F).Ciz(new Fzh(bugReportFragment));
        }
    }

    public static void A09(BugReportFragment bugReportFragment) {
        if (bugReportFragment.A0C || TextUtils.isEmpty(bugReportFragment.A03())) {
            return;
        }
        DKF.A0G(bugReportFragment.A0I).A00(bugReportFragment.A02.A06, "bug_report_entered_description");
        bugReportFragment.A0C = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0A(BugReportFragment bugReportFragment, String str) {
        ViewStub viewStub;
        ExV exV = bugReportFragment.A02;
        if (exV != null) {
            String str2 = exV.A0P;
            int i = 0;
            if (bugReportFragment.A09 && str2.equals("113186105514995") && str.toLowerCase(Locale.ENGLISH).contains(4YT.A00(ActionId.NEW_START_FOUND))) {
                viewStub = bugReportFragment.A00;
                if (viewStub == null) {
                    ViewStub viewStub2 = (ViewStub) 7zL.A0F(bugReportFragment, 2131362392);
                    bugReportFragment.A00 = viewStub2;
                    CZD.A01(viewStub2.inflate().requireViewById(2131362694), bugReportFragment, 0);
                    return;
                }
            } else {
                viewStub = bugReportFragment.A00;
                if (viewStub == null) {
                    return;
                } else {
                    i = 8;
                }
            }
            viewStub.setVisibility(i);
        }
    }

    public 1iF A1R() {
        return DKG.A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0061, code lost:
    
        if (r308 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.activity.bugreport.BugReportFragment.A1S(android.os.Bundle):void");
    }

    @Override // com.facebook.base.fragment.NavigableFragment
    public void Crb(GHX ghx) {
        this.A01 = ghx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.facebook.fbui.widget.contentview.ContentView, com.facebook.fbui.widget.contentview.CheckedContentView, android.view.View] */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(446651617);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131362691);
        int i = 2131953568;
        if (this.A02.A0B == EPO.A0K) {
            i = 2131953563;
        }
        toolbar.A0M(i);
        toolbar.A0L(2131953545);
        FXr.A04(toolbar, this, 19);
        MenuItem add = toolbar.A0F().add(2131953572);
        add.setShowAsAction(2);
        add.setOnMenuItemClickListener(new FXL(this, 0));
        String str = this.A02.A0P;
        boolean equals = str.equals("1635942160029053");
        if (!AnonymousClass001.A1T(getChildFragmentManager().A0b("report_description_fragment"))) {
            if (this.A09) {
                this.A0B.setHint(2131953558);
            }
            this.A0B.setHintTextColor(7zM.A02(requireContext(), 2MR.A1N));
            FWn.A00(this.A0B, this, 1);
            String str2 = this.A02.A0V;
            if (str2 != null) {
                this.A0B.setText(str2);
            }
        }
        if (!this.A09 && str.equals("246145105908594")) {
            7zL.A0F(this, 2131364551).setVisibility(8);
        }
        if (equals) {
            ViewStub viewStub = (ViewStub) 7zL.A0F(this, 2131362392);
            this.A00 = viewStub;
            CZD.A01(viewStub.inflate().requireViewById(2131362694), this, 0);
        }
        if (str.equals("1858085917752599") && this.A09) {
            7zL.A0F(this, 2131366963).setVisibility(0);
        }
        if (this.A02.A0V != null) {
            this.A0C = true;
        }
        this.A06 = (CheckedContentView) 7zL.A0F(this, 2131365345);
        EhO ehO = (EhO) this.A0K.get();
        boolean isChecked = this.A06.isChecked();
        BugReportExtraDataInternal bugReportExtraDataInternal = ehO.A00.A00;
        BugReportExtraData bugReportExtraData = new BugReportExtraData(Boolean.valueOf(isChecked), bugReportExtraDataInternal.A01, bugReportExtraDataInternal.A00, bugReportExtraDataInternal.A03);
        Iterator it = ehO.A01.iterator();
        while (it.hasNext()) {
            ((GEC) it.next()).D6q(ehO.A00, bugReportExtraData);
        }
        ehO.A00 = bugReportExtraData;
        C00i c00i = this.A0M;
        boolean z = true;
        if (!1BK.A0N(c00i).AZk(36314455295795164L) && (!this.A09 || !1BK.A0N(c00i).AZk(36314455294091214L))) {
            z = false;
        }
        ?? r0 = this.A06;
        if (z) {
            FG9 fg9 = r0.A05;
            int A00 = FG9.A00(fg9);
            if (A00 == 0) {
                View view = fg9.A04;
                if (view instanceof TextView) {
                    DKF.A17(fg9.A06.getResources(), (TextView) view, 2132279323);
                }
            } else if (A00 == 1) {
                fg9.A05.A09(fg9.A06.getResources().getDimensionPixelSize(2132279323));
            }
            FXr.A03(this.A06, this, 18);
        } else {
            r0.setVisibility(8);
        }
        0FI.A08(41436403, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1478706704);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541634);
        0FI.A08(-587981450, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetach() {
        int A02 = 0FI.A02(99730041);
        ((Evi) this.A0H.get()).A00(getContext());
        super.onDetach();
        if (!this.A0D) {
            Intent A05 = AbF.A05();
            A05.putExtra("bug_desc", A03());
            A05.putParcelableArrayListExtra("bug_shots", 1JW.A02(DKH.A0f(this.A02.A0t)));
            A05.putExtra("bug_screenshots_added_counter", this.A02.A0F);
            A05.putExtra("bug_screenshots_removed_counter", this.A02.A0G);
            this.A0A = false;
            GHX ghx = this.A01;
            if (ghx != null) {
                ghx.Byj(A05, this);
            }
        }
        1Gz r0 = this.A05;
        if (r0 != null) {
            this.A04.A01(r0);
        }
        0FI.A08(776549843, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-203392790);
        super/*androidx.fragment.app.Fragment*/.onPause();
        C5fi.A00(getActivity());
        DKF.A0Q(this.A0J).A02();
        0FI.A08(1851675211, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1691536597);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A0A = false;
        DKF.A0Q(this.A0J).A03(this.A02.A0B);
        FAc A0H = DKF.A0H(this.A0G);
        ExV exV = this.A02;
        String valueOf = String.valueOf(exV.A06);
        EPO epo = exV.A0B;
        11T.A0F(epo, 1);
        4YU.A1P(7zP.A0e(A0H.A00).markEventBuilder(30539800, "bugreport_load").annotate("bug_report_id", valueOf), Property.SYMBOL_Z_ORDER_SOURCE, epo.name);
        if (!AnonymousClass001.A1T(getChildFragmentManager().A0b("report_description_fragment"))) {
            this.A0B.requestFocus();
            C5fi.A02(this.A0B);
        }
        0FI.A08(-186201882, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A02.A0V = A03();
        bundle.putParcelable("anrreport", new BugReport(this.A02));
        bundle.putString("data_use_policy_url", this.A08);
        bundle.putBoolean("is_data_use_policy_url_internal", this.A07.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(2070761655);
        super/*androidx.fragment.app.Fragment*/.onStart();
        EhO ehO = (EhO) this.A0K.get();
        GEC gec = this.A0R;
        ehO.A01.add(gec);
        BugReportExtraData bugReportExtraData = ehO.A00;
        gec.D6q(bugReportExtraData, bugReportExtraData);
        0FI.A08(275789694, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1313790785);
        super/*androidx.fragment.app.Fragment*/.onStop();
        EhO ehO = (EhO) this.A0K.get();
        ehO.A01.remove(this.A0R);
        0FI.A08(1734853853, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0B = (EditText) 7zL.A0F(this, 2131367932);
        if (this.A09) {
            7zL.A0F(this, 2131362689).setVisibility(8);
        }
        this.A03 = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) new FZD((C1x1) 1Bi.A03(66360))).get(Q2J.class);
        if (this.A09 && 1BK.A0N(this.A0M).AZk(36320940694519594L) && !AnonymousClass001.A1T(getChildFragmentManager().A0b("report_description_fragment"))) {
            C06c A09 = AbJ.A09(this);
            A09.A0Q(new 8GF(), "report_description_fragment", 2131366912);
            A09.A06();
        }
        if (AnonymousClass001.A1T(getChildFragmentManager().A0b("report_description_fragment"))) {
            this.A0B.setVisibility(8);
            FZB.A04(getViewLifecycleOwner(), this.A03.A01, this, 1);
        }
        if (1BK.A0N(this.A0M).AZk(36319351556552620L) && getChildFragmentManager().A0b("problem_tags_fragment") == null) {
            C06c A092 = AbJ.A09(this);
            A092.A0Q(new Q4S(), "problem_tags_fragment", 2131366680);
            A092.A04();
        }
        DOT dot = new DOT();
        dot.A00 = new ECg(view, this);
        Resources A0D = 7zO.A0D(this);
        0Dc A0P = 7zP.A0P(requireContext());
        A0P.A02(A0D.getString(2131953555));
        A0P.A05(dot, 7zK.A00(78), A0D.getString(2131953556), 33);
        TextView A0D2 = DKG.A0D(this, 2131362688);
        A0D2.setText(7zM.A0E(A0P));
        DKC.A1P(A0D2);
    }
}
