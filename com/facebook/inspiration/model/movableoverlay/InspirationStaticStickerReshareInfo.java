package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStaticStickerReshareInfo.class */
public final class InspirationStaticStickerReshareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(46);
    public final String A00;

    public InspirationStaticStickerReshareInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public InspirationStaticStickerReshareInfo(String str) {
        C1pq.A08("stickerUri", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InspirationStaticStickerReshareInfo) && 11T.A0O(this.A00, ((InspirationStaticStickerReshareInfo) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
