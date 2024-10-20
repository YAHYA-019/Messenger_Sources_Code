package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingTransportCallback.class */
public abstract class SignalingTransportCallback {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ASYNC_ACTION_FAIL);

    /* loaded from: SignalingTransportCallback$CProxy.class */
    public final class CProxy extends SignalingTransportCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNG.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SignalingTransportCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
        public native void sendFailureCallback();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
        public native void sendSuccessCallback();
    }

    public abstract void sendFailureCallback();

    public abstract void sendSuccessCallback();
}
