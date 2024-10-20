package com.facebook.mqtt.service.ipc;

import X.0FI;
import X.AnonymousClass001;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IMqttPublishExtListener$Stub$Proxy.class */
public final class IMqttPublishExtListener$Stub$Proxy implements IMqttPublishExtListener {
    public IBinder A00;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-27513317);
        IBinder iBinder = this.A00;
        0FI.A09(-589718877, A03);
        return iBinder;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishExtListener
    public void onPublishAttempt(int i, int i2, int i3, int i4, int i5) {
        int A03 = 0FI.A03(1793320867);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishExtListener");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            this.A00.transact(2, obtain, null, 1);
            obtain.recycle();
            0FI.A09(1437431218, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(-481362977, A03);
            throw th;
        }
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishExtListener
    public void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int A03 = 0FI.A03(445012398);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishExtListener");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i6);
            this.A00.transact(1, obtain, null, 1);
            obtain.recycle();
            0FI.A09(1229167223, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(1454962875, A03);
            throw th;
        }
    }
}
