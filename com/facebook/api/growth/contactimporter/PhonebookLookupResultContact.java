package com.facebook.api.growth.contactimporter;

import X.4YW;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PhonebookLookupResultContact.class */
public class PhonebookLookupResultContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(0);
    public final String email;
    public final boolean isFriend;
    public final int mutualFriends;
    public String name;
    public final String nativeName;
    public final long ordinal;
    public final String phone;
    public final String profilePic;
    public final long recordId;
    public final long userId;

    public PhonebookLookupResultContact() {
        long j = -1;
        this.name = null;
        this.recordId = j;
        this.email = null;
        this.phone = null;
        this.userId = j;
        this.isFriend = false;
        this.profilePic = null;
        this.ordinal = 0L;
        this.nativeName = null;
        this.mutualFriends = 0;
    }

    public PhonebookLookupResultContact(Parcel parcel) {
        this.name = parcel.readString();
        this.recordId = parcel.readLong();
        this.email = parcel.readString();
        this.phone = parcel.readString();
        this.userId = parcel.readLong();
        this.isFriend = 4YW.A0K(parcel);
        this.profilePic = parcel.readString();
        this.ordinal = parcel.readLong();
        this.nativeName = parcel.readString();
        this.mutualFriends = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.recordId);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeLong(this.userId);
        parcel.writeByte(this.isFriend ? (byte) 1 : (byte) 0);
        parcel.writeString(this.profilePic);
        parcel.writeLong(this.ordinal);
        parcel.writeString(this.nativeName);
        parcel.writeInt(this.mutualFriends);
    }
}
