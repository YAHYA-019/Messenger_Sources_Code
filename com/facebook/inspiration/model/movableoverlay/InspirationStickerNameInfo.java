package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStickerNameInfo.class */
public final class InspirationStickerNameInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(49);
    public final String A00;
    public final String A01;
    public final String A02;

    public InspirationStickerNameInfo(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    public InspirationStickerNameInfo(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerNameInfo)) {
                return false;
            }
            InspirationStickerNameInfo inspirationStickerNameInfo = (InspirationStickerNameInfo) obj;
            if (!11T.A0O(this.A00, inspirationStickerNameInfo.A00) || !11T.A0O(this.A01, inspirationStickerNameInfo.A01) || !11T.A0O(this.A02, inspirationStickerNameInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
