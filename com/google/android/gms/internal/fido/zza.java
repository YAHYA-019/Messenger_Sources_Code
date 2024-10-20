package com.google.android.gms.internal.fido;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zza.class */
public abstract class zza implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zza(IBinder iBinder) {
        int A03 = 0FI.A03(1141805010);
        this.A01 = iBinder;
        this.A00 = "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
        0FI.A09(332168626, A03);
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = 0FI.A03(-691077886);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A01, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-526081574, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(1844929344, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(9426838);
        IBinder iBinder = this.A01;
        0FI.A09(-950449876, A03);
        return iBinder;
    }
}
