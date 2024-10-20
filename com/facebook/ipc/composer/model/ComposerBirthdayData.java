package com.facebook.ipc.composer.model;

import X.C1pq;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerBirthdayData.class */
public final class ComposerBirthdayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(0);
    public final boolean A00;

    public ComposerBirthdayData(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    public ComposerBirthdayData(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerBirthdayData) && this.A00 == ((ComposerBirthdayData) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
