package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DisclaimerText.class */
public final class DisclaimerText extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(53);
    public final int A00;
    public final int A01;
    public final String A02;

    public DisclaimerText(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DisclaimerText)) {
                return false;
            }
            DisclaimerText disclaimerText = (DisclaimerText) obj;
            if (!11T.A0O(this.A02, disclaimerText.A02) || this.A00 != disclaimerText.A00 || this.A01 != disclaimerText.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A05(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DisclaimerText(text=");
        A0k.append(this.A02);
        A0k.append(", ctaBegin=");
        A0k.append(this.A00);
        A0k.append(", ctaEnd=");
        return DKH.A0p(A0k, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
