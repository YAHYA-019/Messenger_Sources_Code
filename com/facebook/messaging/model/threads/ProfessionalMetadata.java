package com.facebook.messaging.model.threads;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProfessionalMetadata.class */
public final class ProfessionalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(68);
    public final String A00;

    public ProfessionalMetadata(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : parcel.readString();
    }

    public ProfessionalMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProfessionalMetadata) && 11T.A0O(this.A00, ((ProfessionalMetadata) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }
}
