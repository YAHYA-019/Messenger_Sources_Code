package com.facebook.rsys.stream.gen;

import X.2JQ;
import X.N0E;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoStreamController.class */
public abstract class VideoStreamController {
    public static 2JQ CONVERTER = N6e.A00(63);

    /* loaded from: VideoStreamController$CProxy.class */
    public final class CProxy extends VideoStreamController {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0E.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoStreamController createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoStreamController)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native int getError();

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void handleData(byte[] bArr);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void handleFrame(RSVideoFrame rSVideoFrame);

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setEnable(boolean z);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);
    }

    public abstract int getError();

    public abstract void handleData(byte[] bArr);

    public abstract void handleFrame(RSVideoFrame rSVideoFrame);

    public abstract void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

    public abstract void setEnable(boolean z);

    public abstract void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);
}
