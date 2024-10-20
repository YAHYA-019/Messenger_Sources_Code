package com.facebook.payments.shipping.addresspicker;

import X.1BL;
import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.shipping.model.AddressFormConfig;
import com.facebook.payments.shipping.model.MailingAddress;
import com.google.common.collect.ImmutableList;

/* loaded from: ShippingCoreClientData.class */
public final class ShippingCoreClientData implements CoreClientData {
    public static final Parcelable.Creator CREATOR = FKd.A00(89);
    public AddressFormConfig A00;
    public final ImmutableList A01;

    public ShippingCoreClientData(Parcel parcel) {
        this.A01 = AbN.A0e(parcel, MailingAddress.class);
        this.A00 = (AddressFormConfig) 1BL.A0C(parcel, AddressFormConfig.class);
    }

    public ShippingCoreClientData(AddressFormConfig addressFormConfig, ImmutableList immutableList) {
        this.A00 = addressFormConfig;
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
