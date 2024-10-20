package com.facebook.user.model;

import X.1BL;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;

/* loaded from: UserPhoneNumber.class */
public final class UserPhoneNumber implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(14);
    public final int A00;
    public final TriState A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public UserPhoneNumber(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = TriState.valueOf(parcel.readString());
    }

    public UserPhoneNumber(TriState triState, String str, String str2, String str3, int i) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A01 = triState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UserPhoneNumber userPhoneNumber = (UserPhoneNumber) obj;
            if (this.A00 != userPhoneNumber.A00) {
                return false;
            }
            String str = this.A02;
            String str2 = userPhoneNumber.A02;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.A01 != userPhoneNumber.A01) {
                return false;
            }
            String str3 = this.A03;
            String str4 = userPhoneNumber.A03;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A04;
            String str6 = userPhoneNumber.A04;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((((((1BL.A06(this.A03) * 31) + 1BL.A06(this.A02)) * 31) + 1BL.A06(this.A04)) * 31) + this.A00) * 31;
        TriState triState = this.A01;
        if (triState != null) {
            i = triState.hashCode();
        }
        return A06 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        1BL.A12(parcel, this.A01);
    }
}
