package com.facebook.rsys.videorender.gen;

import X.2JQ;
import X.HNL;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoRenderProxy.class */
public abstract class VideoRenderProxy {
    public static 2JQ CONVERTER = new IQz(19);

    /* loaded from: VideoRenderProxy$CProxy.class */
    public final class CProxy extends VideoRenderProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNL.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoRenderProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void setApi(VideoRenderApi videoRenderApi);
    }

    public abstract void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

    public abstract void setApi(VideoRenderApi videoRenderApi);
}
