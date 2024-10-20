package com.facebook.payments.picker.model;

import X.1BL;
import X.C53v;
import X.DKG;
import X.DKI;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.countdowntimer.model.PaymentsCountdownTimerParams;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: PickerScreenCommonConfig.class */
public final class PickerScreenCommonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(76);
    public final PaymentsCountdownTimerParams A00;
    public final boolean A01;
    public final boolean A02;
    public final PickerScreenAnalyticsParams analyticsParams;
    public final PaymentItemType paymentItemType;
    public final PickerScreenFetcherParams pickerScreenFetcherParams;
    public final PickerScreenStyle pickerScreenStyle;
    public final PickerScreenStyleParams styleParams;
    public final String title;

    public PickerScreenCommonConfig() {
        this.styleParams = new PickerScreenStyleParams(PaymentsDecoratorParams.A03(), RegularImmutableMap.A03);
        this.analyticsParams = null;
        this.pickerScreenStyle = null;
        this.paymentItemType = null;
        this.title = null;
        this.pickerScreenFetcherParams = new SimplePickerScreenFetcherParams(false);
        this.A00 = null;
        this.A02 = false;
        this.A01 = false;
    }

    public PickerScreenCommonConfig(Parcel parcel) {
        this.styleParams = (PickerScreenStyleParams) 1BL.A0C(parcel, PickerScreenStyleParams.class);
        this.analyticsParams = (PickerScreenAnalyticsParams) 1BL.A0C(parcel, PickerScreenAnalyticsParams.class);
        this.pickerScreenStyle = (PickerScreenStyle) C53v.A07(parcel, PickerScreenStyle.class);
        this.paymentItemType = DKG.A0k(parcel);
        this.title = parcel.readString();
        this.pickerScreenFetcherParams = (PickerScreenFetcherParams) 1BL.A0C(parcel, PickerScreenFetcherParams.class);
        parcel.readParcelable(ProductParcelableConfig.class.getClassLoader());
        this.A00 = (PaymentsCountdownTimerParams) 1BL.A0C(parcel, PaymentsCountdownTimerParams.class);
        this.A02 = DKI.A0J(parcel).booleanValue();
        this.A01 = C53v.A0S(parcel);
    }

    public PickerScreenCommonConfig(PaymentItemType paymentItemType, PickerScreenAnalyticsParams pickerScreenAnalyticsParams, PickerScreenFetcherParams pickerScreenFetcherParams, PickerScreenStyle pickerScreenStyle, PickerScreenStyleParams pickerScreenStyleParams, PaymentsCountdownTimerParams paymentsCountdownTimerParams, String str, boolean z) {
        pickerScreenStyleParams.getClass();
        this.styleParams = pickerScreenStyleParams;
        pickerScreenAnalyticsParams.getClass();
        this.analyticsParams = pickerScreenAnalyticsParams;
        pickerScreenStyle.getClass();
        this.pickerScreenStyle = pickerScreenStyle;
        this.paymentItemType = paymentItemType;
        str.getClass();
        this.title = str;
        this.pickerScreenFetcherParams = pickerScreenFetcherParams;
        this.A00 = paymentsCountdownTimerParams;
        this.A02 = false;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.styleParams, i);
        parcel.writeParcelable(this.analyticsParams, i);
        C53v.A0J(parcel, this.pickerScreenStyle);
        C53v.A0J(parcel, this.paymentItemType);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.pickerScreenFetcherParams, i);
        parcel.writeParcelable(null, i);
        parcel.writeParcelable(this.A00, i);
        C53v.A0I(parcel, Boolean.valueOf(this.A02));
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
