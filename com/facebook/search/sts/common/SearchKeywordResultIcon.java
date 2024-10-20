package com.facebook.search.sts.common;

import X.11T;
import X.1BK;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.FKe;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SearchKeywordResultIcon.class */
public final class SearchKeywordResultIcon implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(5);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SearchKeywordResultIcon(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    public SearchKeywordResultIcon(String str, String str2, String str3, int i) {
        C1pq.A08("color", str);
        this.A01 = str;
        AbF.A1U(str2);
        this.A02 = str2;
        this.A00 = i;
        C1pq.A08("variant", str3);
        this.A03 = str3;
        if ((str3 == null || !str3.equalsIgnoreCase("filled")) && (str3 == null || !str3.equalsIgnoreCase("outline"))) {
            throw 1BK.A0g();
        }
        String str4 = this.A01;
        if (str4 != null) {
            Color.parseColor(str4);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SearchKeywordResultIcon)) {
                return false;
            }
            SearchKeywordResultIcon searchKeywordResultIcon = (SearchKeywordResultIcon) obj;
            if (!11T.A0O(this.A01, searchKeywordResultIcon.A01) || !11T.A0O(this.A02, searchKeywordResultIcon.A02) || this.A00 != searchKeywordResultIcon.A00 || !11T.A0O(this.A03, searchKeywordResultIcon.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
