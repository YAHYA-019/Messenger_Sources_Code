package com.facebook.push.mqtt.service.xplat;

import X.0FI;
import X.1BJ;
import X.1Br;
import X.1hD;
import X.2Ay;
import X.AnonymousClass001;
import X.C2xl;
import X.HXn;
import X.IlI;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttPublishExtListener;
import com.facebook.rsys.transport.gen.SendMessageAttemptStats;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;

/* loaded from: MqttXplatPushServiceClientImpl$3.class */
public final class MqttXplatPushServiceClientImpl$3 extends Binder implements IMqttPublishExtListener {
    public final /* synthetic */ 2Ay A00;
    public final /* synthetic */ HXn A01;

    public MqttXplatPushServiceClientImpl$3() {
        int A03 = 0FI.A03(1591715992);
        attachInterface(this, 1BJ.A00(377));
        0FI.A09(1148278927, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MqttXplatPushServiceClientImpl$3(2Ay r302, HXn hXn) {
        this();
        this.A00 = r302;
        this.A01 = hXn;
        0FI.A09(1475761055, 0FI.A03(-2026685600));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-757161400, 0FI.A03(12776491));
        return this;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishExtListener
    public void onPublishAttempt(int i, int i2, int i3, int i4, int i5) {
        int A03 = 0FI.A03(281938914);
        HXn hXn = this.A01;
        if (hXn != null) {
            IlI ilI = hXn.A00;
            SendMessageAttemptStats sendMessageAttemptStats = new SendMessageAttemptStats((short) i2, i3, i4, i5, 4);
            SignalingTransportCallbackExt signalingTransportCallbackExt = ilI.A02;
            if (signalingTransportCallbackExt != null) {
                signalingTransportCallbackExt.sendAttemptCallbackExt(sendMessageAttemptStats);
            }
        }
        0FI.A09(209168289, A03);
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishExtListener
    public void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        1hD r311;
        int i7;
        int A03 = 0FI.A03(1328956263);
        HXn hXn = this.A01;
        if (hXn != null) {
            IlI ilI = hXn.A00;
            SendMessageStats sendMessageStats = new SendMessageStats((short) i4, i5, i2, i3, z, i6, null, 4);
            SignalingTransportCallbackExt signalingTransportCallbackExt = ilI.A02;
            if (signalingTransportCallbackExt != null) {
                signalingTransportCallbackExt.sendCompleteCallbackExt(sendMessageStats);
            }
            SignalingTransportCallback signalingTransportCallback = ilI.A01;
            if (z) {
                signalingTransportCallback.sendSuccessCallback();
                r311 = (1hD) 1Br.A0B(ilI.A00.A02);
                i7 = 49;
            } else {
                signalingTransportCallback.sendFailureCallback();
                r311 = (1hD) 1Br.A0B(ilI.A00.A02);
                i7 = 48;
            }
            1hD.A01(r311, new C2xl(r311, i7));
        }
        0FI.A09(-338284294, A03);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-1241703864);
        String A00 = 1BJ.A00(377);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(A00);
                if (i == 1) {
                    onPublishCompleted(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), AnonymousClass001.A1N(parcel.readInt()), parcel.readInt());
                } else if (i == 2) {
                    onPublishAttempt(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }
                i3 = -1730346040;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(A00);
                i3 = 1036850576;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-458630145, A03);
        return onTransact;
    }
}
