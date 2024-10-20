package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.1qd, reason: invalid class name */
/* loaded from: 1qd.class */
public abstract class C1qd {
    public static final boolean A00 = C02A.isEndToEndTestRun;

    public static final boolean A00(Context context) {
        boolean z = false;
        if (!C02A.isAnimationDisabled) {
            if (!C02A.isEndToEndTestRun) {
                return true;
            }
            if (context != null) {
                float f = Settings.Global.getFloat(context.getContentResolver(), 7zK.A00(24), 1.0f);
                if (!C02A.forceEnableTransitionsForInstrumentationTests && f == 0.0f) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }
}
