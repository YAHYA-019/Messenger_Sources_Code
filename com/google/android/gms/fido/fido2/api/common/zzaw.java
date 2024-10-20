package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.DKD;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzaw.class */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(4);
    public final String A00;

    public zzaw(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return AbstractC09524qc.A00(this.A00, ((zzaw) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return DKD.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, str, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
