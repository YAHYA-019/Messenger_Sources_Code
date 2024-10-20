package com.facebook.mqtt.service.ipc;

import android.os.IInterface;

/* loaded from: IMqttXplatService.class */
public interface IMqttXplatService extends IInterface {
    boolean AHY(long j);

    int Adx();

    int CZo(IMqttPublishListener iMqttPublishListener, String str, byte[] bArr, int i);

    int CZp(String str, byte[] bArr, int i, long j);

    int CZq(IMqttPublishExtListener iMqttPublishExtListener, String str, byte[] bArr, int i);

    String getMqttHealthStats();

    boolean isConnected();

    boolean isConnectedOrConnecting();

    boolean verifyAuthToken(String str);
}
