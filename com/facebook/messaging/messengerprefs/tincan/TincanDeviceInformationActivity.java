package com.facebook.messaging.messengerprefs.tincan;

import X.1BK;
import X.BJB;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.google.common.base.Preconditions;

/* loaded from: TincanDeviceInformationActivity.class */
public class TincanDeviceInformationActivity extends MessengerSettingActivity {
    public TincanDeviceModel A00;
    public boolean A01;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        boolean booleanExtra;
        super.A2y(bundle);
        setTitle(2131963570);
        if (bundle != null) {
            this.A00 = (TincanDeviceModel) bundle.getParcelable("device_model");
            booleanExtra = bundle.getBoolean("is_current_device", false);
        } else {
            this.A00 = (TincanDeviceModel) getIntent().getParcelableExtra("device_model");
            booleanExtra = getIntent().getBooleanExtra("is_current_device", false);
        }
        this.A01 = booleanExtra;
        Preconditions.checkNotNull(this.A00, "Must specify tincan device.");
        A3B();
        BJB bjb = new BJB();
        TincanDeviceModel tincanDeviceModel = this.A00;
        boolean z = this.A01;
        tincanDeviceModel.getClass();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("TINCAN_DEVICE_MODEL", tincanDeviceModel);
        A05.putBoolean("IS_CURRENT_DEVICE", z);
        bjb.setArguments(A05);
        A3C(bjb);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("device_model", this.A00);
        bundle.putBoolean("is_current_device", this.A01);
    }
}
