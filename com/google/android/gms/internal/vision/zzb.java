package com.google.android.gms.internal.vision;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzb.class */
public abstract class zzb implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = 0FI.A03(-1638587878);
        this.A01 = iBinder;
        this.A00 = str;
        0FI.A09(-1751965058, A03);
    }

    public final Parcel A00(Parcel parcel) {
        int A03 = 0FI.A03(1649271168);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                JQy.A14(this.A01, parcel, obtain, 1);
                parcel.recycle();
                0FI.A09(1353686002, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(2091642152, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(1060249796, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1029853520);
        IBinder iBinder = this.A01;
        0FI.A09(1436259827, A03);
        return iBinder;
    }
}
