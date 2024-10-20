package X;

import android.app.Activity;
import android.content.Intent;

/* loaded from: Hx7.class */
public final class Hx7 {
    public L8S A00;

    public static final void A00(Activity activity, boolean z) {
        int i;
        Intent A0A = 4YU.A0A("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
        if (z) {
            A0A.putExtra("android.app.extra.TITLE", activity.getString(2131954121));
            i = 2131954119;
        } else {
            A0A.putExtra("android.app.extra.TITLE", activity.getString(2131954151));
            i = 2131954149;
        }
        A0A.putExtra("android.app.extra.DESCRIPTION", activity.getString(i));
        A0A.setPackage("com.android.settings");
        0LS.A08(activity, A0A, 211);
    }
}
