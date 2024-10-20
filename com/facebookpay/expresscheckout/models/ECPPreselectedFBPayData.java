package com.facebookpay.expresscheckout.models;

import X.0Pz;
import X.11T;
import X.1BL;
import X.7zN;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ECPPreselectedFBPayData.class */
public final class ECPPreselectedFBPayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(44);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ECPPreselectedFBPayData() {
        this(null, null, null, null);
    }

    public ECPPreselectedFBPayData(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ECPPreselectedFBPayData)) {
                return false;
            }
            ECPPreselectedFBPayData eCPPreselectedFBPayData = (ECPPreselectedFBPayData) obj;
            if (!11T.A0O(this.A00, eCPPreselectedFBPayData.A00) || !11T.A0O(this.A03, eCPPreselectedFBPayData.A03) || !11T.A0O(this.A01, eCPPreselectedFBPayData.A01) || !11T.A0O(this.A02, eCPPreselectedFBPayData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A00) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A01)) * 31) + 7zN.A05(this.A02);
    }

    public String toString() {
        return 0Pz.A14("ECPPreselectedFBPayData(selectedCredentialId=", this.A00, ", selectedShippingAddressId=", this.A03, ", selectedEmailId=", this.A01, ", selectedPhoneId=", this.A02, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
