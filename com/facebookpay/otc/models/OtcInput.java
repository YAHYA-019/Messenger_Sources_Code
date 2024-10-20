package com.facebookpay.otc.models;

import X.11T;
import X.1BL;
import X.7zN;
import X.JQz;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OtcInput.class */
public final class OtcInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(3);
    public final String A00;
    public final String A01;

    public OtcInput(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OtcInput)) {
                return false;
            }
            OtcInput otcInput = (OtcInput) obj;
            if (!11T.A0O(this.A00, otcInput.A00) || !11T.A0O(this.A01, otcInput.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A05(this.A00) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        return JQz.A0r("OtcInput(otcSessionId=", this.A00, ", otcType=", this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
