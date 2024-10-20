package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: C2t.class */
public final class C2t {
    public final C00i A00 = 1BQ.A02(17011);
    public final C00i A01 = 1BQ.A02(83824);

    public void A00(Context context, Intent intent) {
        if (((2Pj) this.A00.get()).A0A("messenger_orca_800_live_location") == null) {
            0fH.A0k("LiveLocationForegroundServiceLauncher", "can not start foreground service due to invalid notification channel");
        } else {
            0fH.A0j("LiveLocationForegroundServiceLauncher", "Launching Live Location Sharing Service as a foreground service.");
            ((4bY) this.A01.get()).A00(intent, context);
        }
    }
}
