package com.google.android.gms.fido.fido2.api.common;

import X.DKD;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: GoogleThirdPartyPaymentExtension.class */
public final class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(91);
    public final boolean A00;

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof GoogleThirdPartyPaymentExtension) && this.A00 == ((GoogleThirdPartyPaymentExtension) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return DKD.A04(Boolean.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JQy.A15(parcel, JQx.A0E(parcel), this.A00);
    }
}
