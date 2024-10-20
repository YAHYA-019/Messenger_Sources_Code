package com.facebook.payments.p2p.model;

import X.2JX;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: P2pPromotionScreenInfoParcelable.class */
public final class P2pPromotionScreenInfoParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(90);
    public final 2JX A00;

    public P2pPromotionScreenInfoParcelable(2JX r302) {
        this.A00 = r302;
    }

    public P2pPromotionScreenInfoParcelable(Parcel parcel) {
        this.A00 = FJ8.A01(parcel);
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
