package androidx.work.multiprocess;

import X.0FI;
import X.JR0;
import X.JR1;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: IWorkManagerImplCallback.class */
public interface IWorkManagerImplCallback extends IInterface {
    public static final String A00 = JR1.A0x("androidx$work$multiprocess$IWorkManagerImplCallback");

    /* loaded from: IWorkManagerImplCallback$Stub.class */
    public abstract class Stub extends Binder implements IWorkManagerImplCallback {

        /* loaded from: IWorkManagerImplCallback$Stub$Proxy.class */
        public final class Proxy implements IWorkManagerImplCallback {
            public IBinder A00;

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void Bxe(String str) {
                int A03 = 0FI.A03(-789005235);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
                    obtain.writeString(str);
                    JR0.A16(this.A00, obtain, 2);
                    obtain.recycle();
                    0FI.A09(110525406, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    0FI.A09(752696391, A03);
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void COv(byte[] bArr) {
                int A03 = 0FI.A03(-244052650);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
                    obtain.writeByteArray(bArr);
                    this.A00.transact(1, obtain, null, 1);
                    obtain.recycle();
                    0FI.A09(1542082147, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    0FI.A09(763151382, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(-947407510);
                IBinder iBinder = this.A00;
                0FI.A09(-2047923711, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(-1814143413);
            attachInterface(this, IWorkManagerImplCallback.A00);
            0FI.A09(280964456, A03);
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.work.multiprocess.IWorkManagerImplCallback$Stub$Proxy, java.lang.Object, androidx.work.multiprocess.IWorkManagerImplCallback] */
        public static IWorkManagerImplCallback A00(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IWorkManagerImplCallback.A00);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = 0FI.A03(-666504642);
            obj.A00 = readStrongBinder;
            0FI.A09(1042408621, A03);
            return obj;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(1332910552, 0FI.A03(2145957569));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-1152981776);
            String str = IWorkManagerImplCallback.A00;
            boolean z = true;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        COv(parcel.createByteArray());
                    } else if (i == 2) {
                        Bxe(parcel.readString());
                    }
                    i3 = -1027841409;
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    i3 = 976685070;
                }
                0FI.A09(i3, A03);
                return z;
            }
            z = super.onTransact(i, parcel, parcel2, i2);
            i3 = 2119956713;
            0FI.A09(i3, A03);
            return z;
        }
    }

    void Bxe(String str);

    void COv(byte[] bArr);
}
