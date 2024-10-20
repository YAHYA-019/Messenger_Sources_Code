package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.facebook.acra.constants.ActionId;

/* loaded from: Dpn.class */
public final class Dpn extends Dpp {
    public static final String __redex_internal_original_name = "ExtraChargesDialogFragment";
    public F7f A00;
    public boolean A01 = false;

    @Override // X.Dpp
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(true);
        return A0n;
    }

    @Override // X.Dpp
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1245661339);
        super.onCreate(bundle);
        this.A00 = (F7f) 1Bn.A0A(98829);
        A0g(0, 2132608821);
        0FI.A08(-791834019, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1945914239);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        FXq.A01(linearLayout, this, ActionId.ASYNC_ACTION_FAIL);
        boolean z = false;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        String str = this.A06;
        String str2 = this.A05;
        String string = getString(2131955696);
        FXS fxs = new FXS(this, 0);
        EMn eMn = super.A00;
        EMn eMn2 = EMn.A04;
        int i = 2131968261;
        if (eMn == eMn2) {
            i = 2131955719;
        }
        String string2 = getString(i);
        FXq A00 = FXq.A00(this, ActionId.CONNECTIVITY_CHANGED);
        if (this.A00.A00.A05("upsell_dont_warn_again") || super.A00 == eMn2) {
            onCheckedChangeListener = new FYT(this, 18);
            z = this.A00.A00.A05("upsell_dont_warn_again_checkbox_checked");
        }
        DQU dqu = new DQU(context);
        DQU.A00((Spannable) null, A00, fxs, (View.OnClickListener) null, onCheckedChangeListener, dqu, (String) null, (String) null, (String) null, (String) null, (String) null, str2, string2, string, (String) null, str, "", 0, 0, z, true, false);
        linearLayout.addView(dqu);
        0FI.A08(-607025387, A02);
        return linearLayout;
    }
}
