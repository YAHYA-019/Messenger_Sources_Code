package com.google.android.gms.internal.p002authapiphone;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zza.class */
public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = 0FI.A03(-1128324677);
        this.A00 = iBinder;
        0FI.A09(531508785, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(976510229);
        IBinder iBinder = this.A00;
        0FI.A09(-848440143, A03);
        return iBinder;
    }
}
