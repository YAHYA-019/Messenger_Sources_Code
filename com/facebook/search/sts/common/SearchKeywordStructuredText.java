package com.facebook.search.sts.common;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SearchKeywordStructuredText.class */
public final class SearchKeywordStructuredText implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(7);
    public final ImmutableList A00;
    public final String A01;

    public SearchKeywordStructuredText(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        SearchKeywordResultIcon[] searchKeywordResultIconArr = new SearchKeywordResultIcon[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, searchKeywordResultIconArr, i);
        }
        this.A00 = ImmutableList.copyOf(searchKeywordResultIconArr);
        this.A01 = parcel.readString();
    }

    public SearchKeywordStructuredText(ImmutableList immutableList, String str) {
        C1pq.A08("icons", immutableList);
        this.A00 = immutableList;
        C1pq.A08("text", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SearchKeywordStructuredText)) {
                return false;
            }
            SearchKeywordStructuredText searchKeywordStructuredText = (SearchKeywordStructuredText) obj;
            if (!11T.A0O(this.A00, searchKeywordStructuredText.A00) || !11T.A0O(this.A01, searchKeywordStructuredText.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((SearchKeywordResultIcon) A0b.next(), i);
        }
        parcel.writeString(this.A01);
    }
}
