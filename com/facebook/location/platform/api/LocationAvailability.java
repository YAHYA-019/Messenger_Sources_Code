package com.facebook.location.platform.api;

import X.1BK;
import X.AnonymousClass001;
import X.KRO;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: LocationAvailability.class */
public class LocationAvailability extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(LocationAvailability.class);
    public boolean mAvailable;
    public Bundle mExtras;
    public String mProvider;

    public LocationAvailability() {
    }

    public LocationAvailability(KRO kro) {
        throw AnonymousClass001.A0Q("isAvailable");
    }

    public LocationAvailability(String str, boolean z) {
        this(str, z, 1BK.A05());
    }

    public LocationAvailability(String str, boolean z, Bundle bundle) {
        this.mProvider = str;
        this.mAvailable = z;
        this.mExtras = bundle;
    }

    public static LocationAvailability create(String str, boolean z) {
        return new LocationAvailability(str, z);
    }

    public static LocationAvailability create(String str, boolean z, Bundle bundle) {
        return new LocationAvailability(str, z, bundle);
    }

    public static LocationAvailability fromIntent(Intent intent) {
        return (LocationAvailability) intent.getParcelableExtra("com.facebook.locationavailability");
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public boolean isAvailable() {
        return this.mAvailable;
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            bundle = 1BK.A05();
        }
        return bundle;
    }
}
