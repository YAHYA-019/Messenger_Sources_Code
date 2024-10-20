package com.google.android.gms.internal.auth_blockstore;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zza.class */
public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = 0FI.A03(-665896670);
        this.A00 = iBinder;
        0FI.A09(1822895881, A03);
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = 0FI.A03(1610818168);
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
            parcel.recycle();
            obtain.recycle();
            0FI.A09(1024833074, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(2056383776, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(-354355501);
        IBinder iBinder = this.A00;
        0FI.A09(1941155577, A03);
        return iBinder;
    }
}
