package com.facebook.ipc.pages;

import X.4YV;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: PageInfo.class */
public class PageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(61);
    public final String accessToken;
    public final long pageId;
    public final String pageName;
    public final String pageUrl;
    public final List permission;
    public final String squareProfilePicUrl;

    public PageInfo() {
        this.pageId = 0L;
        this.pageName = null;
        this.accessToken = null;
        this.squareProfilePicUrl = null;
        this.permission = null;
        this.pageUrl = null;
    }

    public PageInfo(Parcel parcel) {
        this.pageId = parcel.readLong();
        this.pageName = parcel.readString();
        this.accessToken = parcel.readString();
        this.squareProfilePicUrl = parcel.readString();
        this.permission = 4YV.A0y(parcel, String.class);
        this.pageUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.pageId);
        parcel.writeString(this.pageName);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.squareProfilePicUrl);
        parcel.writeList(this.permission);
        parcel.writeString(this.pageUrl);
    }
}
