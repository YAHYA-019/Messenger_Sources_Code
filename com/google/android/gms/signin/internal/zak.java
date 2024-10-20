package com.google.android.gms.signin.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* loaded from: zak.class */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(49);
    public final int A00;
    public final ConnectionResult A01;
    public final zav A02;

    public zak(ConnectionResult connectionResult, zav zavVar, int i) {
        this.A00 = i;
        this.A01 = connectionResult;
        this.A02 = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A07(parcel, this.A01, 2, i);
        AbstractC01153q8.A07(parcel, this.A02, 3, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
