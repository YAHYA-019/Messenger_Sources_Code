package com.facebook.wearable.applinks;

import X.KPh;
import android.os.Parcelable;
import com.oculus.applinks.LinkAddress;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkLinkAddress.class */
public class AppLinkLinkAddress extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkLinkAddress.class);
    public String address;
    public int addressType;

    public AppLinkLinkAddress() {
    }

    public AppLinkLinkAddress(LinkAddress linkAddress) {
        this.address = linkAddress.data_.A04();
        KPh forNumber = KPh.forNumber(linkAddress.addressType_);
        this.addressType = (forNumber == null ? KPh.A05 : forNumber).getNumber();
    }
}
