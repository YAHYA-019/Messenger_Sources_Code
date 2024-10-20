package com.facebook.growth.model;

import X.4YU;
import X.DKG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Birthday.class */
public final class Birthday implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(89);
    public final int A00;
    public final int A01;
    public final int A02;

    public Birthday(int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i2;
        this.A02 = i;
    }

    public Birthday(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof Birthday)) {
                return false;
            }
            Birthday birthday = (Birthday) obj;
            if (!DKG.A1Z(birthday.A00, Integer.valueOf(this.A00))) {
                return false;
            }
            if (!DKG.A1Z(birthday.A01, Integer.valueOf(this.A01))) {
                return false;
            }
            if (!DKG.A1Z(birthday.A02, Integer.valueOf(this.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
