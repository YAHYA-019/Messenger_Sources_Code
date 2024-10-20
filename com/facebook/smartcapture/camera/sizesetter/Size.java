package com.facebook.smartcapture.camera.sizesetter;

import X.0Pz;
import X.11T;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Size.class */
public final class Size implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(21);
    public final int A00;
    public final int A01;

    public Size(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            if (this.A01 != size.A01 || this.A00 != size.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public String toString() {
        return 0Pz.A0b("Size(width=", ", height=", ')', this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
