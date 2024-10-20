package com.facebook.inspiration.capture.multicapture.remix.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationRemixableVideoAssetMetaData.class */
public final class InspirationRemixableVideoAssetMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(23);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public InspirationRemixableVideoAssetMetaData(Parcel parcel) {
        this.A08 = DKI.A0k(parcel, this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = C3o5.A0O(parcel);
    }

    public InspirationRemixableVideoAssetMetaData(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        this.A08 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        C1pq.A08("videoDownloadUrl", str4);
        this.A05 = str4;
        C1pq.A08("videoId", str5);
        this.A06 = str5;
        this.A07 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationRemixableVideoAssetMetaData)) {
                return false;
            }
            InspirationRemixableVideoAssetMetaData inspirationRemixableVideoAssetMetaData = (InspirationRemixableVideoAssetMetaData) obj;
            if (this.A08 != inspirationRemixableVideoAssetMetaData.A08 || this.A00 != inspirationRemixableVideoAssetMetaData.A00 || this.A01 != inspirationRemixableVideoAssetMetaData.A01 || !11T.A0O(this.A02, inspirationRemixableVideoAssetMetaData.A02) || !11T.A0O(this.A03, inspirationRemixableVideoAssetMetaData.A03) || !11T.A0O(this.A04, inspirationRemixableVideoAssetMetaData.A04) || !11T.A0O(this.A05, inspirationRemixableVideoAssetMetaData.A05) || !11T.A0O(this.A06, inspirationRemixableVideoAssetMetaData.A06) || !11T.A0O(this.A07, inspirationRemixableVideoAssetMetaData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, (((C1pq.A05(this.A08) * 31) + this.A00) * 31) + this.A01))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
    }
}
