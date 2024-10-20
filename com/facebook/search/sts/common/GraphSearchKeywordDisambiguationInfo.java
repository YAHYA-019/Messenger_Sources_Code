package com.facebook.search.sts.common;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: GraphSearchKeywordDisambiguationInfo.class */
public final class GraphSearchKeywordDisambiguationInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(1);
    public final SearchKeywordResultIcon A00;
    public final SearchKeywordStructuredText A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public GraphSearchKeywordDisambiguationInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SearchKeywordStructuredText searchKeywordStructuredText = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (SearchKeywordResultIcon) parcel.readParcelable(A0e);
        }
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
        this.A01 = parcel.readInt() != 0 ? (SearchKeywordStructuredText) parcel.readParcelable(A0e) : searchKeywordStructuredText;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public GraphSearchKeywordDisambiguationInfo(SearchKeywordResultIcon searchKeywordResultIcon, SearchKeywordStructuredText searchKeywordStructuredText, String str, String str2, String str3, String str4) {
        this.A00 = searchKeywordResultIcon;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = searchKeywordStructuredText;
        C1pq.A08("subtext", str3);
        this.A04 = str3;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GraphSearchKeywordDisambiguationInfo)) {
                return false;
            }
            GraphSearchKeywordDisambiguationInfo graphSearchKeywordDisambiguationInfo = (GraphSearchKeywordDisambiguationInfo) obj;
            if (!11T.A0O(this.A00, graphSearchKeywordDisambiguationInfo.A00) || !11T.A0O(this.A02, graphSearchKeywordDisambiguationInfo.A02) || !11T.A0O(this.A03, graphSearchKeywordDisambiguationInfo.A03) || !11T.A0O(this.A01, graphSearchKeywordDisambiguationInfo.A01) || !11T.A0O(this.A04, graphSearchKeywordDisambiguationInfo.A04) || !11T.A0O(this.A05, graphSearchKeywordDisambiguationInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
