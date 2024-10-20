package com.facebook.wearable.applinks;

import android.os.Parcelable;
import com.oculus.applinks.LinkAppLinkInfoRequest;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkLinkInfoRequest.class */
public class AppLinkLinkInfoRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkLinkInfoRequest.class);
    public int linkType;
    public int requestType;
    public byte[] serviceUUID;

    public AppLinkLinkInfoRequest() {
    }

    public AppLinkLinkInfoRequest(LinkAppLinkInfoRequest linkAppLinkInfoRequest) {
        this.serviceUUID = linkAppLinkInfoRequest.serviceUUID_.A05();
        this.linkType = linkAppLinkInfoRequest.linkType_;
        this.requestType = linkAppLinkInfoRequest.requestType_;
    }
}
