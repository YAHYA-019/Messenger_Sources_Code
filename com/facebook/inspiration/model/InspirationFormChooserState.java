package com.facebook.inspiration.model;

import X.C1pq;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationFormChooserState.class */
public final class InspirationFormChooserState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(54);
    public final boolean A00;

    public InspirationFormChooserState(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    public InspirationFormChooserState(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InspirationFormChooserState) && this.A00 == ((InspirationFormChooserState) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
