package com.facebook.search.sts.common;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: GraphSearchKeywordHighConfidenceResult.class */
public final class GraphSearchKeywordHighConfidenceResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(3);
    public final SearchKeywordResultIcon A00;
    public final SearchKeywordStructuredText A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public GraphSearchKeywordHighConfidenceResult(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readString();
        SearchKeywordStructuredText searchKeywordStructuredText = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (SearchKeywordResultIcon) parcel.readParcelable(A0e);
        }
        this.A07 = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? (SearchKeywordStructuredText) parcel.readParcelable(A0e) : searchKeywordStructuredText;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
    }

    public GraphSearchKeywordHighConfidenceResult(SearchKeywordResultIcon searchKeywordResultIcon, SearchKeywordStructuredText searchKeywordStructuredText, String str, String str2, String str3, String str4, String str5, boolean z) {
        C1pq.A08("highConfidenceId", str);
        this.A02 = str;
        this.A00 = searchKeywordResultIcon;
        this.A07 = z;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = searchKeywordStructuredText;
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str4);
        this.A05 = str4;
        C1pq.A08("text", str5);
        this.A06 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GraphSearchKeywordHighConfidenceResult)) {
                return false;
            }
            GraphSearchKeywordHighConfidenceResult graphSearchKeywordHighConfidenceResult = (GraphSearchKeywordHighConfidenceResult) obj;
            if (!11T.A0O(this.A02, graphSearchKeywordHighConfidenceResult.A02) || !11T.A0O(this.A00, graphSearchKeywordHighConfidenceResult.A00) || this.A07 != graphSearchKeywordHighConfidenceResult.A07 || !11T.A0O(this.A03, graphSearchKeywordHighConfidenceResult.A03) || !11T.A0O(this.A04, graphSearchKeywordHighConfidenceResult.A04) || !11T.A0O(this.A01, graphSearchKeywordHighConfidenceResult.A01) || !11T.A0O(this.A05, graphSearchKeywordHighConfidenceResult.A05) || !11T.A0O(this.A06, graphSearchKeywordHighConfidenceResult.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A00, C1pq.A03(this.A02)), this.A07))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }
}
