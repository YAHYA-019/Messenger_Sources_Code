package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* loaded from: I0i.class */
public final class I0i {
    public static final void A00(Activity activity, HQd hQd, int i) {
        11T.A0F(hQd, 2);
        Intent A0A = 4YU.A0A("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
        A0A.putExtra("android.app.extra.TITLE", activity.getString(2131960157));
        A0A.putExtra("android.app.extra.DESCRIPTION", activity.getString(2131960155));
        A0A.setPackage("com.android.settings");
        0LS.A08(activity, A0A, i);
    }

    public final boolean A01(Context context) {
        Boolean bool = I8R.A09;
        if (bool == null) {
            bool = 2yD.A01(1BL.A0Q(), 36314137466510879L);
            I8R.A09 = bool;
        }
        Boolean bool2 = true;
        boolean equals = bool2.equals(bool);
        LC7 A03 = LC7.A03(context);
        if (!equals) {
            return A03.A04(255) == 0;
        }
        int A04 = A03.A04(33023);
        return (11 == A04 || 12 == A04) ? false : true;
    }
}
