package com.facebook.zero.protocol.params;

import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* loaded from: FetchZeroTokenRequestParams.class */
public final class FetchZeroTokenRequestParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = new C4Ny(52);
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroTokenRequestParams) {
            FetchZeroTokenRequestParams fetchZeroTokenRequestParams = (FetchZeroTokenRequestParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) fetchZeroTokenRequestParams).A00) && Objects.equal(super.A01, ((ZeroRequestBaseParams) fetchZeroTokenRequestParams).A01) && this.A03 == fetchZeroTokenRequestParams.A03 && this.A02 == fetchZeroTokenRequestParams.A02 && Objects.equal(this.A00, fetchZeroTokenRequestParams.A00) && Objects.equal(this.A01, fetchZeroTokenRequestParams.A01)) {
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FetchZeroTokenRequestParams.class);
        stringHelper.add("carrierAndSimMccMnc", super.A00);
        stringHelper.add("networkType", super.A01);
        stringHelper.add("isDialtoneEnabled", String.valueOf(this.A03));
        stringHelper.add("fetchBackupRewriteRules", String.valueOf(this.A02));
        stringHelper.add("tokenRequestReason", this.A01);
        return stringHelper.toString();
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
