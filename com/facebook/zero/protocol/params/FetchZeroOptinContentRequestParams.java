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

/* loaded from: FetchZeroOptinContentRequestParams.class */
public final class FetchZeroOptinContentRequestParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(80);
    public final String A00;

    public FetchZeroOptinContentRequestParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public FetchZeroOptinContentRequestParams(CarrierAndSimMccMnc carrierAndSimMccMnc, String str, String str2) {
        super(carrierAndSimMccMnc, str);
        this.A00 = str2;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return 4YT.A00(1117);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroOptinContentRequestParams) {
            FetchZeroOptinContentRequestParams fetchZeroOptinContentRequestParams = (FetchZeroOptinContentRequestParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) fetchZeroOptinContentRequestParams).A00) && Objects.equal(this.A01, fetchZeroOptinContentRequestParams.A01)) {
                z = 4YV.A1Z(this.A00, fetchZeroOptinContentRequestParams.A00);
            }
        }
        return z;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public int hashCode() {
        return 4YU.A04(super.A00, this.A01, this.A00);
    }

    public String toString() {
        return 4YV.A0s(DKI.A0G(this, FetchZeroOptinContentRequestParams.class), this.A00, "screenScale");
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
