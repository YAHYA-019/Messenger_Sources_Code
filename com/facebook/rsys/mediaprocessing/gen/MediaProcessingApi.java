package com.facebook.rsys.mediaprocessing.gen;

import X.2JQ;
import X.HN6;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.video.gen.MediaProcessor;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MediaProcessingApi.class */
public abstract class MediaProcessingApi {
    public static 2JQ CONVERTER = N6e.A00(35);

    /* loaded from: MediaProcessingApi$CProxy.class */
    public final class CProxy extends MediaProcessingApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN6.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MediaProcessingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaProcessingApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.mediaprocessing.gen.MediaProcessingApi
        public native void setReceiverMediaProcessor(MediaProcessor mediaProcessor);

        @Override // com.facebook.rsys.mediaprocessing.gen.MediaProcessingApi
        public native void setSenderMediaProcessor(MediaProcessor mediaProcessor);
    }

    public abstract void setReceiverMediaProcessor(MediaProcessor mediaProcessor);

    public abstract void setSenderMediaProcessor(MediaProcessor mediaProcessor);
}
