package com.facebook.zero.protocol.params;

import X.4YT;
import X.4YV;
import X.DKI;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: FetchZeroInterstitialContentParams.class */
public final class FetchZeroInterstitialContentParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(78);
    public final String A00;
    public final String A01;
    public final String A02;

    public FetchZeroInterstitialContentParams(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public FetchZeroInterstitialContentParams(CarrierAndSimMccMnc carrierAndSimMccMnc, String str, String str2, String str3, String str4) {
        super(carrierAndSimMccMnc, str);
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return 4YT.A00(1115);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroInterstitialContentParams) {
            FetchZeroInterstitialContentParams fetchZeroInterstitialContentParams = (FetchZeroInterstitialContentParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) fetchZeroInterstitialContentParams).A00) && Objects.equal(super.A01, ((ZeroRequestBaseParams) fetchZeroInterstitialContentParams).A01)) {
                String str = this.A01;
                String str2 = fetchZeroInterstitialContentParams.A01;
                if (Objects.equal(str, str2) && Objects.equal(this.A02, str2)) {
                    z = 4YV.A1Z(this.A00, str2);
                }
            }
        }
        return z;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public int hashCode() {
        return Arrays.hashCode(new Object[]{super.A00, super.A01, this.A01, this.A02, this.A00});
    }

    public String toString() {
        MoreObjects.ToStringHelper A0G = DKI.A0G(this, FetchZeroInterstitialContentParams.class);
        A0G.add("screenScale", this.A01);
        A0G.add(OptSvcAnalyticsStore.LOGGING_KEY_STEP, this.A02);
        return 4YV.A0s(A0G, this.A00, "action");
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
