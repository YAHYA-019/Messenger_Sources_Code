package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationFundraiserReshareInfo.class */
public final class InspirationFundraiserReshareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(14);
    public final double A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public InspirationFundraiserReshareInfo(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A06 = C3o5.A0O(parcel);
    }

    public InspirationFundraiserReshareInfo(String str, String str2, String str3, String str4, String str5, double d, int i) {
        this.A02 = str;
        C1pq.A08("creationSource", str2);
        this.A03 = str2;
        this.A01 = i;
        C1pq.A08("fundraiserId", str3);
        this.A04 = str3;
        C1pq.A08("fundraiserName", str4);
        this.A05 = str4;
        this.A00 = d;
        this.A06 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationFundraiserReshareInfo)) {
                return false;
            }
            InspirationFundraiserReshareInfo inspirationFundraiserReshareInfo = (InspirationFundraiserReshareInfo) obj;
            if (!11T.A0O(this.A02, inspirationFundraiserReshareInfo.A02) || !11T.A0O(this.A03, inspirationFundraiserReshareInfo.A03) || this.A01 != inspirationFundraiserReshareInfo.A01 || !11T.A0O(this.A04, inspirationFundraiserReshareInfo.A04) || !11T.A0O(this.A05, inspirationFundraiserReshareInfo.A05) || this.A00 != inspirationFundraiserReshareInfo.A00 || !11T.A0O(this.A06, inspirationFundraiserReshareInfo.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A00(this.A00, C1pq.A04(this.A05, C1pq.A04(this.A04, (C1pq.A04(this.A03, C1pq.A03(this.A02)) * 31) + this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A00);
        1BL.A13(parcel, this.A06);
    }
}
