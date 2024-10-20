package com.facebook.fbservice.service;

import X.0FI;
import X.AnonymousClass002;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: ICompletionHandler.class */
public interface ICompletionHandler extends IInterface {

    /* loaded from: ICompletionHandler$Stub.class */
    public abstract class Stub extends Binder implements ICompletionHandler {

        /* loaded from: ICompletionHandler$Stub$Proxy.class */
        public final class Proxy implements ICompletionHandler {
            public IBinder A00;

            @Override // com.facebook.fbservice.service.ICompletionHandler
            public void CA5(OperationResult operationResult) {
                int A03 = 0FI.A03(-1150804591);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.fbservice.service.ICompletionHandler");
                    if (operationResult != null) {
                        obtain.writeInt(1);
                        operationResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1182857541, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1369832899, A03);
                    throw th;
                }
            }

            @Override // com.facebook.fbservice.service.ICompletionHandler
            public void CA7(OperationResult operationResult) {
                int A03 = 0FI.A03(1969291029);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.fbservice.service.ICompletionHandler");
                    if (operationResult != null) {
                        obtain.writeInt(1);
                        operationResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1653227013, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-197486710, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(942509027);
                IBinder iBinder = this.A00;
                0FI.A09(1525615751, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(1275859781);
            attachInterface(this, "com.facebook.fbservice.service.ICompletionHandler");
            0FI.A09(83655131, A03);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.fbservice.service.ICompletionHandler, java.lang.Object, com.facebook.fbservice.service.ICompletionHandler$Stub$Proxy] */
        public static ICompletionHandler A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.fbservice.service.ICompletionHandler");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICompletionHandler)) {
                return (ICompletionHandler) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = 0FI.A03(1942643731);
            obj.A00 = iBinder;
            0FI.A09(422116867, A03);
            return obj;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-1077249399, 0FI.A03(-101075406));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-1076387320);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.fbservice.service.ICompletionHandler");
                    if (i == 1) {
                        CA7((OperationResult) AnonymousClass002.A0I(parcel, OperationResult.CREATOR));
                    } else if (i == 2) {
                        CA5((OperationResult) AnonymousClass002.A0I(parcel, OperationResult.CREATOR));
                    }
                    parcel2.writeNoException();
                    i3 = -245909772;
                    0FI.A09(i3, A03);
                    return true;
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.facebook.fbservice.service.ICompletionHandler");
                    i3 = 489942589;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(325341519, A03);
            return onTransact;
        }
    }

    void CA5(OperationResult operationResult);

    void CA7(OperationResult operationResult);
}
