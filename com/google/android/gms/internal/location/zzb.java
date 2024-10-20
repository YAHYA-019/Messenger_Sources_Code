package com.google.android.gms.internal.location;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzb.class */
public abstract class zzb implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = 0FI.A03(335478558);
        this.A00 = iBinder;
        this.A01 = str;
        0FI.A09(658887038, A03);
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(489795492);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        0FI.A09(-1050705418, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(-2053639741);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                JQy.A14(this.A00, parcel, obtain, i);
                parcel.recycle();
                0FI.A09(-534945234, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(2093382843, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(-369713436, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = 0FI.A03(-1066251307);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-351708126, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-493153613, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-856015257);
        IBinder iBinder = this.A00;
        0FI.A09(440586488, A03);
        return iBinder;
    }
}
