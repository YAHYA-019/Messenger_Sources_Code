package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.LGn;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zav.class */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(85);
    public final int A00;
    public final IBinder A01;
    public final ConnectionResult A02;
    public final boolean A03;
    public final boolean A04;

    public zav(IBinder iBinder, ConnectionResult connectionResult, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = connectionResult;
        this.A03 = z;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof zav)) {
                return false;
            }
            zav zavVar = (zav) obj;
            if (!this.A02.equals(zavVar.A02)) {
                return false;
            }
            IBinder iBinder = this.A01;
            IAccountAccessor A00 = iBinder == null ? null : AccountAccessor.A00(iBinder);
            IBinder iBinder2 = zavVar.A01;
            if (!AbstractC09524qc.A00(A00, iBinder2 == null ? null : AccountAccessor.A00(iBinder2))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        IBinder iBinder = this.A01;
        if (iBinder != null) {
            int A01 = AbstractC01153q8.A01(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC01153q8.A03(parcel, A01);
        }
        AbstractC01153q8.A07(parcel, this.A02, 3, i);
        AbstractC01153q8.A06(parcel, 4, this.A03);
        AbstractC01153q8.A06(parcel, 5, this.A04);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
