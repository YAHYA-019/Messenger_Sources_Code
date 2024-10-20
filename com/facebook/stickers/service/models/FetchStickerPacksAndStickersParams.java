package com.facebook.stickers.service.models;

import X.1He;
import X.5Qx;
import X.AnonymousClass002;
import X.DKF;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickerPacksAndStickersParams.class */
public final class FetchStickerPacksAndStickersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(46);
    public final 1He A00;
    public final 5Qx A01;

    public FetchStickerPacksAndStickersParams(1He r302, 5Qx r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public FetchStickerPacksAndStickersParams(Parcel parcel) {
        this.A01 = 5Qx.valueOf(parcel.readString());
        this.A00 = 1He.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchStickerPacksAndStickersParams) {
            FetchStickerPacksAndStickersParams fetchStickerPacksAndStickersParams = (FetchStickerPacksAndStickersParams) obj;
            if (this.A01 == fetchStickerPacksAndStickersParams.A01 && this.A00 == fetchStickerPacksAndStickersParams.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A04 = AnonymousClass002.A04(this.A01) * 31;
        1He r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A04 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A01);
        DKF.A1E(parcel, this.A00);
    }
}
