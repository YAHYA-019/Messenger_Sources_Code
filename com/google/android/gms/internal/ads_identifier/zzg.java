package com.google.android.gms.internal.ads_identifier;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzg.class */
public final class zzg implements IInterface, zze {
    public final IBinder A00;
    public final String A01;

    public zzg(IBinder iBinder) {
        int A03 = 0FI.A03(-1565293878);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        0FI.A09(-1848817682, A03);
        0FI.A09(666617611, 0FI.A03(44314466));
    }

    public final Parcel A00(Parcel parcel, int i) {
        int A03 = 0FI.A03(121677159);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.A00.transact(i, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                0FI.A09(2120833112, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(847764278, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(-141453190, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-1432473586);
        IBinder iBinder = this.A00;
        0FI.A09(-1748524563, A03);
        return iBinder;
    }
}
