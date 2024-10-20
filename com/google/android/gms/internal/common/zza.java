package com.google.android.gms.internal.common;

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
        int A03 = 0FI.A03(-916451897);
        this.A00 = iBinder;
        this.A01 = str;
        0FI.A09(-816241654, A03);
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(-24564629);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        0FI.A09(1470833525, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(1026128298);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                JQy.A14(this.A00, parcel, obtain, i);
                parcel.recycle();
                0FI.A09(-854325858, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(-784283495, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(882642655, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(1190100001);
        IBinder iBinder = this.A00;
        0FI.A09(-170944782, A03);
        return iBinder;
    }
}
