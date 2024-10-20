package com.facebook.search.sts.common;

import X.11T;
import X.4YV;
import X.4YW;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SearchKeywordStructuredBadgeInfo.class */
public final class SearchKeywordStructuredBadgeInfo implements Parcelable {
    public static volatile SearchKeywordStructuredText A03;
    public static final Parcelable.Creator CREATOR = FKe.A00(6);
    public final String A00;
    public final SearchKeywordStructuredText A01;
    public final Set A02;

    public SearchKeywordStructuredBadgeInfo(Parcel parcel) {
        this.A01 = parcel.readInt() == 0 ? null : (SearchKeywordStructuredText) parcel.readParcelable(4YV.A0e(this));
        this.A00 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public SearchKeywordStructuredBadgeInfo(SearchKeywordStructuredText searchKeywordStructuredText, String str, Set set) {
        this.A01 = searchKeywordStructuredText;
        C1pq.A08("text", str);
        this.A00 = str;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public SearchKeywordStructuredText A00() {
        if (this.A02.contains("structuredText")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    ImmutableList.of();
                    ImmutableList of = ImmutableList.of();
                    C1pq.A08("icons", of);
                    A03 = new SearchKeywordStructuredText(of, "");
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SearchKeywordStructuredBadgeInfo)) {
                return false;
            }
            SearchKeywordStructuredBadgeInfo searchKeywordStructuredBadgeInfo = (SearchKeywordStructuredBadgeInfo) obj;
            if (!11T.A0O(A00(), searchKeywordStructuredBadgeInfo.A00()) || !11T.A0O(this.A00, searchKeywordStructuredBadgeInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A01, i);
        parcel.writeString(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
