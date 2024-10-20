package com.facebook.wearable.applinks;

import android.os.Parcelable;
import com.oculus.applinks.LinkAppRegisterResponse;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkRegisterResponse.class */
public class AppLinkRegisterResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkRegisterResponse.class);
    public byte[] serviceUUID;

    public AppLinkRegisterResponse() {
    }

    public AppLinkRegisterResponse(LinkAppRegisterResponse linkAppRegisterResponse) {
        this.serviceUUID = linkAppRegisterResponse.serviceUUID_.A05();
    }
}
