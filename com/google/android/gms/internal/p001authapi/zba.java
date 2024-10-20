package com.google.android.gms.internal.p001authapi;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zba.class */
public abstract class zba implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zba(String str, IBinder iBinder) {
        int A03 = 0FI.A03(203213487);
        this.A00 = iBinder;
        this.A01 = str;
        0FI.A09(496381104, A03);
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(1625149835);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        0FI.A09(-135530439, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = 0FI.A03(-1096005477);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-864740470, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(849984768, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(250671105);
        IBinder iBinder = this.A00;
        0FI.A09(1592559146, A03);
        return iBinder;
    }
}
