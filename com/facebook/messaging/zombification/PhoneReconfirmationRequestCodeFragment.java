package com.facebook.messaging.zombification;

import X.0FI;
import X.1Bi;
import X.1Bn;
import X.1JF;
import X.1Rv;
import X.1lN;
import X.4BM;
import X.7zO;
import X.7zR;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbM;
import X.AbR;
import X.C00i;
import X.C1fe;
import X.C2134Den;
import X.DKC;
import X.F9G;
import X.FAE;
import X.FWp;
import X.Fjl;
import X.JgM;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.facebook.phonenumbers.AsYouTypeFormatter;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* loaded from: PhoneReconfirmationRequestCodeFragment.class */
public final class PhoneReconfirmationRequestCodeFragment extends AbstractNavigableFragment implements 1lN {
    public InputMethodManager A00;
    public Button A01;
    public EditText A02;
    public EditText A03;
    public AbR A04;
    public F9G A05;
    public 4BM A06;
    public FAE A07;
    public PhoneNumberUtil A08;
    public C2134Den A09;
    public String A0A;
    public String A0B;
    public boolean A0G;
    public TextView A0H;
    public FWp A0I;
    public 1Rv A0J;
    public final C00i A0K = AbH.A0c(this);
    public boolean A0C = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0D = false;

    public static void A03(PhoneReconfirmationRequestCodeFragment phoneReconfirmationRequestCodeFragment) {
        phoneReconfirmationRequestCodeFragment.A07.A03("phone_reconfirmation_request_code_screen", "phone_reconfirmation_request_code_continue_button_click_event");
        String A0u = AbM.A0u(phoneReconfirmationRequestCodeFragment.A03);
        String str = phoneReconfirmationRequestCodeFragment.A0A;
        JgM jgM = phoneReconfirmationRequestCodeFragment.A05.A00;
        if (jgM == null || !jgM.A1S()) {
            phoneReconfirmationRequestCodeFragment.A07.A03("phone_reconfirmation_request_code_screen", "phone_reconfirmation_request_code_submit");
            phoneReconfirmationRequestCodeFragment.A05.A02(new RequestConfirmationCodeParams(null, str, "", A0u, phoneReconfirmationRequestCodeFragment.A06.A00.A04(C1fe.A2U), "", null, 1, true, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.FWp, java.lang.Object, android.text.TextWatcher] */
    public static void A06(PhoneReconfirmationRequestCodeFragment phoneReconfirmationRequestCodeFragment, String str, String str2) {
        phoneReconfirmationRequestCodeFragment.A0A = str;
        if (str == null || phoneReconfirmationRequestCodeFragment.getContext() == null) {
            return;
        }
        phoneReconfirmationRequestCodeFragment.A03.removeTextChangedListener(phoneReconfirmationRequestCodeFragment.A0I);
        String str3 = phoneReconfirmationRequestCodeFragment.A0A;
        Context applicationContext = phoneReconfirmationRequestCodeFragment.getContext().getApplicationContext();
        ?? obj = new Object();
        ((FWp) obj).A01 = false;
        if (str3 == null) {
            throw new IllegalArgumentException();
        }
        ((FWp) obj).A00 = new AsYouTypeFormatter(str3, PhoneNumberUtil.getInstance(applicationContext));
        phoneReconfirmationRequestCodeFragment.A0I = obj;
        phoneReconfirmationRequestCodeFragment.A03.addTextChangedListener(obj);
        if (!1JF.A0B(phoneReconfirmationRequestCodeFragment.A03.getText())) {
            EditText editText = phoneReconfirmationRequestCodeFragment.A03;
            editText.setText(editText.getText());
        }
        phoneReconfirmationRequestCodeFragment.A02.setText(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = DKC.A0U(719);
        this.A08 = (PhoneNumberUtil) 1Bi.A03(100133);
        this.A07 = (FAE) 1Bn.A0A(100132);
        this.A05 = (F9G) 7zO.A0l(this, 100135);
        this.A00 = (InputMethodManager) 7zO.A0m(this, 100189);
        this.A06 = (4BM) 1Bn.A0A(32957);
        this.A0J = (1Rv) 1Bi.A03(67262);
        setHasOptionsMenu(true);
        this.A05.A01(getContext(), this, new Fjl(this, 3), 2131962700);
    }

    public String AWg() {
        return "phone_reconfirmation_request_code_screen";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(801563624);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543100);
        0FI.A08(1832795930, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        7zR.A12(requireView(), this.A00);
        return A1Z();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean z = this.A0G;
        String str = this.A0A;
        String str2 = this.A0B;
        bundle.putBoolean("use_same_phone_number", z);
        if (str != null) {
            bundle.putString("iso_country_code", str);
        }
        if (str2 != null) {
            bundle.putString("phone_number", str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r303 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.zombification.PhoneReconfirmationRequestCodeFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
