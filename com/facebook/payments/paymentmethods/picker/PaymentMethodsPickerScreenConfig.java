package com.facebook.payments.paymentmethods.picker;

import X.1BL;
import X.AbN;
import X.C53v;
import X.ERH;
import X.FKd;
import X.RVV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.picker.model.PickerScreenCommonConfig;
import com.facebook.payments.picker.model.PickerScreenConfig;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentMethodsPickerScreenConfig.class */
public final class PaymentMethodsPickerScreenConfig implements PickerScreenConfig {
    public static final Parcelable.Creator CREATOR = FKd.A00(70);
    public final PickerScreenCommonConfig A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public PaymentMethodsPickerScreenConfig(Parcel parcel) {
        this.A00 = (PickerScreenCommonConfig) 1BL.A0C(parcel, PickerScreenCommonConfig.class);
        this.A01 = AbN.A0e(parcel, ERH.class);
        this.A04 = C53v.A0S(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public PaymentMethodsPickerScreenConfig(PickerScreenCommonConfig pickerScreenCommonConfig, ImmutableList immutableList, String str) {
        this.A00 = pickerScreenCommonConfig;
        immutableList.getClass();
        this.A01 = immutableList;
        this.A04 = false;
        RVV.A00(pickerScreenCommonConfig.paymentItemType, ConstantsKt.CAMERA_ID_FRONT);
        this.A02 = ConstantsKt.CAMERA_ID_FRONT;
        this.A03 = str;
    }

    @Override // com.facebook.payments.picker.model.PickerScreenConfig
    public PickerScreenCommonConfig B2r() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
