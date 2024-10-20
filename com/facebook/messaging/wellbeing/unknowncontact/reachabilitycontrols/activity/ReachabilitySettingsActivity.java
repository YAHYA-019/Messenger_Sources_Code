package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.activity;

import X.11T;
import X.1BK;
import X.1pK;
import X.B98;
import X.B9B;
import X.B9D;
import X.Bio;
import X.DGH;
import X.RGO;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySetting;
import java.io.Serializable;

/* loaded from: ReachabilitySettingsActivity.class */
public final class ReachabilitySettingsActivity extends MessengerSettingActivity {
    public static final void A12(DGH dgh, ReachabilitySettingsActivity reachabilitySettingsActivity, ReachabilitySetting reachabilitySetting, String str, String str2, String str3) {
        1pK b98 = new B98();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("reachability_setting_key", reachabilitySetting);
        A05.putString("ig_name_key", str);
        A05.putString("obid_key", str2);
        A05.putString("current_delivery_option_key", str3);
        b98.setArguments(A05);
        b98.A02 = dgh;
        reachabilitySettingsActivity.A3D(b98, true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (fragment instanceof B9D) {
            ((B9D) fragment).A01 = new Bio(this);
        } else if (fragment instanceof B9B) {
            ((B9B) fragment).A00 = new RGO(this);
        }
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        Serializable serializableExtra = getIntent().getSerializableExtra("entry_point");
        Bundle A05 = 1BK.A05();
        A05.putSerializable("entry_point", serializableExtra);
        B9D b9d = new B9D();
        b9d.setArguments(A05);
        A3C(b9d);
    }
}
