package com.facebook.proxygen;

import X.AnonymousClass001;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: JniXplatMQTTConnectPayload.class */
public class JniXplatMQTTConnectPayload extends NativeHandleImpl {
    public final Map appSpecificInfo;
    public final List subscribeTopics;
    public String encodedSubscribeTopics = "";
    public String encodedAppSpecificInfo = "";

    public JniXplatMQTTConnectPayload(XplatMQTTConnectPayload xplatMQTTConnectPayload) {
        this.subscribeTopics = xplatMQTTConnectPayload.subscribeTopics;
        this.appSpecificInfo = xplatMQTTConnectPayload.appSpecificInfo;
        encodeAppSpecificInfo();
        encodeSubscribeTopics();
        init(xplatMQTTConnectPayload.userId, xplatMQTTConnectPayload.clientId, xplatMQTTConnectPayload.password, xplatMQTTConnectPayload.host, xplatMQTTConnectPayload.port, xplatMQTTConnectPayload.userAgent, xplatMQTTConnectPayload.deviceId, xplatMQTTConnectPayload.mqttSessionId, xplatMQTTConnectPayload.clientType, xplatMQTTConnectPayload.phpOverride, xplatMQTTConnectPayload.appId, xplatMQTTConnectPayload.initialNetworkState, xplatMQTTConnectPayload.initialNetworkTransports, this.encodedSubscribeTopics, xplatMQTTConnectPayload.capabilities, this.encodedAppSpecificInfo, xplatMQTTConnectPayload.regionHint, xplatMQTTConnectPayload.configurationMask, xplatMQTTConnectPayload.qplEnabled, xplatMQTTConnectPayload.disablePingOverlaps, xplatMQTTConnectPayload.disablePreemptiveReconnectOverlaps);
    }

    private void encodeAppSpecificInfo() {
        StringBuilder A0k = AnonymousClass001.A0k();
        for (Map.Entry entry : this.appSpecificInfo.entrySet()) {
            A0k.append((String) entry.getKey());
            A0k.append("+");
            A0k.append((String) entry.getValue());
            A0k.append(";");
        }
        this.encodedAppSpecificInfo = A0k.toString();
    }

    private void encodeSubscribeTopics() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = this.subscribeTopics.iterator();
        while (it.hasNext()) {
            A0k.append((String) it.next());
            A0k.append(";");
        }
        this.encodedSubscribeTopics = A0k.toString();
    }

    public native void init(long j, String str, String str2, String str3, String str4, String str5, String str6, long j2, String str7, String str8, String str9, String str10, int i, String str11, long j3, String str12, String str13, int i2, boolean z, boolean z2, boolean z3);
}
