package com.facebook.payments.picker.model;

import X.1BL;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: PickerScreenStyleParams.class */
public class PickerScreenStyleParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(77);
    public final ImmutableMap A00;
    public final PaymentsDecoratorParams paymentsDecoratorParams;

    public PickerScreenStyleParams() {
        this.paymentsDecoratorParams = PaymentsDecoratorParams.A03();
        this.A00 = RegularImmutableMap.A03;
    }

    public PickerScreenStyleParams(Parcel parcel) {
        this.paymentsDecoratorParams = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A00 = C53v.A05(parcel);
    }

    public PickerScreenStyleParams(PaymentsDecoratorParams paymentsDecoratorParams, ImmutableMap immutableMap) {
        this.paymentsDecoratorParams = paymentsDecoratorParams;
        this.A00 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.paymentsDecoratorParams, i);
        parcel.writeMap(this.A00);
    }
}
