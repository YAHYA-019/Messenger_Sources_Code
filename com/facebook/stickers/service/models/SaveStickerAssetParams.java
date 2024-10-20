package com.facebook.stickers.service.models;

import X.1BL;
import X.FKe;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SaveStickerAssetParams.class */
public final class SaveStickerAssetParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(61);
    public final Uri A00;
    public final String A01;
    public final String A02;

    public SaveStickerAssetParams(Uri uri, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = uri;
    }

    public SaveStickerAssetParams(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
