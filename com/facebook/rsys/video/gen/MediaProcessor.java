package com.facebook.rsys.video.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.UserStreamInfo;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MediaProcessor.class */
public abstract class MediaProcessor {
    public static 2JQ CONVERTER = N6e.A00(67);

    /* loaded from: MediaProcessor$CProxy.class */
    public final class CProxy extends MediaProcessor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MediaProcessor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaProcessor)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.video.gen.MediaProcessor
        public native boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

        @Override // com.facebook.rsys.video.gen.MediaProcessor
        public native void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);
    }

    public abstract boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

    public abstract void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);
}
