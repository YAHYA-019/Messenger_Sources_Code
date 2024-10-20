package com.facebook.webrtc.lite;

import X.2JQ;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.syncedclock.gen.ReceivedMessagesCache;
import com.facebook.rsys.syncedclock.gen.SyncedClockProxy;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingHandler.class */
public abstract class SignalingHandler {
    public static 2JQ CONVERTER = new IQz(24);

    /* loaded from: SignalingHandler$CProxy.class */
    public final class CProxy extends SignalingHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SignalingHandler createFromMcfType(McfReference mcfReference);

        public static native SignalingHandler createSignalingHandler(long j, long j2, String str, SignalingTransportProxy signalingTransportProxy, SyncedClockProxy syncedClockProxy, ReceivedMessagesCache receivedMessagesCache);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.webrtc.lite.SignalingHandler
        public native boolean isOffer(SignalingMessage signalingMessage);

        @Override // com.facebook.webrtc.lite.SignalingHandler
        public native SignalMessageProcessingInfo processMessage(SignalingMessage signalingMessage);
    }

    public abstract boolean isOffer(SignalingMessage signalingMessage);

    public abstract SignalMessageProcessingInfo processMessage(SignalingMessage signalingMessage);
}
