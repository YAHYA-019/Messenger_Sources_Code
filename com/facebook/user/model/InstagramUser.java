package com.facebook.user.model;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstagramUser.class */
public class InstagramUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(94);
    public final String instagramUserId;
    public final String profilePictureUrl;
    public final String userName;

    public InstagramUser() {
        this.instagramUserId = null;
        this.userName = null;
        this.profilePictureUrl = null;
    }

    public InstagramUser(Parcel parcel) {
        this.instagramUserId = parcel.readString();
        this.userName = parcel.readString();
        this.profilePictureUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.instagramUserId);
        parcel.writeString(this.userName);
        parcel.writeString(this.profilePictureUrl);
    }
}
