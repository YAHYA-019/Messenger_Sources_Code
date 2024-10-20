package com.google.android.gms.fido.fido2.api.common;

import X.DKD;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: UserVerificationMethodExtension.class */
public final class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(8);
    public final boolean A00;

    public UserVerificationMethodExtension(boolean z) {
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof UserVerificationMethodExtension) && this.A00 == ((UserVerificationMethodExtension) obj).A00) {
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
