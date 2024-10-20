package com.facebook.rsys.videorender.gen;

import X.2JQ;
import X.HNL;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoRenderFrameCallback.class */
public abstract class VideoRenderFrameCallback {
    public static 2JQ CONVERTER = N6e.A00(89);

    /* loaded from: VideoRenderFrameCallback$CProxy.class */
    public final class CProxy extends VideoRenderFrameCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNL.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoRenderFrameCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderFrameCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderFrameCallback
        public native void onFrame(RSVideoFrame rSVideoFrame, int i);
    }

    public abstract void onFrame(RSVideoFrame rSVideoFrame, int i);
}
