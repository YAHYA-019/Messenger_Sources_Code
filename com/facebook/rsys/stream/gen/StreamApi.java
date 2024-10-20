package com.facebook.rsys.stream.gen;

import X.2JQ;
import X.N0E;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: StreamApi.class */
public abstract class StreamApi {
    public static 2JQ CONVERTER = N6e.A00(61);

    /* loaded from: StreamApi$CProxy.class */
    public final class CProxy extends StreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0E.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native StreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.stream.gen.StreamApi
        public native VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StreamApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);
}
