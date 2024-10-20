package com.facebook.wearable.applinks;

import android.os.Parcelable;
import com.oculus.applinks.LinkAppDeviceIdentityRequest;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkDeviceIdentityRequest.class */
public class AppLinkDeviceIdentityRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkDeviceIdentityRequest.class);
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityRequest() {
    }

    public AppLinkDeviceIdentityRequest(LinkAppDeviceIdentityRequest linkAppDeviceIdentityRequest) {
        this.serviceUUID = linkAppDeviceIdentityRequest.serviceUUID_.A05();
    }
}
