package com.facebook.ipc.stories.model.reactionsticker;

import X.11T;
import X.7zU;
import X.AbM;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: KeyFrameInfo.class */
public final class KeyFrameInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(62);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public KeyFrameInfo(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
    }

    public KeyFrameInfo(String str, String str2, String str3, String str4, float f, float f2, float f3, float f4) {
        C1pq.A08("animationId", str);
        this.A04 = str;
        C1pq.A08("animationType", str2);
        this.A05 = str2;
        C1pq.A08("keyFrameAsset", str3);
        this.A06 = str3;
        C1pq.A08("staticFrame", str4);
        this.A07 = str4;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof KeyFrameInfo)) {
                return false;
            }
            KeyFrameInfo keyFrameInfo = (KeyFrameInfo) obj;
            if (!11T.A0O(this.A04, keyFrameInfo.A04) || !11T.A0O(this.A05, keyFrameInfo.A05) || !11T.A0O(this.A06, keyFrameInfo.A06) || !11T.A0O(this.A07, keyFrameInfo.A07) || this.A00 != keyFrameInfo.A00 || this.A01 != keyFrameInfo.A01 || this.A02 != keyFrameInfo.A02 || this.A03 != keyFrameInfo.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(AbM.A00(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04)))), this.A00), this.A01), this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }
}
