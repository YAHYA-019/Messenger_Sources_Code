package com.facebook.videolite.transcoder.base;

import X.0Pz;
import X.AbM;
import X.AnonymousClass001;
import X.FKb;
import X.IFX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SphericalMetadata.class */
public final class SphericalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(24);
    public final String A00;
    public final String A01;

    public SphericalMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public SphericalMetadata(String str, String str2) {
        boolean z = true;
        IFX.A07(AnonymousClass001.A1T(str), "projectionType is null");
        this.A00 = str;
        IFX.A07(str2 == null ? false : z, "stereoMode is null");
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SphericalMetadata)) {
                return false;
            }
            SphericalMetadata sphericalMetadata = (SphericalMetadata) obj;
            String str = this.A00;
            String str2 = sphericalMetadata.A00;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
            String str3 = this.A01;
            String str4 = sphericalMetadata.A01;
            if (str3 != str4 && (str3 == null || !str3.equals(str4))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        return 0Pz.A0z("SphericalMetadata{projectionType=", this.A00, ", stereoMode=", this.A01, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
