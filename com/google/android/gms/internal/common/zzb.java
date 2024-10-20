package com.google.android.gms.internal.common;

import X.0FI;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.zzj;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    public zzb(String str) {
        int A03 = 0FI.A03(2129696633);
        attachInterface(this, str);
        0FI.A09(871699425, A03);
    }

    public boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int i3;
        if (this instanceof zzz) {
            zzz zzzVar = (zzz) this;
            A03 = 0FI.A03(131688968);
            if (i == 1) {
                zzj zzjVar = (zzj) zzzVar;
                int A032 = 0FI.A03(-1049053617);
                ObjectWrapper objectWrapper = new ObjectWrapper(zzjVar.A03());
                0FI.A09(694498148, A032);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(objectWrapper.asBinder());
            } else if (i != 2) {
                i3 = 896591828;
            } else {
                zzj zzjVar2 = (zzj) zzzVar;
                int A033 = 0FI.A03(-1059546480);
                int i4 = zzjVar2.A00;
                0FI.A09(-959291342, A033);
                parcel2.writeNoException();
                parcel2.writeInt(i4);
            }
            0FI.A09(232051545, A03);
            return true;
        }
        A03 = 0FI.A03(-589545027);
        i3 = 1990838751;
        0FI.A09(i3, A03);
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-1755128171, 0FI.A03(-877249015));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A02;
        int i3;
        int A03 = 0FI.A03(-190635185);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            A02 = true;
            i3 = 1174896707;
            0FI.A09(i3, A03);
            return A02;
        }
        A02 = A02(i, parcel, parcel2, i2);
        i3 = 484715494;
        0FI.A09(i3, A03);
        return A02;
    }
}
