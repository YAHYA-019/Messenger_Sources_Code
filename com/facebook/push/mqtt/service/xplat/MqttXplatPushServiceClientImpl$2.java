package com.facebook.push.mqtt.service.xplat;

import X.0FI;
import X.2Ay;
import X.InterfaceC01073pn;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;

/* loaded from: MqttXplatPushServiceClientImpl$2.class */
public final class MqttXplatPushServiceClientImpl$2 extends IMqttPublishListener.Stub {
    public final /* synthetic */ InterfaceC01073pn A00;
    public final /* synthetic */ 2Ay A01;

    public MqttXplatPushServiceClientImpl$2(InterfaceC01073pn interfaceC01073pn, 2Ay r303) {
        this.A01 = r303;
        this.A00 = interfaceC01073pn;
        0FI.A09(1856633719, 0FI.A03(-285578095));
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
    public void onFailure(int i, int i2) {
        int A03 = 0FI.A03(1915975002);
        InterfaceC01073pn interfaceC01073pn = this.A00;
        if (interfaceC01073pn != null) {
            interfaceC01073pn.BxV();
        }
        0FI.A09(-891591644, A03);
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
    public void onSuccess(int i) {
        int A03 = 0FI.A03(-1016075936);
        InterfaceC01073pn interfaceC01073pn = this.A00;
        if (interfaceC01073pn != null) {
            interfaceC01073pn.COO(i);
        }
        0FI.A09(-886209414, A03);
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttPublishListener
    public void onTimeout(int i, boolean z) {
        int A03 = 0FI.A03(-487088064);
        InterfaceC01073pn interfaceC01073pn = this.A00;
        if (interfaceC01073pn != null) {
            interfaceC01073pn.BxV();
        }
        0FI.A09(860526230, A03);
    }
}
