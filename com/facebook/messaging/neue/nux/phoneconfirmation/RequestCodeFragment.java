package com.facebook.messaging.neue.nux.phoneconfirmation;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Hv;
import X.1JF;
import X.1NK;
import X.1Ql;
import X.7zR;
import X.AbF;
import X.AbL;
import X.Bbm;
import X.Bss;
import X.C00i;
import X.C1F;
import X.C1F6;
import X.C1sx;
import X.C8u;
import X.CxA;
import X.DKB;
import X.F9G;
import X.Fjl;
import X.REk;
import X.RG0;
import X.RP7;
import X.Rqt;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.analytics.navigation.NavigationLogs;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.google.common.collect.ImmutableMap;

/* loaded from: RequestCodeFragment.class */
public final class RequestCodeFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public LithoView A00;
    public RP7 A01;
    public Bss A02;
    public RequestConfirmationCodeParams A03;
    public String A04;
    public String A05;
    public InputMethodManager A06;
    public final C00i A07 = AbF.A0S(this, 85296);
    public final C00i A08 = 1BQ.A02(85297);
    public final C00i A0B = 1BV.A00(85021);
    public final Bbm A0A = new Bbm();
    public final REk A09 = new REk();

    public static void A03(RequestCodeFragment requestCodeFragment, RequestConfirmationCodeParams requestConfirmationCodeParams) {
        C1F c1f = (C1F) requestCodeFragment.A08.get();
        String str = requestConfirmationCodeParams.A03;
        String str2 = requestConfirmationCodeParams.A04;
        1Ql A08 = 1Br.A08(c1f.A00);
        A08.CaL(1NK.A6C, str);
        A08.CaL(1NK.A6B, str2);
        A08.commit();
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public NavigationLogs A1a() {
        this.A07.get();
        NavigationLogs A1a = super.A1a();
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.putAll(A1a.A00);
        return new NavigationLogs(A0c);
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return DKB.A00(517);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        this.A06 = (InputMethodManager) 1Hv.A02(context, 100189);
        this.A02 = (Bss) 1Bn.A0E(context, (1BY) null, 85291);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(760);
        RG0 rg0 = new RG0(this);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            RP7 rp7 = new RP7(context, this, rg0);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = rp7;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(595233479);
        String str = null;
        this.A00 = new LithoView(getContext(), (AttributeSet) null);
        Activity A1P = A1P();
        String str2 = null;
        if (A1P != null) {
            str = A1P.getIntent().getStringExtra(DKB.A00(ActionId.APP_FIRST_VIEW_CONTROLLER));
        }
        this.A05 = str;
        if (A1P != null) {
            str2 = A1P.getIntent().getStringExtra(DKB.A00(ActionId.APP_DID_BECOME_ACTIVE));
        }
        this.A04 = str2;
        LithoView lithoView = this.A00;
        0FI.A08(1916061046, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1766374803);
        super/*androidx.fragment.app.Fragment*/.onPause();
        View view = this.mView;
        if (view != null && view.getWindowToken() != null) {
            7zR.A12(this.mView, this.A06);
        }
        0FI.A08(-1616674408, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("phone_number_field_arg", this.A0A.A00);
        bundle.putString("iso_country_code", this.A09.A00);
        bundle.putParcelable("request_code_params", this.A03);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            Bbm bbm = this.A0A;
            String string = bundle.getString("phone_number_field_arg");
            if (string != null) {
                bbm.A00 = string;
            }
            REk rEk = this.A09;
            String string2 = bundle.getString("iso_country_code");
            if (string2 != null) {
                rEk.A00 = string2;
            }
            this.A03 = (RequestConfirmationCodeParams) bundle.getParcelable("request_code_params");
        }
        Bbm bbm2 = this.A0A;
        if (1JF.A0B(bbm2.A00)) {
            if (DKB.A00(27).equals(this.A05)) {
                String A02 = ((C8u) this.A0B.get()).A02();
                if (A02 == null) {
                    A02 = "";
                }
                bbm2.A00 = A02;
            }
        }
        RP7 rp7 = this.A01;
        F9G f9g = rp7.A07;
        Fragment fragment = rp7.A00;
        f9g.A01(fragment.getContext(), fragment, new Fjl(rp7, 1), 2131962650);
        this.A02.A01 = new Rqt(this);
        CxA.A00(this, (C1sx) 1Bi.A03(16837), 10);
    }
}
