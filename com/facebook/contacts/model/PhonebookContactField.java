package com.facebook.contacts.model;

import X.AbM;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: PhonebookContactField.class */
public class PhonebookContactField implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(28);
    public final int A00;
    public final String A01;

    public PhonebookContactField(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public PhonebookContactField(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PhonebookContactField)) {
                return false;
            }
            PhonebookContactField phonebookContactField = (PhonebookContactField) obj;
            if (this.A00 == phonebookContactField.A00 && Objects.equal(this.A01, phonebookContactField.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(Integer.valueOf(this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
