package com.facebook.zero.protocol.params;

import X.4YV;
import X.7zM;
import X.AbstractC00603o4;
import X.AnonymousClass002;
import X.DKI;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* loaded from: FetchZeroDualTokenRequestParams.class */
public final class FetchZeroDualTokenRequestParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(76);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return "fetchZeroDualTokenRequestParams";
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroDualTokenRequestParams) {
            FetchZeroDualTokenRequestParams fetchZeroDualTokenRequestParams = (FetchZeroDualTokenRequestParams) obj;
            if (Objects.equal(super.A00, ((ZeroRequestBaseParams) fetchZeroDualTokenRequestParams).A00) && Objects.equal(super.A01, ((ZeroRequestBaseParams) fetchZeroDualTokenRequestParams).A01) && this.A03 == fetchZeroDualTokenRequestParams.A03 && this.A04 == fetchZeroDualTokenRequestParams.A04 && Objects.equal(this.A00, fetchZeroDualTokenRequestParams.A00) && Objects.equal(this.A01, fetchZeroDualTokenRequestParams.A01)) {
                z = 4YV.A1Z(this.A02, fetchZeroDualTokenRequestParams.A02);
            }
        }
        return z;
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public int hashCode() {
        return 7zM.A05(this.A02, AnonymousClass002.A07(this.A00, AnonymousClass002.A07(this.A01, (((this.A04 ? 1 : 0) * 31) + (this.A03 ? 1 : 0)) * 31)));
    }

    public String toString() {
        MoreObjects.ToStringHelper A0G = DKI.A0G(this, FetchZeroTokenRequestParams.class);
        A0G.add("dialtoneFetchBackupRewriteRules", String.valueOf(this.A03));
        A0G.add("normalFetchBackupRewriteRules", String.valueOf(this.A04));
        return 4YV.A0s(A0G, this.A02, AbstractC00603o4.A00(652));
    }

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
