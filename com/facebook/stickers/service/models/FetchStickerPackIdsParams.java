package com.facebook.stickers.service.models;

import X.5Qx;
import X.7zS;
import X.AnonymousClass002;
import X.DKF;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickerPackIdsParams.class */
public final class FetchStickerPackIdsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(44);
    public long A00;
    public boolean A01;
    public final 5Qx A02;

    public FetchStickerPackIdsParams(Parcel parcel) {
        this.A02 = 5Qx.valueOf(parcel.readString());
        this.A00 = parcel.readLong();
        this.A01 = 7zS.A1Z(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchStickerPackIdsParams) {
            FetchStickerPackIdsParams fetchStickerPackIdsParams = (FetchStickerPackIdsParams) obj;
            if (this.A02 == fetchStickerPackIdsParams.A02 && this.A00 == fetchStickerPackIdsParams.A00 && this.A01 == fetchStickerPackIdsParams.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A05(Long.valueOf(this.A00), AnonymousClass002.A04(this.A02) * 31) + (this.A01 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A02);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
