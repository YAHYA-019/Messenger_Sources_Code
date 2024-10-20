package com.facebook.zero.protocol.params;

import X.4YT;
import X.4YV;
import X.DKI;
import X.FKb;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: FetchZeroInterstitialEligibilityParams.class */
public final class FetchZeroInterstitialEligibilityParams extends ZeroRequestBaseParams {
    public static final Parcelable.Creator CREATOR = FKb.A00(79);

    @Override // com.facebook.zero.protocol.params.ZeroRequestBaseParams
    public String A00() {
        return 4YT.A00(1116);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroInterstitialEligibilityParams) {
            ZeroRequestBaseParams zeroRequestBaseParams = (ZeroRequestBaseParams) obj;
            if (Objects.equal(this.A00, zeroRequestBaseParams.A00)) {
                z = 4YV.A1Z(this.A01, zeroRequestBaseParams.A01);
            }
        }
        return z;
    }

    public String toString() {
        return DKI.A0G(this, FetchZeroInterstitialEligibilityParams.class).toString();
    }
}
