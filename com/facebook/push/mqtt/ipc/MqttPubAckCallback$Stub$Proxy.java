package com.facebook.push.mqtt.ipc;

import X.0FI;
import X.JQy;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: MqttPubAckCallback$Stub$Proxy.class */
public final class MqttPubAckCallback$Stub$Proxy implements MqttPubAckCallback {
    public IBinder A00;

    @Override // com.facebook.push.mqtt.ipc.MqttPubAckCallback
    public void BxW(int i, String str) {
        int A03 = 0FI.A03(634089077);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.push.mqtt.ipc.MqttPubAckCallback");
            obtain.writeInt(i);
            obtain.writeString(str);
            JQy.A14(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1621163458, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1511198646, A03);
            throw th;
        }
    }

    @Override // com.facebook.push.mqtt.ipc.MqttPubAckCallback
    public void CEZ(int i) {
        int A03 = 0FI.A03(1352197047);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.push.mqtt.ipc.MqttPubAckCallback");
            obtain.writeInt(i);
            JQy.A14(this.A00, obtain, obtain2, 3);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1939138206, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1848473401, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1452549602);
        IBinder iBinder = this.A00;
        0FI.A09(-1044785833, A03);
        return iBinder;
    }

    @Override // com.facebook.push.mqtt.ipc.MqttPubAckCallback
    public void onSuccess(int i) {
        int A03 = 0FI.A03(-520092327);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.push.mqtt.ipc.MqttPubAckCallback");
            obtain.writeInt(i);
            JQy.A14(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1788834490, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-201335572, A03);
            throw th;
        }
    }
}
