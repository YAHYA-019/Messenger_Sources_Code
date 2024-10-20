package androidx.work.multiprocess;

import X.0FI;
import X.JR0;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IListenableWorkerImpl$Stub$Proxy.class */
public final class IListenableWorkerImpl$Stub$Proxy implements IListenableWorkerImpl {
    public IBinder A00;

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void BPt(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(543651921);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            JR0.A16(this.A00, obtain, 2);
            obtain.recycle();
            0FI.A09(-583805937, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(-984696325, A03);
            throw th;
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void D2W(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(427052451);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.A00.transact(1, obtain, null, 1);
            obtain.recycle();
            0FI.A09(951945071, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(-1028988993, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(189364128);
        IBinder iBinder = this.A00;
        0FI.A09(166295197, A03);
        return iBinder;
    }
}
