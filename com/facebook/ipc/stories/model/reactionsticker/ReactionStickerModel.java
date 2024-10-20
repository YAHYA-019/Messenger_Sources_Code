package com.facebook.ipc.stories.model.reactionsticker;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbF;
import X.AbI;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ReactionStickerModel.class */
public final class ReactionStickerModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(63);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ReactionStickerModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        KeyFrameInfo[] keyFrameInfoArr = new KeyFrameInfo[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, keyFrameInfoArr, i);
        }
        this.A01 = ImmutableList.copyOf(keyFrameInfoArr);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public ReactionStickerModel(ImmutableList immutableList, String str, String str2, String str3, String str4, int i) {
        C1pq.A08("animationAssets", immutableList);
        this.A01 = immutableList;
        AbF.A1T(str);
        this.A02 = str;
        C1pq.A08("staticUri", str2);
        this.A03 = str2;
        C1pq.A08("stickerAccessibilityLabel", str3);
        this.A04 = str3;
        C1pq.A08("stickerAssetId", str4);
        this.A05 = str4;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReactionStickerModel)) {
                return false;
            }
            ReactionStickerModel reactionStickerModel = (ReactionStickerModel) obj;
            if (!11T.A0O(this.A01, reactionStickerModel.A01) || !11T.A0O(this.A02, reactionStickerModel.A02) || !11T.A0O(this.A03, reactionStickerModel.A03) || !11T.A0O(this.A04, reactionStickerModel.A04) || !11T.A0O(this.A05, reactionStickerModel.A05) || this.A00 != reactionStickerModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((KeyFrameInfo) A0b.next(), i);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
    }
}
