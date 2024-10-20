package androidx.work.multiprocess;

import X.0FI;
import X.JR0;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IWorkManagerImpl$Stub$Proxy.class */
public final class IWorkManagerImpl$Stub$Proxy implements IWorkManagerImpl {
    public IBinder A00;

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void AQR(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(-1285316520);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImpl.A00);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.A00.transact(1, obtain, null, 1);
            obtain.recycle();
            0FI.A09(411634290, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(-1583834266, A03);
            throw th;
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void Cp3(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(192426655);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImpl.A00);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            JR0.A16(this.A00, obtain, 10);
            obtain.recycle();
            0FI.A09(-114338685, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(1104218286, A03);
            throw th;
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void CtR(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(-552939651);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImpl.A00);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            JR0.A16(this.A00, obtain, 9);
            obtain.recycle();
            0FI.A09(-2109272367, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(1991066056, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-1097495085);
        IBinder iBinder = this.A00;
        0FI.A09(1129983574, A03);
        return iBinder;
    }
}
