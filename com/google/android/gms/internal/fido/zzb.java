package com.google.android.gms.internal.fido;

import X.0FI;
import X.JQx;
import X.JQy;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(670219340, 0FI.A03(1617277324));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = 0FI.A03(319829779);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = 2061915392;
            0FI.A09(i4, A03);
            return z;
        }
        zzq zzqVar = (zzq) this;
        int A032 = 0FI.A03(-381567941);
        z = true;
        if (i == 1) {
            Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) JQy.A0R(parcel, PendingIntent.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw JQy.A0P(dataAvail);
            }
            zzqVar.DCQ(pendingIntent, status);
            i3 = -1407774653;
        } else {
            z = false;
            i3 = 1429328687;
        }
        0FI.A09(i3, A032);
        i4 = 2060134006;
        0FI.A09(i4, A03);
        return z;
    }
}
