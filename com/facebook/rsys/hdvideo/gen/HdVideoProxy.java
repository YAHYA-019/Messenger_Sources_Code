package com.facebook.rsys.hdvideo.gen;

import X.2JQ;
import X.HN2;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: HdVideoProxy.class */
public abstract class HdVideoProxy {
    public static 2JQ CONVERTER = IR0.A00(128);

    /* loaded from: HdVideoProxy$CProxy.class */
    public final class CProxy extends HdVideoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN2.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native HdVideoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof HdVideoProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native boolean getHdVideoUserPreference();

        public native int hashCode();

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native void onVideoQualityChanged(Map map);

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native void setApi(HdVideoApi hdVideoApi);
    }

    public abstract boolean getHdVideoUserPreference();

    public abstract void onVideoQualityChanged(Map map);

    public abstract void setApi(HdVideoApi hdVideoApi);
}
