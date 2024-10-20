package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingTransportProxy.class */
public abstract class SignalingTransportProxy {
    public static 2JQ CONVERTER = new IQz(0);

    /* loaded from: SignalingTransportProxy$CProxy.class */
    public final class CProxy extends SignalingTransportProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNG.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SignalingTransportProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void onStatusUpdate(StatusUpdate statusUpdate);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void setSink(SignalingTransportSink signalingTransportSink);
    }

    public abstract void onStatusUpdate(StatusUpdate statusUpdate);

    public abstract void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

    public abstract void setSink(SignalingTransportSink signalingTransportSink);
}
