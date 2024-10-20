package com.facebook.stickers.service.models;

import X.1BL;
import X.1JF;
import X.AnonymousClass002;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickerPacksApiParams.class */
public final class FetchStickerPacksApiParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(48);
    public final int A00;
    public final long A01;
    public final FetchStickerPacksParams A02;
    public final String A03;

    public FetchStickerPacksApiParams(Parcel parcel) {
        this.A02 = (FetchStickerPacksParams) 1BL.A0C(parcel, FetchStickerPacksParams.class);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A01 = parcel.readLong();
    }

    public FetchStickerPacksApiParams(FetchStickerPacksParams fetchStickerPacksParams, long j) {
        this.A02 = fetchStickerPacksParams;
        this.A00 = 1000;
        this.A03 = null;
        this.A01 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchStickerPacksApiParams) {
            FetchStickerPacksApiParams fetchStickerPacksApiParams = (FetchStickerPacksApiParams) obj;
            if (this.A02.equals(fetchStickerPacksApiParams.A02) && this.A00 == fetchStickerPacksApiParams.A00 && 1JF.A0C(this.A03, fetchStickerPacksApiParams.A03) && this.A01 == fetchStickerPacksApiParams.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A04 = ((AnonymousClass002.A04(this.A02) * 31) + this.A00) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A04 + i) * 31) + 1BL.A01(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
    }
}
