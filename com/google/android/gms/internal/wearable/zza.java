package com.google.android.gms.internal.wearable;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zza.class */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(IBinder iBinder) {
        int A03 = 0FI.A03(-1105228816);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.wearable.internal.IRpcResponseCallback";
        0FI.A09(-2047489573, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(1947381750);
        IBinder iBinder = this.A00;
        0FI.A09(2000091918, A03);
        return iBinder;
    }
}
