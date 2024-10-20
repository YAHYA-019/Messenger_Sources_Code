package com.facebook.ipc.model;

import X.4YV;
import X.7zS;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: FacebookPhonebookContact.class */
public class FacebookPhonebookContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(55);
    public List A00;
    public List A01;
    public final String email;
    public final boolean isFriend;
    public String name;
    public final String nativeName;
    public final long ordinal;
    public final String phone;
    public final long recordId;
    public final long userId;

    public FacebookPhonebookContact() {
        this.name = null;
        long j = -1;
        this.recordId = j;
        this.isFriend = false;
        this.userId = j;
        this.phone = null;
        this.A01 = null;
        this.email = null;
        this.A00 = null;
        this.ordinal = 0L;
        this.nativeName = null;
    }

    public FacebookPhonebookContact(Parcel parcel) {
        this.name = parcel.readString();
        this.recordId = parcel.readLong();
        this.isFriend = 7zS.A1Z(parcel);
        this.userId = parcel.readLong();
        this.phone = parcel.readString();
        this.A01 = 4YV.A0y(parcel, String.class);
        this.email = parcel.readString();
        this.A00 = 4YV.A0y(parcel, String.class);
        this.ordinal = parcel.readLong();
        this.nativeName = parcel.readString();
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
            FacebookPhonebookContact facebookPhonebookContact = (FacebookPhonebookContact) obj;
            if (this.isFriend != facebookPhonebookContact.isFriend || this.ordinal != facebookPhonebookContact.ordinal || this.recordId != facebookPhonebookContact.recordId || this.userId != facebookPhonebookContact.userId || !this.A00.equals(facebookPhonebookContact.A00) || !this.name.equals(facebookPhonebookContact.name) || !this.A01.equals(facebookPhonebookContact.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, Long.valueOf(this.recordId), Long.valueOf(this.userId), Boolean.valueOf(this.isFriend), Long.valueOf(this.ordinal), this.A01, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.recordId);
        parcel.writeInt(this.isFriend ? 1 : 0);
        parcel.writeLong(this.userId);
        parcel.writeString(this.phone);
        parcel.writeList(this.A01);
        parcel.writeString(this.email);
        parcel.writeList(this.A00);
        parcel.writeLong(this.ordinal);
        parcel.writeString(this.nativeName);
    }
}
