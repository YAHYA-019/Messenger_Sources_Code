package com.facebook.rsys.stream.gen;

import X.2JQ;
import X.N0E;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoCapturePropertiesListener.class */
public abstract class VideoCapturePropertiesListener {
    public static 2JQ CONVERTER = N6e.A00(62);

    /* loaded from: VideoCapturePropertiesListener$CProxy.class */
    public final class CProxy extends VideoCapturePropertiesListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0E.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoCapturePropertiesListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoCapturePropertiesListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.VideoCapturePropertiesListener
        public native void onResolutionChanged(int i, int i2);

        @Override // com.facebook.rsys.stream.gen.VideoCapturePropertiesListener
        public native void onTargetFpsChanged(int i);
    }

    public abstract void onResolutionChanged(int i, int i2);

    public abstract void onTargetFpsChanged(int i);
}
