package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC00481b7;
import X.DKD;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzad.class */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(90);
    public final boolean A00;

    public zzad(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AbstractC00481b7.A02(valueOf);
        this.A00 = valueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof zzad) && this.A00 == ((zzad) obj).A00) {
            z = true;
        }
        return z;
    }

    public final int hashCode() {
        return DKD.A04(Boolean.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JQy.A15(parcel, JQx.A0E(parcel), this.A00);
    }
}
