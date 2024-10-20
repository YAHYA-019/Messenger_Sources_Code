package com.google.android.gms.internal.auth;

import X.0FI;
import X.JQx;
import X.JQy;
import X.K2M;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-321684353, 0FI.A03(178570651));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = 0FI.A03(-2033467173);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = 75942226;
            0FI.A09(i4, A03);
            return z;
        }
        zzw zzwVar = (zzw) this;
        int A032 = 0FI.A03(-2081466325);
        if (i == 2) {
            Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
            Object createFromParcel = parcel.readInt() == 0 ? null : Bundle.CREATOR.createFromParcel(parcel);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw JQy.A0P(dataAvail);
            }
            int A033 = 0FI.A03(826791745);
            K2M.A02(status, zzwVar.A00, createFromParcel);
            0FI.A09(2120761652, A033);
            z = true;
            i3 = 1991893942;
        } else {
            z = false;
            i3 = 1803982827;
        }
        0FI.A09(i3, A032);
        i4 = -41829849;
        0FI.A09(i4, A03);
        return z;
    }
}
