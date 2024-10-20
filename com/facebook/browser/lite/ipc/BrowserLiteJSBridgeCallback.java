package com.facebook.browser.lite.ipc;

import X.0FI;
import X.AnonymousClass002;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: BrowserLiteJSBridgeCallback.class */
public interface BrowserLiteJSBridgeCallback extends IInterface {

    /* loaded from: BrowserLiteJSBridgeCallback$Stub.class */
    public abstract class Stub extends Binder implements BrowserLiteJSBridgeCallback {

        /* loaded from: BrowserLiteJSBridgeCallback$Stub$Proxy.class */
        public final class Proxy implements BrowserLiteJSBridgeCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
            public void BmG(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i) {
                int A03 = 0FI.A03(325235748);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    if (browserLiteJSBridgeCall != null) {
                        obtain.writeInt(1);
                        browserLiteJSBridgeCall.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1650597332, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(115605958, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(-1923025637);
                IBinder iBinder = this.A00;
                0FI.A09(-541048375, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(599535604);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
            0FI.A09(1238850474, A03);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(1732348154, 0FI.A03(413663211));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-1509431087);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    if (i == 1) {
                        BmG((Bundle) AnonymousClass002.A0I(parcel, Bundle.CREATOR), (BrowserLiteJSBridgeCall) AnonymousClass002.A0I(parcel, BrowserLiteJSBridgeCall.CREATOR), parcel.readInt());
                        parcel2.writeNoException();
                        i3 = 384085702;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    i3 = -71467715;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(1267340153, A03);
            return onTransact;
        }
    }

    void BmG(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i);
}
