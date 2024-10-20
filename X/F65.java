package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: F65.class */
public final class F65 {
    public static final String A04 = 0Pz.A0W("Survey Remix:", "SimonTransformer");
    public static final Qu7[] A05 = {Qu7.A0B, Qu7.A09, Qu7.A0E, Qu7.A01, Qu7.A0C, Qu7.A08, Qu7.A06, Qu7.A04};
    public static final 1G2 A06 = 1G3.A01(1G0.A02, "structured_survey/intern_dev_mode_enabled");
    public boolean A00;
    public final Context A01;
    public final 2Iq A02;
    public final C00i A03;

    public F65() {
        1BQ A0S = AbH.A0S();
        this.A03 = A0S;
        this.A01 = FbInjector.A00();
        this.A02 = (2Iq) 1Bi.A03(16960);
        A0S.get();
        this.A00 = ((FbSharedPreferences) A0S.get()).AZn(A06, false);
    }
}
