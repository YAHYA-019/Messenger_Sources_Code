package com.facebook.stickers.service.models;

import X.0S2;
import X.1BM;
import X.1He;
import X.5Qx;
import X.7zM;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKF;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStickerPacksParams.class */
public final class FetchStickerPacksParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(50);
    public final 1He A00;
    public final 5Qx A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public FetchStickerPacksParams(1He r302, 5Qx r303, Integer num, String str) {
        this.A01 = r303;
        this.A00 = r302;
        this.A03 = str;
        this.A04 = false;
        this.A07 = false;
        this.A05 = false;
        this.A06 = false;
        this.A02 = num;
    }

    public FetchStickerPacksParams(Parcel parcel) {
        Integer num;
        this.A01 = 5Qx.valueOf(parcel.readString());
        this.A00 = 1He.valueOf(parcel.readString());
        this.A03 = parcel.readString();
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = AbJ.A1W(parcel);
        String readString = parcel.readString();
        if (readString.equals("APPEND_TO_DB")) {
            num = 0S2.A00;
        } else if (readString.equals("REPLACE_FROM_NETWORK")) {
            num = 0S2.A01;
        } else {
            if (!readString.equals("DO_NOT_UPDATE")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A0C;
        }
        this.A02 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchStickerPacksParams) {
            FetchStickerPacksParams fetchStickerPacksParams = (FetchStickerPacksParams) obj;
            if (this.A01 == fetchStickerPacksParams.A01 && this.A00 == fetchStickerPacksParams.A00 && this.A03 == fetchStickerPacksParams.A03 && this.A04 == fetchStickerPacksParams.A04 && this.A07 == fetchStickerPacksParams.A07 && this.A05 == fetchStickerPacksParams.A05 && this.A06 == fetchStickerPacksParams.A06 && this.A02 == fetchStickerPacksParams.A02) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        String str;
        int i = 0;
        int A04 = ((AnonymousClass002.A04(this.A01) * 31) + AnonymousClass002.A04(this.A00)) * 31;
        String str2 = this.A03;
        int hashCode = (((((((((A04 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31;
        Integer num = this.A02;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "REPLACE_FROM_NETWORK";
                    break;
                case 2:
                    str = "DO_NOT_UPDATE";
                    break;
                default:
                    str = "APPEND_TO_DB";
                    break;
            }
            i = 7zM.A04(str, intValue);
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        DKF.A1E(parcel, this.A01);
        DKF.A1E(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        switch (this.A02.intValue()) {
            case 1:
                str = "REPLACE_FROM_NETWORK";
                break;
            case 2:
                str = "DO_NOT_UPDATE";
                break;
            default:
                str = "APPEND_TO_DB";
                break;
        }
        parcel.writeString(str);
    }
}
