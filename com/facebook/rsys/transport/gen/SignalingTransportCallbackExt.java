package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingTransportCallbackExt.class */
public abstract class SignalingTransportCallbackExt {
    public static 2JQ CONVERTER = IR0.A00(ActionId.CONNECTIVITY_CHANGED);

    /* loaded from: SignalingTransportCallbackExt$CProxy.class */
    public final class CProxy extends SignalingTransportCallbackExt {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNG.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SignalingTransportCallbackExt createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallbackExt)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallbackExt
        public native void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallbackExt
        public native void sendCompleteCallbackExt(SendMessageStats sendMessageStats);
    }

    public abstract void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

    public abstract void sendCompleteCallbackExt(SendMessageStats sendMessageStats);
}
