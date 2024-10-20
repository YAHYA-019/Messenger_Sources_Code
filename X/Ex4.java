package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ex4.class */
public final class Ex4 {
    public final C00i A01 = AbH.A0S();
    public final C00i A03 = 1BQ.A02(98478);
    public final C00i A00 = 1BQ.A02(98467);
    public final C00i A02 = AbH.A0M();

    public void A00(Context context) {
        String str;
        String str2 = ED7.A00(context, this.A01).A0C;
        if (str2.equals("ZeroAutoFlexOptin")) {
            str = "auto_flex";
        } else if (!str2.equals("ZeroOlympusOptin")) {
            return;
        } else {
            str = "olympus";
        }
        FbUserSession A0D = 4YV.A0D(context);
        ((F8I) this.A03.get()).A01(context, A0D, new Fsu(context, this, 0), 1QE.A01, str, "in", (String) null);
    }

    public void A01(Context context) {
        String str;
        FbUserSession A0D = 4YV.A0D(context);
        String str2 = ED7.A00(context, this.A01).A0C;
        if (str2.equals("ZeroAutoFlexOptin")) {
            str = "auto_flex";
        } else if (!str2.equals("ZeroOlympusOptin")) {
            return;
        } else {
            str = "olympus";
        }
        ((F8I) this.A03.get()).A01(context, A0D, new Fsu(context, this, 1), 1QE.A02, str, "out", (String) null);
    }
}
