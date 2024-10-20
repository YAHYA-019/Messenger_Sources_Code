package com.facebook.wearable.applinks;

import android.os.Parcelable;
import com.oculus.applinks.LinkAppDeviceIdentityResponse;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkDeviceIdentityResponse.class */
public class AppLinkDeviceIdentityResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkDeviceIdentityResponse.class);
    public byte[] devicePublicKey;
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityResponse() {
    }

    public AppLinkDeviceIdentityResponse(LinkAppDeviceIdentityResponse linkAppDeviceIdentityResponse) {
        this.serviceUUID = linkAppDeviceIdentityResponse.serviceUUID_.A05();
        this.devicePublicKey = linkAppDeviceIdentityResponse.devicePublicKey_.A05();
    }
}
