package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: F53.class */
public final class F53 {
    public final C00i A01 = AbH.A0N();
    public final C00i A00 = AbH.A0S();

    public static void A00(F53 f53, String str, String str2, boolean z) {
        1UG A0A = AbG.A0A(z ? 1ZG.A02 : 1ZG.A03, 1BK.A07(f53.A01), "initial_app_launch_experiment_exposure");
        if (A0A.isSampled()) {
            C00i c00i = f53.A00;
            FbSharedPreferences A0R = 1BK.A0R(c00i);
            1G2 r0 = F3w.A00;
            if (1BK.A1T(A0R, 1G3.A01(r0, str))) {
                return;
            }
            A0A.A7R("exp_name", str);
            A0A.A7R("exp_group", str2);
            A0A.BZL();
            AbK.A1O(1BL.A0V(c00i), 1G3.A01(r0, str));
        }
    }
}
