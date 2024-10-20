package com.facebook.payments.form.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CouponFormData.class */
public final class CouponFormData implements Parcelable, PaymentsFormData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(48);
    public final FormFieldAttributes A00;

    public CouponFormData(Parcel parcel) {
        this.A00 = (FormFieldAttributes) 1BL.A0C(parcel, getClass());
    }

    public CouponFormData(FormFieldAttributes formFieldAttributes) {
        C1pq.A08("couponFormFieldAttributes", formFieldAttributes);
        this.A00 = formFieldAttributes;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CouponFormData) && 11T.A0O(this.A00, ((CouponFormData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
