package com.google.android.gms.internal.location;

import X.0FI;
import X.JQx;
import X.JQy;
import X.KjZ;
import X.LcP;
import X.LoX;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: zza.class */
public abstract class zza extends Binder implements IInterface {
    public zza(String str) {
        int A03 = 0FI.A03(1432871374);
        attachInterface(this, str);
        0FI.A09(-703433712, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-65678159, 0FI.A03(1813310896));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        boolean z;
        int i3;
        int A032;
        int i4;
        int i5;
        int A033 = 0FI.A03(-1221644972);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i5 = -62759463;
            0FI.A09(i5, A033);
            return z;
        }
        if (this instanceof zzaz) {
            zzaz zzazVar = (zzaz) this;
            A03 = 0FI.A03(1226516167);
            z = true;
            if (i == 1) {
                Object createFromParcel = parcel.readInt() == 0 ? null : LocationSettingsResult.CREATOR.createFromParcel(parcel);
                int A034 = 0FI.A03(-1860818505);
                zzazVar.A00.Cu3(createFromParcel);
                zzazVar.A00 = null;
                0FI.A09(1377546889, A034);
                i3 = -343838041;
            } else {
                z = false;
                i3 = -1697043938;
            }
        } else {
            if (this instanceof zzz) {
                zzz zzzVar = (zzz) this;
                int A035 = 0FI.A03(715726681);
                if (i == 1) {
                    zzac zzacVar = (zzac) JQy.A0R(parcel, zzac.CREATOR);
                    A032 = 0FI.A03(1921097498);
                    zzzVar.A00.Cu3(zzacVar.A00);
                    i4 = -1265217606;
                } else {
                    if (i != 2) {
                        0FI.A09(-1598604518, A035);
                        z = false;
                        i5 = 1093600575;
                        0FI.A09(i5, A033);
                        return z;
                    }
                    A032 = 0FI.A03(-119558372);
                    i4 = -245868133;
                }
                0FI.A09(i4, A032);
                0FI.A09(1405533967, A035);
                z = true;
                i5 = 1093600575;
                0FI.A09(i5, A033);
                return z;
            }
            zzaw zzawVar = (zzaw) this;
            A03 = 0FI.A03(-1701885290);
            z = true;
            if (i == 1) {
                Location location = (Location) JQy.A0R(parcel, Location.CREATOR);
                synchronized (zzawVar) {
                    int A036 = 0FI.A03(-1891404822);
                    KjZ kjZ = zzawVar.A00;
                    kjZ.A00.execute(new LoX(new LcP(location), kjZ));
                    0FI.A09(547336120, A036);
                }
                i3 = 92594953;
            } else {
                z = false;
                i3 = 2137608920;
            }
        }
        0FI.A09(i3, A03);
        i5 = 1093600575;
        0FI.A09(i5, A033);
        return z;
    }
}
