package com.facebook.messaging.analytics.navigation;

import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: NavigationLogs.class */
public final class NavigationLogs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(92);
    public final ImmutableMap A00;

    public NavigationLogs(Parcel parcel) {
        this.A00 = (ImmutableMap) parcel.readSerializable();
    }

    public NavigationLogs(ImmutableMap.Builder builder) {
        this.A00 = builder.build();
    }

    public NavigationLogs(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }
}
