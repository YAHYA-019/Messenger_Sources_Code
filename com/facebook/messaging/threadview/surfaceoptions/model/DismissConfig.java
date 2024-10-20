package com.facebook.messaging.threadview.surfaceoptions.model;

import X.C1pq;
import X.C3o5;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DismissConfig.class */
public final class DismissConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(35);
    public final boolean A00;

    public DismissConfig() {
        this.A00 = true;
    }

    public DismissConfig(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 1 ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DismissConfig) && this.A00 == ((DismissConfig) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
