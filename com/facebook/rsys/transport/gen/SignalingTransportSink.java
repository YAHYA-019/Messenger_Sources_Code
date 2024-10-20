package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingTransportSink.class */
public abstract class SignalingTransportSink {
    public static 2JQ CONVERTER = new IQz(1);

    /* loaded from: SignalingTransportSink$CProxy.class */
    public final class CProxy extends SignalingTransportSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNG.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SignalingTransportSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportSink
        public native void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);
    }

    public abstract void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);
}
