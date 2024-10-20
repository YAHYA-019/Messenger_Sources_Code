package com.facebook.api.growth.contactimporter;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UsersInviteResult.class */
public class UsersInviteResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(1);
    public final String email;
    public final String inviteStatus;
    public final String normalizedId;
    public final long userId;

    public UsersInviteResult() {
        this.email = null;
        this.inviteStatus = null;
        this.normalizedId = null;
        this.userId = -1;
    }

    public UsersInviteResult(Parcel parcel) {
        this.email = parcel.readString();
        this.inviteStatus = parcel.readString();
        this.normalizedId = parcel.readString();
        this.userId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.email);
        parcel.writeString(this.inviteStatus);
        parcel.writeString(this.normalizedId);
        parcel.writeLong(this.userId);
    }
}
