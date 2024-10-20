package com.google.android.gms.internal.p002authapiphone;

import X.0FI;
import X.JQx;
import X.JQy;
import X.KY4;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-688269044, 0FI.A03(-926332573));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = 0FI.A03(-1007757403);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = 2087296780;
            0FI.A09(i4, A03);
            return z;
        }
        zzz zzzVar = (zzz) this;
        int A032 = 0FI.A03(-277024361);
        z = true;
        if (i == 1) {
            Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
            int A033 = 0FI.A03(-839919989);
            KY4.A00(status, zzzVar.A00, (Object) null);
            0FI.A09(18575256, A033);
            i3 = 1367700893;
        } else {
            z = false;
            i3 = -1307104644;
        }
        0FI.A09(i3, A032);
        i4 = -1137030019;
        0FI.A09(i4, A03);
        return z;
    }
}
