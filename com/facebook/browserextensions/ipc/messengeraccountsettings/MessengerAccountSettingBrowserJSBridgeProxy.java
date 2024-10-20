package com.facebook.browserextensions.ipc.messengeraccountsettings;

import X.11T;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;

/* loaded from: MessengerAccountSettingBrowserJSBridgeProxy.class */
public final class MessengerAccountSettingBrowserJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public static final Parcelable.Creator CREATOR = DKf.A00(61);
    public String A00;
    public String A01;
    public String A02;

    public final void updateCredentialForSmartlock(String str) {
        if (A07() instanceof FragmentActivity) {
            11T.A0D(this.A00);
            11T.A0D(str);
        }
    }

    @Override // com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
