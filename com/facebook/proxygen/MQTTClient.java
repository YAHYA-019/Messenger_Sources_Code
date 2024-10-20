package com.facebook.proxygen;

/* loaded from: MQTTClient.class */
public class MQTTClient extends NativeHandleImpl {
    public ByteEventLogger mByteEventLogger;
    public final MQTTClientCallback mCallback;
    public final MQTTClientFactory mFactory;
    public AnalyticsLogger mLogger;
    public final ConnectionParams mParams;
    public ProxygenRadioMeter mRadioMeter;

    public MQTTClient(MQTTClientFactory mQTTClientFactory, MQTTClientCallback mQTTClientCallback, ConnectionParams connectionParams) {
        this.mFactory = mQTTClientFactory;
        this.mCallback = mQTTClientCallback;
        this.mParams = connectionParams;
    }

    private native void init(MQTTClientFactory mQTTClientFactory, MQTTClientCallback mQTTClientCallback, String str, int i, int i2, boolean z, AnalyticsLogger analyticsLogger, ByteEventLogger byteEventLogger, ProxygenRadioMeter proxygenRadioMeter);

    public native void close();

    public void connect(String str, int i, String str2, String str3, boolean z) {
        connectWithPassword(str, i, str2, str3, z);
    }

    public native void connect(String str, int i, byte[] bArr, int i2, int i3, boolean z);

    public native void connectWithPassword(String str, int i, String str2, String str3, boolean z);

    public native void disconnect();

    public void init() {
        MQTTClientFactory mQTTClientFactory = this.mFactory;
        MQTTClientCallback mQTTClientCallback = this.mCallback;
        ConnectionParams connectionParams = this.mParams;
        init(mQTTClientFactory, mQTTClientCallback, connectionParams.clientId, connectionParams.publishFormat.getValue(), connectionParams.keepaliveSecs, connectionParams.enableTopicEncoding, this.mLogger, this.mByteEventLogger, this.mRadioMeter);
    }

    public void publish(String str, byte[] bArr, int i, int i2) {
        publish(str, bArr, 0, bArr.length, i, i2);
    }

    public native void publish(String str, byte[] bArr, int i, int i2, int i3, int i4);

    public native void sendKeepAliveOnce();

    public native void sendPingResponse();

    public MQTTClient setAnalyticsLogger(AnalyticsLogger analyticsLogger) {
        this.mLogger = analyticsLogger;
        return this;
    }

    public MQTTClient setByteEventLogger(ByteEventLogger byteEventLogger) {
        this.mByteEventLogger = byteEventLogger;
        return this;
    }

    public native void setForeground(boolean z);

    public native void setNetworkConnectionStatus(boolean z);

    public MQTTClient setRadioMeter(ProxygenRadioMeter proxygenRadioMeter) {
        this.mRadioMeter = proxygenRadioMeter;
        return this;
    }

    public native void stopConnectingIfConnectNotSent();

    public native void subscribe(String[] strArr, int[] iArr);

    public native void unSubscribe(String[] strArr, int i);
}
