package com.google.android.gms.internal.flags;

import X.0FI;
import X.7zS;
import X.JQx;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.flags.impl.FlagProviderImpl;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-752924833, 0FI.A03(829104579));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = 0FI.A03(2082162106);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i3 = -2144055115;
            0FI.A09(i3, A03);
            return z;
        }
        FlagProviderImpl flagProviderImpl = (FlagProviderImpl) this;
        int A032 = 0FI.A03(-1546929479);
        if (i != 1) {
            if (i == 2) {
                i4 = flagProviderImpl.getBooleanFlagValue(parcel.readString(), 7zS.A1Z(parcel), parcel.readInt()) ? 1 : 0;
            } else if (i == 3) {
                i4 = flagProviderImpl.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i == 4) {
                long longFlagValue = flagProviderImpl.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
            } else {
                if (i != 5) {
                    0FI.A09(-1291390846, A032);
                    z = false;
                    i3 = -1923412358;
                    0FI.A09(i3, A03);
                    return z;
                }
                String stringFlagValue = flagProviderImpl.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
        } else {
            flagProviderImpl.init(IObjectWrapper.Stub.A01(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        0FI.A09(-1492930898, A032);
        z = true;
        i3 = -1923412358;
        0FI.A09(i3, A03);
        return z;
    }
}
