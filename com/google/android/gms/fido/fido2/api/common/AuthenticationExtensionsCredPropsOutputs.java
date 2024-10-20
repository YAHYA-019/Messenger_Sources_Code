package com.google.android.gms.fido.fido2.api.common;

import X.DKD;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: AuthenticationExtensionsCredPropsOutputs.class */
public final class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(14);
    public final boolean A00;

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.A00 == ((AuthenticationExtensionsCredPropsOutputs) obj).A00) {
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
