package com.facebook.payments.p2p.messenger.utils.sync.delta;

import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: PaymentsPrefetchedSyncData.class */
public final class PaymentsPrefetchedSyncData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(83);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return MoreObjects.toStringHelper(PaymentsPrefetchedSyncData.class).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
