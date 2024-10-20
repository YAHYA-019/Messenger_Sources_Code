package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BM;
import X.7zU;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreateStickerInfo.class */
public final class CreateStickerInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(1);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public CreateStickerInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CreateStickerInfo(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AbF.A1T(str);
        this.A00 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        C1pq.A08("promptText", str2);
        this.A01 = str2;
        C1pq.A08("url", str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreateStickerInfo)) {
                return false;
            }
            CreateStickerInfo createStickerInfo = (CreateStickerInfo) obj;
            if (!11T.A0O(this.A00, createStickerInfo.A00) || this.A03 != createStickerInfo.A03 || this.A04 != createStickerInfo.A04 || this.A05 != createStickerInfo.A05 || !11T.A0O(this.A01, createStickerInfo.A01) || !11T.A0O(this.A02, createStickerInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A03), this.A04), this.A05)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
