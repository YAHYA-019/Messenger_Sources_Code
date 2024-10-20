package com.facebook.contacts.model;

import X.AbM;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: PhonebookWhatsappProfile.class */
public final class PhonebookWhatsappProfile implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(38);
    public final String A00;
    public final String A01;

    public PhonebookWhatsappProfile(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public PhonebookWhatsappProfile(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PhonebookWhatsappProfile)) {
                return false;
            }
            PhonebookWhatsappProfile phonebookWhatsappProfile = (PhonebookWhatsappProfile) obj;
            if (Objects.equal(this.A01, phonebookWhatsappProfile.A01) && Objects.equal(this.A00, phonebookWhatsappProfile.A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
