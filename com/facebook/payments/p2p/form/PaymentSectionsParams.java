package com.facebook.payments.p2p.form;

import X.11T;
import X.AbG;
import X.C1pq;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentSectionsParams.class */
public final class PaymentSectionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(78);
    public final ImmutableList A00;

    public PaymentSectionsParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = FJ8.A02(parcel);
    }

    public PaymentSectionsParams(ImmutableList immutableList) {
        C1pq.A08("sections", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PaymentSectionsParams) && 11T.A0O(this.A00, ((PaymentSectionsParams) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0B(parcel, this.A00);
    }
}
