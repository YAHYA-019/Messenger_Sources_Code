package com.facebook.messaging.zombification;

import X.0FI;
import X.1JF;
import X.1Oe;
import X.1lN;
import X.4BM;
import X.6HM;
import X.7zL;
import X.7zN;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.C00i;
import X.C1fe;
import X.C5yw;
import X.DKG;
import X.ElU;
import X.EwB;
import X.F9G;
import X.FAE;
import X.FXm;
import X.FkI;
import X.FsP;
import X.JgM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam;
import com.facebook.widget.splitinput.SplitFieldCodeInputView;

/* loaded from: PhoneReconfirmationConfirmNumberFragment.class */
public final class PhoneReconfirmationConfirmNumberFragment extends AbstractNavigableFragment implements 1lN {
    public Button A00;
    public TextView A01;
    public EwB A02;
    public JgM A03;
    public ElU A04;
    public F9G A05;
    public PhoneNumberParam A06;
    public 4BM A07;
    public FAE A08;
    public 6HM A09;
    public SplitFieldCodeInputView A0A;
    public String A0B;
    public boolean A0C;
    public InputMethodManager A0D;
    public final C00i A0E = AbH.A0c(this);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006d, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.zombification.PhoneReconfirmationConfirmNumberFragment.A1S(android.os.Bundle):void");
    }

    public String AWg() {
        return this.A0C ? "phone_reconfirmation_fb_login_approval_screen" : "phone_reconfirmation_confirm_number_screen";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2025344005);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543096);
        0FI.A08(816612118, A02);
        return A08;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            return A1Z();
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PhoneNumberParam phoneNumberParam = this.A06;
        String str = this.A0B;
        boolean z = this.A0C;
        if (phoneNumberParam != null) {
            bundle.putParcelable("phone_number", phoneNumberParam);
        }
        if (str != null) {
            bundle.putString("identifier", str);
        }
        bundle.putBoolean("for_login_approvals", z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [android.view.View, com.facebook.widget.splitinput.SplitFieldCodeInputView] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A08.A02(AWg());
        this.A01 = DKG.A0D(this, 2131366433);
        this.A0A = (SplitFieldCodeInputView) 7zL.A0F(this, 2131366160);
        this.A00 = (Button) 7zL.A0F(this, 2131366163);
        this.A01.setText(getString(2131952228));
        Button button = this.A00;
        int i = 0;
        if (this.A0C) {
            i = 8;
        }
        button.setVisibility(i);
        1Oe r0 = this.A07.A00;
        C1fe c1fe = C1fe.A2U;
        FXm.A00(this.A00, this, 1JF.A0B(r0.A04(c1fe)) ? "" : this.A07.A00.A04(c1fe), 6);
        LithoView lithoView = (LithoView) 7zL.A0F(this, 2131365269);
        C5yw A0b = 7zN.A0b(lithoView.A09, false);
        A0b.A2b(AbF.A0p(this.A0E));
        A0b.A2a(2131962692);
        lithoView.A0x(FkI.A00(A0b, this, 21));
        ?? r02 = this.A0A;
        r02.A07 = new FsP(this);
        r02.requestFocus();
        this.A0D.toggleSoftInput(1, 0);
    }
}
