package com.facebook.messaging.neue.nux.phoneconfirmation;

import X.0FI;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Br;
import X.1NK;
import X.4BM;
import X.6HM;
import X.7zR;
import X.AbF;
import X.AbH;
import X.AnonymousClass001;
import X.B3Z;
import X.BWd;
import X.C00i;
import X.C1F;
import X.C1rs;
import X.CHq;
import X.CZk;
import X.DKC;
import X.Erh;
import X.Ert;
import X.EwP;
import X.F9G;
import X.FAJ;
import X.FEY;
import X.FFh;
import X.Fjl;
import X.Fjx;
import X.GF9;
import X.JgM;
import X.QBR;
import X.QKf;
import X.REi;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.phoneconfirmation.protocol.ConfirmPhoneMethod$Params;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: ConfirmPhoneFragment.class */
public final class ConfirmPhoneFragment extends NuxFragment implements CallerContextable {
    public long A01;
    public InputMethodManager A02;
    public Erh A03;
    public JgM A04;
    public B3Z A05;
    public FAJ A06;
    public F9G A07;
    public RequestConfirmationCodeParams A08;
    public 4BM A09;
    public EwP A0A;
    public 6HM A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public LithoView A0H;
    public final FFh A0N = (FFh) 1Bi.A03(100123);
    public final BWd A0T = (BWd) 1Bi.A03(85285);
    public final FEY A0Q = (FEY) 1Bi.A03(85276);
    public final C00i A0R = AbH.A0c(this);
    public final C1F A0O = (C1F) 1Bi.A03(85297);
    public final C00i A0J = 1BV.A00(85243);
    public final C00i A0K = 1BQ.A02(100133);
    public final C00i A0I = AbH.A0a();
    public final C00i A0L = DKC.A0W(this, 99435);
    public int A0G = 0;
    public int A00 = 0;
    public final Ert A0S = new Ert(this);
    public final GF9 A0P = new Fjx(this, 1);
    public final REi A0M = new REi();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(ConfirmPhoneFragment confirmPhoneFragment) {
        CZk cZk = new CZk(confirmPhoneFragment, 3);
        LithoView lithoView = confirmPhoneFragment.A0H;
        QBR qbr = new QBR(lithoView.A09, new QKf());
        MigColorScheme A0p = AbF.A0p(confirmPhoneFragment.A0R);
        QKf qKf = qbr.A01;
        qKf.A06 = A0p;
        BitSet bitSet = qbr.A02;
        bitSet.set(0);
        String str = confirmPhoneFragment.A0E;
        qKf.A04 = ("messenger_android_pna".equals(str) || "messenger_android_pna_device_prefill".equals(str)) ? (CHq) confirmPhoneFragment.A0J.get() : confirmPhoneFragment.A05;
        bitSet.set(1);
        qKf.A02 = cZk;
        qKf.A05 = confirmPhoneFragment.A0S;
        qKf.A07 = confirmPhoneFragment.getString(2131962662);
        bitSet.set(2);
        qKf.A03 = confirmPhoneFragment.A0M;
        bitSet.set(3);
        qKf.A01 = confirmPhoneFragment.A01;
        qKf.A00 = 60000L;
        qKf.A09 = confirmPhoneFragment.A0F;
        String str2 = confirmPhoneFragment.A0E;
        qKf.A08 = ("messenger_android_pna".equals(str2) || "messenger_android_pna_device_prefill".equals(str2)) ? confirmPhoneFragment.getString(2131958898) : null;
        String str3 = confirmPhoneFragment.A0E;
        String str4 = null;
        if ("messenger_android_pna".equals(str3) || "messenger_android_pna_device_prefill".equals(str3)) {
            try {
                confirmPhoneFragment.getString(2131958897);
                C00i c00i = confirmPhoneFragment.A0K;
                PhoneNumberUtil phoneNumberUtil = (PhoneNumberUtil) c00i.get();
                C1F c1f = confirmPhoneFragment.A0O;
                String A00 = c1f.A00((String) null);
                11T.A0F((Object) null, 0);
                String BD0 = 1Br.A09(c1f.A00).BD0(1NK.A6B);
                if (BD0 != null) {
                    str4 = BD0;
                }
                String[] split = ((PhoneNumberUtil) c00i.get()).format(phoneNumberUtil.parse(A00, str4), PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL).split(" ")[1].split("-", 2);
                String str5 = split[0];
                Strings.repeat("*", str5 != null ? str5.length() : 0);
                String replace = split[1].replace("-", "");
                Strings.repeat("*", (replace != null ? replace.length() : 0) - 2);
                String str6 = split[1];
                str6.substring((str6 != null ? str6.length() : 0) - 2);
                Locale.getDefault();
            } catch (Exception unused) {
            }
        }
        C1rs.A02(bitSet, qbr.A03);
        qbr.A0J();
        lithoView.A0x(qKf);
    }

