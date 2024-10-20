package com.facebook.zero.protocol.params;

import X.4YT;
import X.4YU;
import X.4YV;
import X.DKI;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: FetchZeroIndicatorRequestParams.class */
public final class FetchZeroIndicatorRequestParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(77);
    public final String A00;

    public FetchZeroIndicatorRequestParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return 4YT.A00(1114);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroIndicatorRequestParams) {
            FetchZeroIndicatorRequestParams fetchZeroIndicatorRequestParams = (FetchZeroIndicatorRequestParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) fetchZeroIndicatorRequestParams).A00) && Objects.equal(this.A01, fetchZeroIndicatorRequestParams.A01)) {
                z = 4YV.A1Z(this.A00, fetchZeroIndicatorRequestParams.A00);
            }
        }
        return z;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public int hashCode() {
        return 4YU.A04(super.A00, this.A01, this.A00);
    }

    public String toString() {
        return 4YV.A0s(DKI.A0G(this, FetchZeroInterstitialContentParams.class), this.A00, "screenScale");
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
