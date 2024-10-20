package com.facebook.mqtt.service.ipc;

import X.0FI;
import X.AnonymousClass001;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: IMqttPublishListener.class */
public interface IMqttPublishListener extends IInterface {

    /* loaded from: IMqttPublishListener$Stub.class */
    public abstract class Stub extends Binder implements IMqttPublishListener {

        /* loaded from: IMqttPublishListener$Stub$Proxy.class */
        public final class Proxy implements IMqttPublishListener {
            public IBinder A00;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(-2045656236);
                IBinder iBinder = this.A00;
                0FI.A09(-1136486335, A03);
                return iBinder;
            }

            @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
            public void onFailure(int i, int i2) {
                int A03 = 0FI.A03(832597463);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.A00.transact(2, obtain, null, 1);
                    obtain.recycle();
                    0FI.A09(1193649070, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    0FI.A09(1987710904, A03);
                    throw th;
                }
            }

            @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
            public void onSuccess(int i) {
                int A03 = 0FI.A03(1125519222);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                    obtain.writeInt(i);
                    this.A00.transact(1, obtain, null, 1);
                    obtain.recycle();
                    0FI.A09(-537665931, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    0FI.A09(-1449871879, A03);
                    throw th;
                }
            }

            @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
            public void onTimeout(int i, boolean z) {
                int A03 = 0FI.A03(-1247145901);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                    obtain.writeInt(i);
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(3, obtain, null, 1);
                    obtain.recycle();
                    0FI.A09(-547534307, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    0FI.A09(468553876, A03);
                    throw th;
                }
            }
        }

        public Stub() {
            int A03 = 0FI.A03(-1205729476);
            attachInterface(this, "com.facebook.mqtt.service.ipc.IMqttPublishListener");
            0FI.A09(-311503748, A03);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.mqtt.service.ipc.IMqttPublishListener$Stub$Proxy, java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishListener] */
        public static IMqttPublishListener A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.mqtt.service.ipc.IMqttPublishListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMqttPublishListener)) {
                return (IMqttPublishListener) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = 0FI.A03(1507773689);
            obj.A00 = iBinder;
            0FI.A09(128547923, A03);
            return obj;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-298053451, 0FI.A03(-1144845547));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(1688132230);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                    if (i == 1) {
                        onSuccess(parcel.readInt());
                    } else if (i == 2) {
                        onFailure(parcel.readInt(), parcel.readInt());
                    } else if (i == 3) {
                        onTimeout(parcel.readInt(), AnonymousClass001.A1N(parcel.readInt()));
                    }
                    i3 = -1071733845;
                    0FI.A09(i3, A03);
                    return true;
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                    i3 = -563590523;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-1515908421, A03);
            return onTransact;
        }
    }

    void onFailure(int i, int i2);

    void onSuccess(int i);

    void onTimeout(int i, boolean z);
}
