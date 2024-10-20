package com.facebook.wearable.applinks;

import X.AnonymousClass001;
import X.MRR;
import android.os.Parcelable;
import com.oculus.applinks.LinkAddress;
import com.oculus.applinks.LinkAppLinkInfoResponse;
import java.util.Iterator;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkLinkInfoResponse.class */
public class AppLinkLinkInfoResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkLinkInfoResponse.class);
    public List addressList;
    public byte[] buildFlavor;
    public byte[] deviceImageAssetURI;
    public byte[] deviceModelName;
    public byte[] deviceName;
    public byte[] deviceSerial;
    public byte[] firmwareVersion;
    public byte[] hardwareType;
    public byte[] macAddress;

    public AppLinkLinkInfoResponse() {
    }

    public AppLinkLinkInfoResponse(LinkAppLinkInfoResponse linkAppLinkInfoResponse) {
        MRR mrr = linkAppLinkInfoResponse.addresses_;
        this.addressList = AnonymousClass001.A0s();
        Iterator it = mrr.iterator();
        while (it.hasNext()) {
            this.addressList.add(new AppLinkLinkAddress((LinkAddress) it.next()));
        }
        this.firmwareVersion = linkAppLinkInfoResponse.firmwareVersion_.A05();
        this.deviceSerial = linkAppLinkInfoResponse.deviceSerial_.A05();
        this.deviceImageAssetURI = linkAppLinkInfoResponse.deviceImageAssetURI_.A05();
        this.deviceModelName = linkAppLinkInfoResponse.deviceModelName_.A05();
        this.buildFlavor = linkAppLinkInfoResponse.buildFlavor_.A05();
        this.deviceName = linkAppLinkInfoResponse.deviceName_.A05();
        this.hardwareType = linkAppLinkInfoResponse.hardwareType_.A05();
        this.macAddress = linkAppLinkInfoResponse.macAddress_.A05();
    }
}
