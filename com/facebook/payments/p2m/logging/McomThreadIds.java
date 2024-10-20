package com.facebook.payments.p2m.logging;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: McomThreadIds.class */
public final class McomThreadIds implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(71);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public McomThreadIds(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = C3o5.A0O(parcel);
        this.A06 = parcel.readString();
    }

    public McomThreadIds(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        this.A01 = str;
        this.A00 = i;
        C1pq.A08("listingInventoryType", str2);
        this.A02 = str2;
        C1pq.A08("messageThreadGraphQLId", str3);
        this.A03 = str3;
        C1pq.A08("messageThreadId", str4);
        this.A04 = str4;
        this.A05 = str5;
        C1pq.A08("sessionId", str6);
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof McomThreadIds)) {
                return false;
            }
            McomThreadIds mcomThreadIds = (McomThreadIds) obj;
            if (!11T.A0O(this.A01, mcomThreadIds.A01) || this.A00 != mcomThreadIds.A00 || !11T.A0O(this.A02, mcomThreadIds.A02) || !11T.A0O(this.A03, mcomThreadIds.A03) || !11T.A0O(this.A04, mcomThreadIds.A04) || !11T.A0O(this.A05, mcomThreadIds.A05) || !11T.A0O(this.A06, mcomThreadIds.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, (C1pq.A03(this.A01) * 31) + this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
    }
}