    public static void A06(ConfirmPhoneFragment confirmPhoneFragment, String str) {
        confirmPhoneFragment.A0C = str;
        confirmPhoneFragment.A0M.A00 = str;
        A03(confirmPhoneFragment);
        FAJ.A00(confirmPhoneFragment.A06, "confirm_phone_autofilled", (Map) null);
        confirmPhoneFragment.A0N.A02("confirm_phone", "phone_confirmation_confirm_code_autofilled");
        A07(confirmPhoneFragment, str);
        A08(confirmPhoneFragment, str);
    }

    public static void A07(ConfirmPhoneFragment confirmPhoneFragment, String str) {
        if (confirmPhoneFragment.A04.A1S()) {
            return;
        }
        JgM jgM = confirmPhoneFragment.A07.A00;
        if (jgM == null || !jgM.A1S()) {
            confirmPhoneFragment.A0G++;
            ConfirmPhoneMethod$Params confirmPhoneMethod$Params = new ConfirmPhoneMethod$Params(str);
            Bundle A05 = 1BK.A05();
            A05.putParcelable("confirm_phone_params", confirmPhoneMethod$Params);
            confirmPhoneFragment.A04.A1R(1BJ.A00(388), A05);
        }
    }

    public static void A08(ConfirmPhoneFragment confirmPhoneFragment, String str) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        HashMap A0u = AnonymousClass001.A0u();
        A0c.put("attempt_count", Integer.toString(confirmPhoneFragment.A0G));
        A0u.put("attempt_count", String.valueOf(confirmPhoneFragment.A0G));
        String str2 = confirmPhoneFragment.A0C;
        if (str2 != null) {
            boolean equal = Objects.equal(str2, str);
            A0c.put("confirm_phone_used_autofill", Boolean.toString(equal));
            A0u.put("used_autofill", String.valueOf(equal));
        }
        FAJ.A00(confirmPhoneFragment.A06, "confirm_phone_submit", A0c.build());
        confirmPhoneFragment.A0N.A03("confirm_phone", "phone_confirmation_confirm_code_ok_click", A0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(2027502466);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        A03(this);
        this.A0A.A01();
        this.A07.A01(getContext(), this, new Fjl(this, 0), 2131962651);
        0FI.A08(1364780956, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-2076396697);
        if (bundle != null) {
            this.A0F = bundle.getBoolean("hide_resend_code_button", false);
        }
        String str = null;
        this.A0H = new LithoView(getContext(), (AttributeSet) null);
        Activity A1P = A1P();
        String str2 = null;
        if (A1P != null) {
            str = A1P.getIntent().getStringExtra("source_param");
        }
        this.A0E = str;
        if (A1P != null) {
            str2 = A1P.getIntent().getStringExtra("qp_id_param");
        }
        this.A0D = str2;
        LithoView lithoView = this.A0H;
        0FI.A08(1688924152, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-2078859595);
        this.A0A.A00();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-692286543, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1704589512);
        super/*androidx.fragment.app.Fragment*/.onPause();
        FEY fey = this.A0Q;
        if (fey.A00 == this.A0P) {
            fey.A00 = null;
        }
        7zR.A12(this.mView, this.A02);
        0FI.A08(-1574321082, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("hide_resend_code_button", this.A0F);
        bundle.putLong("last_clock_time", this.A01);
        super.onSaveInstanceState(bundle);
    }
}
