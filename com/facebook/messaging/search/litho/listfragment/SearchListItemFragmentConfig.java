package com.facebook.messaging.search.litho.listfragment;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SearchListItemFragmentConfig.class */
public final class SearchListItemFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(70);
    public final String A00;

    public SearchListItemFragmentConfig(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public SearchListItemFragmentConfig(String str) {
        C1pq.A08("identifierString", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SearchListItemFragmentConfig) && 11T.A0O(this.A00, ((SearchListItemFragmentConfig) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
