package com.facebook.search.sts.common;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbF;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GraphSearchKeywordDirectNavResult.class */
public final class GraphSearchKeywordDirectNavResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(0);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public GraphSearchKeywordDirectNavResult(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
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
        this.A07 = AbN.A1U(parcel);
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A00 = parcel.readInt();
        this.A05 = C3o5.A0O(parcel);
        this.A06 = parcel.readString();
    }

    public GraphSearchKeywordDirectNavResult(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        C1pq.A08("fbid", str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A07 = z;
        this.A04 = str4;
        this.A00 = i;
        this.A05 = str5;
        AbF.A1V(str6);
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GraphSearchKeywordDirectNavResult)) {
                return false;
            }
            GraphSearchKeywordDirectNavResult graphSearchKeywordDirectNavResult = (GraphSearchKeywordDirectNavResult) obj;
            if (!11T.A0O(this.A01, graphSearchKeywordDirectNavResult.A01) || !11T.A0O(this.A02, graphSearchKeywordDirectNavResult.A02) || !11T.A0O(this.A03, graphSearchKeywordDirectNavResult.A03) || this.A07 != graphSearchKeywordDirectNavResult.A07 || !11T.A0O(this.A04, graphSearchKeywordDirectNavResult.A04) || this.A00 != graphSearchKeywordDirectNavResult.A00 || !11T.A0O(this.A05, graphSearchKeywordDirectNavResult.A05) || !11T.A0O(this.A06, graphSearchKeywordDirectNavResult.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))), this.A07)) * 31) + this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
    }
}
