package com.facebook.payments.p2p.model;

import X.2JX;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MarketplaceTransactionDisclaimerScreenDataParcelable.class */
public final class MarketplaceTransactionDisclaimerScreenDataParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(87);
    public final 2JX A00;

    public MarketplaceTransactionDisclaimerScreenDataParcelable(2JX r302) {
        this.A00 = r302;
    }

    public MarketplaceTransactionDisclaimerScreenDataParcelable(Parcel parcel) {
        2JX A01 = FJ8.A01(parcel);
        A01.getClass();
        this.A00 = A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0A(parcel, this.A00);
    }
}
