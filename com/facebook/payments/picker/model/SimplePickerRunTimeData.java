package com.facebook.payments.picker.model;

import X.1BL;
import X.C53v;
import android.os.Parcel;
import com.google.common.collect.ImmutableMap;

/* loaded from: SimplePickerRunTimeData.class */
public abstract class SimplePickerRunTimeData implements PickerRunTimeData {
    public final CoreClientData A00;
    public final PickerScreenConfig A01;
    public final PickerScreenFetcherParams A02;
    public final ImmutableMap A03;

    public SimplePickerRunTimeData(Parcel parcel) {
        this.A01 = (PickerScreenConfig) 1BL.A0C(parcel, PickerScreenConfig.class);
        this.A02 = (PickerScreenFetcherParams) 1BL.A0C(parcel, PickerScreenFetcherParams.class);
        this.A00 = (CoreClientData) 1BL.A0C(parcel, CoreClientData.class);
        this.A03 = C53v.A05(parcel);
    }

    public SimplePickerRunTimeData(CoreClientData coreClientData, PickerScreenConfig pickerScreenConfig, PickerScreenFetcherParams pickerScreenFetcherParams, ImmutableMap immutableMap) {
        this.A01 = pickerScreenConfig;
        this.A02 = pickerScreenFetcherParams;
        this.A00 = coreClientData;
        this.A03 = immutableMap;
    }

    public SimplePickerRunTimeData(PickerScreenConfig pickerScreenConfig) {
        this.A01 = pickerScreenConfig;
        PickerScreenCommonConfig B2r = pickerScreenConfig.B2r();
        this.A02 = B2r.pickerScreenFetcherParams;
        this.A00 = null;
        this.A03 = B2r.styleParams.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeMap(this.A03);
    }
}
