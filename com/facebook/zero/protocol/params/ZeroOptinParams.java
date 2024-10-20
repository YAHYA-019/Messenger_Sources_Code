package com.facebook.zero.protocol.params;

import X.4YT;
import X.4YU;
import X.4YV;
import X.DKI;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.google.common.base.Objects;

/* loaded from: ZeroOptinParams.class */
public final class ZeroOptinParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(81);
    public final String A00;

    public ZeroOptinParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public ZeroOptinParams(CarrierAndSimMccMnc carrierAndSimMccMnc, String str) {
        super(carrierAndSimMccMnc, str);
        this.A00 = "";
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return 4YT.A00(1605);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ZeroOptinParams) {
            ZeroOptinParams zeroOptinParams = (ZeroOptinParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) zeroOptinParams).A00) && Objects.equal(this.A01, zeroOptinParams.A01)) {
                z = 4YV.A1Z(this.A00, zeroOptinParams.A00);
            }
        }
        return z;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public int hashCode() {
        return 4YU.A04(super.A00, this.A01, this.A00);
    }

    public String toString() {
        return 4YV.A0s(DKI.A0G(this, ZeroOptinParams.class), this.A00, "subnoBlob");
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
