package com.facebook.stickers.service.models;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StickerSearchParams.class */
public final class StickerSearchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(62);
    public final String A00;
    public final String A01;

    public StickerSearchParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public StickerSearchParams(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
