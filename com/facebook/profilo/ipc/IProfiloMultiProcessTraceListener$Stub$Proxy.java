package com.facebook.profilo.ipc;

import X.0FI;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IProfiloMultiProcessTraceListener$Stub$Proxy.class */
public final class IProfiloMultiProcessTraceListener$Stub$Proxy implements IProfiloMultiProcessTraceListener {
    public IBinder A00;

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void CFc(IProfiloMultiProcessTraceService iProfiloMultiProcessTraceService) {
        int A03 = 0FI.A03(1362976392);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
            obtain.writeStrongInterface(iProfiloMultiProcessTraceService);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1909349038, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-696220556, A03);
            throw th;
        }
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void DA5(long j) {
        int A03 = 0FI.A03(998603740);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
            obtain.writeLong(j);
            this.A00.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(487985078, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-187866108, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-257488506);
        IBinder iBinder = this.A00;
        0FI.A09(110362939, A03);
        return iBinder;
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceAbort(TraceContext traceContext) {
        int A03 = 0FI.A03(1986484698);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
            obtain.writeInt(1);
            traceContext.writeToParcel(obtain, 0);
            this.A00.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-179953565, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1267779512, A03);
            throw th;
        }
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceStart(TraceContext traceContext) {
        int A03 = 0FI.A03(-1597150464);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
            obtain.writeInt(1);
            traceContext.writeToParcel(obtain, 0);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-167354463, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1368883312, A03);
            throw th;
        }
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceStop(TraceContext traceContext) {
        int A03 = 0FI.A03(-1403041515);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
            obtain.writeInt(1);
            traceContext.writeToParcel(obtain, 0);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1812920640, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(219451110, A03);
            throw th;
        }
    }
}
