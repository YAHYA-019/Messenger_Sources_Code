package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationChannelReshareInfo.class */
public final class InspirationChannelReshareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(6);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public InspirationChannelReshareInfo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
    }

    public InspirationChannelReshareInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        C1pq.A08("channelDescription", str);
        this.A01 = str;
        C1pq.A08("channelImageUri", str2);
        this.A02 = str2;
        C1pq.A08("channelName", str3);
        this.A03 = str3;
        C1pq.A08("entryPoint", str4);
        this.A04 = str4;
        this.A00 = i;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        C1pq.A08("stickerStyle", str8);
        this.A08 = str8;
        C1pq.A08("threadId", str9);
        this.A09 = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationChannelReshareInfo)) {
                return false;
            }
            InspirationChannelReshareInfo inspirationChannelReshareInfo = (InspirationChannelReshareInfo) obj;
            if (!11T.A0O(this.A01, inspirationChannelReshareInfo.A01) || !11T.A0O(this.A02, inspirationChannelReshareInfo.A02) || !11T.A0O(this.A03, inspirationChannelReshareInfo.A03) || !11T.A0O(this.A04, inspirationChannelReshareInfo.A04) || this.A00 != inspirationChannelReshareInfo.A00 || !11T.A0O(this.A05, inspirationChannelReshareInfo.A05) || !11T.A0O(this.A06, inspirationChannelReshareInfo.A06) || !11T.A0O(this.A07, inspirationChannelReshareInfo.A07) || !11T.A0O(this.A08, inspirationChannelReshareInfo.A08) || !11T.A0O(this.A09, inspirationChannelReshareInfo.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))) * 31) + this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
    }
}
