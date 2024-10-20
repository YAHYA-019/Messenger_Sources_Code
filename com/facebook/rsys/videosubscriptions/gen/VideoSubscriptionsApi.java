package com.facebook.rsys.videosubscriptions.gen;

import X.2JQ;
import X.HNM;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoSubscriptionsApi.class */
public abstract class VideoSubscriptionsApi {
    public static 2JQ CONVERTER = new IQz(21);

    /* loaded from: VideoSubscriptionsApi$CProxy.class */
    public final class CProxy extends VideoSubscriptionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNM.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoSubscriptionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoSubscriptionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi
        public native void updateSubscriptions(VideoSubscriptions videoSubscriptions);
    }

    public abstract void updateSubscriptions(VideoSubscriptions videoSubscriptions);
}
