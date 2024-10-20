package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: OmnistoreMqtt.class */
public class OmnistoreMqtt {
    public static final OmnistoreMqtt $redex_init_class = null;
    public final HybridData mHybridData;

    /* loaded from: OmnistoreMqtt$PublishCallback.class */
    public class PublishCallback {
        public final HybridData mHybridData;

        static {
            C0il.A0B("omnistore");
        }

        public PublishCallback(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void onFailure();

        public native void onSuccess();
    }

    /* loaded from: OmnistoreMqtt$Publisher.class */
    public interface Publisher {
        void ensureConnection();

        void publishMessage(String str, byte[] bArr, PublishCallback publishCallback);
    }

    static {
        C0il.A0B("omnistore");
    }

    public OmnistoreMqtt(Publisher publisher, OmnistoreCustomLogger omnistoreCustomLogger) {
        this.mHybridData = initHybrid(publisher, omnistoreCustomLogger);
    }

    public static native HybridData initHybrid(Publisher publisher, OmnistoreCustomLogger omnistoreCustomLogger);

    public native MqttProtocolProvider getProtocolProvider();

    public native void handleOmnistoreSyncMessage(byte[] bArr);

    public native void onConnectionEstablished();

    public native void onConnectionLost();
}
