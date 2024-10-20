package com.facebook.omnistore.mqtt;

import X.1BO;
import X.1Bi;
import X.InterfaceC01343qr;

/* loaded from: OmnistoreMqttPushHandler.class */
public class OmnistoreMqttPushHandler implements InterfaceC01343qr {
    public final FacebookOmnistoreMqtt mFacebookOmnistoreMqtt = (FacebookOmnistoreMqtt) 1Bi.A03(32791);

    public static final OmnistoreMqttPushHandler _UL__ULSEP_com_facebook_omnistore_mqtt_OmnistoreMqttPushHandler_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new OmnistoreMqttPushHandler();
    }

    @Override // X.InterfaceC01343qr
    public String getHandlerName() {
        return "OmnistoreMqttPushHandler";
    }

    @Override // X.InterfaceC01343qr
    public void onMessage(String str, byte[] bArr, int i, long j, Long l) {
        if (OmnistoreMqttTopicsSetProvider.isOmnistoreTopic(str)) {
            this.mFacebookOmnistoreMqtt.handleOmnistoreSyncMessage(bArr);
        }
    }
}
