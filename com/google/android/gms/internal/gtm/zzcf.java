package com.google.android.gms.internal.gtm;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzcf.class */
public final class zzcf implements IInterface, zzce {
    public final IBinder A00;
    public final String A01;

    public zzcf(IBinder iBinder) {
        int A03 = 0FI.A03(728595681);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        0FI.A09(-1729265600, A03);
        0FI.A09(301352018, 0FI.A03(-1913896335));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(749957443);
        IBinder iBinder = this.A00;
        0FI.A09(1293538116, A03);
        return iBinder;
    }
}
