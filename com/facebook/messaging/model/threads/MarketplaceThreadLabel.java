package com.facebook.messaging.model.threads;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MarketplaceThreadLabel.class */
public final class MarketplaceThreadLabel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(63);
    public final String A00;
    public final String A01;

    public MarketplaceThreadLabel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public MarketplaceThreadLabel(String str, String str2) {
        C1pq.A08("labelString", str);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketplaceThreadLabel)) {
                return false;
            }
            MarketplaceThreadLabel marketplaceThreadLabel = (MarketplaceThreadLabel) obj;
            if (!11T.A0O(this.A00, marketplaceThreadLabel.A00) || !11T.A0O(this.A01, marketplaceThreadLabel.A01)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
