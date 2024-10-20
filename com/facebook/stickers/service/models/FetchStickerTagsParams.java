package com.facebook.stickers.service.models;

import X.0S2;
import X.1He;
import X.AnonymousClass001;
import X.DKF;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickerTagsParams.class */
public final class FetchStickerTagsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(54);
    public final 1He A00;
    public final Integer A01;

    public FetchStickerTagsParams(1He r302, Integer num) {
        this.A00 = r302;
        this.A01 = num;
    }

    public FetchStickerTagsParams(Parcel parcel) {
        Integer num;
        this.A00 = 1He.valueOf(parcel.readString());
        String readString = parcel.readString();
        if (readString.equals("ALL")) {
            num = 0S2.A00;
        } else if (readString.equals("FEATURED")) {
            num = 0S2.A01;
        } else {
            if (!readString.equals("NON_FEATURED")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A0C;
        }
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        DKF.A1E(parcel, this.A00);
        switch (this.A01.intValue()) {
            case 1:
                str = "FEATURED";
                break;
            case 2:
                str = "NON_FEATURED";
                break;
            default:
                str = "ALL";
                break;
        }
        parcel.writeString(str);
    }
}
