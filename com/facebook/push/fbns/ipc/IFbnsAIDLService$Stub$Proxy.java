package com.facebook.push.fbns.ipc;

import X.0FI;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IFbnsAIDLService$Stub$Proxy.class */
public final class IFbnsAIDLService$Stub$Proxy implements IFbnsAIDLService {
    public IBinder A00;

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public FbnsAIDLResult CaS(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = 0FI.A03(1819998277);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            obtain.writeInt(1);
            fbnsAIDLRequest.writeToParcel(obtain, 0);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            FbnsAIDLResult fbnsAIDLResult = (FbnsAIDLResult) (obtain2.readInt() != 0 ? FbnsAIDLResult.CREATOR.createFromParcel(obtain2) : null);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-413372834, A03);
            return fbnsAIDLResult;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1651473098, A03);
            throw th;
        }
    }

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public void D6S(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = 0FI.A03(1204005627);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            obtain.writeInt(1);
            fbnsAIDLRequest.writeToParcel(obtain, 0);
            this.A00.transact(2, obtain, null, 1);
            obtain.recycle();
            0FI.A09(-1188527113, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(1041951890, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-335947478);
        IBinder iBinder = this.A00;
        0FI.A09(-1666669739, A03);
        return iBinder;
    }
}
