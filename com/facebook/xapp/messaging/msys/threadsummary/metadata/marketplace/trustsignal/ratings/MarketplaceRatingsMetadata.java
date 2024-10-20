package com.facebook.xapp.messaging.msys.threadsummary.metadata.marketplace.trustsignal.ratings;

import X.11T;
import X.1BL;
import X.82N;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: MarketplaceRatingsMetadata.class */
public final class MarketplaceRatingsMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A02;
    public static final Parcelable.Creator CREATOR = new 82N(23);
    public final double A00;
    public final int A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(MarketplaceRatingsMetadata.class, null);
    }

    public MarketplaceRatingsMetadata(int i, double d) {
        this.A00 = d;
        this.A01 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketplaceRatingsMetadata)) {
                return false;
            }
            MarketplaceRatingsMetadata marketplaceRatingsMetadata = (MarketplaceRatingsMetadata) obj;
            if (Double.compare(this.A00, marketplaceRatingsMetadata.A00) != 0 || this.A01 != marketplaceRatingsMetadata.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A01(Double.doubleToLongBits(this.A00)) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A01);
    }
}
