package com.facebook.wearable.applinks;

import android.os.Parcelable;
import com.oculus.applinks.LinkAppRegisterRequest;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkRegisterRequest.class */
public class AppLinkRegisterRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkRegisterRequest.class);
    public byte[] appPublicKey;
    public int testAppNumber = 0;

    public AppLinkRegisterRequest() {
    }

    public AppLinkRegisterRequest(LinkAppRegisterRequest linkAppRegisterRequest) {
        this.appPublicKey = linkAppRegisterRequest.appPublicKey_.A05();
    }
}
