package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.facebook.account.recovery.common.protocol.AccountRecoveryValidateCodeMethod$Params;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.resources.ui.FbEditText;

/* renamed from: X.Ala, reason: case insensitive filesystem */
/* loaded from: Ala.class */
public final class C1556Ala extends 1pK implements CallerContextable {
    public static final String __redex_internal_original_name = "MessengerResetPasswordFragment";
    public View A00;
    public DE6 A01;
    public ErC A02;
    public FbEditText A03;
    public String A04;
    public String A05;
    public boolean A06;
    public View A07;
    public InputMethodManager A08;
    public BlueServiceOperationFactory A09;
    public 5iG A0A;
    public final C00i A0B = AbI.A0N();
    public final C00i A0C = 1BQ.A02(85263);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C1556Ala c1556Ala) {
        String A0u = AbM.A0u(c1556Ala.A03);
        if (1JF.A0B(A0u)) {
            return;
        }
        if (A0u.length() < 6) {
            A06(c1556Ala, c1556Ala.getString(2131962704), null);
            return;
        }
        A07(c1556Ala, true);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("accountRecoveryValidateCodeParamsKey", new AccountRecoveryValidateCodeMethod$Params(c1556Ala.A04, c1556Ala.A05, A0u, "", c1556Ala.A06));
        c1556Ala.A0A.A04(new ApN(A0u, c1556Ala, 1), 1Ho.A00(c1556Ala.A09.newInstance_DEPRECATED(1BJ.A00(74), A05, 0, CallerContext.A06(C1556Ala.class)), true), (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(C1556Ala c1556Ala, String str, String str2) {
        DKS dks = new DKS(c1556Ala.getContext());
        dks.A0B(str);
        dks.A0A(str2);
        dks.A0H(CSG.A00(c1556Ala, 12), c1556Ala.getString(2131955719));
        dks.A04();
    }

    public static void A07(C1556Ala c1556Ala, boolean z) {
        View view = c1556Ala.A07;
        if (!z) {
            view.setVisibility(8);
            c1556Ala.A03.setVisibility(0);
            c1556Ala.A03.requestFocus();
            c1556Ala.A08.showSoftInput(c1556Ala.A03, 1);
            c1556Ala.A00.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        c1556Ala.A03.setVisibility(8);
        c1556Ala.A03.clearFocus();
        AbH.A1L(c1556Ala.A03, c1556Ala.A08);
        c1556Ala.A00.setVisibility(8);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A08 = (InputMethodManager) 7zO.A0m(this, 100189);
        this.A09 = (BlueServiceOperationFactory) 7zO.A0l(this, 33031);
        this.A0A = (5iG) 1Bn.A0A(49829);
        this.A02 = (ErC) 1Bn.A0A(85287);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getString("candidate_id");
            this.A05 = bundle2.getString("confirmation_code");
            this.A06 = bundle2.getBoolean("logout_other_devices");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(321425025);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542594);
        0FI.A08(-1176298806, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A07 = 7zL.A0F(this, 2131366701);
        this.A03 = (FbEditText) 7zL.A0F(this, 2131365966);
        this.A00 = 7zL.A0F(this, 2131363364);
        A07(this, false);
        this.A03.addTextChangedListener(new BJI(this, 0));
        this.A03.setOnEditorActionListener(new CZT(this, 0));
        CZD.A01(this.A00, this, 12);
    }
}
