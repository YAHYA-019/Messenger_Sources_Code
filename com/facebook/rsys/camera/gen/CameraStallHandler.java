package com.facebook.rsys.camera.gen;

import X.2JQ;
import X.HMp;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CameraStallHandler.class */
public abstract class CameraStallHandler {
    public static 2JQ CONVERTER = IR0.A00(49);

    /* loaded from: CameraStallHandler$CProxy.class */
    public final class CProxy extends CameraStallHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMp.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CameraStallHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraStallHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallDetected();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallRecovered();
    }

    public abstract void onCameraStallDetected();

    public abstract void onCameraStallRecovered();
}
