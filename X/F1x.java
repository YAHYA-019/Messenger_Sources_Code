package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.fxcal.settings.details.FxCalDetailsSettingsActivity;

/* loaded from: F1x.class */
public final class F1x {
    public static final void A00(Bundle bundle, Fragment fragment, 2JX r303, 1Iw r304, String str, String str2) {
        Context context;
        Intent A01;
        11T.A0F(r304, 0);
        if (r303 != null) {
            String A2Q = r303.A2Q();
            if (A2Q == null) {
                A2Q = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
            }
            if (A2Q.equals("FB_PAY")) {
                context = 7zL.A0A(r304);
                boolean z = bundle.getBoolean("should_show_done_button");
                Bundle A05 = 1BK.A05();
                A05.putBoolean("should_show_done_button", z);
                A01 = F70.A00(context, A05, A2Q, str, str2);
                if (z) {
                    1BK.A0W().A0B(A01, fragment, 1);
                    return;
                }
            } else {
                boolean booleanValue = r303.getBooleanValue(1443587848);
                context = r304.A0D;
                11T.A0A(context);
                A01 = FxCalDetailsSettingsActivity.A00.A01(context, A2Q, booleanValue ? "select_account" : "main_settings");
            }
            DKE.A1C(context, A01);
        }
    }
}
