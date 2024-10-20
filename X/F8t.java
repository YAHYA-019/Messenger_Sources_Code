package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: F8t.class */
public final class F8t {
    public final C00i A02 = 1BV.A00(99816);
    public final DialogInterface.OnClickListener A00 = FK6.A00(this, 18);
    public final C00i A01 = 1BV.A00(67527);

    public static void A00(C00i c00i, BJB bjb) {
        ((F8t) c00i.get()).A01(bjb.getContext(), bjb.A01);
    }

    public void A01(Context context, MigColorScheme migColorScheme) {
        if (context != null) {
            C00i c00i = this.A02;
            F9e f9e = (F9e) c00i.get();
            c00i.get();
            f9e.A02(context, this.A00, migColorScheme, 1BK.A0u(context, 2131957343));
        }
    }

    public void A02(Context context, MigColorScheme migColorScheme, String str, String str2, String str3, String str4) {
        if ("ALREADY_LOCKED".equals(str4)) {
            0fH.A0l("FxImDialogHelper", "Already running mutation");
            return;
        }
        if (1JF.A0B(str) || 1JF.A0B(str2) || 1JF.A0B(str3)) {
            A01(context, migColorScheme);
        } else if (context != null) {
            ((F9e) this.A02.get()).A03(context, this.A00, migColorScheme, str3, str2, str);
        }
    }
}
