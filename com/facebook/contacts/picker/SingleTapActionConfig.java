package com.facebook.contacts.picker;

import X.1BL;
import X.AbN;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: SingleTapActionConfig.class */
public final class SingleTapActionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(39);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public SingleTapActionConfig(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = AbN.A1U(parcel);
    }

    public SingleTapActionConfig(String str) {
        this.A01 = str;
        this.A00 = null;
        this.A02 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SingleTapActionConfig)) {
                return false;
            }
            SingleTapActionConfig singleTapActionConfig = (SingleTapActionConfig) obj;
            if (Objects.equal(this.A01, singleTapActionConfig.A01) && Objects.equal(this.A00, singleTapActionConfig.A00) && Objects.equal(Boolean.valueOf(this.A02), Boolean.valueOf(singleTapActionConfig.A02))) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() + 31) * 31) + 1BL.A05(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
