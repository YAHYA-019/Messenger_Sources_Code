package com.facebook.proxygen;

/* loaded from: MQTTClientCallback.class */
public interface MQTTClientCallback {
    void onConnectFailure(MQTTClientError mQTTClientError);

    void onConnectSent();

    void onConnectSuccess(byte[] bArr);

    void onError(MQTTClientError mQTTClientError);

    void onPingRequest();

    void onPingRequestFailure(MQTTClientError mQTTClientError);

    void onPingRequestSent();

    void onPingResponse();

    void onPingResponseFailure(MQTTClientError mQTTClientError);

    void onPublish(String str, byte[] bArr, int i, int i2);

    void onPublishAck(int i);

    void onPublishAckFailure(MQTTClientError mQTTClientError);

    void onPublishFailure(int i, MQTTClientError mQTTClientError);

    void onPublishSent(String str, int i);

    void onReceiveTrace(String str);

    void onSubscribeAck(int i);

    void onSubscribeFailure(int i, MQTTClientError mQTTClientError);

    void onUnsubscribeAck(int i);

    void onUnsubscribeFailure(int i, MQTTClientError mQTTClientError);
}
