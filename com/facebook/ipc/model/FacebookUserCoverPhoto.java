package com.facebook.ipc.model;

import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FacebookUserCoverPhoto.class */
public class FacebookUserCoverPhoto implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(58);
    public final long coverID;
    public final float offsetX;
    public final float offsetY;
    public final String source;

    public FacebookUserCoverPhoto() {
        this.coverID = -1;
        this.source = null;
        float f = 0.0f / 0.0f;
        this.offsetX = f;
        this.offsetY = f;
    }

    public FacebookUserCoverPhoto(Parcel parcel) {
        this.coverID = parcel.readLong();
        this.source = parcel.readString();
        this.offsetX = parcel.readFloat();
        this.offsetY = parcel.readFloat();
    }

    public FacebookUserCoverPhoto(String str) {
        this.coverID = -1;
        this.source = str;
        float f = 0.0f / 0.0f;
        this.offsetX = f;
        this.offsetY = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.coverID);
        parcel.writeString(this.source);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
    }
}
