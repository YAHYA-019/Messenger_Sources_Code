package com.google.android.gms.fido.fido2.api.common;

import X.1BK;
import X.AbstractC01153q8;
import X.DKD;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzu.class */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(24);

    public final boolean equals(Object obj) {
        return JQy.A1X(obj instanceof zzu ? 1 : 0);
    }

    public final int hashCode() {
        return DKD.A04(1BK.A0d());
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A06(parcel, 1, false);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
