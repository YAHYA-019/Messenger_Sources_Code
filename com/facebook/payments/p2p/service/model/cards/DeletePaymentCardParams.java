package com.facebook.payments.p2p.service.model.cards;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: DeletePaymentCardParams.class */
public final class DeletePaymentCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(7);
    public final String A00;

    public DeletePaymentCardParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public DeletePaymentCardParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "credentialId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
