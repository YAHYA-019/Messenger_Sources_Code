package com.facebook.inspiration.model;

import X.11T;
import X.4YW;
import X.7zK;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationAvatarStickerModel.class */
public final class InspirationAvatarStickerModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(45);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public InspirationAvatarStickerModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = DKH.A0l(parcel);
    }

    public InspirationAvatarStickerModel(String str, String str2, String str3, String str4, String str5) {
        C1pq.A08("avatarStickerTemplateId", str);
        this.A00 = str;
        AbF.A1T(str2);
        this.A01 = str2;
        C1pq.A08(7zK.A00(39), str3);
        this.A02 = str3;
        C1pq.A08("stickerType", str4);
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAvatarStickerModel)) {
                return false;
            }
            InspirationAvatarStickerModel inspirationAvatarStickerModel = (InspirationAvatarStickerModel) obj;
            if (!11T.A0O(this.A00, inspirationAvatarStickerModel.A00) || !11T.A0O(this.A01, inspirationAvatarStickerModel.A01) || !11T.A0O(this.A02, inspirationAvatarStickerModel.A02) || !11T.A0O(this.A03, inspirationAvatarStickerModel.A03) || !11T.A0O(this.A04, inspirationAvatarStickerModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        4YW.A0E(parcel, this.A04);
    }
}
