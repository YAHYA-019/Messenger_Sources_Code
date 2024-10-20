package com.facebook.search.sts.common;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GraphSearchKeywordStructuredInfo.class */
public final class GraphSearchKeywordStructuredInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(4);
    public final GraphSearchKeywordDirectNavResult A00;
    public final GraphSearchKeywordDisambiguationResult A01;
    public final GraphSearchKeywordHighConfidenceResult A02;
    public final SearchKeywordStructuredBadgeInfo A03;
    public final String A04;

    public GraphSearchKeywordStructuredInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        GraphSearchKeywordHighConfidenceResult graphSearchKeywordHighConfidenceResult = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (SearchKeywordStructuredBadgeInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (GraphSearchKeywordDirectNavResult) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (GraphSearchKeywordDisambiguationResult) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (GraphSearchKeywordHighConfidenceResult) parcel.readParcelable(A0e) : graphSearchKeywordHighConfidenceResult;
        this.A04 = C3o5.A0O(parcel);
    }

    public GraphSearchKeywordStructuredInfo(GraphSearchKeywordDirectNavResult graphSearchKeywordDirectNavResult, GraphSearchKeywordDisambiguationResult graphSearchKeywordDisambiguationResult, GraphSearchKeywordHighConfidenceResult graphSearchKeywordHighConfidenceResult, SearchKeywordStructuredBadgeInfo searchKeywordStructuredBadgeInfo, String str) {
        this.A03 = searchKeywordStructuredBadgeInfo;
        this.A00 = graphSearchKeywordDirectNavResult;
        this.A01 = graphSearchKeywordDisambiguationResult;
        this.A02 = graphSearchKeywordHighConfidenceResult;
        this.A04 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GraphSearchKeywordStructuredInfo)) {
                return false;
            }
            GraphSearchKeywordStructuredInfo graphSearchKeywordStructuredInfo = (GraphSearchKeywordStructuredInfo) obj;
            if (!11T.A0O(this.A03, graphSearchKeywordStructuredInfo.A03) || !11T.A0O(this.A00, graphSearchKeywordStructuredInfo.A00) || !11T.A0O(this.A01, graphSearchKeywordStructuredInfo.A01) || !11T.A0O(this.A02, graphSearchKeywordStructuredInfo.A02) || !11T.A0O(this.A04, graphSearchKeywordStructuredInfo.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A03)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        1BL.A13(parcel, this.A04);
    }
}
