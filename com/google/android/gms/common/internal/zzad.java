package com.google.android.gms.common.internal;

import X.0FI;
import android.os.IBinder;

/* loaded from: zzad.class */
public final class zzad implements IGmsServiceBroker {
    public final IBinder A00;

    public zzad(IBinder iBinder) {
        int A03 = 0FI.A03(1056654617);
        this.A00 = iBinder;
        0FI.A09(-428114195, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(-369549011);
        IBinder iBinder = this.A00;
        0FI.A09(-2009736343, A03);
        return iBinder;
    }
}
