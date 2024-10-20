package com.facebook.payments.p2p.phases;

import X.11T;
import X.2JX;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.FJ8;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.messenger.common.idv.IdvPhaseLifecycleData;

/* loaded from: PaymentPhaseWrapper.class */
public final class PaymentPhaseWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(3);
    public final 2JX A00;
    public final IdvPhaseLifecycleData A01;

    public PaymentPhaseWrapper(2JX r302, IdvPhaseLifecycleData idvPhaseLifecycleData) {
        this.A01 = idvPhaseLifecycleData;
        C1pq.A08("phase", r302);
        this.A00 = r302;
    }

    public PaymentPhaseWrapper(Parcel parcel) {
        this.A01 = parcel.readInt() == 0 ? null : (IdvPhaseLifecycleData) parcel.readParcelable(4YV.A0e(this));
        this.A00 = FJ8.A01(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentPhaseWrapper)) {
                return false;
            }
            PaymentPhaseWrapper paymentPhaseWrapper = (PaymentPhaseWrapper) obj;
            if (!11T.A0O(this.A01, paymentPhaseWrapper.A01) || !11T.A0O(this.A00, paymentPhaseWrapper.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A01, i);
        FJ8.A0A(parcel, this.A00);
    }
}
