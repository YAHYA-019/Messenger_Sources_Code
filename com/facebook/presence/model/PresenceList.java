package com.facebook.presence.model;

import X.4YV;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: PresenceList.class */
public final class PresenceList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(0);
    public final ImmutableList A00;

    public PresenceList(Parcel parcel) {
        this.A00 = ImmutableList.copyOf((Collection) 4YV.A0y(parcel, PresenceItem.class));
    }

    public PresenceList(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
