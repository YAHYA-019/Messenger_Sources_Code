package com.facebook.privacy.uafprivacyoption;

import X.0Pz;
import X.11T;
import X.1BL;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UAFPrivacyImage.class */
public final class UAFPrivacyImage extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(64);
    public final String name;

    public UAFPrivacyImage() {
        this(null);
    }

    public UAFPrivacyImage(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof UAFPrivacyImage) && 11T.A0O(this.name, ((UAFPrivacyImage) obj).name));
    }

    public int hashCode() {
        return 1BL.A05(this.name);
    }

    public String toString() {
        return 0Pz.A0X("UAFPrivacyImage(name=", this.name, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.name);
    }
}
