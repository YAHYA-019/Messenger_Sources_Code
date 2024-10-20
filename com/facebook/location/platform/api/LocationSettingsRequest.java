package com.facebook.location.platform.api;

import X.AnonymousClass001;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: LocationSettingsRequest.class */
public class LocationSettingsRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(LocationSettingsRequest.class);
    public List mLocationRequests;

    public LocationSettingsRequest() {
        this.mLocationRequests = AnonymousClass001.A0s();
    }

    public LocationSettingsRequest(List list) {
        this.mLocationRequests = list;
    }

    public List getLocationRequests() {
        return this.mLocationRequests;
    }
}
