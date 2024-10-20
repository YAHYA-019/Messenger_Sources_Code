package com.facebook.messaging.stickers.keyboardopenparams;

import X.11T;
import X.4YT;
import X.7zU;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StickerPackOpenParams.class */
public final class StickerPackOpenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(70);
    public final String A00;

    public StickerPackOpenParams(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public StickerPackOpenParams(String str) {
        C1pq.A08(4YT.A00(444), str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StickerPackOpenParams) && 11T.A0O(this.A00, ((StickerPackOpenParams) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
