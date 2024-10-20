package com.facebook.zero.protocol.params;

import X.1BL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import java.util.Arrays;

/* loaded from: ZeroRequestBaseParams.class */
public abstract class ZeroRequestBaseParams implements Parcelable {
    public final CarrierAndSimMccMnc A00;
    public final String A01;

    public ZeroRequestBaseParams(Parcel parcel) {
        this.A00 = (CarrierAndSimMccMnc) 1BL.A0C(parcel, CarrierAndSimMccMnc.class);
        this.A01 = parcel.readString();
    }

    public ZeroRequestBaseParams(CarrierAndSimMccMnc carrierAndSimMccMnc, String str) {
        this.A00 = carrierAndSimMccMnc;
        this.A01 = str;
    }

    public String A00() {
        return "fetchZeroTokenRequestParams";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
