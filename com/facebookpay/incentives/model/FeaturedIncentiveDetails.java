package com.facebookpay.incentives.model;

import X.11T;
import X.LGp;
import X.MPZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FeaturedIncentiveDetails.class */
public final class FeaturedIncentiveDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(96);
    public final MPZ A00;
    public final String A01;

    public FeaturedIncentiveDetails() {
        this(null, null);
    }

    public FeaturedIncentiveDetails(MPZ mpz, String str) {
        this.A00 = mpz;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeString(this.A01);
    }
}
