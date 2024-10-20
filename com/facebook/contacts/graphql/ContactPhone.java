package com.facebook.contacts.graphql;

import X.0Pz;
import X.AbN;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ContactPhone.class */
public class ContactPhone implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(23);
    public final String mDisplayNumber;
    public final String mId;
    public final boolean mIsVerified;
    public final String mLabel;
    public final String mUniversalNumber;

    public ContactPhone() {
        this.mId = null;
        this.mLabel = null;
        this.mDisplayNumber = null;
        this.mUniversalNumber = null;
        this.mIsVerified = false;
    }

    public ContactPhone(Parcel parcel) {
        this.mId = parcel.readString();
        this.mLabel = parcel.readString();
        this.mDisplayNumber = parcel.readString();
        this.mUniversalNumber = parcel.readString();
        this.mIsVerified = AbN.A1U(parcel);
    }

    public ContactPhone(String str, String str2, String str3, String str4, boolean z) {
        this.mId = str;
        this.mLabel = str2;
        this.mDisplayNumber = str3;
        this.mUniversalNumber = str4;
        this.mIsVerified = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 0Pz.A15("ContactPhone<", this.mId, ":", this.mLabel, "> ", this.mUniversalNumber, " (", this.mDisplayNumber, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mLabel);
        parcel.writeString(this.mDisplayNumber);
        parcel.writeString(this.mUniversalNumber);
        parcel.writeInt(this.mIsVerified ? 1 : 0);
    }
}
