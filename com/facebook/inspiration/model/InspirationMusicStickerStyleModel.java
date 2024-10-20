package com.facebook.inspiration.model;

import X.C1pq;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationMusicStickerStyleModel.class */
public final class InspirationMusicStickerStyleModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(60);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public InspirationMusicStickerStyleModel(int i, int i2, int i3, boolean z) {
        this.A03 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public InspirationMusicStickerStyleModel(Parcel parcel) {
        this.A03 = DKI.A0k(parcel, this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMusicStickerStyleModel)) {
                return false;
            }
            InspirationMusicStickerStyleModel inspirationMusicStickerStyleModel = (InspirationMusicStickerStyleModel) obj;
            if (this.A03 != inspirationMusicStickerStyleModel.A03 || this.A00 != inspirationMusicStickerStyleModel.A00 || this.A01 != inspirationMusicStickerStyleModel.A01 || this.A02 != inspirationMusicStickerStyleModel.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((C1pq.A05(this.A03) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
