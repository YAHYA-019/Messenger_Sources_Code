package com.facebook.payments.auth.pin.model;

import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentPinStatus.class */
public final class PaymentPinStatus implements Parcelable {
    public static final PaymentPinStatus A04 = new PaymentPinStatus(ImmutableList.of(), ImmutableList.of(), null, false);
    public static final Parcelable.Creator CREATOR = FKY.A00(39);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    public PaymentPinStatus(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = C53v.A0S(parcel);
        this.A00 = C53v.A01(parcel);
        this.A01 = C53v.A01(parcel);
    }

    public PaymentPinStatus(ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        immutableList.getClass();
        this.A00 = immutableList;
        immutableList2.getClass();
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }
}
