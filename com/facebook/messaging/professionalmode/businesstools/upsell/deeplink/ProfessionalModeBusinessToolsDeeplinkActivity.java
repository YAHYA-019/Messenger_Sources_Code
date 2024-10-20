package com.facebook.messaging.professionalmode.businesstools.upsell.deeplink;

import X.1BK;
import X.1pK;
import X.7zU;
import X.AbL;
import X.C06c;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.professionalmode.businesstools.upsell.fullscreen.NeueNuxProfessionalModeBusinessToolsNuxFragment;

/* loaded from: ProfessionalModeBusinessToolsDeeplinkActivity.class */
public final class ProfessionalModeBusinessToolsDeeplinkActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        AbL.A0l(this);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(View.generateViewId());
        setContentView(frameLayout);
        1pK neueNuxProfessionalModeBusinessToolsNuxFragment = new NeueNuxProfessionalModeBusinessToolsNuxFragment();
        Bundle A05 = 1BK.A05();
        A05.putBoolean("arg_nux_flow_active", false);
        neueNuxProfessionalModeBusinessToolsNuxFragment.setArguments(A05);
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(neueNuxProfessionalModeBusinessToolsNuxFragment, frameLayout.getId());
        C06c.A00(A0D, false);
    }
}
