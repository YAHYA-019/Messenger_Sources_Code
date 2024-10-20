package com.facebook.stickers.service.models;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickersByPackIdParams.class */
public final class FetchStickersByPackIdParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(56);
    public final String A00;

    public FetchStickersByPackIdParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FetchStickersByPackIdParams)) {
            return false;
        }
        String str = this.A00;
        String str2 = ((FetchStickersByPackIdParams) obj).A00;
        return str == null ? str2 == null : str2 != null && str.equals(str2);
    }

    public int hashCode() {
        String str = this.A00;
        return str != null ? str.hashCode() : super.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
