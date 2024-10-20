package com.facebook.growth.model;

import X.0Pz;
import X.1JF;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: FullName.class */
public final class FullName implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(92);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FullName(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public FullName(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof FullName)) {
                return false;
            }
            FullName fullName = (FullName) obj;
            if (!Objects.equal(this.A01, fullName.A01) || !Objects.equal(this.A03, fullName.A03) || !Objects.equal(this.A02, fullName.A02) || !Objects.equal(this.A00, fullName.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A03, this.A02, this.A00});
    }

    public String toString() {
        String str = this.A00;
        if (!1JF.A0A(str)) {
            return str;
        }
        String str2 = this.A01;
        if (1JF.A0A(str2)) {
            str2 = "";
        }
        String str3 = this.A03;
        if (!1JF.A0A(str3)) {
            str2 = 1JF.A0B(str2) ? str3 : 0Pz.A0j(str2, " ", str3);
        }
        String str4 = this.A02;
        return !1JF.A0A(str4) ? 1JF.A0B(str2) ? str4 : 0Pz.A0j(str2, " ", str4) : str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
