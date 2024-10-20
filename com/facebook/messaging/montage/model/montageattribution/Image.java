package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.4YW;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.HTj;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Image.class */
public final class Image implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(64);
    public final String A00;

    public Image(HTj hTj) {
        this.A00 = hTj.A00;
    }

    public Image(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : parcel.readString();
    }

    public Image(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Image) && 11T.A0O(this.A00, ((Image) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
    }
}
