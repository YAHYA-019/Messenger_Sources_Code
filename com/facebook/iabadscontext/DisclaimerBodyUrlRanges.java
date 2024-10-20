package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.C04v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DisclaimerBodyUrlRanges.class */
public final class DisclaimerBodyUrlRanges extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(96);
    public final int A00;
    public final int A01;
    public final String A02;

    public DisclaimerBodyUrlRanges(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DisclaimerBodyUrlRanges)) {
                return false;
            }
            DisclaimerBodyUrlRanges disclaimerBodyUrlRanges = (DisclaimerBodyUrlRanges) obj;
            if (this.A01 != disclaimerBodyUrlRanges.A01 || this.A00 != disclaimerBodyUrlRanges.A00 || !11T.A0O(this.A02, disclaimerBodyUrlRanges.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + 1BL.A05(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }
}
