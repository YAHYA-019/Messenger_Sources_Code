package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: Dpm.class */
public final class Dpm extends Dpp {
    public static String A00;
    public static String A01;
    public static final String __redex_internal_original_name = "SpinnerDialogFragment";

    @Override // X.Dpp
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(true);
        return A0n;
    }

    @Override // X.Dpp
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1671050051);
        super.onCreate(bundle);
        A0g(0, 2132608821);
        0FI.A08(333274244, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(512299323);
        Context requireContext = requireContext();
        LinearLayout linearLayout = new LinearLayout(requireContext);
        DQU dqu = new DQU(requireContext);
        String str = A01;
        DQU.A02(FXr.A02(this, 49), dqu, A00, getString(2131958479), str, "");
        linearLayout.addView(dqu);
        0FI.A08(-102796602, A02);
        return linearLayout;
    }
}
