package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbN;
import X.C1pq;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.form.model.FormFieldAttributes;

/* loaded from: CouponCode.class */
public final class CouponCode implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(68);
    public final FormFieldAttributes A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public CouponCode(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = parcel.readString();
        this.A00 = (FormFieldAttributes) parcel.readParcelable(A0e);
        this.A02 = AbN.A1U(parcel);
        this.A01 = DKH.A0l(parcel);
    }

    public CouponCode(FormFieldAttributes formFieldAttributes, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = formFieldAttributes;
        this.A02 = z;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CouponCode)) {
                return false;
            }
            CouponCode couponCode = (CouponCode) obj;
            if (!11T.A0O(this.A03, couponCode.A03) || !11T.A0O(this.A00, couponCode.A00) || this.A02 != couponCode.A02 || !11T.A0O(this.A01, couponCode.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A00, C1pq.A03(this.A03)), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        4YW.A0E(parcel, this.A01);
    }
}
