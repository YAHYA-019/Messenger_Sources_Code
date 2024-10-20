package com.facebook.ipc.composer.model;

import X.C1pq;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EventsCrossPostData.class */
public final class EventsCrossPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(82);
    public final boolean A00;

    public EventsCrossPostData(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    public EventsCrossPostData(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EventsCrossPostData) && this.A00 == ((EventsCrossPostData) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
