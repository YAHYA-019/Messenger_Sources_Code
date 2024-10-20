package com.facebook.mqtt.service.ipc;

import X.0FI;
import X.1BL;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IMqttXplatService$Stub$Proxy.class */
public final class IMqttXplatService$Stub$Proxy implements IMqttXplatService {
    public IBinder A00;

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean AHY(long j) {
        int A03 = 0FI.A03(-713243440);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            obtain.writeLong(j);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 3) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-159202127, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1178614628, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int Adx() {
        int A03 = 0FI.A03(-1263948066);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            int A02 = 1BL.A02(this.A00, obtain, obtain2, 10);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1613327111, A03);
            return A02;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(2071556154, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZo(IMqttPublishListener iMqttPublishListener, String str, byte[] bArr, int i) {
        int A03 = 0FI.A03(-1317056790);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            obtain.writeInt(i);
            obtain.writeStrongInterface(iMqttPublishListener);
            int A02 = 1BL.A02(this.A00, obtain, obtain2, 6);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1152024298, A03);
            return A02;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1872755461, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZp(String str, byte[] bArr, int i, long j) {
        int A03 = 0FI.A03(1212407540);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            obtain.writeInt(i);
            obtain.writeLong(j);
            int A02 = 1BL.A02(this.A00, obtain, obtain2, 9);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1890734002, A03);
            return A02;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(816928515, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZq(IMqttPublishExtListener iMqttPublishExtListener, String str, byte[] bArr, int i) {
        int A03 = 0FI.A03(-1571247375);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            obtain.writeString("/t_rtc_multi");
            obtain.writeByteArray(bArr);
            obtain.writeInt(1);
            obtain.writeStrongInterface(iMqttPublishExtListener);
            int A02 = 1BL.A02(this.A00, obtain, obtain2, 8);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1398401324, A03);
            return A02;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-800328969, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-1990897626);
        IBinder iBinder = this.A00;
        0FI.A09(668650228, A03);
        return iBinder;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public String getMqttHealthStats() {
        int A03 = 0FI.A03(468125206);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            this.A00.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1630665012, A03);
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-846477317, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean isConnected() {
        int A03 = 0FI.A03(723640465);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 2) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-361487232, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1596640682, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean isConnectedOrConnecting() {
        int A03 = 0FI.A03(-841056601);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 1) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-2017411129, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1675087998, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean verifyAuthToken(String str) {
        int A03 = 0FI.A03(209623644);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttXplatService");
            obtain.writeString(str);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 12) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(539290625, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(850598392, A03);
            throw th;
        }
    }
}
