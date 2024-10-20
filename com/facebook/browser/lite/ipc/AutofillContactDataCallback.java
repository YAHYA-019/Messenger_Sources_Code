package com.facebook.browser.lite.ipc;

import X.0FI;
import X.0Q8;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: AutofillContactDataCallback.class */
public interface AutofillContactDataCallback extends IInterface {

    /* loaded from: AutofillContactDataCallback$Stub.class */
    public abstract class Stub extends Binder implements AutofillContactDataCallback {

        /* loaded from: AutofillContactDataCallback$Stub$Proxy.class */
        public final class Proxy implements AutofillContactDataCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.AutofillContactDataCallback
            public void BmF(List list) {
                throw 0Q8.createAndThrow();
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(2097453670);
                IBinder iBinder = this.A00;
                0FI.A09(956006122, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(277936071);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillContactDataCallback");
            0FI.A09(1177855588, A03);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(595727461, 0FI.A03(340444089));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(1068407367);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    if (i == 1) {
                        BmF(parcel.createStringArrayList());
                        i3 = 1681541556;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    i3 = -1746015955;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-812655039, A03);
            return onTransact;
        }
    }

    void BmF(List list);
}
