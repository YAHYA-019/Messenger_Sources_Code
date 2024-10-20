package com.google.android.gms.internal.safetynet;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzj.class */
public final class zzj implements IInterface, zzi {
    public final IBinder A00;
    public final String A01;

    public zzj(IBinder iBinder) {
        int A03 = 0FI.A03(761763215);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.safetynet.internal.ISafetyNetService";
        0FI.A09(219535784, A03);
        0FI.A09(-1621362217, 0FI.A03(-113475116));
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(-2041824502);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        0FI.A09(1015539355, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(-303491184);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-634569487, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(1716373439, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(240949633);
        IBinder iBinder = this.A00;
        0FI.A09(625063383, A03);
        return iBinder;
    }
}
