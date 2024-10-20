package com.google.android.play.core.splitinstall.internal;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzbm.class */
public final class zzbm implements IInterface, zzbo {
    public final IBinder A00;

    public zzbm(IBinder iBinder) {
        int A03 = 0FI.A03(-1581730868);
        this.A00 = iBinder;
        0FI.A09(199081014, A03);
        0FI.A09(1229888723, 0FI.A03(-174297378));
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(1945677728);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        0FI.A09(-818381903, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(1763831065);
        try {
            this.A00.transact(i, parcel, null, 1);
            parcel.recycle();
            0FI.A09(-124666491, A03);
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(-929959655, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(210492270);
        IBinder iBinder = this.A00;
        0FI.A09(25356761, A03);
        return iBinder;
    }
}
