package com.google.android.gms.internal.base;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zaa.class */
public abstract class zaa implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zaa(String str, IBinder iBinder) {
        int A03 = 0FI.A03(-1643773090);
        this.A00 = iBinder;
        this.A01 = str;
        0FI.A09(-1832426573, A03);
    }

    public final Parcel A00() {
        int A03 = 0FI.A03(209746410);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        0FI.A09(1497862639, A03);
        return obtain;
    }

    public final void A01(Parcel parcel) {
        int A03 = 0FI.A03(-1122337457);
        try {
            this.A00.transact(1, parcel, null, 1);
            parcel.recycle();
            0FI.A09(1863232442, A03);
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(-1980423653, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = 0FI.A03(-1691246703);
        Parcel obtain = Parcel.obtain();
        try {
            JQy.A14(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-1601516113, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            0FI.A09(-353042594, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(-1832304334);
        IBinder iBinder = this.A00;
        0FI.A09(-176232273, A03);
        return iBinder;
    }
}
