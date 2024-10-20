package com.facebook.advancedcryptotransport.plugins.androididprovider;

import X.0fH;
import X.C0f1;
import android.provider.Settings;

/* loaded from: AdvancedCryptoTransportAndroidIDProviderPluginSessionless.class */
public final class AdvancedCryptoTransportAndroidIDProviderPluginSessionless extends Sessionless {
    public final String TAG = "ACTAndroidIDProviderPlugin";

    @Override // com.facebook.advancedcryptotransport.plugins.androididprovider.Sessionless
    public String MCCAndroidIDProviderImpl_MsysAndroidIDProviderCopyAndroidID() {
        try {
            return Settings.Secure.getString(C0f1.A00().getContentResolver(), "android_id");
        } catch (SecurityException e) {
            0fH.A0s(this.TAG, "Failed permission check - returning NULL for ANDROID_ID.", e);
            return null;
        }
    }
}
