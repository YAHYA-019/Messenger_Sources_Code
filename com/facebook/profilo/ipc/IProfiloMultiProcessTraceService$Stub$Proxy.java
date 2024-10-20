package com.facebook.profilo.ipc;

import X.0FI;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IProfiloMultiProcessTraceService$Stub$Proxy.class */
public final class IProfiloMultiProcessTraceService$Stub$Proxy implements IProfiloMultiProcessTraceService {
    public IBinder A00;

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceService
    public void CRC(long j, int i) {
        int A03 = 0FI.A03(1767577486);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
            obtain.writeLong(j);
            obtain.writeInt(i);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1889979029, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(578514478, A03);
            throw th;
        }
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceService
    public void CcO(IProfiloMultiProcessTraceListener iProfiloMultiProcessTraceListener) {
        int A03 = 0FI.A03(-876090529);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
            obtain.writeStrongInterface(iProfiloMultiProcessTraceListener);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-394959360, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1200062581, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-1467117008);
        IBinder iBinder = this.A00;
        0FI.A09(463775479, A03);
        return iBinder;
    }
}
