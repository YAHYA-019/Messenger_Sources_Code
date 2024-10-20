package com.facebook.search.serverdriven.dedup;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SearchTypeaheadSuggestionKeys.class */
public final class SearchTypeaheadSuggestionKeys implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(99);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;

    public SearchTypeaheadSuggestionKeys(Parcel parcel) {
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A01 = immutableList;
        this.A00 = parcel.readInt();
    }

    public SearchTypeaheadSuggestionKeys(ImmutableList immutableList, String str, int i) {
        this.A02 = str;
        this.A01 = immutableList;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SearchTypeaheadSuggestionKeys)) {
                return false;
            }
            SearchTypeaheadSuggestionKeys searchTypeaheadSuggestionKeys = (SearchTypeaheadSuggestionKeys) obj;
            if (!11T.A0O(this.A02, searchTypeaheadSuggestionKeys.A02) || !11T.A0O(this.A01, searchTypeaheadSuggestionKeys.A01) || this.A00 != searchTypeaheadSuggestionKeys.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A01, C1pq.A03(this.A02)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeInt(this.A00);
    }
}
