package com.google.android.gms.internal.auth;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zza.class */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = 0FI.A03(843359090);
        this.A00 = iBinder;
        this.A01 = str;
        0FI.A09(-215572543, A03);
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(-817965754);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        0FI.A09(-2014512701, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(1888362964);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                JQy.A14(this.A00, parcel, obtain, i);
                parcel.recycle();
                0FI.A09(665393575, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(-1502654559, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(503531119, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = 0FI.A03(986014495);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-1763914463, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(693487009, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(749514481);
        IBinder iBinder = this.A00;
        0FI.A09(-497050468, A03);
        return iBinder;
    }
}
