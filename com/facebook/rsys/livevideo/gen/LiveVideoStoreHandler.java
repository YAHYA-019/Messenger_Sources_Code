package com.facebook.rsys.livevideo.gen;

import X.2JQ;
import X.HN4;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LiveVideoStoreHandler.class */
public abstract class LiveVideoStoreHandler {
    public static 2JQ CONVERTER = LVi.A00(26);

    /* loaded from: LiveVideoStoreHandler$CProxy.class */
    public final class CProxy extends LiveVideoStoreHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN4.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LiveVideoStoreHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoStoreHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStoreHandler
        public native void liveStreamStateUpdated(long j, int i, LiveStreamOptInInfo liveStreamOptInInfo);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStoreHandler
        public native void liveVideoMetadataUpdated(long j, LiveVideoMetadata liveVideoMetadata);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStoreHandler
        public native void roomsBroadcastDataLoaded(long j, String str, int i, Integer num, String str2);
    }

    public abstract void liveStreamStateUpdated(long j, int i, LiveStreamOptInInfo liveStreamOptInInfo);

    public abstract void liveVideoMetadataUpdated(long j, LiveVideoMetadata liveVideoMetadata);

    public abstract void roomsBroadcastDataLoaded(long j, String str, int i, Integer num, String str2);
}
