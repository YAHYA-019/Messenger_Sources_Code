package com.facebook.wearable.applinks;

import android.os.ParcelUuid;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkingParameters.class */
public class AppLinkingParameters extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkingParameters.class);
    public byte[] devicePublicKey;
    public byte[] linkedAppPrivateKey;
    public ParcelUuid serviceUUID;

    public AppLinkingParameters() {
    }

    public AppLinkingParameters(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        this.serviceUUID = parcelUuid;
        this.linkedAppPrivateKey = bArr;
        this.devicePublicKey = bArr2;
    }
}
